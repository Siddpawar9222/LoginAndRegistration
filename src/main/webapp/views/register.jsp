<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
	<title>Registration Form</title>
	<link rel="stylesheet" type="text/css" href="../css/register.css">
	 <script src="../js/register.js"></script>
	<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
	<style>
	#subbtn:hover{
	background-color: green !important;
}
	</style>
</head>
<body>   
      
      <div class="wrapper">
	<div class="r_form_wrap">
		
		<div class="title">
			<p>Registration Form</p>
		</div>

		<div class="r_form">
			<form action="reg">
				<div class="input_wrap">
					<label for="yourname">Your Name</label>
					<div class="input_item">
						<span class="icon">
							<ion-icon name="person-sharp"></ion-icon>
						</span>
						<input type="text" name="name" class="input" id="yourname">
					</div>
				</div>
				<div class="input_wrap">
					<label for="emailaddress">Email Address</label>
					<div class="input_item">
						<span class="icon">
							<ion-icon name="mail-sharp"></ion-icon>
						</span>
						<input type="text" name="email" class="input" id="emailaddress">
					</div>
				</div>
				<div class="input_wrap">
					<label for="password">Password</label>
					<div class="input_item">
						<span class="icon">
							<ion-icon name="key-sharp"></ion-icon>
						</span>
						<input type="password" name="password" class="input" id="password"  required>
					</div>
				</div>
				<div class="input_wrap">
					<label for="confirmpassword">Confirm Password</label>
					<div class="input_item">
						<span class="icon">
							<ion-icon name="key-sharp"></ion-icon>
						</span>
						<input type="password" name="confirmpassword" class="input" id="confirmpassword" required>
					</div>
				</div>
				<div class="input_wrap">
					<label for="phone">Phone</label>
					<div class="input_item">
						<span class="icon">
							<ion-icon name="call-sharp"></ion-icon>
						</span>
						<input type="number" name="phone" class="input" id="phone">
					</div>
				</div>
				<div class="input_wrap">
					<label>Gender</label>
					<div class="input_radio">
						<div class="input_radio_item">
							<input type="radio" id="male" name="gender" class="radio" value="male">
							<label for="male" class="radio_mark">
								<ion-icon class="i" name="male-sharp"></ion-icon>
							Male</label>
						</div>
						<div class="input_radio_item">
							<input type="radio" id="female" name="gender" class="radio" value="female">
							<label for="female" class="radio_mark">
								<ion-icon class="i" name="female-sharp"></ion-icon>
								Female</label>
						</div>
						<div class="input_radio_item">
							<input type="radio" id="others" name="gender" class="radio" value="others">
							<label for="others" class="radio_mark">
								<ion-icon class="i" name="male-female-sharp"></ion-icon>
								Others</label>
						</div>
					</div>
				</div>

			<input type="submit" value="Register Now" id="subbtn" style="width: 100%;border: 0;background: var(--primary);padding: 10px;border-radius: 3px;height: 40px;color: var(--white);cursor: pointer;transition: 0.5s ease;">
			</form>
		</div>

	</div>
</div>
</body>
</html>