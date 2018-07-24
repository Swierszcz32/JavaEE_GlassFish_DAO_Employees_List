<%-- 
    Document   : newjsp
    Created on : 2018-07-18, 09:25:31
    Author     : adizw
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Lp.</th>
                    <th>Imię i nazwisko</th>
                    <th>Wypłata</th>
                    <th>Data zatrudnienia</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach varStatus="loop" items="${employees}" var="e">
                    <tr>
                        <td>${loop.index+1}.</td>
                        <td>${e.firstName} ${e.lastName}</td>
                        <td>${e.salary}</td>
                        <td>${e.data}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
