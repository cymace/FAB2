package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listeStyles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/commun.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/commun.css\">\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".centre {\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
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
      out.write("\t\t\t\t<a href=\"index.jsp\" class=\"navbar-brand active\"> <span\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-film\"></span> <span\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-film\"></span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\"#navbar-main\">\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"navbar-collapse collapse\" id=\"navbar-main\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Accueil</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"lister\">Liste des films</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"ajouter\">Ajouter un film</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\">Styles</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"geo.jsp\">Qui sommes-nous</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h1 class=\"bleu\">Gestion des styles</h1>\n");
      out.write("\t\t<br> <br>\n");
      out.write("\t\t<table class=\"table table-hover table-striped\">\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>id</th>\n");
      out.write("\t\t\t\t<th>Libelle </th>\n");
      out.write("\t\t\t\t<th>&nbsp;</th>\n");
      out.write("\t\t\t\t<th>&nbsp;</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\n");
      out.write("\t\t<br><br><br>\n");
      out.write("\t\t<h2 class=\"bleu\">Nouveau style :</h2>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<form action=\"ajouterStyle\" method=\"POST\" class=\"form-horizontal\" >\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-10\">\n");
      out.write("\t\t\t\t\t\t<input name=\"libelle\" placeholder=\"Libellé du style ...\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\"  />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-2\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary pull-right\">Envoyer</button>\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listeS}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("s");
    _jspx_th_c_forEach_0.setVarStatus("bStatus");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<form action=\"modifStyle\" method=\"Post\">\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"libelle\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.libelle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" /></td>\n");
          out.write("\t\t\t\t\t\t<td class=\"centre\">\n");
          out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"glyphicon glyphicon-edit vert\"></button>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t\t<td class=\"centre\">\n");
          out.write("\t\t\t\t\t\t\t<a href=\"supprimerStyle?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-remove rouge\"></span>\n");
          out.write("\t\t\t\t\t\t\t</a>\n");
          out.write("\t\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t</form>\n");
          out.write("\t\t\t");
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
