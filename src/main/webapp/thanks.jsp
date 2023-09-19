<%-- 
    Document   : thanks
    Created on : Aug 29, 2023, 2:40:25 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>HTML_CSS</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>  
    </head>
    <body>
        <h1>Thanks for joining our email list</h1>
        
        <p>Here is the information that you entered</p>
        
        <label><b>Email:</b></label>
        <span><u>${user.email}</u></span><br>
        
        <label><b>First Name:</b></label>
        <span><u>${user.firstName}</u></span><br>
        
        <label><b>Last Name:</b></label>
        <span><u>${user.lastName}</u></span><br>
        
        <label style= "width: 15em;"><b>You found out through: </b></label>
        <span><u>${user.hear}</u></span><br>
        
        <label style= "width: 33em;"><b>You want to receive notifications about new CDs and special offers:  </b></label>
        <span><u>${user.receive}</u></span><br>
        
        <label style= "width: 15em;"><b>You contact me by : </b></label>
        <span><u>${user.contact}</u></span><br>
        
        <p>To enter another email address, click on the Back button in your browser or the Return button shown below.</p>
        
        <form action="" method="get">
            <input type="hidden" name="action" value="join">
            <input type="submit" value="Return">
        </form>
    </body>
</html>
