
package com.bankapp;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accountNumber = request.getParameter("accountNumber");
        String password = request.getParameter("password");

        
        if ("12345".equals(accountNumber) && "password".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("name", "John Doe");
            session.setAttribute("balance", "5000");

            response.sendRedirect("BalanceServlet");
        } else {
            response.getWriter().println("Invalid login. <a href='login.html'>Try again</a>");
        }
    }
}
