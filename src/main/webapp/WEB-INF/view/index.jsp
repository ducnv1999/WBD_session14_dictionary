<%--
  Created by IntelliJ IDEA.
  User: anhduc
  Date: 22/04/2019
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <h1>Dictionary</h1>
  <form action="/dictionary" method="post">
    EN:<label>
      <input type="text" name="english" value="${english}"/>
    </label>

    <input type="submit" value="Translate">

    </label>

    VI:<label>
    <input type="text" name="vietnamese" value="${vietnamese}"/>
    </label>
  </form>
  </body>
</html>
