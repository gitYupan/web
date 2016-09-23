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
    <title>系统登录</title>
    <meta name="keywords" content="YihouUI 是基于bootscrap的前端UI组件框架。">
    <meta name="description"
          content="yihou,YihouUI,java,j2ee,j2ee.top,eclipse,插件,idea,Framework,ui引擎,ui engine,模块化,业务单元,flow,流程,业务流,页面流,Java,SOA,框架,组件,分层,水平扩展,db cluster,framework,框架,分布式计算,Web">
    <link rel="icon" href="${pageContext.request.contextPath}/static/img/favicon.ico">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/static/img/favicon.ico">
    <script>
        var contextPath = "${pageContext.request.contextPath}";
    </script>
    <!--[if IE 8 ]>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/html5shiv.min.js"></script>
    <![endif]-->
    <link href="${pageContext.request.contextPath}/static/plugins/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/font-awesome/4.5.0/css/font-awesome.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/typography/0.0.1/css/typography.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/base.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/admin.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/ie8.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/login/0.0.1/css/login.css" rel="stylesheet">
</head>
<body>
    <div class="login-part">
        <div class="user-pic"></div>
        <div class="form-wrap">
            <form action="" method="post" id="" autocomplete="off">
                <h3 class="web-info mt-0">管理系统登录</h3>
                <div class="form-group ">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-user"></i></span>
                        <input type="text" class="form-control" name="pusername" placeholder="用户名" required/>
                    </div>
                </div>
                <div class="form-group  has-feedback">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                        <input type="password" class="form-control" name="ppassword" autocomplete="off" placeholder="密码" required/>
                    </div>
                    <span class="fa fa-keyboard-o form-control-feedback" aria-hidden="true"></span>
                </div>
                <div class="form-group"><input type="submit" value="登 录" id="btn-submit" class="btn btn-primary form-control"></div>
            </form>
        </div>
    </div>
</body>
</html>
