package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addRecords_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<h2>Entry form</h2>\n");
      out.write("<form role=\"form\" action=\"saveuser.jsp\" method=\"post\"> \n");
      out.write("    <label>Name:</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"studentname\" placeholder=\"Enter Name of the student\">            \n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"roll\" placeholder=\"Enter roll\">\n");
      out.write("    <select name=\"subject\" class=\"form-control\">\n");
      out.write("        <option  value=\"IT Enterpreneur\" name=\"IT Enterpreneur\">IT Enterpreneur</option>\n");
      out.write("        <option value=\"Human Resource Management\" name=\"Human Resource Management\" >Human Resource Management</option>\n");
      out.write("        <option value=\"Critical thinking and Decision Making\" name=\"Critical thinking and Decision Making\">Critical thinking and Decision Making</option>\n");
      out.write("        <option value=\"Organization Relation\" name=\"Organization Relation\">Organization Relation</option>\n");
      out.write("        <option value=\"High Speed and Multimedia Networking\" name=\"High Speed and Multimedia Networking\">High Speed and Multimedia Networking</option>\n");
      out.write("        <option value=\"Management Information System\" name=\"Management Information System\">Management Information System</option>\n");
      out.write("    </select>\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"class\" placeholder=\"Enter class\">\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"assignment\" placeholder=\"Enter marks secured in assignment\">\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"report\" placeholder=\"Enter marks secured in report\">\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"midterm\" placeholder=\"Enter marks secured in midterm\">\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"presentation\" placeholder=\"Enter presentation\">\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"preboard\" placeholder=\"Enter preboard\">\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"total\" placeholder=\"Enter total\">\n");
      out.write("    <br>\n");
      out.write("    <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("</form>  ");
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
