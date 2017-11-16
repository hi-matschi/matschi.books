<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="../../c.tld" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><%= request.getParameter("title") %></title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="<%= request.getParameter("cssPath") %>bulma.min.css">
</head>
<body>
<nav class="navbar is-warning">
  <div class="navbar-brand">
    <a class="navbar-item" href="<core:url value='/'/>">
		<strong>MATSCHI BOOKS</strong>
    </a>
  </div>

  <div class="navbar-menu">
    <div class="navbar-start">
      <a class="navbar-item" href="<core:url value='/book/list'/>">
        List Book
      </a>
      <a class="navbar-item" href="<core:url value='/book/add'/>">
        Add Book
      </a>
    </div>

    <div class="navbar-end">
      <div class="navbar-item">
        JavaEE Mathieu
      </div>
    </div>
  </div>
</nav>