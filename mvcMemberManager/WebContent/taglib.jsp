<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<%
	int i=0;
	if(i==0){
	
	}
%>
<!--  c:set tag => 새로운 변수를 생성 ... varName=varValue 자료형에 대한 지정은 따로 하지 않는다. -->
	<c:set var="varName" value="varValue"/>
	<c:out value="${varName}"/>
	<c:if test="${varName eq varValue}">
		<div> <c:out value="${varName}"></c:out></div>
	</c:if>
	<%String varName="varValue"; %>
	
	<%if(varName.equals("varValue")){ %>
	<div>java if: <%=varName %></div>
<%} %>


	<c:set var="num" value="90"/>
	<c:choose>
		<c:when test="${num==100}"> 출력 : 100 </c:when>
		<c:when test="${num==90 }"> 출력 : 90 </c:when>
		<c:otherwise>그 외 출력 </c:otherwise>
	</c:choose>	
	
	<!--  if, else if, else 문을 사용할 때 c:choose, c:when,
	 c:otherwise태그를 사용해서 작성  -->


	<c:forEach var="i" begin="0" end="10" step="1">
			${i}<br>	
	</c:forEach>

	
</head>


<body>

</body>
</html>