<%@page contentType="text/html"%>
<%@page  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta content="telephone=no" name="format-detection">
		<title>demo</title>

		<link rel="stylesheet" href="css/common.css" />
        
		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript">
			var w, h, className;

			function getSrceenWH() {
				w = $(window).width();
				h = $(window).height();
				$('#dialogBg').width(w).height(h);
			}

			window.onresize = function() {
				getSrceenWH();
			}
			$(window).resize();

			$(function() {
				getSrceenWH();

				//显示弹框
				$('#register').click(function() {
					className = $(this).attr('class');
					$('#dialogBg').fadeIn(300);
					$('#dialog').removeAttr('class').addClass('animated ' + className + '').fadeIn();
				});

				//关闭弹窗
				$('.claseDialogBtn').click(function() {
					$('#dialogBg').fadeOut(300, function() {
						$('#dialog').addClass('bounceOutUp').fadeOut();
					});
				});
			});
		</script>
	</head>

	<body>

		<div id="wrapper">
			<div class="box">
				<div class="demo">
					<button id="register" class="bounceIn">注册</button>
				</div>
				<div id="dialogBg"></div>
				<div id="dialog" class="animated">
					<img class="dialogIco" width="50" height="50" src="images/ico.png" alt="" />
					<div class="dialogTop">
						<a href="javascript:;" class="claseDialogBtn">关闭</a>
					</div>
					<form action="register" method="post" id="editForm">
						<ul class="editInfos">
							<li><label><font color="#ff0000">* </font>昵称：<input type="text" name="nickName" required value="" class="ipt"/></label></li>
							<li><label><font color="#ff0000">* </font>用户名：<input type="text" name="userName" required value="" class="ipt"/></label></li>
							<li><label><font color="#ff0000">* </font>密码：<input type="password" name="password" required value="" class="ipt"/></label></li>
							<li><label><font color="#ff0000">* </font>确认密码：<input type="password" name="password2" required value="" class="ipt"/></label></li>
							<li><label><font color="#ff0000">* </font>性别：<input type="radio" name="sex"  value="男" />男 <input type="radio" name="sex"  value="女"/>女</label></li>
							<li><label><font color="#ff0000">*</font>邮箱：<input type="email" name="email" class="ipt" /></label></li>
							<li><label><font color="#ff0000">*</font>电话：<input type="tel" name="phone" class="ipt"/></label></li>
							<li><label><font color="#ff0000">*</font>QQ：<input type="number" name="qq" class="ipt"/></label></li>
							<li><label><font color="#ff0000">*</font>角色：<input type="radio" name="role"  value="学生" />学生 <input type="radio" name="role"  value="老师"/>老师</label></li>
							<li><input type="submit" value="确认提交" class="submitBtn" /></li>
						</ul>

					</form>
				</div>
			</div>

		</div>
	</body>

</html>