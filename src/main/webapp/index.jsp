<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Math Test</title>
</head>
<body>
<%!
 int a = 15;
 String act = "-";
 int b = 5;
%>

<%
    //????? ????? ???????? ?????-???, ?????????? ?????? ???????, ???????????? void
%>

<form action='check' method='post'>
    How many is <%=a%> <%=act %> <%=b%> = <input type='number' name='answer'>? <input
        type='submit' value='check'>
</form>
</body>
</html>