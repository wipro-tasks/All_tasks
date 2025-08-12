package com.helloweb;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String subscribe = request.getParameter("subscribe");
        String[] frameworks = request.getParameterValues("framework");
        String gender = request.getParameter("gender");
        String favNumber = request.getParameter("favNumber");

        out.println("<h2>User Submitted Data</h2>");
        out.println("Username: " + username + "<br>");
        out.println("Password: " + password + "<br>");
        out.println("Address: " + address + "<br>");
        out.println("Subscribed: " + (subscribe != null ? "Yes" : "No") + "<br>");
        out.print("Frameworks: ");
        if (frameworks != null) {
            for (String fw : frameworks) {
                out.print(fw + " ");
            }
        }
        out.println("<br>");
        out.println("Gender: " + gender + "<br>");
        out.println("Favorite Number: " + favNumber + "<br>");
    }
}
