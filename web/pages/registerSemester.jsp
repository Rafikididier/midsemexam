<%-- 
    Document   : registerSemester
    Created on : Oct 13, 2023, 6:44:17 PM
    Author     : sam
--%>


<%@page import="dao.CourseDefinitionDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.CourseDefinition"%>
<%@page import="java.util.Date"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@page import="dao.SemesterDAO"%>
<%@page import="model.Semester"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<jsp:useBean id="semBean" class="beans.SemesterBean" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
try {
    Semester sem = new Semester();
    sem.setName(request.getParameter("sem"));
    String startDateStr = request.getParameter("startdate");
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date startDate = dateFormat.parse(startDateStr);
    sem.setStartDate(startDate);
    String endDateStr = request.getParameter("enddate");
    SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
    Date endDate = dateFormat2.parse(endDateStr);
    sem.setEndDate(endDate);

    // Retrieve the selected courses from the form
    String[] selectedCourses = request.getParameterValues("courses");
    List<CourseDefinition> courses = new ArrayList<>();

    // Retrieve the selected courses by their codes
    for (String courseCode : selectedCourses) {
        CourseDefinition course = CourseDefinitionDAO.getCourseByCode(courseCode);
        if (course != null) {
            courses.add(course);
        }
    }

    // Associate courses with the semester
    sem.setCourses(courses);

    // Add the semester to the database
    SemesterDAO.addSemester(sem);

    // Redirect to the Semester.jsp page
    request.getRequestDispatcher("Semester.jsp").forward(request, response);

} catch (Exception e) {
    // Handle exceptions
    request.getRequestDispatcher("Semester.jsp").forward(request, response);
}
%>

    </body>
</html>