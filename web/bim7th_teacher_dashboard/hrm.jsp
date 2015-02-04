<%-- 
    Document   : highspeed
    Created on : Feb 4, 2015, 12:13:31 AM
    Author     : Rozer
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.ReportManagementSystem.entities.Student,com.ReportManagementSystem.model.Student_bim7th"%>
<h2>Human Resource Management</h2>   
<div class="pull-right">
    <p>
        <a href="#" onclick="loadRecords()" class="btn btn-primary">Add Records</a>
    </p>
</div>
<table  class="table table-bordered table-striped">
    <tr>
        <th>Name</th>
        <th>Roll</th>
        <th>Assignment</th>
        <th>Report</th>
        <th>Midterm</th>
        <th>Presentation</th>
        <th>Preboard</th>
        <th>Total</th>
        <th>operation</th>
    </tr>
    <%
        try {
            for (Student u : Student_bim7th.getHRM()) {
    %>
    <tr>

        <td><%=u.getName()%></td>
        <td><%=u.getRoll()%></td>
        <td><%=u.getAssignment()%></td>
        <td><%=u.getReport()%></td>
        <td><%=u.getMidterm()%></td>
        <td><%=u.getPresentation()%></td>
        <td><%=u.getPreboard()%></td>
        <td><%=u.getTotal()%></td>
        <td>
                    <a href="edituser.jsp?id=<%=u.getId()%>" class="btn btn-success">Edit</a>
                    <a href="deleteuser.jsp?id=<%=u.getId()%>" class="btn btn-danger" onclick="return confirm('Are you sure to Delete?')">Delete</a>
                    
                </td>
        
    </tr> 

</tr> 


<%
        }
    } catch (Exception ex) {
        out.println(ex.getMessage());
    }
%>
</table>