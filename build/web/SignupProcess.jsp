<%@page import="com.ReportManagementSystem.entities.Users"%>
<%@page import="com.ReportManagementSystem.model.LoginModel"%>

<% 
Users u=new Users();
u.setUserName(request.getParameter("username"));
u.setPosition(request.getParameter("position"));
u.setPassword(request.getParameter("password"));
LoginModel.insert(u);
response.sendRedirect("index.jsp");
%>
