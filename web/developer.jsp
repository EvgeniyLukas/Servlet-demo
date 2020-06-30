<%@ page import="org.itstep.Resume" %><%--
  Created by IntelliJ IDEA.
  User: ЛукашикЕвгенийАлекса
  Date: 30.06.2020
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Developer Info</title>
</head>
<body>
<h1>Developer Info</h1>
<%--<p>Title: <% out.println(request.getAttribute("title"));%></p> &lt;%&ndash;;1 способ вывод информации&ndash;%&gt;--%>
<%--<p>Name: <%= request.getAttribute("name") %></p> &lt;%&ndash;2 декларирование&ndash;%&gt;--%>
<%--<p>Last name: ${last_name}</p> &lt;%&ndash;3 способ description language&ndash;%&gt;--%>


<%
    Resume resume = (Resume) request.getAttribute("resume");
%>


<p>Title: <% out.println(resume.getTitle());%></p>
<p>Name: <%= resume.getDeveloper().getFirstName() %></p>
<p>Last name: ${resume.getDeveloper().getLastName()}</p>



</body>
</html>
