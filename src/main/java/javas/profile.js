
// let hello = document.getElementById('hello');
// let textarea = document.getElementById('record');
// let comment = document.getElementsByClassName('comment')[0].parentNode;


if (localStorage.getItem('isAuth') != 'true') {
  location.href = 'login.html';
} else {
  hello.innerHTML += localStorage.getItem('name');
}

logout.onclick = function () {
  localStorage.removeItem('isAuth');
  location.href = 'login.html';
}

// button.onclick = function () {
//   comment.innerHTML += '<div class="comment">' + textarea.value + '<button class="remove">x</button></div>';
// }

// remove.addEventListener = function () {
//   // if (event.target.className != 'remove-button') return;

//   // let comment = event.target.closest('.comment');
//   this.parentNode.remove();
// };