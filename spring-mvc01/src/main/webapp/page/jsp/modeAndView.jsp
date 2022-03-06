<jsp:useBean id="form" scope="request" type="com.xkz.entity.Form"/>
<!DOCTYPE html>

<%@page contentType="text/html;charset=utf-8" language="java" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ModeAndView</title>
</head>
<body>
用户名：${form.username}
密码：${form.password}
</body>
</html>