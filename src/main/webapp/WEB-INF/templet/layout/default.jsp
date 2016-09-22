<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cmn-Hans-CN">
<head>
    <meta charset="utf-8"/>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <title><sitemesh:write property='title'/></title>
    <meta name="keywords" content="YihouUi 是基于bootscrap的前端UI组件框架。">
    <meta name="description"
          content="java,j2ee,j2ee.top,eclipse,插件,idea,Framework,ui引擎,ui engine,模块化,业务单元,flow,流程,业务流,页面流,Java,SOA,框架,组件,分层,水平扩展,db cluster,framework,框架,分布式计算,Web">
    <link rel="icon" href="${pageContext.request.contextPath}/static/img/favicon.ico">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/img/favicon.ico">
    <script>
        var ctx = "${pageContext.request.contextPath}";
    </script>
    <!--[if IE 8 ]>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/html5shiv.min.js"></script>
    <![endif]-->
    <link href="${pageContext.request.contextPath}/static/plugins/layer/0.0.1/skin/layer.css">
    <link href="${pageContext.request.contextPath}/static/plugins/bootstrap/3.3.5/css/bootstrap.css">
    <link href="${pageContext.request.contextPath}/static/plugins/jqueryui/1.10.4/css/jquery.ui.css">
    <link href="${pageContext.request.contextPath}/static/plugins/font-awesome/4.5.0/css/font-awesome.css">
    <link href="${pageContext.request.contextPath}/static/plugins/animate/3.4.0/css/animate.css">
    <link href="${pageContext.request.contextPath}/static/plugins/typography/0.0.1/css/typography.css">

    <script src="${pageContext.request.contextPath}/static/plugins/jquery/1.11.3/jquery.min.js"></script>

    <sitemesh:write property='head'/>

</head>
<body>

<!-- 开始加入页面内容 -->
<div>
    <sitemesh:write property='body'/>
</div>
<!-- 加入页面内容结束 -->

<!-- 系统默认js开始 -->
<script src="${pageContext.request.contextPath}/static/plugins/layer/0.0.1/layer.js"></script>
<script src="${pageContext.request.contextPath}/static/plugins/layer/0.0.1/layer.ajax.js"></script>

<script src="${pageContext.request.contextPath}/static/plugins/moment/2.5.1/moment.js"></script>
<script src="${pageContext.request.contextPath}/static/plugins/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/plugins/jqueryui/1.10.4/js/jquery-ui.js"></script>
<script src="${pageContext.request.contextPath}/static/plugins/animate/3.4.0/js/animate.js"></script>
<!-- 系统默认js结束 -->
<!-- 页面自定义js开始 -->
<sitemesh:write property='pagejs'/>
<!-- 页面自定义js结束 -->
</body>
</html>