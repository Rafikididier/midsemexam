<%-- 
    Document   : registerTeacher
    Created on : Oct 14, 2023, 11:38:09 AM
    Author     : sam
--%>

<%@page import="dao.TeacherDAO"%>
<%@page import="model.Teacher"%>
<%@page import="dao.CourseDefinitionDAO"%>
<%@page import="model.CourseDefinition"%>
<%@page import="model.EAcademicUnit"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<jsp:useBean id="teaBean" class="beans.TeacherBean" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        try {
                Teacher te = new Teacher();
                te.setCode(request.getParameter("code"));
                te.setName(request.getParameter("name"));
                te.setQualification(request.getParameter("sem"));
                
                
                
               
                TeacherDAO.addTeacher(te);
              
//               acadBean.setInfoMessage("Saved Successfully");
//                
////                acadBean.clear();
//                acadBean.setErrorMessage("");
                request.getRequestDispatcher("Teacher.jsp").forward(request, response);
                
            } catch (Exception e) {
//                acadBean.setErrorMessage("Error!! check student issue");
//                acadBean.setInfoMessage("");
                request.getRequestDispatcher("Teacher.jsp").forward(request, response);
            }
        
        %>
    </body>
</html>
