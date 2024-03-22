<%-- 
    Document   : registerCourseDefinition
    Created on : Oct 13, 2023, 4:39:04 PM
    Author     : sam
--%>

<%@page import="dao.CourseDefinitionDAO"%>
<%@page import="model.CourseDefinition"%>
<%@page import="model.EAcademicUnit"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<jsp:useBean id="crsdefBean" class="beans.CourseDefinitionBean" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        try {
            
                CourseDefinition crsD = new CourseDefinition();
                crsD.setCode(request.getParameter("code"));
                crsD.setName(request.getParameter("name"));
                crsD.setDescription(request.getParameter("description"));
                crsD.setAcademicUnit(null);
               
                
                CourseDefinitionDAO.addCourseDefinition(crsD);
//               acadBean.setInfoMessage("Saved Successfully");
//                
////                acadBean.clear();
//                acadBean.setErrorMessage("");
                request.getRequestDispatcher("CourseDefinition.jsp").forward(request, response);
                
            } catch (Exception e) {
//                acadBean.setErrorMessage("Error!! check student issue");
//                acadBean.setInfoMessage("");
                request.getRequestDispatcher("CourseDefinition.jsp").forward(request, response);
            }
        
        %>
    </body>
</html>