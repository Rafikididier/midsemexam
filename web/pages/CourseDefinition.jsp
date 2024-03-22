<%-- 
    Document   : CourseDefinition
    Created on : Oct 13, 2023, 4:38:33 PM
    Author     : sam
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="crsdefBean" class="beans.CourseDefinitionBean" scope="request" />
<jsp:include page="navbar.jsp" />
<!DOCTYPE html>
<html>
<head>
  <title>Course Definition</title>
  
  <style>
      <%@ include file="../css/AcademicUnit.css"%> 
  </style>
</head>
<body>
<div class="container">
  <h1>Course Definition</h1>
  <form id="registrationForm"   action="registerCourseDefinition.jsp" method="post">
    <label for="code">Course Code:</label>
  <input type="text" id="code" name="code" value="${crsdefBean.code}" ><br>

    <label for="name">Course Name:</label>
    <input type="text" id="name" name="name"  value="${crsdefBean.name}" ><br>
     <label for="name">Description:</label>
     <input type="text" id="name" name="description"  value="${crsdefBean.description}" ><br>




  <input type="submit"  name="action" value="Submit"/>
  </form>
</div>

<!-- Include your JavaScript -->
<!--<script src="./../js/AcademicUnit.js"></script>-->
</body>
</html>>
