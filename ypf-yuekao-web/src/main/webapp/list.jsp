<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=path%>/js/jquery.validate.js"></script>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<form action="queryAct" method="post">
		活动名称:<input type="text" name="aname">
		活动类型:<select name="tid">
					<option value="">请选择</option>
					<option value="1">技术交流</option>
					<option value="2">舌战群儒</option>
					<option value="3">商业互吹</option>
					<option value="4">赛前烂话</option>
				</select>
		创建时间:<input type="date" name="createstart">~<input type="date" name="createend">
		<input type="submit" value="搜索">
	</form>
	<table>
		<tr>
			<td>序号</td>
			<td>活动编号</td>
			<td>活动名称</td>
			<td>活动类型</td>
			<td>活动开始时间</td>
			<td>活动结束时间</td>
			<td>活动服务</td>
			<td>创建时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list}" var="a">
			<tr>
				<td>${a.aid}</td>
				<td>${a.code}</td>
				<td>${a.aname}</td>
				<td>${a.tname}</td>
				<td>${a.starttime}</td>
				<td>${a.endtime}</td>
				<td>${a.sname}</td>
				<td>${a.createtime}</td>
				<td>
					<a href="delAct?aid=${a.aid}"><input type="button" value="删除"></a>
					<a href="toUpdate?aid=${a.aid}"><input type="button" value="修改"></a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="9">
				<a href="?pageNum=1">首页</a>
				<a href="?pageNum=${page.pageNum-1}">上一页</a>
				<a href="?pageNum=${page.pageNum+1}">下一页</a>
				<a href="?pageNum=${page.pages}">尾页</a>
			</td>
		</tr>
		<tr>
			<td colspan="9">
				<a href="add.jsp"><input type="button" value="添加活动"></a>
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	
</script>
</html>