package com.registration;



import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String profession = request.getParameter("profession");
        String married = request.getParameter("married");
        String note = request.getParameter("note");

        out.println("<h2>Registration Details</h2>");
        out.println("<b>Full Name:</b> " + fullname + "<br>");
        out.println("<b>Email:</b> " + email + "<br>");
        out.println("<b>Password:</b> " + password + "<br>");
        out.println("<b>Birthday:</b> " + birthday + "<br>");
        out.println("<b>Gender:</b> " + gender + "<br>");
        out.println("<b>Profession:</b> " + profession + "<br>");
        out.println("<b>Married:</b> " + (married != null ? "Yes" : "No") + "<br>");
        out.println("<b>Note:</b> " + note + "<br>");
    }
}
