window.onload =()=>{
    showToast() ;
}

function showToast() {
    const toastContainer = document.getElementById("toastContainer");

    const toast = document.createElement("div");
    toast.classList.add("toast");
    toast.textContent = "Register Successful....Please Login";

    toastContainer.appendChild(toast);

    setTimeout(function () {
        toast.classList.add("show");

        setTimeout(function () {
            toast.classList.remove("show");

            setTimeout(function () {
                toastContainer.removeChild(toast);
            }, 300); // Fade out transition duration
        }, 5000); // Toast duration (5 seconds)
    }, 100); // Delay to allow toast to be appended to the DOM
}
