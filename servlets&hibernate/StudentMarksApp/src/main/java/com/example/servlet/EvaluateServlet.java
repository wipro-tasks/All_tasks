package com.example.servlet;

import java.io.IOException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EvaluateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int marks = Integer.parseInt(request.getParameter("marks"));
        
        request.setAttribute("studentName", name);
        request.setAttribute("studentMarks", marks);
        
        if (marks >= 40) {
            RequestDispatcher rd = request.getRequestDispatcher("pass.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("fail.jsp");
            rd.forward(request, response);
        }
    }
}
