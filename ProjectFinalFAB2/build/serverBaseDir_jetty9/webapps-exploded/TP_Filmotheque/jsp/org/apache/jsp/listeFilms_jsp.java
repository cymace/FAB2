package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listeFilms_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("\t<script src=\"js/commun.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/commun.css\">\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write(".centre {\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("img {\n");
      out.write("\tvertical-align: bottom;\n");
      out.write("}\n");
      out.write("</style>\n");
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
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\">Liste des films</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"ajouter\">Ajouter un film</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"listerStyle\">Styles</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"geo.jsp\">Qui sommes-nous</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\t\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t<h1 class=\"bleu\">Liste des films</h1>\n");
      out.write("\t<br><br>\n");
      out.write("\t<table class=\"table table-hover table-striped\">\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<th>Titre </th>\n");
      out.write("\t\t\t<th>Année </th>\n");
      out.write("\t\t\t<th>Style</th>\n");
      out.write("\t\t\t<th>Réalisateur</th>\n");
      out.write("\t\t\t<th>Durée </th>\n");
      out.write("\t\t\t<th>Vu</th>\n");
      out.write("\t\t\t<th></th>\n");
      out.write("\t\t\t<th></th>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listeF}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("f");
    _jspx_th_c_forEach_0.setVarStatus("bStatus");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t<tr>\n");
          out.write("\t\t\t\t<td><a href=\"afficher?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.titre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></td>\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.annee}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.style.libelle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.real.prenom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.real.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.duree}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.vu?\"Oui\":\"Non\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t<td class=\"centre\">\n");
          out.write("\t\t\t\t\t<span class=\"modif glyphicon glyphicon-edit vert\"  id=\"m");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></span>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t\t<td class=\"centre\">\n");
          out.write("\t\t\t\t\t<span class=\"glyphicon glyphicon-remove rouge supp\"  id=\"s");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${f.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></span>\n");
          out.write("\t\t\t\t</td>\n");
          out.write("\t\t\t</tr>\n");
          out.write("\t\t");
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
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
