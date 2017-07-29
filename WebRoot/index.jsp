<%@ page language="java" import="java.util.*,cn.java.entity.Member" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
    <title>查看</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	
  </head>
  <script type="text/javascript">
   $(function(){
       $.ajax({
               url:"<%=basePath%>selectAll.shtml",
               type:"post",
               datatype:"json",
               async:false,
               success:function(json){
              console.log(json)
              for(js in json){
              var $tr=$("<tr></tr>");
              var person= json[js];
              
              $.each(person,function(key,value){
                if(key=="id"){ return true}
                 var td="<td>"+value+"</td>";
                  $tr.append(td); 
                 
              });

               $("table").append($tr);
              
              }
              

               	}
               
              
       })
   })
  </script>
  <body>

  <center>
  <table  width=70% height="50px" border="1px solid black" cellspacing="0px" cellpadding="0px" >
 俱乐部会员信息
 	<tr>
   		<td>编号</td>
   		<td>姓名</td>
   		<td>性别</td>
   		<td>年龄</td>
   		<td>家庭住址</td>
   		<td>Email</td>
 
   	</tr>

   
  </table>
  </center> 
  </body>
</html>
