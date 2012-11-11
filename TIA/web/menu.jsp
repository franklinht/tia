<%-- 
    Document   : menu
    Created on : 08/11/2012, 22:20:29
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
        <title>TIA - Menu</title>
    </head>
    <body>
        <div class="preview ui-shadow swatch">
            <div class="ui-header ui-bar-a" data-swatch="a" data-theme="a" data-form="ui-bar-a" data-role="header" role="banner">
                <h1 class="ui-title" tabindex="0" role="heading" aria-level="1">TIA - Nota</h1>
            </div>
            <div class="ui-content ui-body-a" data-theme="a" data-form="ui-body-a" data-role="content" role="main">
                <form method="POST" action="Notas">
                    <button id="bt_notas" data-icon="star" data-theme="b" data-form="ui-btn-up-b" class="ui-btn-hidden" aria-disabled="false"> Notas </button>
                </form>
                <form method="POST" action="Faltas">
                    <button id="bt_faltas" data-icon="star" data-theme="b" data-form="ui-btn-up-b" class="ui-btn-hidden" aria-disabled="false" > Faltas </button>
                </form>
            </div> 
        </div>
    </body>
</html>
