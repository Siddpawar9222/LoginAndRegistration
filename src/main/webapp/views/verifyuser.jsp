<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/verifyuser.css">
<title>Verify User</title>
</head>
<body>
    <div class="container">
        <h1>Verify User</h1>

        <form action="verify" method="post" >
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" required>
            </div>

            <div class="form-group">
                <label for="phone">Phone</label>
                <input type="text" id="phone" name="phone" required>
            </div>

            <button type="submit" class="btn">Verify</button>
        </form>
    </div>
</body>
</html>