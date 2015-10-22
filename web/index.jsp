<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>SSE Interview Test || Entry</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/stylesheet.css" rel="stylesheet" type="text/css" media="all" />
    </head>
    <body>
        <div class="container">
            <div id="navbar">
                <nav class="navbar navbar-transparent" role="navigation">
                    <div class="row">
                        <div class="logo col-md-3">
                            <img src="img/jt.png" alt="Logo" />
                        </div>
                        <div class="col-md-6">
                            <h3>Software Support Engineer Interview Test</h3>
                        </div>
                    </div>
                    <ul class="nav navbar-nav">
                        <li><button type="button" class="btn btn-default"><s:a href="log.jsp" target="_blank">View Log</s:a></button></li>
                    </ul>
                </nav>
            </div>
            <hr noshade />
            <div class="row-fluid">
                <div class="col-md-12">
                    <s:form action="result" class="entry" method="POST">
                        <s:textfield name="os" class="textfield" label="Operating System (OS)" placeholder="OS X"
                                     autofocus="autofocus" />
                        <s:textfield name="osVersion" class="textfield" label="OS Version" placeholder="10.0.3" />
                        <s:textarea name="notes" class="textfield" label="Notes" />
                        <s:submit value="Proceed" type="button" class="btn btn-default btn-lg" align="left" />
                    </s:form>
                </div>
            </div>
        </div>
    </body>
</html>
