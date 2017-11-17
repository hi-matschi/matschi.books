<%@ taglib uri="/WEB-INF/c.tld" prefix="core"%>
<jsp:include page="/WEB-INF/views/inc/top.jsp">
	<jsp:param name="title" value="Matschi Books - Home" />
	<jsp:param name="cssPath" value="./../css/" />
</jsp:include>

<form method="post" action="add">
	<div class="hero">
		<div class="hero-body">

			<div class="field">
				<label class="label">First name</label>
				<div class="control">
					<input class="input" type="text" name="firstname"
						placeholder="">
				</div>
			</div>

			<div class="field">
				<label class="label">Last name</label>
				<div class="control">
					<input class="input" type="text" name="lastname" placeholder="">
				</div>
			</div>

			<div class="field is-grouped">
				<div class="control">
					<input class="button is-warning" type="submit" name="addAuthor" value="Submit">
				</div>
				<div class="control">
					<a href="<core:url value='/'/>">
						<button class="button">Cancel</button>
					</a>
				</div>
			</div>
			
		</div>
	</div>
</form>

<jsp:include page="/WEB-INF/views/inc/bot.jsp"></jsp:include>