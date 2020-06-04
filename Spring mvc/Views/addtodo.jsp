<%@ include file="common/Header.jspf" %>
<%@ include file="common/Navigation.jspf" %>

<div class="container">
<h1>Add a To-do</h1>
<form:form  method="post" commandName="todo">
<form:hidden path="id"/>

<fieldset class="form-group">
<form:label path="desc">Description</form:label>
<form:input path="desc" type="text" class="form-control" required="required"/>
<form:errors path="desc" cssClass="text-Warning"/>
</fieldset>
<fieldset class="form-group">
<form:label path="targetDate">TargetDate</form:label>
<form:input path="targetDate" type="text" class="form-control" required="required"/>
<form:errors path="targetDate" cssClass="text-Warning"/>
</fieldset>


<input class="btn btn-success" type="submit" value="Submit">
</form:form>
</div>
<%@ include file="common/footer.jspf" %>