<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title></title>
</head>
<body>

<g:form action="index" method="POST" enctype="multipart/form-data" >
    <input type="text" value="Multipart 200"/>
    <input type="submit"/>
</g:form>

<g:form action="sendError403" method="POST">
    <input type="text" value="Simple post 403"/>
    <input type="submit"/>
</g:form>

<g:form action="sendError403" method="POST" enctype="multipart/form-data" >
    <input type="text" value="Multipart post 403"/>
    <input type="submit"/>
</g:form>

</body>
</html>