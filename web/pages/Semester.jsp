<%-- 
    Document   : Semester
    Created on : Oct 13, 2023, 6:44:01 PM
    Author     : sam
--%>



<%@page import="dao.CourseDefinitionDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.CourseDefinition"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="semBean" class="beans.SemesterBean" scope="request" />
<jsp:include page="navbar.jsp" />
<!DOCTYPE html>
<html>
<head>
  <title>Semester</title>
  <style>
      <%@ include file="../css/AcademicUnit.css"%> 
  </style>
</head>
<body>
<div class="container">
  <h1>Semester</h1>
  <form id="registrationForm" action="registerSemester" method="post">
    <label for="sem">Semester Name</label>
    <select id="sem" name="sem" class="form-control" required  value="${semBean.name}">
        <option value="Semester one">Semester one</option>
        <option value="Semester two">Semester two</option>
      
    </select>
    <br>
    <label for="startdate">Start Date</label>
    <input type="date" id="startdate" name="startdate" class="form-control" required="required"  value="${semBean.startDate}">
    <br>
    <label for="enddate">End Date</label>
    <input type="date" id="enddate" name="enddate" class="form-control" required="required"  value="${semBean.endDate}">

    <label for="courses">Select Courses</label>
    <select id="courses" name="courses" multiple class="form-control"  value="${semBean.courses}">
        <%
            List<CourseDefinition> allCourses = CourseDefinitionDAO.getAllCourses(); 
            for (CourseDefinition course : allCourses) {
        %>
            <option value="<%= course.getCode() %>"><%= course.getName() %></option>
        <%
            }
        %>
    </select>

    <input type="submit" name="action" value="Submit">
  </form>
</div>
</body>
</html>