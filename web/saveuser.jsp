<%@page import="com.ReportManagementSystem.entities.Student"%>
<%@page import="com.ReportManagementSystem.model.Student_bim7th"%>
<%@page import="java.sql.Date"%>

<%
    Student u = new Student();
    u.setName(request.getParameter("studentname"));
    u.setRoll(Integer.parseInt(request.getParameter("roll")));
    u.setSubject(request.getParameter("subject"));
    u.setClass(request.getParameter("class"));
    u.setAssignment(Integer.parseInt(request.getParameter("assignment")));
    u.setReport(Integer.parseInt(request.getParameter("report")));
    u.setMidterm(Integer.parseInt(request.getParameter("midterm")));
    u.setPresentation(Integer.parseInt(request.getParameter("presentation")));
    u.setPreboard(Integer.parseInt(request.getParameter("preboard")));
    u.setTotal(Integer.parseInt(request.getParameter("total")));
    
    Date d = new Date(System.currentTimeMillis());
    if (request.getParameter("userid")!= "") {
        Student_bim7th.insert(u);
    } else {
        int userid = Integer.parseInt(request.getParameter("userid"));
        u.setId(userid);
        Student_bim7th.Update(u);
    }
  //response.sendRedirect("teacherDashboard.jsp#");
%>