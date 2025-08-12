package com.bankapp;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class BalanceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("name") != null) {
            String name = (String) session.getAttribute("name");
            String balance = (String) session.getAttribute("balance");

            response.setContentType("text/html");
            response.getWriter().println("<h2>Welcome, " + name + "</h2>");
            response.getWriter().println("<p>Your balance is: $" + balance + "</p>");
            response.getWriter().println("<a href='LogoutServlet'>Logout</a>");
        } else {
            response.getWriter().println("Session expired. <a href='login.html'>Login again</a>");
        }
    }
}
