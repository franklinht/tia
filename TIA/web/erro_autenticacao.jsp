<%-- 
    Document   : index
    Created on : 08/11/2012, 22:11:33
    Author     : 30959306
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="themes/wikimedia.min.css" />
        <link rel="stylesheet" href="http://code.jquery.com/mobile/1.2.0/jquery.mobile.structure-1.2.0.min.css" />
        <script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
        <script src="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.js"></script>
        <title>TIA - Terminal Academico</title>
    </head>
    <body>
        <div class="preview ui-shadow swatch">
            <div class="ui-header ui-bar-a" data-swatch="a" data-theme="a" data-form="ui-bar-a" data-role="header" role="banner">
                <a href = "menu.aspx" class="ui-btn-left ui-btn ui-btn-icon-notext ui-btn-corner-all ui-shadow ui-btn-up-a" data-iconpos="notext" data-theme="a" data-role="button" data-icon="home" title=" Home ">
                    <span class="ui-btn-inner ui-btn-corner-all">
                        <span class="ui-btn-text"> cotonete</span>
                        <span data-form="ui-icon" class="ui-icon ui-icon-home ui-icon-shadow"></span>
                    </span>
                </a>
                <h1 class="ui-title" tabindex="0" role="heading" aria-level="1">TIA - Terminal Academico</h1>
                <a class="ui-btn-right ui-btn ui-btn-icon-notext ui-btn-corner-all ui-shadow ui-btn-up-a" data-iconpos="notext" data-theme="a" data-role="button" data-icon="grid" title=" Navigation ">
                    <span class="ui-btn-inner ui-btn-corner-all">
                        <span class="ui-btn-text"> chinelo </span>
                        <span data-form="ui-icon" class="ui-icon ui-icon-grid ui-icon-shadow"></span>
                    </span>
                </a>
            </div>

            <!-- padroes comecam aqui -->
            <div class="ui-content ui-body-a" data-theme="a" data-form="ui-body-a" data-role="content" role="main" >
                <table width="100%" height="100%" align="center">
                    <tr>
                        <td align="center">
                            Erro na autenticação: Verifique os valores digitados (TIA - Senha) e tente novamente. Você não tem permissão para entrar no sistema.
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </body>
</html>
