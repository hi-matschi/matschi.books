<%@ taglib uri="/WEB-INF/c.tld" prefix="core"%>
<jsp:include page="/WEB-INF/views/inc/top.jsp">
	<jsp:param name="title" value="Matschi Books - Book list" />
	<jsp:param name="cssPath" value="./../css/" />
</jsp:include>

<table class="table">
	<tr>
		<th>Img</th>
		<th>ISBN</th>
		<th>Title</th>
		<th>Subtitle</th>
		<th>Author</th>
		<th>Actions</th>
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
			<core:forEach var="author" items="${authors}">
				<core:if test = "${book.idAuthor == author.id}">
		          <td>${author.firstname} ${author.lastname}</td>
		        </core:if>
			</core:forEach>
			<td>
				<a href="<core:url value='/book/edit/${book.id}'/>">
					<span class="icon">
					  <i class="fa fa-edit"></i>
					</span>
				</a>
				<a href="<core:url value='/book/remove/${book.id}'/>">
					<span class="icon">
					  <i class="fa fa-trash"></i>
					</span>
				</a>
			</td>
			
		</tr>
	</core:forEach>

</table>

<jsp:include page="/WEB-INF/views/inc/bot.jsp"></jsp:include>