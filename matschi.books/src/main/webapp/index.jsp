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
      <ul>
	     <li><a href="<core:url value='/list/book'/>">Display all books</a></li>
	     <li><a href="<core:url value='/list/author'/>">Display all authors</a></li>
	     <li><a href="<core:url value='/list/user'/>">Display all users</a></li>
	     <li><a href="<core:url value='/add/book'/>">Add a new book</a></li>
	     <li><a href="<core:url value='/add/author'/>">Add a new author</a></li>
	     <li><a href="<core:url value='/add/user'/>">Add a new user</a></li>
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
