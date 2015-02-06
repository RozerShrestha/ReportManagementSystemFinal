package org.apache.jsp.bim7th_005fteacher_005fdashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ReportManagementSystem.entities.Student;
import com.ReportManagementSystem.model.Student_bim7th;

public final class or_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h2>Organizational Relations</h2>   \n");
      out.write("<div class=\"pull-right\">\n");
      out.write("    <p>\n");
      out.write("        <a href=\"#\" onclick=\"loadRecords()\" class=\"btn btn-primary\">Add Records</a>\n");
      out.write("    </p>\n");
      out.write("</div>\n");
      out.write("<table  class=\"table table-bordered table-striped\">\n");
      out.write("    <tr>\n");
      out.write("        <th>Id</th>\n");
      out.write("        <th>Name</th>\n");
      out.write("        <th>Roll</th>\n");
      out.write("        <th>Assignment</th>\n");
      out.write("        <th>Report</th>\n");
      out.write("        <th>Midterm</th>\n");
      out.write("        <th>Presentation</th>\n");
      out.write("        <th>Preboard</th>\n");
      out.write("        <th>Total</th>\n");
      out.write("        <th>operation</th>\n");
      out.write("    </tr>\n");
      out.write("    ");

        try {
            for (Student u : Student_bim7th.getOR()) {
    
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print(u.getId());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(u.getName());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(u.getRoll());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(u.getAssignment());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(u.getReport());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(u.getMidterm());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(u.getPresentation());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(u.getPreboard());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(u.getTotal());
      out.write("</td>\n");
      out.write("        <td>\n");
      out.write("                    <a href=\"editRecords.jsp?id=");
      out.print(u.getId());
      out.write("\" class=\"btn btn-success\">Edit</a>\n");
      out.write("                    <a href=\"deleteRecords.jsp?id=");
      out.print(u.getId());
      out.write("\" class=\"btn btn-danger\" onclick=\"return confirm('Are you sure to Delete?')\">Delete</a>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("        \n");
      out.write("    </tr> \n");
      out.write("\n");
      out.write("</tr> \n");
      out.write("\n");
      out.write("\n");

        }
    } catch (Exception ex) {
        out.println(ex.getMessage());
    }

      out.write("\n");
      out.write("</table>");
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
