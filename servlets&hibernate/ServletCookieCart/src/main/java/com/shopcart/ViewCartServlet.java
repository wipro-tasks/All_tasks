package com.shopcart;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewCartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Cookie[] cookies = request.getCookies();

        response.setContentType("text/html");
        response.getWriter().println("<h2>Your Cart:</h2>");

        boolean found = false;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().startsWith("item_")) {
                    found = true;
                    response.getWriter().println("<p>• " + cookie.getValue() + "</p>");
                }
            }
        }

        if (!found) {
            response.getWriter().println("<p>Your cart is empty.</p>");
        }

        response.getWriter().println("<br><a href='index.html'>Go back to shop</a>");
    }
}
