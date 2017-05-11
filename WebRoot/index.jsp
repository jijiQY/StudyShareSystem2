<%@ page language="java"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8">
    <title>首页</title>
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <meta name="viewport" content="width=device-width,inital-sacle=1">
    <meta name="renderer" content="webkit" >
    <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="assets/css/demo.css"/>
    <link rel="stylesheet" href="assets/css/tab.css" />
     <link rel="stylesheet" href="assets/css/body.css" />
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/amazeui.min.js"></script>
    <script src="assets/js/responsiveslides.min.js"></script>
    <!--mask -->
    <link rel="stylesheet" href="assets/css/mask.css" />
    <script src="assets/js/mask.js"></script>
</head>
<body>
<jsp:include page="WEB-INF/views/html/header.html"></jsp:include>
<!--container   内容 begin-->
<div class="am-g am-g-fixed blog-g-fixed">
    <!--左边分享内容  begin-->
    <div class="am-u-md-8">
    <!--ImageTurn 图片轮播  -->
       <jsp:include page="WEB-INF/views/html/imageTurn.html"></jsp:include>
        <!--tab文章 start-->
        <article class="blog-main articleTab" >
            <div class="am-g blog-content">
                <div class="am-u-lg-7">
                    <p>你自信滿滿的跟客戶進行第一次 demo。秀出你精心設計的內容時，你原本期許客戶冷不防地掉下感動的眼淚。</p>
                    <p>因為那實在是太高級了。</p>
                </div>
                <div class="am-u-lg-4">
                    <p><img src="images/ico.png"></p>
                </div>
            </div>
            <h4 class="am-article-meta blog-meta">by <a href="">open</a> posted on 2014/06/17 under <a href="#">字体</a></h4>
            <a href="#">全文阅读</a>
        </article>
        <article class="blog-main articleTab" >
            <div class="am-g blog-content">
                <div class="am-u-lg-7">
                    <p>你自信滿滿的跟客戶進行第一次 demo。秀出你精心設計的內容時，你原本期許客戶冷不防地掉下感動的眼淚。</p>
                    <p>因為那實在是太高級了。</p>
                </div>
                <div class="am-u-lg-4">
                    <p><img src="images/ico.png"></p>
                </div>
            </div>
            <h4 class="am-article-meta blog-meta">by <a href="">open</a> posted on 2014/06/17 under <a href="#">字体</a></h4>
            <a href="#">全文阅读</a>
        </article>
      <!--  <hr class="am-article-divider blog-hr">-->
        <article class="blog-main articleTab">
            <div class="am-g blog-content">
                <div class="am-u-lg-7">
                    <p>你自信滿滿的跟客戶進行第一次 demo。秀出你精心設計的內容時，你原本期許客戶冷不防地掉下感動的眼淚。</p>
                    <p>因為那實在是太高級了。</p>
                </div>
                <div class="am-u-lg-4">
                    <p><img src="images/ico.png"></p>
                </div>
            </div>
            <h4 class="am-article-meta blog-meta">by <a href="">open</a> posted on 2014/06/17 under <a href="#">字体</a></h4>
            <a href="#">全文阅读</a>
        </article>

        <!--tab文章 start-->
    </div>
    <!--左边分享内容   内容 end-->
    <jsp:include page="WEB-INF/views/html/rightNav.html"></jsp:include>
</body>
</html>


