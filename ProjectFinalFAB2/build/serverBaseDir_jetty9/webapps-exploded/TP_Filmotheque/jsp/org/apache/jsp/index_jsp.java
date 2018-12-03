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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/commun.css\">\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t        <a  href=\"index.jsp\" class=\"navbar-brand active\">\n");
      out.write("\t\t        <span class=\"glyphicon glyphicon-film\"></span> \n");
      out.write("\t\t        <span class=\"glyphicon glyphicon-film\"></span> \n");
      out.write("\t\t        </a>\n");
      out.write("\t\t          <button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-main\">\n");
      out.write("\t\t            <span class=\"icon-bar\"></span>\n");
      out.write("\t\t            <span class=\"icon-bar\"></span>\n");
      out.write("\t\t            <span class=\"icon-bar\"></span>\n");
      out.write("\t\t          </button>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t\t<div class=\"navbar-collapse collapse\" id=\"navbar-main\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\">Accueil</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"lister\">Liste des films</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"ajouter\">Ajouter un film</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"listerStyle\">Styles</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"geo.jsp\">Qui sommes-nous</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\t\t\n");
      out.write("\t\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"jumbotron\">\n");
      out.write("\t \t\t\t <h1>Bienvenue <small>dans notre application de gestion de films</small></h1>\n");
      out.write("\t \t\t\t <p>Vous allez pouvoir visualiser vos plus grands chefs-d'oeuvres, mais aussi ajouter, modifier ou supprimer.</p>\n");
      out.write("\t \t\t\t <p>Expérience enrichissante garantie.</p>\n");
      out.write("\t \t\t\t <p><a class=\"btn btn-primary btn-lg\" role=\"button\" href=\"geo.jsp\">En savoir plus ...</a></p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
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
