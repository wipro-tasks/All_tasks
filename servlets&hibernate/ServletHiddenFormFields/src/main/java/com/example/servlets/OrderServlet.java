package com.example.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        String productName = request.getParameter("productName");
        double productPrice = Double.parseDouble(request.getParameter("productPrice"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double total = productPrice * quantity;

        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Receipt</h2>");
        response.getWriter().println("<p>Product: " + productName + "</p>");
        response.getWriter().println("<p>Price per unit: ₹" + productPrice + "</p>");
        response.getWriter().println("<p>Quantity: " + quantity + "</p>");
        response.getWriter().println("<h3>Total: ₹" + total + "</h3>");
        response.getWriter().println("</body></html>");
    }
}
