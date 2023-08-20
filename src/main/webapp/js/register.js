console.log("Hello World")

 window.addEventListener("load", function() {
    var password = document.getElementById("password");
    var confirmPassword = document.getElementById("confirmpassword");

    password.addEventListener("input", validatePasswords);
    confirmPassword.addEventListener("input", validatePasswords);

    function validatePasswords() {
      var passwordValue = password.value;
      var confirmValue = confirmPassword.value;

      if (passwordValue === confirmValue) {
        confirmPassword.setCustomValidity("");
        console.log("Passwords match");
      } else {
        confirmPassword.setCustomValidity("Passwords do not match");
        console.log("Passwords do not match");
      }
    }
  });

