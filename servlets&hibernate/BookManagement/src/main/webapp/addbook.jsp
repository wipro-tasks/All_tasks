<html>
<head><title>Add New Book</title></head>
<body>
    <h2>Add New Book</h2>
    <form action="BookServlet" method="post">
        Title: <input type="text" name="title" required/><br/>
        Author: <input type="text" name="author" required/><br/>
        Price: <input type="number" name="price" step="0.01" required/><br/>
        <input type="submit" value="Save"/>
    </form>
    <a href="index.jsp">Back</a>
</body>
</html>
