<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8">
    <title>发表文章</title>
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <meta name="viewport" content="width=device-width,inital-sacle=1">
    <meta name="renderer" content="webkit" >
    <link rel="stylesheet" href="assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="assets/css/demo.css"/>
    <link rel="stylesheet" href="assets/css/tab.css" />
     <link rel="stylesheet" href="assets/css/body.css" />
    <link href="assets/edits/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="assets/edits/css/froala_editor.min.css" rel="stylesheet" type="text/css">
    <script src="assets/js/jquery-1.11.1.min.js"></script>
    <script src="assets/js/jquery.min.js"></script>
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
        <!--位置所在-->
        <div style="padding-left: 20px">
            <strong>您所在的位置：<a href="#">江西财经大学</a></strong>
        </div>
        <hr>
        <!--位置所在end-->
<jsp:include page="html/edits.html"></jsp:include>
  </div>

    <!--左边分享内容   内容 end-->
<jsp:include page="html/rightNav.html"></jsp:include> 
</body>
</html>