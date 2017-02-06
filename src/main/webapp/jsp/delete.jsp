<%--
  Created by IntelliJ IDEA.
  User: minghui.fan
  Date: 2017/2/6
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/user/delete" method="post">
        <table>
            <tr>
                <td>id:</td>
                <td><input type="number" name="id"></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="delete">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
