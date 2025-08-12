<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head><title>Account Details</title></head>
<body>
    <h2>Account Information</h2>
    Account Number: ${account.accountNo} <br>
    Name: ${account.name} <br>
    Balance: ${account.balance} <br>
    Account Type (from session): ${sessionScope.accountType} <br><br>

    <c:choose>
        <c:when test="${account.balance >= 1000}">
            <b>Status: Sufficient Balance</b>
        </c:when>
        <c:otherwise>
            <b>Status: Insufficient Balance</b>
        </c:otherwise>
    </c:choose>
</body>
</html>
