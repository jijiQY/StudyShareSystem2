<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8">
		<meta name="renderer" content="webkit|ie-comp|ie-stand">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="Bookmark" href="favicon.ico">
		<link rel="Shortcut Icon" href="favicon.ico" />
		<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
		<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
		<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
		<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
		<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
		<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
		<link rel="stylesheet" href="layui/css/layui.css" />
		<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
		<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
        <script type="text/javascript" src="js/page.js"></script>
		<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
		<!--/meta 作为公共模版分离出去-->

		<title>H-ui.admin v3.0</title>
		<meta name="keywords" content="">
		<meta name="description" content="">
		<link rel="stylesheet" href="css/style.css" />
	</head>
	<style type="text/css">
		.dataTables_filter {
			position: relative;
			float: right;
			right: 10px;
		}
		
		.input-text {
			height: 30px;
			width: 100px;
		}
		.faceShow{
	width:100%;
	margin:0 auto;
	position:relative;
}
.faceShow span{
	line-height:10px;
	padding:5px;
	width:10%;
	text-align:center;
	border:1px #000000 solid;
	
}
#faceContent{
	width:800px;
	border:1px #CCCCCC solid;
	display:none;
	border-radius:5px;
}
#clipDIV ul{
	width:600px;
	margin:0 auto;
}
	</style>
<body onload="clipInit()">
		<!--_header 作为公共模版分离出去-->
		<header class="navbar-wrapper">
			<div class="navbar navbar-fixed-top">
				<div class="container-fluid cl">
					<a class="logo navbar-logo f-l mr-10 hidden-xs" href="index.html">学习分享系统后台</a>

					<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
						<ul class="cl">
							<li>超级管理员</li>
							<li  class="dropDown dropDown_hover" >
								<a href="javascript:;" class="dropDown_A radius" onclick="noticeIssue('发布公告','notice-issue.html','','300')">发布公告<i class="Hui-iconfont"> &#xe692;</i></a>
                                 
							</li>
							<li class="dropDown dropDown_hover" onclick="exit()">
								<a href="#" class="dropDown_A">退出 <i class="Hui-iconfont">&#xe6a6;</i></a>

							</li>

							<li id="Hui-skin" class="dropDown right dropDown_hover">
								<a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
								<ul class="dropDown-menu menu radius box-shadow">
									<li>
										<a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a>
									</li>
									<li>
										<a href="javascript:;" data-val="blue" title="蓝色">蓝色</a>
									</li>
									<li>
										<a href="javascript:;" data-val="green" title="绿色">绿色</a>
									</li>
									<li>
										<a href="javascript:;" data-val="red" title="红色">红色</a>
									</li>
									<li>
										<a href="javascript:;" data-val="yellow" title="黄色">黄色</a>
									</li>
									<li>
										<a href="javascript:;" data-val="orange" title="橙色">橙色</a>
									</li>
								</ul>
							</li>
						</ul>
					</nav>
				</div>
			</div>
		</header>
		<!--/_header 作为公共模版分离出去-->

		<!--_menu 作为公共模版分离出去-->
		<aside class="Hui-aside">

			<div class="menu_dropdown bk_2">
				<dl id="menu-article">
					<dt><i class="Hui-iconfont">&#xe720;</i> 分享管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
					<dd>
						<ul>
							<li>
								<a href="shareManager" title="分享管理">分享管理</a>
							</li>
						</ul>
					</dd>
				</dl>
				<dl id="menu-picture">
					<dt><i class="Hui-iconfont">&#xe622;</i> 评论管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
					<dd>
						<ul>
							<li>
								<a href="commentManager" title="评论管理">评论管理</a>
							</li>
						</ul>
					</dd>
				</dl>
				<dl id="menu-product">
					<dt><i class="Hui-iconfont">&#xe60d;</i> 用户信息管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
					<dd>
						<ul>
							<li>
								<a href="userMessageManager" title="用户信息管理">用户信息管理</a>
							</li>
						</ul>
					</dd>
				</dl>

				<dl id="menu-admin">
					<dt class="selected"><i class="Hui-iconfont">&#xe693;</i> 分享圈管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
					<dd>
						<ul>
							<li>
								<a href="circleManager" title="分享圈管理">分享圈管理</a>
							</li>

						</ul>
					</dd>
				</dl>

			</div>
		</aside>
		<div class="dislpayArrow hidden-xs">
			<a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a>
		</div>
		<!--/_menu 作为公共模版分离出去-->

		<section class="Hui-article-box">
			<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 分享管理
				<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新"><i class="Hui-iconfont">&#xe68f;</i></a>
			</nav>

			<div class="mt-20">
				<div id="DataTables_Table_0_filter" class="dataTables_filter"><label>从当前数据中检索:
					<input type="search" class="input-text " aria-controls="DataTables_Table_0"></label></div>

				<table class="table table-border table-bordered table-hover table-bg table-sort">
					<thead>
						<tr class="text-c">

							<th width="80">ID</th>
							<th width="100">作者</th>
							<th width="150">发布时间</th>
							
							<th width="250">文章标题</th>
					        
							<th width="70">发布状态</th>
							<th width="100">操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${page.content }" var="shareManager">
				<tr class="text-c">
					<td >${shareManager.id }</td>
					<td >${shareManager.user.nickName }</td>
					<td>
						<fmt:formatDate value="${shareManager.pubTime }" pattern="yyyy-MM-dd hh:mm:ss"/>
					</td>
					<td>${shareManager.title }</td>
					<td >${shareManager.state }</td>
					<td>
					<button class="btn radius btn-primary size-S" onclick="lookover('')">查看</button>
								<button class="btn radius btn-primary size-S"onclick="del(this,'${shareManager.id }')" id="sanchu">删除</button>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="8">
					共 ${page.totalElements } 条记录
					共 ${page.totalPages } 页
					当前 ${page.number + 1 } 页
					<a href="?pageNo=${page.number + 1 - 1 }">上一页</a>
					<a href="?pageNo=${page.number + 1 + 1 }">下一页</a>
				</td>
			</tr>
					</tbody>
				</table>

			</div>

			
			
			
			
			<div style="width:60%; margin:20px auto; padding:5px;" id="clipDIV">

</div>
		</section>

		<!--_footer 作为公共模版分离出去-->
		<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
		<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
		<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script>
		<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.page.js"></script>
		<!--/_footer /作为公共模版分离出去-->

		<!--请在下方写此页面业务相关的脚本-->
		<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
		<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
		<script src="layui/lay/dest/layui.all.js"></script>
		<script type="text/javascript">
			
			function exit() {
				var a = confirm("确定退出吗?");
				if(a == true) {

					//window.location.assign("https://www.baidu.com/");

					window.open("https://www.baidu.com/");
					window.close();
				}

			}
			
		function del(obj,shareManager_id){
				
			 confirm_ = confirm('确定删?');
			 
			 if(confirm_){
			 		$(obj).parents("tr").remove();
		            $.ajax({
		                type:"POST",
		                url:"deleteShare",
		                data : {  
		                	"id":shareManager_id
	                    },
		                success:function(){
		                },
		            error:function(){
		            }
		            });
		        }
		    }
				
				
				
		
			function noticeIssue(title,url,w,h){
			
			layer_show(title,url,w,h);
			}
			
			function lookover(articleID){
			
			}
			
			
			
		</script>

		<!--/请在上方写此页面业务相关的脚本-->
	</body>

</html>