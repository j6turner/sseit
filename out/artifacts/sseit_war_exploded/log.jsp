<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>SSE Interview Test || Log</title>
    </head>
    <body>
        <h1>OS Information</h1>
        OS: <s:property value="os" /> <br />
        OS Version: <s:property value="osVersion" /> <br />
        Notes: <s:property value="notes" />
    </body>
</html>
