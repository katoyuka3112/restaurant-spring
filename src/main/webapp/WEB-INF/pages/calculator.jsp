<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	Integer tong = (Integer) request.getAttribute("tong");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "<%=request.getContextPath()%>/calculator" method="post" >
<h1>Nhập số vào ô trống</h1>
nhập số thứ 1 : <input type = "text" name ="number1" value='<% if(request.getParameter("number1") != null) out.print(request.getParameter("number1"));%>'><br>
nhập số thứ 2 : <input type = "text" name ="number2" value='<% if(request.getParameter("number2") != null) out.print(request.getParameter("number2"));%>'></br>
<button type="submit">Tính</button>
<br>
<% if (tong != null) { %>
tổng của hai số : <% out.print(tong); %>
<% } %>
</form>

</body>
</html>