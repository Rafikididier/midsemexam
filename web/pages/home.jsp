
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <style>
        /* Styles for the sidebar/navbar */
        .sidebar {
            height: 100%;
            width: 250px;
            position: fixed;
            top: 0;
            left: 0;
            background-color: #333; /* Background color for the sidebar */
            padding-top: 20px;
        }

        .sidebar a {
            padding: 15px 25px;
            text-decoration: none;
            font-size: 18px;
            color: white;
            display: block;
        }

        .sidebar a:hover {
            background-color: #555; /* Background color on hover */
        }

        /* Content area style to move content away from the sidebar */
        .content {
            margin-left: 250px; /* Adjust this value to match the sidebar width */
            padding: 20px;
        }
         <%@ include file="../css/styles.css"%> 
    </style>
    <title>Home Page</title>
</head>
<body>
    <div class="sidebar">
        <a href="CourseDefinition.jsp">Register New Course</a>
        <a href="listCourse.jsp">List All Course</a>
        <a href="listTeachers.jsp">List All Teachers</a>
        <a href="Teacher.jsp">Register new Teacher</a>
        <a href="Semester.jsp">Register new Semester</a>
    </div>
    <div class="container">
        <!-- Your main content goes here -->
        <h1>Welcome to AUCA REGISTRATION MODULE</h1><br/><br/>
        
    </div>
</body>
</html>

