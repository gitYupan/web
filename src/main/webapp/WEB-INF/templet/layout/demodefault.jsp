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
        var contextPath = "${pageContext.request.contextPath}";
    </script>
    <!--[if IE 8 ]>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/html5shiv.min.js"></script>
    <![endif]-->
    <link href="${pageContext.request.contextPath}/static/plugins/layer/0.0.1/skin/layer.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/jqueryui/1.10.4/css/jquery.ui.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/font-awesome/4.5.0/css/font-awesome.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/animate/3.4.0/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/typography/0.0.1/css/typography.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/base.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/admin.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/ie8.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/totop/0.0.1/css/toTop.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/themes/clean/clean.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/themes/black/black.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/themes/deepblue/deepblue.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/themes/diy01/diy01.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/themes/fashion/fashion.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/themes/gray/gray.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/themes/green/green.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/themes/greenyellow/greenyellow.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/themes/lightblue/lightblue.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/themes/orange/orange.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/css/themes/purple/purple.css" rel="stylesheet">

    <script src="${pageContext.request.contextPath}/static/plugins/jquery/1.11.3/jquery.min.js"></script>

    <script src="${pageContext.request.contextPath}/static/plugins/layer/0.0.1/layer.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/layer/0.0.1/layer.ajax.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/moment/2.5.1/moment.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/jqueryui/1.10.4/js/jquery-ui.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/animate/3.4.0/js/animate.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/pixel-slimscroll.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/fastclick-0.6.11.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/jquery.cookie.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/resize.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/canvas-to-blob.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/time.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/switcher/0.0.1/js/switcher.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/app.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/events.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/utils.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/main-menu.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/main-navbar.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/jquery.slimscroll-1.3.2.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/totop/0.0.1/js/toTop.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/pjax/0.0.1/jquery.pjax.js"></script>
    <!--[if IE 8 ]>
    <script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/respond.min.js"></script>
    <![endif]-->
    <script type="application/javascript">
        var tinyTplList = [];
        tinyTplList.push({sort: 9, name: 'orange', title: '橙色', img: contextPath + '/static/img/themes/orange.png'});
        tinyTplList.push({sort: 10, name: 'purple', title: '紫色', img: contextPath + '/static/img/themes/purple.png'});
        tinyTplList.push({sort: 2, name: 'black', title: '黑色', img: contextPath + '/static/img/themes/black.png', logoImg: contextPath + '/img/logo-black.png'});
        tinyTplList.push({sort: 4, name: 'fashion', title: '时尚', img: contextPath + '/static/img/themes/fashion.png'});
        tinyTplList.push({sort: 1, name: 'clean', title: '清爽', img: contextPath + '/static/img/themes/clean.png'});
        tinyTplList.push({sort: 6, name: 'green', title: '绿色', img: contextPath + '/static/img/themes/greenyellow.png'});
        tinyTplList.push({sort: 11, name: 'diy01', title: '定制01', img: contextPath + '/static/img/themes/diy01.png'});
        tinyTplList.push({sort: 5, name: 'gray', title: '灰色', img: contextPath + '/static/img/themes/gray.png'});
        tinyTplList.push({sort: 8, name: 'lightblue', title: '浅蓝', img: contextPath + '/static/img/themes/lightblue.png'});
        tinyTplList.push({sort: 7, name: 'greenyellow', title: '黄绿', img: contextPath + '/static/img/themes/green.png'});
        tinyTplList.push({sort: 3, name: 'deepblue', title: '深蓝', img: contextPath + '/static/img/themes/deepblue.png'});
    </script>
    <sitemesh:write property='head'/>

