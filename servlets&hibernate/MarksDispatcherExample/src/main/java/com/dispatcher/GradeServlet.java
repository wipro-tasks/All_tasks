package com.dispatcher;



import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class GradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = (String) request.getAttribute("studentName");
        int marks = (Integer) request.getAttribute("studentMarks");

        String grade;
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 75) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Student Grade Report</h2>");
        out.println("<b>Name:</b> " + name + "<br>");
        out.println("<b>Marks:</b> " + marks + "<br>");
        out.println("<b>Grade:</b> " + grade);
    }
}
