package com.example.servlets;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        String[] productInfo = request.getParameter("product").split(",");
        String productName = productInfo[0];
        String productPrice = productInfo[1];

        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Enter Quantity for " + productName + "</h2>");
        response.getWriter().println("<form action='OrderServlet' method='post'>");
        response.getWriter().println("Quantity: <input type='number' name='quantity' min='1' required><br><br>");
        response.getWriter().println("<input type='hidden' name='productName' value='" + productName + "'>");
        response.getWriter().println("<input type='hidden' name='productPrice' value='" + productPrice + "'>");
        response.getWriter().println("<input type='submit' value='Calculate Total'>");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");
    }
}
