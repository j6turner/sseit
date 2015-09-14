<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>SSE Interview Test || Entry</title>
    </head>
    <body>
    <h1>Test</h1>

    <s:form action="result">
        <s:textfield name="os" label="Operating System (OS)" />
        <s:textfield name="osVersion" label="OS Version" />
        <s:textarea name="notes" label="Notes" />
        <s:submit value="Submit" />
    </s:form>
    
    </body>
</html>
