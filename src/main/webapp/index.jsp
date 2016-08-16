<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <script src="${pageContext.request.contextPath}/scripts/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/index.js"></script>
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <title>管理员登录</title>
</head>
<body>
<div class="graphic-container">
    <div class="login-div">
        <form action="user/login" method="post">
            <table class="login_table" width="100%" height="100%" >
                <tr width="100%" height="40%"><td width="100%" align="center" colspan="2"><h2>智能停车场管理系统</h2></td></tr>
                <tr width="100%" height="20%">
                    <td width="40%" align="center">&nbsp;&nbsp;用户名：</td>
                    <td width="60%" align="left"><input type="text" name="userName"></td>
                </tr>
                <tr width="100%" height="20%">
                    <td width="40%" align="center">&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
                    <td width="60%" align="left"><input type="password" name="password"></td>
                </tr>
                <tr width="100%" height="20%">
                    <td width="40%" align="center"><input type="submit" value="登&nbsp;&nbsp;&nbsp;&nbsp;录"></td>
                    <td width="50%" align="center"><input type="reset" value="忘记密码"></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>
