<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Information Page</title>
    <style>
        body {
            background-color: #f0f8ff;
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 20px;
        }
        h1 {
            color: #4682b4;
        }
        .content {
            background-color: #ffffff;
            border-radius: 8px;
            padding: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            display: inline-block;
        }
    </style>
</head>
<body>
    <div class="content">
        <h1>Information Page</h1>
        <p>Name: ${name}</p>
        <p>Age: ${age}</p>
    </div>
</body>
</html>
