<%--
  Created by IntelliJ IDEA.
  User: liujianmeng
  Date: 16/4/8
  Time: 23:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../css/style.css" type="text/css">
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/scripts/jqgrid/css/jquery-ui.theme.min.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/scripts/jqgrid/css/ui.jqgrid.css" />
    <script src="${pageContext.request.contextPath}/scripts/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/scripts/jqgrid/js/i18n/grid.locale-en.js"></script>
    <script src="${pageContext.request.contextPath}/scripts/jqgrid/js/jquery.jqGrid.min.js"></script>
    <title>智能停车场管理系统</title>
</head>
<body>
<div class="all-container">
    <div class="headers-region" style="width: 100%;height: 50px;border-bottom: 1px solid slategray">
        <div style="width: 8%;height:50px;line-height:50px;float: left;">
            <img src="../images/logo.png" style="width: 50px;height: 50px;margin-left: 40px">
        </div>
        <div style="font-size: 30px;height: 50px;line-height: 50px;float: left">智能停车场收费管理系统</div>
        <div style="width: 20%;height:50px;line-height:50px;float: right;text-align:center">欢迎您:${user.userName}</div>
    </div>
    <div class="arrow" style="float: left;width: 100%;height: 92%;  ">
        <div class="menu" style="height: 100%;width: 15%;float:left;">
            <div style="width: 100%;height: 20px"></div>
            <a href="${pageContext.request.contextPath}/vips/findAllTest" target="mainFrame" style="margin-top: 50px" class="menu-button">会员管理</a><br>
            <a href="${pageContext.request.contextPath}/vips/mapTest" target="mainFrame" class="menu-button">模拟迁移</a><br>
            <a href="../welcome.jsp" target="mainFrame" class="menu-button">用户管理</a><br>
            <a href="../welcome.jsp" target="mainFrame" class="menu-button">收费设置</a><br>
            <a href="../welcome.jsp" target="mainFrame" class="menu-button">营&nbsp;&nbsp;业&nbsp;&nbsp;额</a>
        </div>
        <div class="content" style="height: 100%;width: 85%;float: left;">
            <iframe src="../welcome.jsp"   name="mainFrame" frameborder="0" marginheight="0" marginwidth="0" height="100%" width="100%"></iframe>
        </div>
    </div>
</div>
</body>
</html>
