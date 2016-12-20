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
    <title>Cabinet</title>
    <link rel="stylesheet" href="../../resources/css/style_menu.css" />
    <link rel="stylesheet" href="../../resources/css/style_footer.css" />
    <link rel="stylesheet" href="../../resources/css/style_popup.css" />
    <script type="text/javascript" src="../../resources/js/jquery-3.1.1.js"></script>
    <script>
        $(document).ready(function(){
            //Скрыть PopUp при загрузке страницы
            PopUpHide();
        });
        //Функция отображения PopUp
        function PopUpShow(){
            $("#popup1").show();
        }
        //Функция скрытия PopUp
        function PopUpHide(){
            $("#popup1").hide();
        }
    </script>
</head>

<body>
<!-- Use this navigation div as your menu bar div -->
<div>
<jsp:include page="include/menu.jsp" />
<table width="100%" align="center" style="margin-bottom: 50px; padding-top:50px; padding-left:200px">
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
                <tr>
                    <td><input type="button" value="Debts" style="font-size: 15px" onclick="PopUpShow()"/></td>
                </tr>
            </table>
        </td>
    </tr>

</table>


</div>


<div class="b-popup" id="popup1">
    <div class="b-popup-content">
        <div align="center" style="font-size: 25px">DEBTS</div>
        <c:if test="${student.debts.size() != 0}">
            <table cellspacing="20">
                <tr>
                    <td align="center">Name</td>
                    <td align="center">Price</td>
                </tr>
                <c:forEach var="d" items="${student.debts}">
                    <tr>
                        <td>${d.description}</td>
                        <td>${d.price}</td>
                    </tr>
                </c:forEach>

            </table>
        </c:if>
        <c:if test="${student.debts.size() == 0}">
            <div>There are not debts</div>
        </c:if>
        <div align = "center"><input type="button" value="OK" onclick="PopUpHide()"/></div>

    </div>
</div>
</body>
<jsp:include page="include/footer.jsp" />
</html>
