<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>page.jsp</title>
<!-- 1.animate -->
<link rel="stylesheet" href="/webjars/animate.css/3.5.2/animate.min.css">
<!-- 2.bootstrap -->
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css">
<!-- 3.jquery -->
<script type="text/javascript" src="/webjars/jquery/1.11.1/jquery.min.js"></script>
<!-- 4.bootstrap.js -->
<script type="text/javascript" src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
</head>
<body>
<c:set var="countries" value="${page.countries}"/>
<c:set var="paging" value="${page.paging}"/>
<h1>Country Page List pageNo=${paging.pageNo}</h1>
<c:forEach var="c" items="${countries}" varStatus="status">
<b> ${status.index} </b>
${c.code} ${c.name} ${c.population} <br>
</c:forEach>
<hr>
${paging} 
<hr>
<a href="/country/page/${paging.firstPage-1}">prev</a>
<c:forEach var="i" begin="${paging.firstPage}" end="${paging.lastPage}">
<a href="/country/page/${i}">${i}</a>
</c:forEach>
<a href="/country/page/${paging.lastPage+1}">next</a>

</body>
</html>