<%@ taglib uri="/WEB-INF/c.tld" prefix="core" %>
<jsp:include page="/WEB-INF/views/inc/top.jsp">
       <jsp:param name="title" value="Matschi Books - Book list" />
       <jsp:param name="cssPath" value="./../css/" />
</jsp:include>

<table class="table">
  <tr>
    <th>ID</th>
    <th>Firstname</th>
    <th>Lastname</th>
  </tr>
  <core:forEach var="author" items="${authors}">
	  <tr>
	    <td>${author.id}</td>
	    <td>${author.firstname}</td>
	    <td>${author.lastname}</td>
	  </tr>
  </core:forEach>
  
</table>

<jsp:include page="/WEB-INF/views/inc/bot.jsp"></jsp:include>