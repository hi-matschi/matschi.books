<%@ taglib uri="/WEB-INF/c.tld" prefix="core" %>
<jsp:include page="/WEB-INF/views/inc/top.jsp">
       <jsp:param name="title" value="Matschi Books - Home" />
</jsp:include>

<section class="hero">
  <div class="hero-body">
    <div class="container">
      <h1 class="title">
        Admininistration
      </h1>
      <h2 class="subtitle">
        All admin actions
      </h2>
      <ul>
     <li><a href="<core:url value='/list'/>">Display all books</a></li>
     <li><a href="<core:url value='/add'/>">Add a new book</a></li>
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
