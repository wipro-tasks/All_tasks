package bookmanagement;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class BookServlet extends HttpServlet {
    private BookDao bookDao;

    @Override
    public void init() {
        bookDao = new BookDao();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        double price = Double.parseDouble(request.getParameter("price"));

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);

        try {
            bookDao.insertBook(book);
            response.sendRedirect("index.jsp");
        } catch (Exception e) {
            throw new ServletException("Insert failed", e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<Book> books = bookDao.getAllBooks();
            request.setAttribute("bookList", books);
            RequestDispatcher rd = request.getRequestDispatcher("listbooks.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            throw new ServletException("Read failed", e);
        }
    }
}
