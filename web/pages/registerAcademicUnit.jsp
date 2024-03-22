<%-- 
    Document   : registerAcademicUnit
    Created on : Oct 13, 2023, 3:32:13 PM
    Author     : sam
--%>

<%@page import="model.EAcademicUnit"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.AcademicUnitDAO"%>
<%@page import="model.AcademicUnit"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<jsp:useBean id="acadBean" class="beans.AcademicUnitBean" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        try {
            
               
                AcademicUnit ac = new AcademicUnit();
                ac.setCode(request.getParameter("code"));
                ac.setName(request.getParameter("name"));
//               EAcademicUnit academicUnitType = EAcademicUnit.valueOf(request.getParameter("academicUnit"));
//              ac.setAcademicUnitType(null);
               
                
              
                AcademicUnitDAO.addAcademicUnit(ac);
               acadBean.setInfoMessage("Saved Successfully");
                
//                acadBean.clear();
                acadBean.setErrorMessage("");
                request.getRequestDispatcher("AcademicUnit.jsp").forward(request, response);
                
            } catch (Exception e) {
                acadBean.setErrorMessage("Error!! check student issue");
                acadBean.setInfoMessage("");
                request.getRequestDispatcher("Academic.jsp").forward(request, response);
            }
        
        %>
    </body>
</html>