package com.example.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "password".equals(password)) {
            response.sendRedirect("success.html");
        } else {
            response.setContentType("text/html");
            response.getWriter().println("<h1>Invalid username or password</h1>");
            response.getWriter().println("<a href='login.html'>Try again</a>");
        }
    }
}
