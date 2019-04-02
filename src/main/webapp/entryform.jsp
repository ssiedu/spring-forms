<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="fr" %>
<html>
<body>
	<h3>New-Emp-Entry</h3>
	<fr:form action="saveemp" modelAttribute="empobj">
	<pre>
		Code	<fr:input path="ecode"/>
		Name	<fr:input path="ename"/>
		Salary	<fr:input path="sal"/>
		City	<fr:select path="city" items="${cities}"/>
			<input type="submit" value="Save"/>
	</pre>
	</fr:form>
</body>
</html>