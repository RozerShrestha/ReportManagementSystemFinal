package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ReportManagementSystem.entities.Student;
import com.ReportManagementSystem.model.Student_bim7th;

public final class editRecords_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

    if (request.getParameter("id") == null) {
        response.sendRedirect("teacherDashboard.jsp");
    }

    int userid = Integer.parseInt(request.getParameter("id"));
    Student user = Student_bim7th.getByPk(userid);

      out.write('\r');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css\">\n");
      out.write("<style>\n");
      out.write("    body{\n");
      out.write("        padding:10px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>");
      out.write("\r\n");
      out.write("<h1>Edit User</h1>\r\n");
      out.write("<form role=\"form\" action=\"saveuser.jsp\" method=\"post\"> \r\n");
      out.write("    <label>Name:</label>\r\n");
      out.write("    <input value=\"");
      out.print(user.getName());
      out.write("\" type=\"text\" class=\"form-control\" name=\"studentname\" placeholder=\"Enter Name of the student\">            \r\n");
      out.write("    <label>Roll:</label>\r\n");
      out.write("    <input value=\"");
      out.print(user.getRoll());
      out.write("\" type=\"text\" class=\"form-control\" name=\"roll\" placeholder=\"Enter roll\">\r\n");
      out.write("    <label>Subject:</label>\r\n");
      out.write("    <select name=\"subject\" class=\"form-control\">\r\n");
      out.write("        <option  value=\"IT Enterpreneur\" name=\"IT Enterpreneur\">IT Enterpreneur</option>\r\n");
      out.write("        <option value=\"Human Resource Management\" name=\"Human Resource Management\" >Human Resource Management</option>\r\n");
      out.write("        <option value=\"Critical thinking and Decision Making\" name=\"Critical thinking and Decision Making\">Critical thinking and Decision Making</option>\r\n");
      out.write("        <option value=\"Organization Relation\" name=\"Organization Relation\">Organization Relation</option>\r\n");
      out.write("        <option value=\"High Speed and Multimedia Networking\" name=\"High Speed and Multimedia Networking\">High Speed and Multimedia Networking</option>\r\n");
      out.write("        <option value=\"Management Information System\" name=\"Management Information System\">Management Information System</option>\r\n");
      out.write("    </select>\r\n");
      out.write("    <label>Faculty:</label>\r\n");
      out.write("    <select name=\"class\" class=\"form-control\">\r\n");
      out.write("        <option value=\"bim1st\" name=\"bim1st\">BIM 1st</option>\r\n");
      out.write("        <option value=\"bim2nd\" name=\"bim2nd\">BIM 2nd</option>\r\n");
      out.write("        <option value=\"bim3rd\" name=\"bim3rd\">BIM 3rd</option>\r\n");
      out.write("        <option value=\"bim4th\" name=\"bim4th\">BIM 4th</option>\r\n");
      out.write("        <option value=\"bim5th\" name=\"bim5th\">BIM 5th</option>\r\n");
      out.write("        <option value=\"bim6th\" name=\"bim6th\">BIM 6th</option>\r\n");
      out.write("        <option value=\"bim7th\" name=\"bim7th\">BIM 7th</option>\r\n");
      out.write("        <option value=\"bim8th\" name=\"bim8th\">BIM 8th</option>    \r\n");
      out.write("    </select>\r\n");
      out.write("    <!--<input type=\"text\" class=\"form-control\" name=\"class\" placeholder=\"Enter class\">-->\r\n");
      out.write("    <label>Assignment:</label>\r\n");
      out.write("    <input value=\"");
      out.print(user.getAssignment());
      out.write("\" type=\"text\" class=\"form-control\" name=\"assignment\" placeholder=\"Enter marks secured in assignment\">\r\n");
      out.write("    <label>Report:</label>\r\n");
      out.write("    <input value=\"");
      out.print(user.getReport());
      out.write("\" type=\"text\" class=\"form-control\" name=\"report\" placeholder=\"Enter marks secured in report\">\r\n");
      out.write("    <label>Mid Term:</label>\r\n");
      out.write("    <input value=\"");
      out.print(user.getMidterm());
      out.write("\" type=\"text\" class=\"form-control\" name=\"midterm\" placeholder=\"Enter marks secured in midterm\">\r\n");
      out.write("    <label>Presentation:</label>\r\n");
      out.write("    <input value=\"");
      out.print(user.getPresentation());
      out.write("\" type=\"text\" class=\"form-control\" name=\"presentation\" placeholder=\"Enter presentation\">\r\n");
      out.write("    <label>PreBoard:</label>\r\n");
      out.write("    <input value=\"");
      out.print(user.getPreboard());
      out.write("\" type=\"text\" class=\"form-control\" name=\"preboard\" placeholder=\"Enter preboard\">\r\n");
      out.write("    <label>Total:</label>\r\n");
      out.write("    <input value=\"");
      out.print(user.getTotal());
      out.write("\" type=\"text\" class=\"form-control\" name=\"total\" placeholder=\"Enter total\">\r\n");
      out.write("    <br>\r\n");
      out.write("    <button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("</form>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
