<%@ page import="java.util.*, bookmanagement.Book" %>
<%
    List<Book> bookList = (List<Book>) request.getAttribute("bookList");
%>

<h2>All Books</h2>
<table border="1">
    <tr><th>Title</th><th>Author</th><th>Price</th></tr>
    <%
        if (bookList != null && !bookList.isEmpty()) {
            for (Book b : bookList) {
    %>
                <tr>
                    <td><%= b.getTitle() %></td>
                    <td><%= b.getAuthor() %></td>
                    <td><%= b.getPrice() %></td>
                </tr>
    <%
            }
        } else {
    %>
        <tr><td colspan="3">No books found</td></tr>
    <%
        }
    %>
</table>
