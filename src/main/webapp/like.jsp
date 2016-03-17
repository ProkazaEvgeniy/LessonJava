<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>First JSP</title></head>
<body>
<%
    double num = Math.random();
    if (num > 0.5) {
%>
<h2>You`ll have a luck day!</h2><p>(<%= num %>)</p>
<%
} else {
%>
<h2>Well, life goes on ... </h2><p>(<%= num %>)</p>
<%
    }
%>
<a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>

<c:if test="${value > 12}">
<p>The temperature is: <c:out value="${value}"/> for : <c:out value="${name}"/><p>
</c:if>
</body>
</html>