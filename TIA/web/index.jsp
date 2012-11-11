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
        <title>TIA - Terminal Academico </title>
    </head>
    <body>
        <div class="preview ui-shadow swatch">
            <div class="ui-header ui-bar-a" data-swatch="a" data-theme="a" data-form="ui-bar-a" data-role="header" role="banner">
                <h1 class="ui-title" tabindex="0" role="heading" aria-level="1">TIA - Terminal Academico</h1>
            </div>

            <!-- padroes comecam aqui -->
            <div class="ui-content ui-body-a" data-theme="a" data-form="ui-body-a" data-role="content" role="main">
                <form method="POST" action="Login">
                    Tia: <input name="login" id="login" type="text" value="30959306" class="input ui-input-text ui-body-a ui-corner-all ui-shadow-inset" data-form="ui-body-a"></input>
                    Senha: <input name="senha" id="senha" type="text" value="frank" class="input ui-input-text ui-body-a ui-corner-all ui-shadow-inset" data-form="ui-body-a"></input>
                    <br /><button id="bt_login" data-icon="star" data-theme="b" data-form="ui-btn-up-b" class="ui-btn-hidden" aria-disabled="false" onclick="Login">Login</button>
                </form>
            </div>
        </div>
    </body>
</html>
