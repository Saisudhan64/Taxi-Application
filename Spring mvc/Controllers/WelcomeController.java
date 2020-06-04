package com.in28minutes1.jee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class WelcomeController {
@RequestMapping( value = "/", method = RequestMethod.GET)

public String displognpage(ModelMap model) {
	model.put("name", "In28Minutes");
	return "welcome";
}

}
