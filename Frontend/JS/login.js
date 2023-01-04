
var form  = document.getElementById('form');
let loginBtn = document.querySelector("#login");
let xhr = new XMLHttpRequest();

function login() {
    
    var link = `http://localhost:8080/usuario/iniciarSesion?username=${form.elements['username'].value}&password=${form.elements['password'].value}`
    var xhr = new XMLHttpRequest();
    xhr.open('GET', link, true);
    xhr.onreadystatechange = function () {
        if(xhr.status == 200){
            window.location.href = "../HTML/Inicio.html";
        }
        if(xhr.status == 400){
            alert("Error al iniciar sesión")
        }
        if(xhr.status == 401){
            alert("Usuario no autorizado")
        }
        var data = xhr.response;
    }
    xhr.send();
    console.log("Inicio de sesión funcionando")
}
loginBtn.addEventListener("click", login)

