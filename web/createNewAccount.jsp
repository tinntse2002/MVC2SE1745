<%-- 
    Document   : createNewAccount.jsp
    Created on : Mar 12, 2023, 7:43:22 PM
    Author     : Tin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Account</title>
    </head>
    <body>
        <h1>Create New Account</h1>
        <form action="DispatcherServlet" method="POST">
            Username* <input type="text" name ="txtUsername" value=""/> (6 - 20 characters) <br/>
            Password* <input type="text" name ="txtPassword" value=""/> (6 - 30 characters) <br/>
            Confirm* <input type="text" name ="txtConfirm" value=""/> <br/>
            Full name <input type="text" name ="txtFullName" value=""/> (2 - 50 characters) <br/>
            <input type="submit" value="Create New Account" name ="btAction" />
            <input type="reset" value="Reset" />
        </form>
    </body>
</html>
