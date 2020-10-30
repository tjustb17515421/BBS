<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
@import url("style.css");

#apDiv1 {
	position: absolute;
	left: 1px;
	top: 1px;
	width: 800px;
	height: 50px;
	z-index: 1;
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
}
#apDiv3 {
	position: absolute;
	left: 1px;
	top: 76px;
	width: 800px;
	height: 15px;
	z-index: 3;
}
#apDiv4 {
	position: absolute;
	left: 1px;
	top: 92px;
	width: 800px;
	height: 300px;
	z-index: 4;
}
</style>
</head>

<body>
<div class="biaoti" id="apDiv1">校园BBS系统</div>
<div class="denglu" id="apDiv2">您尚未 登录 | 注册</div>
<div id="apDiv4">
  <form id="form1" name="form1" method="post" action="">
    <table width="100%" heigh = "115" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td align="center"><span class = "body">用户名：</span>
        <label>
        <input name="uname" type="text" id="textfield1"/>
        </label>
        </td>
      </tr>
      <tr>
        <td align="center"><span class = "body">密码：</span>
        <label>
        <input name="upass" type="password" id="textfield2"/>
        </label>
        </td>
      </tr>
      <tr>
        <td align="center"><span class = "body">重复密码：</span>
        <label>
        <input name="upass2" type="password" id="textfield3"/>
        </label>
        </td>
      </tr>
      <tr>
        <td align = "center">
			<label>
            <input type = "submit" name="button" id="button" value="注册"/>
        	</label>
        </td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>

