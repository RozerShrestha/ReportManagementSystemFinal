<%@page import="com.ReportManagementSystem.model.Student_bim7th"%>


<%
Student_bim7th.Delete(Integer.parseInt(request.getParameter("id")));
//response.sendRedirect("users.jsp");
%>