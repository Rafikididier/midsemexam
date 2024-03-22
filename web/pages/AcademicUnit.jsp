<%-- 
    Document   : AcademicUnit
    Created on : Oct 13, 2023, 3:10:27 PM
    Author     : sam
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="acadBean" class="beans.AcademicUnitBean" scope="request" />
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
  <form id="registrationForm"   action="registerAcademicUnit.jsp" method="post">
    <label for="code">Code:</label>
    <input type="text" id="code" name="code" value="${acadBean.code}" ><br>

    <label for="name">Name:</label>
    <input type="text" id="name" name="name"  value="${acadBean.name}" ><br>

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
