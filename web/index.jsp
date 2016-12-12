<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Authentification</title>
  <script src="../../resources/js/login-validate.js" defer></script>
  <meta http-equiv="Content-Type" content="text/html; charset=windows-1251" />
  <link href="../../resources/css/style.css" rel="stylesheet"/>
</head>
<body>
<table>
  <tr>
    <td>
      <img src="../../resources/images/signMenu.png" alt="Sign" width="50" height="45">
    </td>
    <td>
      <h1 class="styleText">StudentBase</h1>
    </td>
  </tr>
</table>
<form id="login-form" action="<c:url value="/j_spring_security_check"/>" method="POST" style="position: fixed; top: 35%; left: 42%; width: 200px">
  Login:<br /> <input type="text" name="username" style="width: 200px"/><br />
  Password:<br /> <input type="password" name="password" maxlength="8" style="width: 200px"/><br />
  <button type="submit" class="button" align="center" style="width: 200px"> Enter </button>

  <div style="margin-top: 35px" class="control-group controls">
    <c:if test="${not empty error}">
      <div class="alert alert-danger" role="alert">
        <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
        <span class="sr-only">Error:</span>
        Invalid username or password
      </div>
    </c:if>
  </div>
</form>

</body>
</html>
