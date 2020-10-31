<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<!--<base href="<%=basePath%>">--> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
#apDiv1 {
	position: absolute;
	left: 1px;
	top: 1px;
	width: 800px;
	height: 50px;
	z-index: 1;
	font-size: 24px;
	color: #3399cc;
	text-align: center;
}
#apDiv2 {
	position: absolute;
	left: 1px;
	top: 51px;
	width: 800px;
	height: 25px;
	z-index: 2;
	text-align: center;
	font-size: 12px;
	color: #3399cc;
}
#apDiv3 {
	position: absolute;
	left: 1px;
	top: 76px;
	width: 800px;
	height: 500px;
	z-index: 3;
}
#apDiv4 {
	position: absolute;
	left: 1px;
	top: 76px;
	width: 800px;
	height: 500px;
	z-index: 3;
	font-size: 12px;
	color: #3399cc;
	text-align: left;
}
#apDiv4 table tr td {
	color: #3399cc;
	text-align: left;
}
</style>
</head>

<body>
<div id="apDiv1">校园BBS系统</div>
<div id="apDiv2">您尚未<a href="login.html" target="_blank">登录</a>|<a href="reg.html" target="_blank">注册</a>
</div>
<div id="apDiv4">
  <table width="800" border="1" cellspacing="0" cellpadding="0">
    <tr>
      <td colspan="2">论坛</td>
      <td>主题</td>
      <td>最后发表</td>
    </tr>
    <tr>
      <td height="24" colspan="4">NET方向：</td>
    </tr>
    <tr>
      <td height="26">&nbsp;</td>
      <td>C#语言</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><p>&nbsp;</p></td>
      <td>Winforms</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>ADO.NET</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>ASP.NET</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td height="27" colspan="4">Java方向：</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>Java基础</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>JSP技术</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>Servlet技术</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>Eclipse应用</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </table>
</div>
</body>
</html>
    