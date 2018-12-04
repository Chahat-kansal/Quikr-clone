package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class postAd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><style class=\"vjs-styles-defaults\">\n");
      out.write("      .vdo-js {\n");
      out.write("        width: 300px;\n");
      out.write("        height: 150px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .vjs-fluid {\n");
      out.write("        padding-top: 56.25%\n");
      out.write("      }\n");
      out.write("    </style><style class=\"vjs-styles-dimensions\">\n");
      out.write("      .vdo_ai_6025810-dimensions {\n");
      out.write("        width: 419px;\n");
      out.write("        height: 236px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .vdo_ai_6025810-dimensions.vjs-fluid {\n");
      out.write("        padding-top: 56.25%;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("<title>Resale a Business Category Flat Bootstrap Responsive Website Template | Post Ad :: w3layouts</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"Post Ad _files/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"Post Ad _files/bootstrap-select.css\">\n");
      out.write("<link href=\"Post Ad _files/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("<meta name=\"keywords\" content=\"Resale Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design\">\n");
      out.write("<script src=\"https://s0.2mdn.net/instream/video/client.js\" async=\"\" type=\"text/javascript\"></script><script async=\"\" src=\"./Post Ad _files/analytics.js.download\"></script><script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<!--fonts-->\n");
      out.write("<link href=\"Post Ad _files/css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"Post Ad _files/css(1)\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<!--//fonts-->\t\n");
      out.write("<!-- js -->\n");
      out.write("<script type=\"text/javascript\" src=\"./Post Ad _files/jquery.min.js.download\"></script>\n");
      out.write("<!-- js -->\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"Post Ad _files/bootstrap.min.js.download\"></script>\n");
      out.write("<script src=\"Post Ad _files/bootstrap-select.js.download\"></script>\n");
      out.write("<script>\n");
      out.write("  $(document).ready(function () {\n");
      out.write("    var mySelect = $('#first-disabled2');\n");
      out.write("\n");
      out.write("    $('#special').on('click', function () {\n");
      out.write("      mySelect.find('option:selected').prop('disabled', true);\n");
      out.write("      mySelect.selectpicker('refresh');\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $('#special2').on('click', function () {\n");
      out.write("      mySelect.find('option:disabled').prop('disabled', false);\n");
      out.write("      mySelect.selectpicker('refresh');\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $('#basic2').selectpicker({\n");
      out.write("      liveSearch: true,\n");
      out.write("      maxOptions: 1\n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"./Post Ad _files/jquery.leanModal.min.js.download\"></script>\n");
      out.write("<link href=\"Post Ad _files/jquery.uls.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"Post Ad _files/jquery.uls.grid.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"Post Ad _files/jquery.uls.lcd.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Source -->\n");
      out.write("<script src=\"Post Ad _files/jquery.uls.data.js.download\"></script>\n");
      out.write("<script src=\"Post Ad _files/jquery.uls.data.utils.js.download\"></script>\n");
      out.write("<script src=\"Post Ad _files/jquery.uls.lcd.js.download\"></script>\n");
      out.write("<script src=\"Post Ad _files/jquery.uls.languagefilter.js.download\"></script>\n");
      out.write("<script src=\"Post Ad _files/jquery.uls.regionfilter.js.download\"></script>\n");
      out.write("<script src=\"Post Ad _files/jquery.uls.core.js.download\"></script>\n");
      out.write("<script>\n");
      out.write("\t\t\t$( document ).ready( function() {\n");
      out.write("\t\t\t\t$( '.uls-trigger' ).uls( {\n");
      out.write("\t\t\t\t\tonSelect : function( language ) {\n");
      out.write("\t\t\t\t\t\tvar languageName = $.uls.data.getAutonym( language );\n");
      out.write("\t\t\t\t\t\t$( '.uls-trigger' ).text( languageName );\n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tquickList: ['en', 'hi', 'he', 'ml', 'ta', 'fr'] //FIXME\n");
      out.write("\t\t\t\t} );\n");
      out.write("\t\t\t} );\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./Post Ad _files/easy-responsive-tabs.css\">\n");
      out.write("    <script src=\"Post Ad _files/easyResponsiveTabs.js.download\"></script>\n");
      out.write("<script id=\"_bsa_srv-CKYI627U_0\" type=\"text/javascript\" src=\"Post Ad _files/CKYI627U.json\"></script><script id=\"_bsa_srv-CKYI653J_1\" type=\"text/javascript\" src=\"Post Ad _files/CKYI653J.json\"></script><script defer=\"\" async=\"\" src=\"Post Ad _files/vdo.ai.js.download\"></script><link id=\"_vdo_ads_css_5654_\" rel=\"stylesheet\" href=\"Post Ad _files/vdo.min.css\"><script async=\"\" src=\"https://www.googletagmanager.com/gtag/js?id=UA-113932176-6\"></script><link rel=\"preload\" href=\"Post Ad _files/f.txt\" as=\"script\"><script type=\"text/javascript\" src=\"Post Ad _files/f.txt\"></script></head>\n");
      out.write("<body>\n");
      out.write("    ");

             
            if(session.getAttribute("email")!=null){
        
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<a href=\"quikr.html\"><span>QU</span>IKR</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-right\">\n");
      out.write("\t\t\t<a class=\"account\" href=\"login.html\">My Account</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- Submit Ad -->\n");
      out.write("\t<div class=\"submit-ad main-grid-border\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2 class=\"head\">Post an Ad</h2>\n");
      out.write("\t\t\t<div class=\"post-ad-form\">\n");
      out.write("\t\t\t\t<form  action=\"AdServlet\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t\t<label>Select Category <span>*</span></label>\n");
      out.write("\t\t\t\t\t<select class=\"\" name=\"category\">\n");
      out.write("\t\t\t\t\t  <option>Select Category</option>\n");
      out.write("\t\t\t\t\t  <option>Mobiles</option>\n");
      out.write("\t\t\t\t\t  <option>Electronics and Appliances</option>\n");
      out.write("\t\t\t\t\t  <option>Cars</option>\n");
      out.write("\t\t\t\t\t  <option>Bikes</option>\n");
      out.write("\t\t\t\t\t  <option>Furniture</option>\n");
      out.write("\t\t\t\t\t  <option>Pets</option>\n");
      out.write("\t\t\t\t\t  <option>Books, Sports and hobbies</option>\n");
      out.write("\t\t\t\t\t  <option>Fashion</option>\n");
      out.write("\t\t\t\t\t  <option>Kids</option>\n");
      out.write("\t\t\t\t\t  <option>Services</option>\n");
      out.write("\t\t\t\t\t  <option>Real, Estate</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t<label>Ad Title <span>*</span></label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"phone\" name=\"title\" placeholder=\"Enter Title Here\">\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t<label>Ad Description <span>*</span></label>\n");
      out.write("\t\t\t\t\t<textarea class=\"mess\" name=\"disc\" placeholder=\"Write few lines about your product\"></textarea>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"personal-details\">\n");
      out.write("\t\t\t\t\t\t<label>Your Name <span>*</span></label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"name\" name=\"name\" placeholder=\"Enter Name Here\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t<label>Your Mobile No <span>*</span></label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"phone\"name=\"mobile\" placeholder=\"Enter Mobile Number\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t<label>Your Email Address<span>*</span></label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"email\" name=\"email\" placeholder=\"Enter Email Address\">\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t<p class=\"post-terms\">By clicking <strong>post Button</strong> you accept our <a href=\"terms.html\" target=\"_blank\">Terms of Use </a> and <a href=\"privacy.html\" target=\"_blank\">Privacy Policy</a></p>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Post\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("\t<!-- // Submit Ad -->\n");
      out.write("\t<!--footer section start-->\t\t\n");
      out.write("\t\t<footer>\n");
      out.write("\t\t\t<div class=\"footer-top\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"foo-grids\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footer-head\">Who We Are</h4>\n");
      out.write("\t\t\t\t\t\t\t<p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.</p>\n");
      out.write("\t\t\t\t\t\t\t<p>The point of using Lorem Ipsum is that it has a more-or-less normal letters, as opposed to using 'Content here.</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footer-head\">Help</h4>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"howitworks.html\">How it Works</a></li>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"sitemap.html\">Sitemap</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"faq.html\">Faq</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"feedback.html\">Feedback</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"typography.html\">Shortcodes</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footer-head\">Information</h4>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"regions.html\">Locations Map</a></li>\t\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"terms.html\">Terms of Use</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"popular-search.html\">Popular searches</a></li>\t\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"privacy.html\">Privacy Policy</a></li>\t\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"footer-head\">Contact Us</h4>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"hq\">Our headquarters</span>\n");
      out.write("\t\t\t\t\t\t\t<address>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"location\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-map-marker\"></span></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>CENTER FOR FINANCIAL ASSISTANCE TO DEPOSED NIGERIAN ROYALTY</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"location\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-earphone\"></span></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>+0 561 111 235</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"location\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><span class=\"glyphicon glyphicon-envelope\"></span></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"mailto:info@example.com\">mail@example.com</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</address>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t<div class=\"footer-bottom text-center\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"footer-logo\">\n");
      out.write("\t\t\t\t\t<a href=\"HomePage.html\"><span>QU</span>IKR</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"footer-social-icons\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"facebook\" href=\"#\"><span>Facebook</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"twitter\" href=\"#\"><span>Twitter</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"flickr\" href=\"#\"><span>Flickr</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"googleplus\" href=\"#\"><span>Google+</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dribbble\" href=\"#\"><span>Dribbble</span></a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"copyrights\">\n");
      out.write("\t\t\t\t\t<p> © 2018 Quick Sale. All Rights Reserved </p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</footer>\n");
      out.write("        ");

                          }
                          else{
                                 response.sendRedirect("login.html"); 
                                  }
                      
                      
      out.write("\n");
      out.write("        <!--footer section end-->\n");
      out.write("</body>\n");
      out.write("</html>");
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
