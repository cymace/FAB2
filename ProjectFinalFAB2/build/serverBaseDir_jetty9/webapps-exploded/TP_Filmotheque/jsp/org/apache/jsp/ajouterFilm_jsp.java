package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajouterFilm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE>\n");
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
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("\t\t\t\t\t<li ><a href=\"index.jsp\">Accueil</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"lister\">Liste des films</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\">Ajouter un film</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"listerStyle\">Styles</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"geo.jsp\">Qui sommes-nous</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\t\n");
      out.write("\t\n");
      out.write("<div class=\"container\">\t\n");
      out.write("\t<h1 class=\"bleu\">Ajout d'un film</h1>\n");
      out.write("\t<br><br>\n");
      out.write("\t\t<div>\n");
      out.write("\t<form action=\"ajouter\" method=\"POST\" class=\"form-horizontal\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\t\t\t\n");
      out.write("\t\t\t\t\t<label for=\"titre\" class=\"col-xs-2 control-label\">Titre :</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-10\">\n");
      out.write("\t\t\t\t\t\t<input id=\"titre\"  name=\"titre\"  placeholder=\"Titre du film ...\"  class=\"form-control\" /> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-group\">\t\t\t\n");
      out.write("\t\t\t\t\t<label for=\"annee\" class=\"col-xs-2 control-label\">Année :</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-10\">\n");
      out.write("\t\t\t\t\t\t<input id=\"annee\" name=\"annee\"  placeholder=\"Année de sortie ...\"  class=\"form-control\" /> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-group\">\t\t\t\n");
      out.write("\t\t\t\t\t<label for=\"style\" class=\"col-xs-2 control-label\">Style :</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-10\">\n");
      out.write("\t\t\t\t\t\t<select name=\"style\" id=\"style\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t</select>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\t\t\t\n");
      out.write("\t\t\t\t\t<label for=\"real.prenom\" class=\"col-xs-2 control-label\">Réalisateur :</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-5\">\n");
      out.write("\t\t\t\t\t\t<input id=\"real.prenom\"  name=\"real.prenom\"  placeholder=\"Prénom ...\"  class=\"form-control\" /> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-5\">\n");
      out.write("\t\t\t\t\t\t<input id=\"real.nom\" name=\"real.nom\"  placeholder=\"Nom ...\"  class=\"form-control\" /> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-group\">\t\t\t\n");
      out.write("\t\t\t\t\t<label for=\"duree\" class=\"col-xs-2 control-label\">Durée :</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-10\">\n");
      out.write("\t\t\t\t\t\t<input id=\"duree\" name=\"duree\"  placeholder=\"Durée du film (format h:mm) ...\"  class=\"form-control\" /> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-group\">\t\t\t\n");
      out.write("\t\t\t\t\t<label for=\"vu\" class=\"col-xs-2 control-label\">Vu :</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-10\">\n");
      out.write("\t\t\t\t\t\t<select id=\"vu\"  name=\"vu\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t\t\t<option value=\"true\">Oui</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"false\">Non</option>\n");
      out.write("\t\t\t\t\t\t</select>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-group\">\t\t\t\n");
      out.write("\t\t\t\t\t<label for=\"synopsis\" class=\"col-xs-2 control-label\">Synopsis :</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-10\">\n");
      out.write("\t\t\t\t\t\t<textarea name=\"synopsis\" id=\"synopsis\" rows=\"5\" placeholder=\"Résumé et commentaires ...\"  class=\"form-control\" ></textarea> \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-group\" >\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-offset-2 col-xs-10\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Envoyer</button>\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t\n");
      out.write("\t</form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\t\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listeStyles}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("s");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.libelle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(0);
    _jspx_th_c_forEach_1.setEnd(4);
    _jspx_th_c_forEach_1.setVar("ind");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<div class=\"form-group\">\t\t\t\n");
          out.write("\t\t\t\t\t\t<label for=\"prenom");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ind}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"col-xs-2 control-label\">Acteur ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ind + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" :</label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-xs-5\">\n");
          out.write("\t\t\t\t\t\t\t<input id =\"prenom");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ind}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"prenom");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ind}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" placeholder=\"Prénom ...\" class=\"form-control\"/>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-xs-5\">\n");
          out.write("\t\t\t\t\t\t\t<input name =\"nom");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ind}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  placeholder=\"Nom ...\" class=\"form-control\"/>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
