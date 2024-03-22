<%-- 
    Document   : editCourse
    Created on : Oct 15, 2023, 12:15:09 PM
    Author     : sam
--%>

<%@page import="beans.CourseDefinitionBean"%>
<%@page import="dao.CourseDefinitionDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.CourseDefinition"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>

<jsp:useBean id="crsdBean" class="beans.CourseDefinitionBean" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Student</title>
    </head>
    <body>
        <% 
         if (request.getParameter("action").equals("Update")){  
        crsdBean.setCode(request.getParameter("code"));     
        String action = request.getParameter("action");
        
        CourseDefinitionDAO crss = new CourseDefinitionDAO();
        CourseDefinition crs = crss.getCourseByCode(crsdBean.getCode());
        crsdBean.setName(crs.getName());
        crsdBean.setDescription(crs.getDescription());
     
//        admBean.setCertificateName(adm.getCertificateName());
//        admBean.setImageName(adm.getImageName());
       
        request.setAttribute("action", action);
        request.getRequestDispatcher("CourseDefinition.jsp").forward(request, response);
         }else if(request.getParameter("action").equals("Delete")){
         CourseDefinitionDAO.deleteCourse(request.getParameter("code"));
         
      
        request.getRequestDispatcher("home.jsp").forward(request, response);
         
         }
       
        %>
    </body>
</html>

