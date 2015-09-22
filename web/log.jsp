<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>SSE Interview Test || Log</title>
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
                            <h1>JULIE TURNER</h1>
                            <h3>Software Support Engineer Interview Test</h3>
                        </div>
                    </div>
                    <ul class="nav navbar-nav">
                        <li><button type="button" class="btn btn-default"><s:a href="index.jsp"
                                                                               target="_blank">Return Home</s:a></button></li>
                    </ul>
                </nav>
            </div>
            <hr noshade />
            <div class="row-fluid">
                <h4>OS Information</h4>
                <div class="result">
                    <div class="col-md-12">
                        <p>New record has been logged:</p>
                        <ul>
                            <li>OS: <strong><s:property value="os" /></strong></li>
                            <li>OS Version: <strong><s:property value="osVersion" /></strong></li>
                            <li>Notes: <strong><s:property value="notes" /></strong></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="row-fluid">
                <div class="table-responsive">
                    <div class="col-md-12">
                        <h5>All records:</h5>
                        <table class="entries" border="2">
                            <tr>
                                <th>ID</th>
                                <th>OS</th>
                                <th>OS Version</th>
                                <th>Notes</th>
                                <th>Timestamp</th>
                            </tr>
                            <s:iterator value="list">
                                <tr>
                                    <td><s:property value="id" /></td>
                                    <td><s:property value="os" /></td>
                                    <td><s:property value="osVersion" /></td>
                                    <td><s:property value="notes" /></td>
                                    <td><s:property value="timestamp" /></td>
                                </tr>
                            </s:iterator>
                        </table>
                    </div>
                </div>
            </div>

        </div>
    </body>
</html>
