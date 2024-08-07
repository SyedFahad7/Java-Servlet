package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PersonalInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Adding inline CSS with background color, animations, and carousel
        String htmlResponse = "<!DOCTYPE html>" +
                              "<html>" +
                              "<head>" +
                              "<title>Personal Info</title>" +
                              "<style>" +
                              "body {" +
                              "    background-color: #e0f7fa;" +  // Light cyan background color
                              "    font-family: Arial, sans-serif;" +  // Font style
                              "    text-align: center;" +
                              "    padding: 20px;" +
                              "    margin: 0;" +
                              "}" +
                              "h1 {" +
                              "    color: #00796b;" +  // Dark teal color
                              "    animation: bounce 2s infinite;" +  // Bouncing animation
                              "}" +
                              "@keyframes bounce {" +
                              "    0%, 20%, 50%, 80%, 100% {" +
                              "        transform: translateY(0);" +
                              "    }" +
                              "    40% {" +
                              "        transform: translateY(-30px);" +
                              "    }" +
                              "    60% {" +
                              "        transform: translateY(-15px);" +
                              "    }" +
                              "}" +
                              ".carousel {" +
                              "    position: relative;" +
                              "    max-width: 600px;" +
                              "    margin: auto;" +
                              "    overflow: hidden;" +
                              "}" +
                              ".carousel img {" +
                              "    width: 100%;" +
                              "    height: auto;" +
                              "    display: block;" +
                              "}" +
                              ".carousel .slides {" +
                              "    display: flex;" +
                              "    transition: transform 0.5s ease-in-out;" +
                              "}" +
                              ".carousel .slide {" +
                              "    min-width: 100%;" +
                              "    box-sizing: border-box;" +
                              "}" +
                              ".carousel .prev, .carousel .next {" +
                              "    cursor: pointer;" +
                              "    position: absolute;" +
                              "    top: 50%;" +
                              "    width: 40px;" +
                              "    height: 40px;" +
                              "    background-color: rgba(0, 0, 0, 0.5);" +
                              "    color: #fff;" +
                              "    text-align: center;" +
                              "    line-height: 40px;" +
                              "    font-size: 24px;" +
                              "    border: none;" +
                              "    border-radius: 50%;" +
                              "    z-index: 100;" +
                              "    transform: translateY(-50%);" +
                              "}" +
                              ".carousel .prev { left: 10px; }" +
                              ".carousel .next { right: 10px; }" +
                              "</style>" +
                              "</head>" +
                              "<body>" +
                              "<h1>My name is Syed Fahad and I am studying in Lords Institute of Engineering and Technology</h1>" +
                              "<div class='carousel'>" +
                              "    <div class='slides'>" +
                              "        <div class='slide'><img src='https://www.lords.ac.in/wp-content/uploads/2023/04/Website-Logo.png' alt='Image 1'></div>" +
                              "        <div class='slide'><img src='https://www.lords.ac.in/wp-content/uploads/2023/07/Library.jpg' alt='Image 2'></div>" +
                              "        <div class='slide'><img src='https://www.lords.ac.in/wp-content/uploads/2023/07/World-Class-Infra.jpg' alt='Image 3'></div>" +
                              "        <div class='slide'><img src='https://www.lords.ac.in/wp-content/uploads/2020/06/gal6.jpg' alt='Image 4'></div>" +
                              "    </div>" +
                              "    <button class='prev' onclick='prevSlide()'>&#10094;</button>" +
                              "    <button class='next' onclick='nextSlide()'>&#10095;</button>" +
                              "</div>" +
                              "<script>" +
                              "let index = 0;" +
                              "const slides = document.querySelector('.slides');" +
                              "const totalSlides = document.querySelectorAll('.slide').length;" +
                              "function showSlide(n) {" +
                              "    if (n >= totalSlides) {" +
                              "        index = 0;" +
                              "    } else if (n < 0) {" +
                              "        index = totalSlides - 1;" +
                              "    } else {" +
                              "        index = n;" +
                              "    }" +
                              "    slides.style.transform = 'translateX(' + (-index * 100) + '%)';" +
                              "}" +
                              "function nextSlide() {" +
                              "    showSlide(index + 1);" +
                              "}" +
                              "function prevSlide() {" +
                              "    showSlide(index - 1);" +
                              "}" +
                              "setInterval(nextSlide, 3000);" + // Auto-slide every 3 seconds
                              "</script>" +
                              "</body>" +
                              "</html>";

        response.getWriter().println(htmlResponse);
    }
}
