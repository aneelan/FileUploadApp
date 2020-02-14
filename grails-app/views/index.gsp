<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>

Hello ${params.message}
<a href="${createLink(action:'index', controller:'user')}"> File Upload </a>

</body>
</html>
