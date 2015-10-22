<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>SSE Interview Test || Error</title>
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
                        <li><button type="button" class="btn btn-default"><s:a href="index.jsp"
                                                                               target="_blank">Return Home</s:a></button></li>
                        <li><button type="button" class="btn btn-default"><s:a href="log.jsp"
                                                                               target="_blank">View Data</s:a></button></li>
                    </ul>
                </nav>
            </div>
            <hr noshade />
            <div class="row">
                <h2>ERROR</h2>
                <s:action name="result" var="entry" />
                <div class="col-lg-6 exception">
                <h2>Exception name: ${entry.exception}</h2>
                <h2>Exception stack trace: ${entry.exceptionStack}</h2>
                </div>
            </div>
        </div>
    </body>
</html>
