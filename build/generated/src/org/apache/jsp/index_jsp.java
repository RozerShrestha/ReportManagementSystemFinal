package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Fullscreen Login</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/reset.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/supersized.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("        <div class=\"page-header\" >\n");
      out.write("            <h1><center>Report Management System</center></h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"page-container\">\n");
      out.write("            <h1>Login</h1>\n");
      out.write("            <form name=\"loginform\" action=\"loginProcess.jsp\" method=\"post\">\n");
      out.write("                <input type=\"text\" name=\"username\" class=\"username\" placeholder=\"Username\">\n");
      out.write("                <br><br>\n");
      out.write("                <select name=\"position\" style=\"color:#f0ad4e\">\n");
      out.write("                    <option value=\"management\" style=\"color: #000000\">Management</option>\n");
      out.write("                    <option value=\"teacher\" style=\"color: #000000\">Teacher</option>\n");
      out.write("                    <option value=\"student\" style=\"color: #000000\">Student</option>\n");
      out.write("                </select>\n");
      out.write("                <input type=\"password\" name=\"password\" class=\"password\" placeholder=\"Password\">\n");
      out.write("                <h1><button type=\"submit\">Sign me in</button></h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <script src=\"assets/js/jquery-1.8.2.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/supersized.3.2.7.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/supersized-init.js\"></script>\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
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
