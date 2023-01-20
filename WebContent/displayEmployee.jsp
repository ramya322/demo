<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="com.cmr.prj.Employee" %>
 
  <% 
  Employee e=(Employee)request.getAttribute("e");
  
  %>
 
 
  
  <table>
  
  <tr>
  <td>Employee Id</td>
  <td>
  <%=e.getEmpid()%>
  </td>
   
  </tr>
  
  <tr>
  <td>Employee Name</td>
  <td><%=e.getEname()%></td>
   
  </tr>
  
  <tr>
  <td>Employee Designation</td>
  <td><%=e.getEmpdesignation()%></td>
   
  </tr>
  
  </table>

</body>
</html>