<%@ taglib uri="/WEB-INF/c.tld" prefix="core" %>
<jsp:include page="/WEB-INF/views/inc/top.jsp">
       <jsp:param name="title" value="Matschi Books - Home" />
       <jsp:param name="cssPath" value="./css/" />
</jsp:include>

<section class="hero">
  <div class="hero-body">
    <div class="container">
      <h1 class="title">
        Administration
      </h1>
      <h2 class="subtitle">
        All admin actions
      </h2>
      <p>Book</p>
      <ul>
	     <li><a href="<core:url value='/book/'/>">Display all books</a></li>
	     <li><a href="<core:url value='/book/add'/>">Add a new book</a></li>
	  </ul>
	  <br>
	  <p>Author</p>
	  <ul>
	     <li><a href="<core:url value='/author/list'/>">Display all authors</a></li>
	     <li><a href="<core:url value='/author/add'/>">Add a new author</a></li>
	  </ul>
	  <br>
	  <p>User</p>
	  <ul>
	     <li><a href="<core:url value='/user/list'/>">Display all users</a></li>
	     <li><a href="<core:url value='/user/add'/>">Add a new user</a></li>
      </ul>
    </div>
  </div>
</section>

<section class="hero is-warning">
  <div class="hero-body">
    <div class="container">
      <h1 class="title">
        Subscriber
      </h1>
      <h2 class="subtitle">
        All subscribers actions
      </h2>
      <ul>
	     <li><a href="<core:url value='/take'/>">Take a book</a></li>
	     <li><a href="<core:url value='/return'/>">Return a book</a></li>
      </ul>
    </div>
  </div>
</section>

<jsp:include page="/WEB-INF/views/inc/bot.jsp"></jsp:include>
