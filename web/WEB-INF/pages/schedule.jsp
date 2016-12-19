<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 18.12.2016
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Schedule</title>
    <link rel="stylesheet" href="../../resources/css/style_menu.css" />
    <link rel="stylesheet" href="../../resources/css/style_footer.css" />
</head>
<body>
<jsp:include page="include/menu.jsp" />

<table width="70%" align="center" cellspacing="20" cellpadding="30" style="margin-left:250px; padding-top:50px">
    <tr style="font-size:20px">
        <td align="center" valign="center">Monday</td>
        <td align="left">
            <c:if test="${not empty monday}">
                <table>
                    <c:forEach var="subject" items="${monday}">
                        <tr>
                            <td>
                                    ${subject.fk_time_of_pair.time}
                            </td>
                            <td>
                                    ${subject.fk_subject.name}
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </td>
        </tr>
        <tr style="font-size:20px">
        <td align="center" valign="center">Tuesday</td>
        <td align="left">
            <c:if test="${not empty tuesday}">
                <table>
                    <c:forEach var="subject" items="${tuesday}">
                        <tr>
                            <td>
                                ${subject.fk_time_of_pair.time}
                            </td>
                            <td>
                                ${subject.fk_subject.name}
                            </td>
                        </tr>
                    </c:forEach>

                </table>
            </c:if>
        </td>
            </tr>
    <tr style="font-size:20px">
        <td align="center" valign="center">Wednesday</td>
        <td align="left">
            <c:if test="${not empty wednesday}">
                <table>
                    <c:forEach var="subject" items="${wednesday}">
                        <tr>
                            <td>
                                    ${subject.fk_time_of_pair.time}
                            </td>
                            <td>
                                    ${subject.fk_subject.name}
                            </td>
                        </tr>
                    </c:forEach>

                </table>
            </c:if>
        </td>
        </tr>
    <tr style="font-size:20px">
        <td align="center" valign="center">Thursday</td>
        <td align="left">
            <c:if test="${not empty thursday}">
                <table>
                    <c:forEach var="subject" items="${thursday}">
                        <tr>
                            <td>
                                    ${subject.fk_time_of_pair.time}
                            </td>
                            <td>
                                    ${subject.fk_subject.name}
                            </td>
                        </tr>
                    </c:forEach>

                </table>
            </c:if>
        </td>
        </tr>
    <tr style="font-size:20px">
        <td align="center" valign="center">Friday</td>
        <td align="left">
            <c:if test="${not empty friday}">
                <table>
                    <c:forEach var="subject" items="${friday}">
                        <tr>
                            <td>
                                    ${subject.fk_time_of_pair.time}
                            </td>
                            <td>
                                    ${subject.fk_subject.name}
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </td>
        </tr>
    <tr style="font-size:20px">
        <td align="center" valign="center">Saturday</td>
        <td align="left">
            <c:if test="${not empty saturday}">
                <table>
                    <c:forEach var="subject" items="${saturday}">
                        <tr>
                            <td>
                                    ${subject.fk_time_of_pair.time}
                            </td>
                            <td>
                                    ${subject.fk_subject.name}
                            </td>
                        </tr>
                    </c:forEach>

                </table>
            </c:if>
        </td>
        </tr>
</table>
</body>
<jsp:include page="include/footer.jsp" />
</html>
