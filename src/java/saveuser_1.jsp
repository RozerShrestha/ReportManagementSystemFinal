<%@page import="com.ReportManagementSystem.entities.Student"%>
<%@page import="com.ReportManagementSystem.model.Student_bim1st" %>
<%@page import="java.sql.Date"%>

<%
Student s=new Student();
s.setName(request.getParameter("name"));
s.setSubject(request.getParameter("subject"));
s.setClass(request.getParameter("class"));
s.setRoll(Integer.parseInt(request.getParameter("roll")));
s.setAssignment(Integer.parseInt(request.getParameter("assignment")));
s.setReport(Integer.parseInt(request.getParameter("report")));
s.setMidterm(Integer.parseInt(request.getParameter("midterm")));
s.setPresentation(Integer.parseInt(request.getParameter("presentation")));
s.setPreboard(Integer.parseInt(request.getParameter("preboard")));
s.setTotal(Integer.parseInt(request.getParameter("total")));
//if(request.getParameter("userid")!="")
//{
//Student_bim1st.insert(s);
//}
//else
//{
//   int userid=Integer.parseInt(request.getParameter("userid"));
//   s.setId(Id);
//   Student_bim1st.insert(s);
//}
Student_bim1st.insert(s);
%>