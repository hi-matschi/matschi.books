<%@ taglib uri="/WEB-INF/c.tld" prefix="core" %>
<jsp:include page="/WEB-INF/views/inc/top.jsp">
       <jsp:param name="title" value="Matschi Books - Home" />
       <jsp:param name="cssPath" value="./../css/" />
</jsp:include>

<table class="table">
  <tr>
    <th>ID</th>
    <th>ISBN</th>
    <th>Title</th>
    <th>Subtitle</th>
    <th>Img path</th>
  </tr>
  <core:forEach var="book" items="${books}">
	  <tr>
	    <td>${book.id}</td>
	    <td>${book.isbn}</td>
	    <td>${book.title}</td>
	    <td>${books.subtitle}</td>
	    <td>${book.img}</td>
	  </tr>
  </core:forEach>
  
</table>

<jsp:include page="/WEB-INF/views/inc/bot.jsp"></jsp:include>