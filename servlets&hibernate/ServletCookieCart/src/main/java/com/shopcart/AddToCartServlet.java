package com.shopcart;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String item = request.getParameter("item");

        if (item != null && !item.isEmpty()) {
            Cookie cookie = new Cookie("item_" + System.currentTimeMillis(), item);
            cookie.setMaxAge(60 * 60); // 1 hour
            response.addCookie(cookie);
        }

        response.setContentType("text/html");
        response.getWriter().println("<p>Item added to cart: " + item + "</p>");
        response.getWriter().println("<a href='index.html'>Add More</a><br>");
        response.getWriter().println("<a href='ViewCartServlet'>View Cart</a>");
    }
}
