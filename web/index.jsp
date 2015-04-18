<%-- 
    Document   : login
    Created on : Dec 3, 2014, 8:49:43 AM
    Author     : Rozer
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<meta charset="utf-8">
<title>Fullscreen Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link href="assets/css/signup.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
<link rel="stylesheet" href="assets/css/reset.css">
<link rel="stylesheet" href="assets/css/supersized.css">
<link rel="stylesheet" href="assets/css/style.css">


<div class="page-header" >
    <h1><center>Report Management System</center></h1>
</div>
<div class="page-container">
    <h1>Login</h1>
    
        <form name="loginform" action="loginProcess.jsp" method="post">
            <input type="text" name="username" class="username" placeholder="Username">
            <select name="position" style="color:#f0ad4e">
                <option value="management" style="color: #000000">Management</option>
                <option value="teacher" style="color: #000000">Teacher</option>
                <option value="student" style="color: #000000">Student</option>
            </select>
            <input type="password" name="password" class="password" placeholder="Password">
            <h1><button type="submit">Sign me in</button></h1>
        </form>

<!--</div>-->
<main role="main">
    <button id="popup-trigger" class="popup-trigger btn"><span>Signup Now<i class="fa fa-plus-square-o"></i></span></button>
</main>
<div id="overlay" class="overlay">
    <div id="overlay-background" class="overlay-background"></div>
    <div id="overlay-content" class="overlay-content">
        <div id="overlay-close" class="fa fa-times fa-lg overlay-close"></div>
        <h1 class="main-heading">Signup Now</h1>
        <h3 class="blurb">Creating an account is free &mdash;</h3><span class="blurb-tagline">and won't take longer than a couple of seconds.</span>
        <form method="post" action="SignupProcess.jsp" novalidate="novalidate" class="signup-form">
            <input id="signup-name" type="text" name="username" placeholder="username" autocomplete="off"/>
            <select name="position" style="color:#f0ad4e">
                <option value="management" style="color: #000000">Management</option>
                <option value="teacher" style="color: #000000">Teacher</option>
                <option value="student" style="color: #000000">Student</option>
            </select>
            <input id="signup-pw" type="password" name="password" placeholder="password" autocomplete="off"/>
            <!--<input id="signup-cpw" type="password" name="conform" placeholder="conform password" autocomplete="off"/>-->
            <button class="btn btn-outline submit-btn" type="submit"><span>signup</span></button>
        </form>
    </div>
</div>
</div>


<script src="assets/js/jquery-2.1.3.min.js" type="text/javascript"></script>
<script src="assets/js/signup.js" type="text/javascript"></script>
<!--<script src="assets/js/jquery-1.8.2.min.js"></script>-->
<script src="assets/js/supersized.3.2.7.min.js"></script>
<script src="assets/js/supersized-init.js"></script>
<script src="assets/js/scripts.js"></script>




