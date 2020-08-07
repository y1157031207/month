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
	<form action="#">
		<input type="hidden" name="aid" value="${activity.aid}"><br><br>
		活动编号:<input type="text" name="code" value="${activity.code}"><br><br>
		活动名称:<input type="text" name="aname" value="${activity.aname}"><br><br>
		活动分类:<select name="tid" id="tid">
					<option value="">请选择</option>
				</select><br><br>
		活动日期:<input type="date" name="starttime" value="${activity.starttime}">~<input type="date" name="endtime" value="${activity.endtime}"><br><br>
		<div id="sid">
			活动服务:
		</div><br><br>
		<input type="button" value="保存修改" onclick="update()">
	</form>
</body>
<script type="text/javascript">
	$.post("queryType",function(data){
		for(var i in data){
			$("#tid").append("<option value='"+data[i].tid+"'>"+data[i].tname+"</option>")
		}
		$("#tid").val("${activity.tid}")
	})
	
	$.post("queryServer",function(data){
		for(var i in data){
			$("#sid").append("<input type='checkbox' name='sid' value='"+data[i].sid+"'>"+data[i].sname)
		}
		$("#sid").attr("checked").attr(true)
	})
	
	function update() {
		$.post("updateAct",$("form").serialize(),function(data){
			if(data){
				alert("修改成功")
				location.href="queryAct"
			}else{
				alert("修改失败")
			}
		})
	}
</script>
</html>