const form  = document.getElementById('registroProducto');
const registroBtn = document.querySelector("#guardar");

function registro(){ 
    const link = 'http://localhost:8080/Bienes/crearProducto'
    const data = {
        producto: form.elements['producto'].value,
        precio: form.elements['precio'].value,
        stock: form.elements['stock'].value,
    };
    const response = fetch(link, {
        method: 'POST',
        body: JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json'
        }
    })
        .then(response => response.json())
        .then(data => console.log(data))

    alert("Producto registrado");
}
registroBtn.addEventListener("click", registro);
