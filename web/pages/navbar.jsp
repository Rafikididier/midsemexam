<%-- 
    Document   : navbar
    Created on : Oct 9, 2023, 12:53:24 PM
    Author     : sam
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Navigation Bar</title>
    <style>
        /* Add your CSS styles for the navigation bar here */
        ul.navbar {
            list-style-type: none;
            background-color: #007bff; /* Background color for the navigation bar */
            overflow: hidden;
        }

        ul.navbar li {
            float: left;
        }

        ul.navbar li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        ul.navbar li a:hover {
            background-color: #0056b3; /* Background color on hover */
            
        }
      
        
    </style>
</head>
<body>
    
    <ul class="navbar">
        <li><a href="home.jsp">Home</a></li>
       
    </ul>
    
</body>
</html>
