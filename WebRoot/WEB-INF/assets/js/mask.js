/*  window.onload=function(){
	    var username=${sessionScope.username };
	  if(username)
	  { getSession(username);}
  }*/
	//弹出
		function ShowMask(show_div, bg_div) {
			document.getElementById(show_div).style.display = 'block';
			document.getElementById(bg_div).style.display = 'block';
			var bgdiv = document.getElementById(bg_div);
			var showdiv = document.getElementById(show_div);
			bgdiv.style.width = document.body.scrollWidth;
			showdiv.style.width= 
			$("#" + bg_div).height($(document).height());
		};
		//关闭
		function CloseMask(show_div, bg_div) {
			document.getElementById(show_div).style.display = 'none';
			document.getElementById(bg_div).style.display = 'none';
		};
		
		//登陆后
		function getSession(username){
			document.getElementById('#register').style.display='none';
			document.getElementById('#login').style.display='none';
			document.getElementById('#username').style.display='inline-block';
		}