
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>list.jsp</title>


<!-- Code Assist -->
<c:if test="false">
<link rel="stylesheet" href="../code_assist/animate.css">
<link rel="stylesheet" href="../code_assist/bootstrap.css">
</c:if>


</head>
<body>

<h1>city page pageNo=${page.paging.pageNo}</h1>
<ol class="list-group">
<c:forEach var="city" items="${page.cities}">
<li class="list-group-item-info animated zoomIn">${city.id} <a href="/city/item/${city.id}?pageNo=${page.paging.pageNo}">${city.name}</a> 
${city.population} ${city.countryCode}</li>
</c:forEach>
</ol>
<hr class="animated bounce">

<a href="/city/page/1">First</a>
<a href="/city/page/${page.paging.firstPage-1}">Prev</a>
<c:forEach var="i" begin="${page.paging.firstPage}" end="${page.paging.lastPage}">
<a href="/city/page/${i}">${i}</a>
</c:forEach>
<a href="/city/page/${page.paging.lastPage+1}">Next</a>
<a href="/city/page/${page.paging.totalPage}">Last</a>
</body>
</html>