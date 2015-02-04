<%@include file="header.jsp" %>
<%@page import="com.ReportManagementSystem.entities.Student,com.ReportManagementSystem.model.Student_bim1st"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>


        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico"




              <link href="assets/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <link href="assets/css/dashboard.css" rel="stylesheet" type="text/css"/>

        <script src="assets/js/ie-emulation-modes-warning.js" type="text/javascript"></script>

        <script src="assets/js/ie10-viewport-bug-workaround.js" type="text/javascript"></script>
        <script>
            function loadToContent(str) {
                if (str.length == 0) {
                    document.getElementById("table").innerHTML = "";
                    return;
                } else {
                    var xmlhttp = new XMLHttpRequest();
                    xmlhttp.onreadystatechange = function() {
                        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                            document.getElementById("table").innerHTML = xmlhttp.responseText;
                        }
                    }
                    xmlhttp.open("GET", "newjsp.jsp", true);
                    xmlhttp.send();
                }
            }
        </script>

    </head>

    <body>

        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar navbar-brand" href="#"><b>Report Management System</b></a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">

                        <li><a>Welcome ${sessionScope.sessionData}</a></li>
                        <li><a href="index.jsp">Logout</a></li>


                    </ul>
                    <form class="navbar-form navbar-right">
                        <input type="text" class="form-control" placeholder="Search...">
                    </form>
                </div>
            </div>
        </div>







        <div class="col-sm-3 col-md-2 sidebar"> <!--for side bar-->
            <ul class="nav nav-sidebar">
                <div class="panel-group" id="accordion">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseBIM">
                                    BIM
                                </a>
                            </h4>
                        </div>
                        <div id="collapseBIM" class="panel-collapse collapse">
                            <div class="panel-group" id="accordion">
                                <div class="panel panel-default">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM1st">
                                        BIM1st
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBIM1st" style="height: auto;">
                                        <li><a  href="#" onclick="loadToContent()">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM2ed">
                                        BIM2nd
                                    </a>                                   
                                    <ul class="panel-collapse collapse" id="collapseBIM2ed" style="height: auto;">
                                        <li><a href="">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                   
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM3rd">
                                        BIM3rd
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBIM3rd" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                   
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM4th">
                                        BIM4th
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBIM4th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM5th">
                                        BIM5th
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBIM5th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                  
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM6th">
                                        BIM6th
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBIM6th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                  
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM7th">
                                        BIM7th
                                    </a>                                   
                                    <ul class="panel-collapse collapse" id="collapseBIM7th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                  
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBIM8th">
                                        BIM8th
                                    </a>                                  
                                    <ul class="panel-collapse collapse" id="collapseBIM8th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>
                            </div>




                        </div>
                    </div>

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseBBA">
                                    BBA
                                </a>
                            </h4>
                        </div>
                        <div id="collapseBBA" class="panel-collapse collapse">
                            <div class="panel-group" id="accordion">
                                <div class="panel panel-default">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBBA1st">
                                        BBA1st
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBBA1st" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBBA2ed">
                                        BBA2nd
                                    </a>                                   
                                    <ul class="panel-collapse collapse" id="collapseBBA2ed" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                   
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBBA3rd">
                                        BBA3rd
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBBA3rd" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                   
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBBA4th">
                                        BBA4th
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBBA4th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBBA5th">
                                        BBA5th
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBBA5th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                  
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBBA6th">
                                        BBA6th
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBBA6th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                  
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBBA7th">
                                        BBA7th
                                    </a>                                   
                                    <ul class="panel-collapse collapse" id="collapseBBA7th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                  
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBBA8th">
                                        BBA8th
                                    </a>                                  
                                    <ul class="panel-collapse collapse" id="collapseBBA8th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseBSCCSIT">
                                    BScCsit
                                </a>
                            </h4>
                        </div>
                        <div id="collapseBSCCSIT" class="panel-collapse collapse">
                            <div class="panel-group" id="accordion">
                                <div class="panel panel-default">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBScCsit1st">
                                        BScCsit1st
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBScCsit1st" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBScCsit2ed">
                                        BScCsit2nd
                                    </a>                                   
                                    <ul class="panel-collapse collapse" id="collapseBScCsit2ed" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                   
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBScCsit3rd">
                                        BScCsit3rd
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBScCsit3rd" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                   
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBScCsit4th">
                                        BScCsit4th
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBScCsit4th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBScCsit5th">
                                        BScCsit5th
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBScCsit5th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                  
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBScCsit6th">
                                        BScCsit6th
                                    </a>                                    
                                    <ul class="panel-collapse collapse" id="collapseBScCsit6th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                  
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBScCsit7th">
                                        BScCsit7th
                                    </a>                                   
                                    <ul class="panel-collapse collapse" id="collapseBScCsit7th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>


                                <div class="panel panel-default">                                  
                                    <a data-toggle="collapse" data-parent="#accordion1" href="#collapseBScCsit8th">
                                        BScCsit8th
                                    </a>                                  
                                    <ul class="panel-collapse collapse" id="collapseBScCsit8th" style="height: auto;">
                                        <li><a href="#">English Composition</a></li>
                                        <li><a href="#">Principle of Management</a></li>
                                        <li><a href="#">Basic Mathematics</a></li>
                                        <li><a href="#">Computer Information System</a></li>
                                        <li><a href="#">Digital Logic</a></li>
                                    </ul>   
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </ul>
        </div><!--for side bar-->








        <div id="table" class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

            <h2 class="sub-header"></h2>
<!--            <div class="table" >
                this is  for table
                <table class="table table-bordered">
                    <tr>
                        <th>Name</th>
                        <th>Subject</th>
                        <th>Class</th>
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
                            for (Student u : Student_bim1st.getAll()) {
                    %>
                    <tr>

                        <td><%=u.getName()%></td>
                        <td><%=u.getSubject()%></td>
                        <td><%=u.getclass()%></td>
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
            </div>-->
        </div>
                <script src="assets/js/jquery.min.js" type="text/javascript"></script>
                <script src="assets/js/transition.js" type="text/javascript"></script>
                <script src="assets/js/collapse.js" type="text/javascript"></script>


                </body>
                </html>
