 
<!doctype html>
<html>
 <head>
 	<link href="/news/css/1.css" rel="stylesheet" type="text/css">
 	<meta charset="utf-8"> 
 	<script type="text/javascript"> 
 		function getOnePage(type){
    	  	var url1;
    	  	var page=document.getElementById("page");
    	  	var pageSize=document.getElementById("pageSize");
    	  	var totalPageCount=document.getElementById("totalPageCount");
			
    	  	pageValue=parseInt(page.value);
    	  	if(type=="pre"){
    	  		pageValue-=1;
    	  		page.value=pageValue.toString();
    	  	}else if(type=="next"){
    	  		pageValue+=1;
    	  		page.value=pageValue.toString();
    	  	}
    	  	//提交
    	  	document.getElementById('myform').submit();
      	}
	</script>  
  </head>
  	  <div class="newsShowByType_frame center" >
  	  	<div class="newsShowByType_left">
  	  		<ul style="list-style-type: none;">
		    	<li><a href="/news/servlet/UserServlet?type1=showPrivate" target='frame'>显示个人信息</a></li>
  				<li><a href="/news/servlet/UserServlet?type1=changePrivate1" target='frame'>修改个人信息</a></li>
  				<li><a href="/news/user/manage/changePassword.jsp" target='frame'>修改密码</a></li>
  	  		</ul>
		</div>	
		<div class="backMainUser_right">
			<iframe name="frame" id="frame" scrolling="no" seamless frameborder="0" width="100%" height="100%"></iframe>
		</div>
  	  </div>	

	 <div class="clear center" style="width:400;">
	 	<hr style="margin-top:25px;">
<<<<<<< HEAD
		Copyright © 2006-2015 renming.com All Rights Reserved. 甘智友 版权所有 <br>
			京ICP证120085号 京ICP备16004154号 京网文[2012]0620-206号<br>
					京公网安备 11011202000608号<br>
=======
		<br>
>>>>>>> branch 'master' of https://github.com/XperiaZ1compat/news_maven.git
	 </div>   
  </body> 
</html>
