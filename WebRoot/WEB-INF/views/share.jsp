<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
    <meta charset="UTF-8">
	<title>文章分享</title>
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
	<!--comments List-->
	<link rel="stylesheet" href="assets/css/comments.css"/>
	<script type="text/javascript" src="assets/js/comments.js"></script>
 <!--mask -->
    <link rel="stylesheet" href="assets/css/mask.css" />
    <script src="assets/js/mask.js"></script>
</head>
<body>
<jsp:include page="html/header.html"></jsp:include>
<!--container   内容 begin-->
<div class="am-g am-g-fixed blog-g-fixed">
	<!--左边分享内容  begin-->
	<div class="am-u-md-8">
		<!--tab文章 start-->
		<article class="blog-main">
			<h3 class="am-article-title blog-title">
				<a href="#">Google fonts 的字體（display 篇）</a>
			</h3>
			<h4 class="am-article-meta blog-meta">by <a href="">open</a> posted on 2014/06/17 under <a href="#">字体</a></h4>

			<div class="am-g blog-content">
				<div class="am-u-lg-7">
					<p><!-- 本demo来自 http://blog.justfont.com/ -->你自信滿滿的跟客戶進行第一次 demo。秀出你精心設計的內容時，你原本期許客戶冷不防地掉下感動的眼淚。</p>

					<p>因為那實在是太高級了。</p>

					<p>除了各項基本架構幾乎完美無缺之外，內文是高貴的，有著一些距離感的，典雅的襯線字體。不是 Times New
						Roman，而是很少有人見過的，你精心挑選過的字體，凸顯你品味的高超。而且它並沒有花上你與業主一毛錢，或許這也非常重要。</p>
				</div>
				<div class="am-u-lg-5">
					<p><img src="http://f.cl.ly/items/451O3X0g47320D203D1B/不夠活潑.jpg"></p>
				</div>
			</div>
			<div class="am-g">
				<div class="am-u-sm-12">
					<p>看著自己的作品，你的喜悅之情溢於言表，差點就要說出我要感謝我的父母之類的得獎感言。但在你對面的客戶先是一點表情也沒有，又瞬間轉為陰沉，抿了抿嘴角冷冷的說……</p>

					<p>「我要一種比較跳的感覺懂嗎？」</p>
				</div>
			</div>
            <div class="am-topbar-right" >
                <button class="am-btn am-btn-secondary am-topbar-btn am-btn-sm"> 评论</button>
				<button class="am-btn am-btn-secondary am-topbar-btn am-btn-sm">转载</button>
            </div>

		</article>
        <!--Comments-->
        <div id="list">
            <div class="comment-list">
                <div class="comment-box clearfix" user="self">
                    <img class="myhead" src="assets/i/my.jpg" alt=""/>
                    <div class="comment-content">
                        <p class="comment-text"><span class="user">我：</span>写的太好了。</p>
                        <p class="comment-time">
                            2014-02-19 14:36
                            <a href="javascript:;" class="comment-praise" total="1" my="0" style="display: inline-block">1 赞</a>
                            <a href="javascript:;" class="comment-operate">删除</a>
                        </p>
                    </div>
                </div>
            </div>
            <div class="text-box">
                <textarea class="comment" autocomplete="off">评论…</textarea>
                <button class="btn ">回 复</button>
                <span class="word"><span class="length">0</span>/140</span>
            </div>
        </div>
        <!--Comments End-->
		<!--tab文章 start-->
		<hr class="am-article-divider blog-hr">
		<ul class="am-pagination blog-pagination">
			<li class="am-pagination-prev"><a href="">&laquo; 上一篇</a></li>
			<li class="am-pagination-next"><a href="">下一篇 &raquo;</a></li>
		</ul>
	</div>
	<script>

	</script>
	<!--左边分享内容   内容 end-->
<jsp:include page="html/rightNav.html"></jsp:include>
</body>
</html>