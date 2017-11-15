<%@ taglib uri="/WEB-INF/c.tld" prefix="core" %>
<jsp:include page="/WEB-INF/views/inc/top.jsp">
       <jsp:param name="title" value="Matschi Books - Home" />
       <jsp:param name="cssPath" value="./../css/" />
</jsp:include>

<table class="table">
  <tr>
    <th>ID</th>
    <th>Login</th>
    <th>Password</th>
  </tr>
  <core:forEach var="user" items="${users}">
	  <tr>
	    <td>${user.id}</td>
	    <td>${user.login}</td>
	    <td>${user.password}</td>
	  </tr>
  </core:forEach>
  
</table>

<jsp:include page="/WEB-INF/views/inc/bot.jsp"></jsp:include>