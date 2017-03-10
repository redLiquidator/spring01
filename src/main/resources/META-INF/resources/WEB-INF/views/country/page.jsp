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


<!-- code_assist -->
<c:if test="false">
<link rel="stylesheet" href="../code_assist/animate.css">
<link rel="stylesheet" href="../code_assist/bootstrap.css">
</c:if>
</head>
<body>
<c:set var="countries" value="${page.countries}"/>
<c:set var="paging" value="${page.paging}"/>
<h2>Country Page List pageNo=${paging.pageNo}</h2>


<c:forEach var="c" items="${countries}" varStatus="status">
<table class="table table-condensed">
<tr>
<th width="10%"><b> ${status.index} </b></th>
<th width="20%"> ${c.code} </th>
<th width="40%"><a href="/country/item/${c.code}">${c.name}</a></th>
<th width="30%"> ${c.population} <br></th>
<tr>
</tr>
</table>

</c:forEach>



<hr>
<div align="center">
<button onclick="displayBox(event)" class="btn btn-primary animated bounce">
${paging}
</button>
</div>


 
<hr>


<div align="center">
<a href="/country/page/${paging.firstPage-1}">prev</a>
<c:forEach var="i" begin="${paging.firstPage}" end="${paging.lastPage}">
<a href="/country/page/${i}">${i}</a>
</c:forEach>
<a href="/country/page/${paging.lastPage+1}">next</a>
</div>
<script type="text/javascript">
function  displayBox(event){
	$('.btn').toggleClass('btn-danger');
}
 
</script>
</body>
</html>