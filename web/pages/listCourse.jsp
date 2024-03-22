<%-- 
    Document   : listCourse
    Created on : Oct 15, 2023, 11:44:22 AM
    Author     : sam
--%>

<%@page import="dao.CourseDefinitionDAO"%>
<%@page import="model.CourseDefinition"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<jsp:include page="navbar.jsp" />

<%@page import="java.util.ArrayList"%>





<!DOCTYPE html>
<html lang="en">
<head>
    <!-- ... Your existing head content ... -->
    <style>
        table {
            font-family: Arial, sans-serif;
            font-size: 16px; /* Adjust the font size as needed */
        }
        
        th, td {
            font-weight: bold;
        }
        td{
            color: green;
        }
        .action-buttons button {
            font-size: 12px; /* Reduce the font size for action buttons */
            padding: 5px 10px; /* Adjust the padding as needed */
        }
           <%@ include file="../css/styles.css"%> 
    </style>
</head>
<body>
  
    <div class="container">
        <h2>List of Courses</h2>
        <table>
            <thead>
                <tr>
                    <th>Course code</th>
                    <th>Course Name</th>
                    <th>Description</th>
                    <th>Action</th>
                </tr>
            </thead>
            <%
               List<CourseDefinition> listCrs = CourseDefinitionDAO.getAllCourses();
               if (listCrs != null) {
                   for (CourseDefinition adm : listCrs) {
            %>
            <tbody>
                <tr>
                    <td>
                        <%=adm.getCode()%>
                    </td>
                    <td>
                        <%=adm.getName() %>
                    </td>
                    <td>
                        <%=adm.getDescription() %>
                    </td>
                   
                    <td class="action-butto">
                        <a href="editCourse.jsp?code=<%=adm.getCode() %>&action=Update">Edit</a>
                <a href="editCourse.jsp?code=<%=adm.getCode()%>&action=Delete">Delete</a>
                    </td>
                </tr>
                <%
                   }
               }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
