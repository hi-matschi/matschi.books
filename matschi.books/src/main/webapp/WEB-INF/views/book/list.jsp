<%@ taglib uri="/WEB-INF/c.tld" prefix="core"%>
<jsp:include page="/WEB-INF/views/inc/top.jsp">
	<jsp:param name="title" value="Matschi Books - Book list" />
	<jsp:param name="cssPath" value="./../css/" />
</jsp:include>

<table class="table">
	<tr>
		<th>Img path</th>
		<th>ISBN</th>
		<th>Title</th>
		<th>Subtitle</th>
	</tr>
	<core:forEach var="book" items="${books}">
		<tr>
			<td>
				<core:choose>
					<core:when test="${ book.img != null }">
						<img src="${book.img}" alt="${book.title}"></img>
					</core:when>
					<core:otherwise>img missing</core:otherwise>
				</core:choose>
			</td>
			<td>${book.isbn}</td>
			<td>${book.title}</td>
			<td>${book.subtitle}</td>
		</tr>
	</core:forEach>

</table>

<jsp:include page="/WEB-INF/views/inc/bot.jsp"></jsp:include>