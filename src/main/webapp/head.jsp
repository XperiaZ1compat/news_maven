<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
 	<head>
 	 <meta charset="utf-8">
  	 <link href="/news/css/1.css" rel="stylesheet" type="text/css">
  	 <script type="text/javascript"> 
  	 	function search(){
  	 		document.getElementById('searchForm').submit();
  	 	}	
  	 </script>
  	</head>
  <body>
	  <form id="searchForm" action="/news/servlet/NewsServlet?type1=search">
		 <div class="div-out">
		 	<div class="logleft">
		 		<img src="/news/images/log.png">
		 	</div>
		 	<div class="logMiddle">
				<div class="logMiddleInner">			
					<input type="text" id="search" style="width: 187px; height: 41px; ">
					<a href='javascript:void(0);' onclick="search();">
					<img  src="/news/images/search_b.jpg" /></a>	
				</div> 	
		 	</div>
			<div class="logRight">
				<div class="logRightInner">	
					<c:if test="${!(empty sessionScope.user) }">
						<a href="/news/user/manageUIMain/manageMain.jsp">管a理</a>&nbsp;
					</c:if>
				
					<a href="/news/index.jsp">首a页</a>&nbsp;
					<c:choose>
						<c:when test="${empty sessionScope.user}">
							<a href="/news/user/free/login.jsp">登a录</a>
							&nbsp;<a href="/news/user/free/register.jsp">注a册</a>
					    </c:when>
					    <c:otherwise>
					    	${sessionScope.user.name}&nbsp;
					    	<a href="/news/servlet/UserServlet?type1=exit">注a销</a>
					    </c:otherwise>
					</c:choose>		
				</div> 	
		 	</div>
		</div>
		<div class="clear"></div>
	</form>	   
  </body> 
</html>
