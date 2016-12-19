<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 12.12.2016
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <!-- Load jQuery from Google's CDN -->
    <!-- Source our javascript file with the jQUERY code -->
    <title>Subjects</title>
    <link rel="stylesheet" href="../../resources/css/style_menu.css" />
    <link rel="stylesheet" href="../../resources/css/style_footer.css" />
</head>

<body>
<!-- Use this navigation div as your menu bar div -->
<div>
    <jsp:include page="include/menu.jsp" />
    <table width="70%" align="center" cellspacing="20" cellpadding="30" style="margin-left:250px; padding-top:50px">
        <tr style="font-size:30px">
            <td align="center">Subject</td>
            <td align="center">Description</td>
        </tr>

        <c:forEach var="subject" items="${subjects}">
        <tr align = "center" style="font-size:20px">
            <td align="center" style="font-size:20px">${subject.name}</td>

            <td align="center" style="font-size:20px">${subject.description}</td>
        </tr>
        </c:forEach>

    </table>


</div>

</body>
<jsp:include page="include/footer.jsp" />
</html>
