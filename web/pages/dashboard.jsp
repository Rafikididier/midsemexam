<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.EAcademicUnit" %>
<%@ page import="java.util.Arrays" %>
<% 
    EAcademicUnit[] academicUnits = EAcademicUnit.values();
%>

<!DOCTYPE html>
<html>
<head>
  <title>Dashboard</title>
  <style>
    <%@ include file="../css/dashboard.css"%>
  </style>
</head>
<body>
<div class="sidebar">
  <a class="menu-item" href="">Courses</a>
  <a class="menu-item" href="#">Semester</a>
  <a class="menu-item" href="#">Teacher</a>
 <a class="menu-item" href="#programmes">Academics</a>


  <div class="submenu">
    <a id="programmes" class="submenu-title">Programmes</a>
    <%
        for (EAcademicUnit unit : academicUnits) {
            if (unit == EAcademicUnit.PROGRAMME) {
    %>
    <a class="submenu-item" href="#"><%= unit.name() %></a>
    <%
            }
        }
    %>
    <div class="submenu">
      <a class="submenu-title">Faculty</a>
      <%
        for (EAcademicUnit unit : academicUnits) {
            if (unit == EAcademicUnit.FACULTY) {
      %>
      <a class="submenu-item" href="#"><%= unit.name() %></a>
      <%
            }
        }
      %>
      <div class="submenu">
        <a class="submenu-title">Department</a>
        <%
          for (EAcademicUnit unit : academicUnits) {
            if (unit == EAcademicUnit.DEPARTMENT) {
        %>
        <a class="submenu-item" href="#"><%= unit.name() %></a>
        <%
            }
          }
        %>
      </div>
    </div>
  </div>
</div>


<div class="content">
  Content goes here.
</div>
    <script src="../js/dashboard.js" ></script>
</body>
</html>
