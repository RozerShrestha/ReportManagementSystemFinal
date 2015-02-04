<%@page import="com.ReportManagementSystem.entities.Student,com.ReportManagementSystem.model.Student_bim7th"%>
<h2>IT Enterpreneur and Supply Chain Management</h2>                
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
                    </tr>
                    <%
                        try {
                            for (Student u :Student_bim7th.getIT_Enterpreneur()) {
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


                    </tr> 


                    <%
                            }
                        } catch (Exception ex) {
                            out.println(ex.getMessage());
                        }
                    %>
                </table>