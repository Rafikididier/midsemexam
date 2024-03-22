<%-- 
    Document   : Teacher
    Created on : Oct 14, 2023, 11:37:53 AM
    Author     : Sam
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="teaBean" class="beans.TeacherBean" scope="request" />
<jsp:include page="navbar.jsp" />
<!DOCTYPE html>
<html>
<head>
  <title>Academic Unit</title>
  
  <style>
      <%@ include file="../css/AcademicUnit.css"%> 
  </style>
</head>
<body>
<div class="container">
  <h1>Academic Unit</h1>
  <form id="registrationForm"   action="registerTeacher.jsp" method="post">
    <label for="code">Code:</label>
    <input type="text" id="code" name="code" value="${teaBean.code}" ><br>

    <label for="name">Name:</label>
    <input type="text" id="name" name="name"  value="${teaBean.name}"  ><br>
    
     <label for="sem">Qualification</label>
     <select id="sem" name="sem" class="form-control" value="${teaBean.qualification}" required>
        <option value="MASTER">MASTER</option>
        <option value="PHD">PHD</option>
         <option value="PROFESSOR">PROFESSOR</option>
      
    </select>
     <br>

<!--<label for="academicUnit">Academic Unit Type:</label>
<select id="academicUnit" name="academicUnit" >
    <c:forEach var="unit" items="${EAcademicUnit.values()}">
        <option value="${unit}">${unit}</option>
    </c:forEach>
</select><br>-->


  <input type="submit"  name="action" value="Submit"/>
  </form>
</div>

<!-- Include your JavaScript -->
<!--<script src="./../js/AcademicUnit.js"></script>-->
</body>
</html>

