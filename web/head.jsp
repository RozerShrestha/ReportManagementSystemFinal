<link href="assets/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="assets/css/dashboard.css" rel="stylesheet" type="text/css"/>
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
                <li><a href="aboutme.jsp">About me</a></li>


            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
        </div>
    </div>
</div>