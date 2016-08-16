<%--
  Created by IntelliJ IDEA.
  User: liujianmeng
  Date: 16/4/9
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/scripts/jqgrid/css/jquery-ui-1.7.1.custom.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/scripts/jqgrid/css/ui.jqgrid.css" />
    <title>客户信息</title>
    <script src="${pageContext.request.contextPath}/scripts/jquery-1.11.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/scripts/jqgrid/js/i18n/grid.locale-en.js"></script>
    <script src="${pageContext.request.contextPath}/scripts/jqgrid/js/jquery.jqGrid.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/vipManager.js"></script>
</head>
<body>
<div id="content-pane" style="width: 100%;height: 100%;background-color: aliceblue">
<table id="vip-table"></table>
</div>
</body>
</html>
