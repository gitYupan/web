<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <title><sitemesh:write property='title'/></title>
    <link rel="icon" href="${pageContext.request.contextPath}/static/img/favicon.ico">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/img/favicon.ico">
    <%--
        todo
        添加css样式
    --%>
    <sitemesh:write property='head'/>
    <script>
        var ctx = "${pageContext.request.contextPath}";
    </script>
</head>
<body>

<!-- 开始加入页面内容 -->
<div>
    <sitemesh:write property='body'/>
</div>
<!-- 加入页面内容结束 -->

<!-- 系统默认js开始 -->
<!-- 系统默认js结束 -->
<!-- 页面自定义js开始 -->
<sitemesh:write property='pagejs'/>
<!-- 页面自定义js结束 -->
</body>
</html>