<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
<h2>User Registration</h2>
<form action="register" method="post">
    <table>
        <tr>
            <td>Full name:</td>
            <td><input type="text" name="fullname" /></td>
        </tr>
        <tr>
            <td>E-mail:</td>
            <td><input type="email" name="email" /></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password" /></td>
        </tr>
        <tr>
            <td>Birthday (yyyy-mm-dd):</td>
            <td><input type="date" name="birthday" /></td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td>
                <input type="radio" name="gender" value="Male" /> Male
                <input type="radio" name="gender" value="Female" /> Female
            </td>
        </tr>
        <tr>
            <td>Profession:</td>
            <td>
                <select name="profession">
                    <option value="Developer">Developer</option>
                    <option value="Designer">Designer</option>
                    <option value="Manager">Manager</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Married?</td>
            <td><input type="checkbox" name="married" value="yes" /></td>
        </tr>
        <tr>
            <td>Note:</td>
            <td><textarea name="note" rows="4" cols="30"></textarea></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Register" /></td>
        </tr>
    </table>
</form>
</body>
</html>
