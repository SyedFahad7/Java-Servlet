package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class ImageServlet extends HttpServlet {

    // Use relative path to the images directory in WebContent
    private static final String IMAGE_DIR = "WebContent\\images";

    private static final Map<String, String> MIME_TYPES = new HashMap<>();
    
    static {
        MIME_TYPES.put(".jpg", "image/jpeg");
        MIME_TYPES.put(".jpeg", "image/jpeg");
        MIME_TYPES.put(".png", "image/png");
        MIME_TYPES.put(".gif", "image/gif");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String imagePath = request.getPathInfo(); // Get image path from URL
        if (imagePath == null || imagePath.equals("/")) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "No image specified.");
            return;
        }

        String realPath = getServletContext().getRealPath(IMAGE_DIR);
        File imageFile = new File(realPath, imagePath);

        if (imageFile.exists() && !imageFile.isDirectory()) {
            String fileExtension = getFileExtension(imagePath);
            String contentType = MIME_TYPES.getOrDefault(fileExtension, "application/octet-stream");
            response.setContentType(contentType);

            try (FileInputStream fis = new FileInputStream(imageFile);
                 OutputStream os = response.getOutputStream()) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    os.write(buffer, 0, bytesRead);
                }
            }
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Image not found.");
        }
    }

    private String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex >= 0) {
            return fileName.substring(lastDotIndex).toLowerCase();
        }
        return "";
    }
}
