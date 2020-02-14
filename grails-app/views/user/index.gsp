<%--
  Created by IntelliJ IDEA.
  User: anoreen
  Date: 2/10/2020
  Time: 2:53 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>

<g:form action="upload" enctype="multipart/form-data" useToken="true">

    <span class="button">
        <input type="file" name="userFile"/>
        <input type="submit" class="upload" value="upload"/>

    </span>

</g:form>
</body>
</html>