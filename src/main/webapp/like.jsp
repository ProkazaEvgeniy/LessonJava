<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
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

<h2>This place for H2sql</h2>

<c:out value="${book.getTitle()}"/>

<style>
    table {
        width: 100%; /* Ширина таблицы */
        background: white; /* Цвет фона таблицы */
        color: white; /* Цвет текста */
        border-spacing: 1px; /* Расстояние между ячейками */
    }
    td, th {
        background: maroon; /* Цвет фона ячеек */
        padding: 5px; /* Поля вокруг текста */
    }
</style>

<table border="2">
    <tr>
        <th>ID 1</th>
        <th>Title 2</th>
        <th>Isbn 3</th>
        <th>Description 4</th>
    </tr>
    <tr>
        <th>value 5</th>
        <th>value 6</th>
        <th>value 7</th>
        <th>value 8</th>
    </tr>
</table>

</body>
<head><title>First JSP</title></head>
</html>