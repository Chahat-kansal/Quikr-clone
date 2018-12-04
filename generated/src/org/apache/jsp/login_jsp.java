package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body{\n");
      out.write("    background-image: url(\"action-blur-close-up-735911.jpg\");\n");
      out.write("    background-size: 1370px;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("filter: .10;\n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("    color: white;\n");
      out.write("    font-size: 15px;\n");
      out.write("}\n");
      out.write("    .demo{\n");
      out.write("    border:0.5px solid black;    \n");
      out.write("    box-shadow: 30px 30px 35px;\n");
      out.write("    border-radius: 15px;\n");
      out.write("\n");
      out.write("    }\n");
      out.write(".content {\n");
      out.write("    max-width: 500px;\n");
      out.write("    opacity: .4;\n");
      out.write("    margin: auto;\n");
      out.write("    padding: 150px;\n");
      out.write("    animation-name:test;\n");
      out.write("    animation-duration: 3s; \n");
      out.write("    animation-fill-mode: forwards;\n");
      out.write("}\n");
      out.write("@keyframes test{\n");
      out.write("    0%{\n");
      out.write("        width: 400px;\n");
      out.write("        height: 600px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    100%{\n");
      out.write("        width: 600px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    0%{\n");
      out.write("        opacity: 0;\n");
      out.write("    }\n");
      out.write("    100%{\n");
      out.write("        opacity: 1;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".but{\n");
      out.write("    top:100px;\n");
      out.write("}\n");
      out.write(".rnd{\n");
      out.write("    border-radius: 15px;\n");
      out.write("    background: rgba(0,0,0,0);\n");
      out.write("    opacity: .6;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".rnd::placeholder{\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write(".abc{\n");
      out.write("    \n");
      out.write("    width:50px;\n");
      out.write("    height:50px;\n");
      out.write("  border: 0px solid black;\n");
      out.write("    position: relative;\n");
      out.write("    top:20%;\n");
      out.write("    left:8%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    <div class=\"content\">\n");
      out.write("            <div class=\"demo\">\n");
      out.write("        <div class=\"abc\"><img src=\"Quikr1-Logo.png\" height=\"70px\" width=\"90px\"></div>\n");
      out.write("                    <form action=\"Login\" method=\"POST\">\n");
      out.write("                \n");
      out.write("        \n");
      out.write("           <center> <pre><b><p class=\"btn\">Username:- </p><input class=\"rnd\" type=\"text\" name=\"uname\" placeholder=\"Enter your username\" >\n");
      out.write("<br>\n");
      out.write(" <p class=\"btn\">Password:- </p><input class=\"rnd\" type=\"password\" name=\"password\" placeholder=\"Enter your password\" >\n");
      out.write("<br>\n");
      out.write("<button  class=\"rnd\" type=\"submit\" name=\"login\" >Login</button>     <button class=\"rnd\" type=\"submit\" name=\"Signup\" formaction=\"Signup.html\">Signup</button>\n");
      out.write("             \n");
      out.write("               </pre></center>\n");
      out.write("                </form>\n");
      out.write("     \n");
      out.write("                </b> </div>\n");
      out.write("   \n");
      out.write("        \n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("        </body>\n");
      out.write("</html>\n");
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
