
button.onclick = function () {
  let inpEmail = document.getElementById("inpEmail");
  let inpPass = document.getElementById("inpPass");

  let email = document.getElementById("email");
  let pass = document.getElementById("pass");

  let valEmail = /^\w{4,10}\@\w{4,10}\.\w{2}/.test(inpEmail.value);
  let valPass = /^\w{1,15}$/.test(inpPass.value);

  let localEmail = localStorage.getItem("email");
  let localPass = localStorage.getItem("password");

  if (!valEmail) {
    email.innerHTML = 'email is not correct!';
    email.className = 'active';
    return false;
  } else {
    email.innerHTML = '';
  }

  if (!valPass) {
    pass.innerHTML = 'password is not correct!';
    pass.className = 'active';
    return false;
  } else {
    pass.innerHTML = '';
  }

  if (valEmail && valPass && inpEmail.value == localEmail && inpPass.value == localPass) {
    localStorage.setItem("isAuth", 'true');
    location.href = "profile.html";
  } else {
    location.href = "registr.html";
  }
}

