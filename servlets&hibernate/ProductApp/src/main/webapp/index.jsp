<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Enter Product Details</title>
</head>
<body>
    <h2>Product Details Form</h2>
    <form action="display.jsp" method="post">
        Product ID: <input type="text" name="productId" /><br/><br/>
        Name: <input type="text" name="name" /><br/><br/>
        Price: <input type="text" name="price" /><br/><br/>
        Quantity: <input type="text" name="quantity" /><br/><br/>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
