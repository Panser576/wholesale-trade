btn.onclick = function () {

  let valName = /^\w{3,15}$/.test(inpName.value);
  let valTel = /^\+380\d{9}$/.test(inpTel.value);
  let valEmail = /^\w{4,10}\@\w{4,10}\.\w{2}/.test(inpEmail.value);
  let valPass = /^\w{1,15}$/.test(inpPass1.value);

  if (!valName) {
    username.innerHTML = 'username is not correct!';
    username.className = 'active';
    return false;
  } else {
    username.innerHTML = '';
  }

  if (!valTel) {
    tel.innerHTML = 'phone is not correct!';
    tel.className = 'active';
    return false;
  } else {
    tel.innerHTML = '';
  }

  if (!valEmail) {
    email.innerHTML = 'email is not correct!';
    email.className = 'active';
    return false;
  } else {
    email.innerHTML = '';
  }

  if (valPass) {
    pass1.innerHTML = '';
  }

  if (!valPass) {
    pass1.innerHTML = 'password is not correct!';
    pass1.className = 'active';
    return false;
  }
  else if (inpPass2.value != inpPass1.value) {
    pass2.innerHTML = 'confirm password is not correct!';
    pass2.className = 'active';
    return false;
  }



  if (valName && valTel && valEmail && valPass) {
    let name = document.getElementById('inpName');
    let email = document.getElementById('inpEmail');
    let pass = document.getElementById('inpPass1');

    localStorage.setItem('name', name.value);
    localStorage.setItem('email', email.value);
    localStorage.setItem('password', pass.value);

    location.href = 'login.html';
  }
}
