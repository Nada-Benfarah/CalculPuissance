<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="web.Puissance"%>
<% Puissance pui=(Puissance)request.getAttribute("model"); %>
<html>
<head>
    <title>Calculer Puissance</title>
</head>
<body>
<div>
    <form action="controle" method="POST">
        <table>
            <tr>
                <td> Nombre a:</td>
                <td><input type="number" min="0" name="a" value="${model.a}"></td>
            </tr>
            <tr>
                <td> Nombre b:</td>
                <td><input type="number" min="0" name="b" value="${model.b}"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Calculer"></td>
            </tr>
        </table>
    </form>
</div>
<div>
    <table>
        <tr>
            <td>La puissance:</td>
            <td>${model.p}</td>
        </tr>
    </table>
</div>
</body>
</html>