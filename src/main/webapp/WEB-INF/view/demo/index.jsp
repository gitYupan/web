<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Yihou-UI展示</title>
    <link href="${pageContext.request.contextPath}/static/plugins/widget/0.0.1/css/widgets.css" rel="stylesheet">
    <style type="text/css">#content-wrapper {
        padding-left: 0;
        padding-right: 0;
    }
    </style>
</head>
<body>

<section id="widget-grid" class="widget-grid">
    <article class="col-lg-12 col-x">
        <div class="jarviswidget" id="wid-id-k1" data-widget-editbutton="false" data-widget-deletebutton="false">
            <header>
                <span class="widget-icon"><i class="fa fa-bar-chart"></i></span>
                <h2>即时动态</h2>
                <span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span>
            </header>
            <div class="widget-body" style="padding:0" role="content">
                <div style="padding:15px;">
                    123456
                </div>
            </div>
        </div>
    </article>
    <article class="col-lg-3 col-x">
        <div class="jarviswidget" id="wid-id-k2" data-widget-editbutton="false" data-widget-deletebutton="false">
            <header>
                <span class="widget-icon"><i class="fa fa-bar-chart"></i></span>
                <h2>即时动态</h2>
                <span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span>
            </header>
            <div class="widget-body" style="padding:0" role="content">
                <div style="padding:15px;">
                    123456
                </div>
            </div>
        </div>
    </article>
    <article class="col-lg-9 col-x">
        <div class="jarviswidget" id="wid-id-k3" data-widget-editbutton="false" data-widget-deletebutton="false">
            <header>
                <span class="widget-icon"><i class="fa fa-bar-chart"></i></span>
                <h2>即时动态</h2>
                <span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span>
            </header>
            <div class="widget-body" style="padding:0" role="content">
                <div style="padding:15px;">
                    123456
                </div>
            </div>
        </div>
    </article>
</section>

<pagejs>
    <script src="${pageContext.request.contextPath}/static/plugins/widget/0.0.1/js/jarvis.widget.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/plugins/widget/0.0.1/js/widget.init.js"></script>
    <script type="text/javascript">
        $(function () {
            setup_widgets();
            if(typeof($.fn.mCustomScrollbar)!='undefined'){
                $('.col-lg-6 .widget-body>div,.col-lg-4 .widget-body>div').mCustomScrollbar({
                    set_height:'260px'
                });
            }else if(typeof($.fn.slimScroll)!='undefined'){
                $('.col-lg-6 .widget-body>div,.col-lg-4 .widget-body>div').slimScroll({
                    height: 260,
                    alwaysVisible: true,
                    color: '#888',
                    allowPageScroll: true
                });
            }
        });
    </script>
</pagejs>
</body>
</html>
