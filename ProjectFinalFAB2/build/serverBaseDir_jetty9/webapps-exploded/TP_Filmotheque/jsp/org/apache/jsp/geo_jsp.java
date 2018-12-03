package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class geo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDx112FebkN_E_DM6WAvowszRDAaNgg5jg&sensor=true\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/commun.css\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t$(function(){\n");
      out.write("\t\tnavigator.geolocation.getCurrentPosition(affichagePos);\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\tfunction affichagePos(position){\n");
      out.write("\t\tvar lat = position.coords.latitude;\n");
      out.write("\t\tvar lon = position.coords.longitude;\n");
      out.write("//\t\tvar alt = position.coords.altitude;\n");
      out.write("\t\t\n");
      out.write("//\t\tvar chaine = \"<p>Latitude : \" + lat + \"</p>\";\n");
      out.write("//\t\tchaine += \"<p>Longitude : \" + lon + \"</p>\";\n");
      out.write("//\t\tchaine += \"<p>Altitude : \" + alt + \"</p>\";\n");
      out.write("\t\t\n");
      out.write("//\t\t$(\"#maposition\").html(chaine);\n");
      out.write("\t\t\n");
      out.write("\t\tlat = 47.2261843;\n");
      out.write("\t\tlon = -1.6202782;\n");
      out.write("\t\t\n");
      out.write("\t\tvar latlng = new google.maps.LatLng(lat, lon);\n");
      out.write("\t\tvar myOptions = {\n");
      out.write("\t\t\tzoom : 14,\n");
      out.write("\t\t\tcenter : latlng,\n");
      out.write("\t\t\tmapTypeId : google.maps.MapTypeId.ROADMAP\n");
      out.write("\t\t};\n");
      out.write("\t\t\n");
      out.write("//\t\tvar map = new google.maps.Map(document.getElementById(\"map\"), myOptions);\n");
      out.write("\t\tvar map = new google.maps.Map($(\"#map\").get(0), myOptions);\n");
      out.write("\t\t\n");
      out.write("\t\tvar marker = new google.maps.Marker({\n");
      out.write("\t\t\tposition : latlng,\n");
      out.write("\t\t\tmap : map,\n");
      out.write("\t\t\ttitle : \"Ma position\"\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t</script>\n");
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
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Accueil</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"lister\">Liste des films</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"ajouter\">Ajouter un film</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"listerStyle\">Styles</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\">Qui sommes-nous</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\t\t\n");
      out.write("\t\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h1 class = \"bleu\">Nos coordonnées</h1>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-primary\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"panel-title\"><span class=\"pull-left\">Par téléphone</span> <span class=\"glyphicon glyphicon-phone-alt pull-right\"> </span> </h3>\n");
      out.write("\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>Du lundi au vendredi de 8h00 à 19h00</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"text-info\">02.28.03.17.28</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-footer\">\n");
      out.write("\t\t\t\t\t\t\t\t<span><small>N'hésitez pas à nous contacter</small></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-primary\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"panel-title\"><span class=\"pull-left\">Par mail ou courrier</span> <span class=\"glyphicon glyphicon-envelope pull-right\"> </span></h3>\n");
      out.write("\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body panel-body-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>2B rue Benjamin Franklin <br>\n");
      out.write("\t\t\t\t\t\t\t\t\tZAC Moulin Neuf <br>\n");
      out.write("\t\t\t\t\t\t\t\t\t44800 Saint-Herblain</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><span class=\"glyphicon glyphicon-phone-alt pull-right\"> </span></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a href=\"mailto:ecole@eni-ecole.fr\">ecole@eni-ecole.fr</a></p>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12 col-sm-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-primary\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"panel-title\"><span class=\"pull-left\">Par réseau social</span> <span class=\"glyphicon glyphicon-link pull-right\"> </span></h3>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body panel-body-info\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-6 text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a target=\"viadeo\" href=\"http://fr.viadeo.com/fr/company/eni-ecole-informatique\"><img src=\"img/viadeo.png\" border=\"0\" alt=\"Profil Viadeo\"/></a></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a target=\"viadeo\" href=\"http://fr.viadeo.com/fr/company/eni-ecole-informatique\">Viadeo</a></p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-xs-6 text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<p></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a target=\"in\" href=\"https://fr.linkedin.com/edu/eni-ecole-informatique-201017\" style=\"text-decoration:none;\"><span style=\"font: 80% Arial,sans-serif; color:#0783B6;\"><img src=\"img/icone-in.png\" width=\"36\" height=\"36\" alt=\"Voir le profil LinkedIn de Sopra Steria\" style=\"vertical-align:middle;\" border=\"0\"></span></a></p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p><a target=\"in\" href=\"https://fr.linkedin.com/edu/eni-ecole-informatique-201017\" >Linked In</a></p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div><p></p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t<div id=\"map\"></div>\n");
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
