package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Adding inline CSS with background gradient, cool colors, and animations
        String htmlResponse = "<!DOCTYPE html>" +
                              "<html>" +
                              "<head>" +
                              "<style>" +
                              "body {" +
                              "    background: linear-gradient(135deg, #00c6ff, #0072ff);" + // Cool gradient background
                              "    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;" + // Modern font
                              "    display: flex;" +
                              "    justify-content: center;" +
                              "    align-items: center;" +
                              "    height: 100vh;" +
                              "    margin: 0;" +
                              "}" +
                              "h1 {" +
                              "    color: #ffffff;" + // White text color
                              "    font-size: 3em;" + // Larger font size
                              "    text-shadow: 2px 2px 8px rgba(0, 0, 0, 0.3);" + // Subtle shadow
                              "    animation: glowing 1.5s infinite alternate;" + // Glowing effect
                              "    text-align: center;" +
                              "}" +
                              "@keyframes glowing {" +
                              "    from {" +
                              "        text-shadow: 0 0 5px #ffffff, 0 0 10px #ffffff, 0 0 15px #ff00ff, 0 0 20px #ff00ff, 0 0 25px #ff00ff, 0 0 30px #ff00ff, 0 0 35px #ff00ff;" +
                              "    }" +
                              "    to {" +
                              "        text-shadow: 0 0 10px #ffffff, 0 0 20px #ffffff, 0 0 30px #ff00ff, 0 0 40px #ff00ff, 0 0 50px #ff00ff, 0 0 60px #ff00ff, 0 0 70px #ff00ff;" +
                              "    }" +
                              "}" +
                              "</style>" +
                              "</head>" +
                              "<body>" +
                              "<h1>Hello World</h1>" +
                              "</body>" +
                              "</html>";
                              

        response.getWriter().println(htmlResponse);
    }
}
