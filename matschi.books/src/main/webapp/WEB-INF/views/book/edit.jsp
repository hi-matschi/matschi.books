<%@ taglib uri="/WEB-INF/c.tld" prefix="core"%>
<jsp:include page="/WEB-INF/views/inc/top.jsp">
	<jsp:param name="title" value="Matschi Books - Home" />
	<jsp:param name="cssPath" value="./../../css/" />
</jsp:include>

<form method="post" action="">
	<div class="hero">
		<div class="hero-body">
		

			<div class="field">
				<label class="label">ISBN</label>
				<div class="control">
					<input class="input" type="text" name="isbn"
						placeholder="Number ISBN" value="${book.isbn}">
				</div>
			</div>

			<div class="field">
				<label class="label">Title</label>
				<div class="control">
					<input 
						class="input" 
						type="text" 
						name="title" 
						placeholder=""
						value="${book.title}"
					>
				</div>
			</div>

			<div class="field">
				<label class="label">Subtitle</label>
				<div class="control">
					<input 
						class="input" 
						type="text" 
						name="subtitle" 
						placeholder=""
						value="${book.subtitle}"
					>
				</div>
			</div>

			<div class="field">
				<label class="label">Img</label>
				<div class="control">
					<input 
						class="input" 
						type="text" 
						name="img" 
						placeholder="Url"
						value="${book.img}"
					>
				</div>
			</div>
			
			<div class="field">
			  <label class="label">Author</label>
			  <div class="control">
			    <div class="select">
			      <select name="author">
			      <core:forEach var="author" items="${authors}">
			      	 <core:choose>
					    <core:when test="${author.id == book.idAuthor}">
					    	<option selected value="${author.id}">${author.firstname} ${author.lastname}</option>
					    </core:when>
					    <core:otherwise>
					    	<option value="${author.id}">${author.firstname} ${author.lastname}</option>
					    </core:otherwise>
				     </core:choose>
				  </core:forEach>
			      </select>
			    </div>
			  </div>
			</div>

			<div class="field is-grouped">
				<div class="control">
					<input class="button is-warning" type="submit" name="editBook" value="Submit">
				</div>
				<div class="control">
					<a href="<core:url value='/book/'/>">
						<button class="button">Cancel</button>
					</a>
				</div>
			</div>
			
		</div>
	</div>
</form>

<jsp:include page="/WEB-INF/views/inc/bot.jsp"></jsp:include>