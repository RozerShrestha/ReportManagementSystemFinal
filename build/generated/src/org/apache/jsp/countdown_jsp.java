package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class countdown_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("  %header.span5\n");
      out.write("    .inner.cf\n");
      out.write("      %h1.welcome Hello. Welcome to the JS DOM Manipulation Challenge!\n");
      out.write("    %section.span5\n");
      out.write("      %h1.time Countdown to Dev Bootcamp\n");
      out.write("      .clipped\n");
      out.write("        #clock\n");
      out.write("  %main#container.cf\n");
      out.write("    %section.span1\n");
      out.write("      %aside\n");
      out.write("        %ul\n");
      out.write("          %li\n");
      out.write("            %button#b_one.button.button-horizontal.icon-star1{:type => \"button\"}\n");
      out.write("              %span Click!\n");
      out.write("          %li\n");
      out.write("            %button#b_two.button.button-horizontal.icon-star2{:type => \"button\"}\n");
      out.write("              %span And...Click!\n");
      out.write("          %li\n");
      out.write("            %button#b_three.button.button-horizontal.icon-star2{:type => \"button\"}\n");
      out.write("              %span Duh!\n");
      out.write("    %section#character_block.span4.col.effect_container\n");
      out.write("      %div\n");
      out.write("        %h2#colorful_heading\n");
      out.write("          %span#colorful HOVER OVER ME!\n");
      out.write("    %section#oscilating_block.span4.col.effect_container\n");
      out.write("      %h3#no_move.no_move DBC\n");
      out.write("      %h3#move_left.move_left DBC\n");
      out.write("      %h3#move_right.move_right DBC\n");
      out.write("    %section.span4.col.effect_container\n");
      out.write("      #moving_dot.dot\n");
      out.write("  / ! end of #container\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
