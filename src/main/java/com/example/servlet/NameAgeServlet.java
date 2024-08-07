package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NameAgeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        request.setAttribute("name", name);
        request.setAttribute("age", age);

        // Forward to JSP
        request.getRequestDispatcher("/WEB-INF/info.jsp").forward(request, response);
    }
}
