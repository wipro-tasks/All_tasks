<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String name = (String) request.getAttribute("studentName");
    int marks = (Integer) request.getAttribute("studentMarks");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <h2>Sorry <%= name %>!</h2>
    <p>You failed with <%= marks %> marks.</p>

    <jsp:include page="footer.jsp" />
</body>
</html>
