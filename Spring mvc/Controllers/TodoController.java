package com.in28minutes1.service;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class TodoController {

	@Autowired
	private TodoService service;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}
	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		String user = getLoggedInUserName();
		model.addAttribute("todos", service.retrieveTodos(user));
		return "list-todos";
	}

	 private String getLoggedInUserName() {
		// TODO Auto-generated method stub
		return "in28Minutes";
	}
	@RequestMapping(value = "/add-todos", method = RequestMethod.GET)
	public String addtodopage(ModelMap model) {
		model.addAttribute("todo", new Todo(0,"in28Minutes","",new Date(),false));
		 return "addtodo";
	}
	
	@RequestMapping(value = "/add-todos", method = RequestMethod.POST)
	public String addingtodotolist(ModelMap model,@Valid Todo todo,BindingResult result) {
		if(result.hasErrors()){return "addtodo";}
		model.clear();
		service.addTodo(getLoggedInUserName(), todo.getDesc(), new Date(), false);
		return "redirect:list-todos";
	}
	@RequestMapping(value = "/update-todo", method = RequestMethod.GET)
	public String updatetodoto(ModelMap model,@RequestParam int id) {
		Todo todo = service.retrieveTodo(id);
		model.addAttribute("todo",todo);
		return "addtodo";
	}
	@RequestMapping(value = "/update-todo", method = RequestMethod.POST)
	public String updatetodoto(ModelMap model,@Valid Todo todo,BindingResult result) {
		if(result.hasErrors()){return "addtodo";}	
		service.updateTodo(todo);
	todo.setUser(getLoggedInUserName());
		return "redirect:list-todos";
	}
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deletetodoto(@RequestParam int id,ModelMap model) {
		model.clear();
		service.deleteTodo(id);
		return "redirect:list-todos";
	}

}
