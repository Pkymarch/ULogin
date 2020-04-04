<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <title>Prakash</title>
    <body>
       <form:form action="register.jlc" method="Post" modelAttribute="myuser">
        <h2 align="center">Student Login</h2>
       <table align="center">
         <tr>
             <td>Username</td>
             <td><form:input path="username"/> </td>
             <td><font color=blue size=3><form:errors path="username" /></font></td>
         </tr>
          <tr>
             <td>Password</td>
             <td><form:input path="password"/> </td>
             <td><font color=blue size=3><form:errors path="password" /></font></td>
         </tr>
          <tr>
             <td><input type="submit" value="Submit"></td>
         </tr>
       </table>
       </form:form>
    </body>
    
</html>