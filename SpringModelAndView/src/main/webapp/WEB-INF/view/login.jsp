<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sample Form</title>
</head>
<body>
    <h1>Sample Form</h1>
    <form action="process" method="post">
        <label for="name">StudentName:</label>
        <input type="text" id="name" name="studentName" required><br><br>
        <label for="name">StudentId:</label>
        <input type="text" id="name" name="id" required><br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="studentEmail" required><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
    