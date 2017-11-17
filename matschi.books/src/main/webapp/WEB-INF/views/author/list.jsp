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
    <th>Books</th>
  </tr>
  <core:forEach var="author" items="${authors}">
	  <tr>
	    <td>${author.id}</td>
	    <td>${author.firstname}</td>
	    <td>${author.lastname}</td>
	    <td>
	    <core:forEach var="book" items="${books}">
			<core:if test = "${book.idAuthor == author.id}">
	          <a href="<core:url value='/book/${book.id}'/>">
	          	<span class="tag is-warning">${book.title}</span>
	          </a>
	        </core:if>
		</core:forEach>
		</td>
	  </tr>
  </core:forEach>
</table>

<jsp:include page="/WEB-INF/views/inc/bot.jsp"></jsp:include>