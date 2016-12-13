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
    <link rel="stylesheet" href="../../resources/css/style_menu.css" />
    <link rel="stylesheet" href="../../resources/css/style_footer.css" />
</head>

<body>
<!-- Use this navigation div as your menu bar div -->
<div id="wrap">
    <jsp:include page="include/menu.jsp" />
    <table width="100%" align="center" style="padding-top:50px; padding-left:200px">
        <tr>
            <td align="right">
                <img src="../../resources/photos/${student.id_student}.png" width="300" height="400"
                     alt="Иллюстрация" align="left"
                     vspace="5" hspace="5"/>
            </td>
            <td valign="top" align="left">
                <table width="500" cellspacing="20" cellpadding="30" >
                    <tr>
                        <td align="left" width="200">ФИО</td>
                        <td>${student.name}</td>
                    </tr>
                    <tr>
                        <td width="200" align="left">Номер студенческого</td>
                        <td width="300" >${student.id_student}</td>
                    </tr>
                    <tr>
                        <td align="left" width="200">Факультет</td>
                        <td>${student.faculty.name}</td>
                    </tr>
                    <tr>
                        <td align="left" width="200">Курс</td>
                        <td>${student.course.id_course}</td>
                    </tr>
                    <tr>
                        <td align="left" width="200">Группа</td>
                        <td>${student.group.number}</td>
                    </tr>
                    <tr>
                        <td align="left" width="200">Специальность</td>
                        <td>${student.group.speciality}</td>
                    </tr>
                    <tr>
                        <td align="left">Email</td>
                        <td>${student.email}</td>
                    </tr>
                </table>
            </td>
        </tr>

    </table>


</div>

</body>
<jsp:include page="include/footer.jsp" />
</html>
