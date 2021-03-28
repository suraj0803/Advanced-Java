<%@ page language="Java" %>
<%String uname=(String)session.getAttribute("username");
if(uname==null)
uname=" ";
%>
<html>
<body>
Welcome <%=uname%>
</body>
</html>

