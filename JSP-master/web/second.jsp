<%@ page language= "Java" %>
<% String name =request.getParameter ("username");
if (name==null)
name=" ";
session.setAttribute("username", name);
%>
<% String email=request.getParameter ("email");
if(email==null)
email = " ";
session.setAttribute("Email", email);
%>
    
<body>
<a href = "third.jsp">
Click on Next page </a>
 </body>
</html>

