<%@ taglib uri="/WEB-INF/c.tld" prefix="core"%>
<jsp:include page="/WEB-INF/views/inc/top.jsp">
	<jsp:param name="title" value="Matschi Books - Book list" />
	<jsp:param name="cssPath" value="./../css/" />
</jsp:include>



<article class="media">
	<figure class="media-left">
		<p class="image">
			<core:choose>
				<core:when test="${ book.img != null }">
					<img src="${book.img}" alt="${book.title}"></img>
				</core:when>
				<core:otherwise>img missing</core:otherwise>
			</core:choose>
		</p>
	</figure>
	<div class="media-content">
		<div class="content">
			<p>
				<strong>${book.title}</strong><br>
				<small>${book.subtitle}</small>
			</p>
			<p>
				By
				<core:forEach var="author" items="${authors}">
				<core:if test = "${book.idAuthor == author.id}">
		          ${author.firstname} ${author.lastname}
		        </core:if>
			</core:forEach>
			</p>
			<p>ISBN: ${book.isbn}</p>
		</div>
	</div>
	<div class="media-right">
		<button class="delete"></button>
	</div>
</article>

<jsp:include page="/WEB-INF/views/inc/bot.jsp"></jsp:include>