</head>
<body class="main-menu-animated">
<script>var init = [];</script>
<script src="${pageContext.request.contextPath}/static/plugins/assets/0.0.1/js/setting.js"></script>
<div id="main-wrapper">
    <!-- 页面头部导航开始 -->
    <div id="main-navbar" class="navbar navbar-inverse" role="navigation">
        <button type="button" id="main-menu-toggle"><i class="navbar-icon fa fa-bars icon"></i><span class="hide-menu-text"></span></button>
        <div class="navbar-inner">
            <div class="navbar-header">
                <a href="javascript:void(0);" class="navbar-brand">
                    <div>
                        Yihou-组件化的开发框架
                    </div>
                </a>
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#main-navbar-collapse"><i class="navbar-icon fa fa-bars"></i></button>
            </div>
            <div id="main-navbar-collapse" class="collapse navbar-collapse main-navbar-collapse">
                <div>
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="#">首页</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">下拉</a>
                            <ul class="dropdown-menu">
                                <li><a href="#">菜单一</a></li>
                                <li><a href="#">菜单二</a></li>
                                <li class="divider"></li>
                                <li><a href="#">菜单三</a></li>
                            </ul>
                        </li>
                    </ul>
                    <div class="right clearfix">
                        <ul class="nav navbar-nav pull-right right-navbar-nav">
                            <li>
                                <form class="navbar-form pull-left">
                                    <input type="text" class="form-control" value="" placeholder="查找更多...">
                                    <span class="search-icon"><i class="fa fa-search"></i></span>
                                </form>
                            </li>
                            <li>
                                <a href="/tinyuiweb/" title="1.0版">1.0版</a>
                            </li>
                            <li>
                                <a href="#" target="_blank">表单设计器</a>
                            </li>
                            <li>
                                <a href="#" target="_blank" title="基础工程下载">基础工程下载</a>
                            </li>
                            <li class="dropdown">
                                <a href="javascript:void(0);" class="dropdown-toggle user-menu" data-toggle="dropdown">
                                    <%--<img src="" alt="">--%>
                                    <span>用户名</span>
                                </a>
                                <ul class="dropdown-menu">
                                    <li><a href="javascript:void(0);"><span class="label label-warning pull-right">新的</span>资料文件</a></li>
                                    <li><a href="javascript:void(0);"><span class="badge badge-primary pull-right">新的</span>个人中心</a></li>
                                    <li><a href="javascript:void(0);"><i class="fa fa-cog"></i>&nbsp;&nbsp;设置</a></li>
                                    <li class="divider"></li>
                                    <li><a href="javascript:void(0);"><i class="fa fa-power-off"></i>&nbsp;&nbsp;退出</a></li>
                                </ul>
                            </li>
                            <li class="fullscreen">
                                <a href="javascript:void(0);" onclick="launchFullScreen(document.documentElement);" title="全屏"><i class="fa fa-arrows-alt"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- 页面头部导航结束 -->
    <!-- 页面左侧菜单开始 -->
    <div id="main-menu" role="navigation">
        <div id="main-menu-inner">
            <ul class="navigation">
                <li>
                    <a href="${pageContext.request.contextPath}/demo/index" class="navitem" title="控制台" data-treeid="0">
                        <i class="menu-icon fa fa-home"></i>
                        <span class="mm-text">控制台</span>
                    </a>
                </li>
                <li class="mm-dropdown">
                    <a href="javascript:void(0);" class="navitem" title="UI元素" data-treeid="1">
                        <i class="menu-icon fa fa-desktop"></i>
                        <span class="mm-text">UI元素</span>
                    </a>
                    <ul>
                        <li class="mm-dropdown">
                            <a href="javascript:void(0);" class="navitem" title="弹出插件" data-treeid="1.1">
                                <span class="mm-text">弹出插件</span>
                            </a>
                            <ul>
                                <li>
                                    <a href="#" class="navitem" title="对话框/弹出层" data-treeid="1.1.1">
                                        <span class="mm-text">对话框/弹出层</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#" class="navitem" title="UED提示" data-treeid="1.1.2">
                                        <span class="mm-text">UED提示</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <div id="main-menu-bg"></div>
    <!-- 页面左侧菜单结束 -->
    <!-- 页面主内容开始 -->
    <div class="content-wrapper-bg"></div>
    <div id="content-wrapper">
        <div class="postion-nav">
            <ul class="breadcrumb">
                <li>所在位置：</li>
            </ul>
        </div>
        <div class="container-fluid">
            <div id="tinypagecontent" class="row" style="min-height:490px;">
                <!-- 开始加入页面内容 -->
                <sitemesh:write property='body'/>
                <!-- 加入页面内容结束 -->
            </div>
        </div>
        <!-- 页面尾部开始 -->
        <div id="tinyfooter">
            <div class="tinyfooterrap">
					<span class="right">
                        <!--
						<a class="record-num" target="_blank" href="http://www.beianbeian.com/search/tinygroup.org">浙ICP备14043110号-1</a>
					    -->
                    </span>
                Yihou官方网站 &copy; 2013-2016
            </div>
        </div>
        <!-- 页面尾部结束 -->
    </div>
    <!-- 页面主内容结束 -->
</div>
<!-- 系统默认js开始 -->
<script type="text/javascript">
    var advIe = (function () {
        "use strict";
        return !this;
    }());
    init.push(function () {
        //SyntaxHighlighter.highlight();
        var menucount = $(".navigation:first>li").size();
        $("#topmenurap .navigation>li").css("width", 100 / menucount + "%");
        var setFooterPostion = function () {
            $("#tinypagecontent").css("min-height", $(window).height() - $("#tinypagecontent").offset().top - $("#tinyfooter").height() + $(window).scrollTop() - 20 + "px");
        }
        $(window).on("scroll resize", function () {
            setFooterPostion();
        });
        setFooterPostion();
    });
    if (advIe) {
        $(function () {
            function initPageOtherInfo(e) {
                $("#main-menu-inner li").removeClass("active open");
                $(e).parents("li").addClass("active open");
                var href = $(e).attr("href");
                var setNavPos = false, currenttxt = "";
                $("#main-menu-inner a").each(function () {
                    if (!setNavPos && $(this).attr("href") == href) {
                        $('.postion-nav>.breadcrumb').html('<li>所在位置： </li><li>首页</li>');
                        $(this).parents("li").find("span:first").each(function () {
                            $('.postion-nav>.breadcrumb').append("<li>" + $(this).html() + "</li>");
                            currenttxt = $(this).html() + "-" + currenttxt;
                        });
                        $(this).closest("li").addClass("active");
                        setNavPos = true;
                    } else {
                        $(this).closest("li").removeClass("active");
                    }
                });
                $(document).attr("title", currenttxt + " YihouUi展示");
            }

            init.push(function () {
                var hash = location.pathname;
                $("#main-menu-inner .navigation li a[href]").each(function () {
                    if (!hash || hash == $(this).attr("href")) {
                        initPageOtherInfo(this);
                        return false;
                    }
                });
            });
            $(document).off("click.pjax").on("click.pjax", "[pjax-target]", function () {
                var jq_currentLink = $(this);
            });
        });
    }
</script>
<!-- 系统默认js结束 -->
<!-- 页面自定义js开始 -->
<sitemesh:write property='pagejs'/>
<!-- 页面自定义js结束 -->
</body>
</html>