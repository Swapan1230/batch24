<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jrout.tutorial.advance.domain.Employee" %>    
<%@ page import="java.util.List" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Employee emp = (Employee) request.getAttribute("employee");
	%>
	<%
		for(int i = 0 ; i  < 5 ; i++){
	%>
	
	<%		
			
		}
	%>
	<table>
		<tr> 
		<td>This is JSP</td>
			<td><%=emp.getEmployeeNo() %></td>
			<td><%=emp.getFirstName() %></td>
			<td><%=emp.getLastName() %></td>
		</tr>
	</table>
</body>
</html>