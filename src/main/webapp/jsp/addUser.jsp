<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/user/add", method="post">
        <table>
            <tr>
                <td>name:</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>age:</td>
                <td><input type="number" name="age"></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="save">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
