<%@ include file="common/Header.jspf" %>
<%@ include file="common/Navigation.jspf" %>
<div class="container">
hi ${name}<br>
 <table class="table table-striped">
 <caption>Your to-do's List</caption>
 
 <thead>
 <tr>
 <th>Description</th>
 <th>Date</th>
 <th>Completed</th>
 </tr>
 </thead>
 <c:forEach items="${todos}" var="todo">
 <tr>
 <td>${todo.desc}</td>
 <td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate}"/></td>
 <td>${todo.done}</td>
 <td>
 <a href = "/delete-todo?id=${todo.id}"class="btn btn-danger">delete</a>
 <a href = "/update-todo?id=${todo.id}"class="btn btn-info">Update</a>
 </td>
 </tr>
 </c:forEach>
</tbody> 
 </table>
  
if you wish to add a To-do please <div class="btn btn-success"><a href="/add-todos">click here</a></div> 
</div>
<%@ include file="common/footer.jspf" %>