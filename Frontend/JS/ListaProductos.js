const url = 'http://localhost:8080/Bienes/listarProductos'
const contenedor = document.querySelector('tbody')
let resultados = ''

const mostrar = (Productos) => {
    Productos.forEach(producto=> {
        resultados += `<tr>
                                <td>${producto.ID}</td>
                                <td>${producto.producto}</td>
                                <td>${producto.precio}</td>
                                <td>${producto.stock}</td>
                                <td class="text-center"><a>Editar</a><a>Borrar</a></td>
                            </tr>`    
    })
    contenedor.innerHTML = resultados  
}
fetch(url)
    .then (response => response.json())
    .then (data => mostrar(data))
    .then (data => console.log(data))
    .catch (error => console.log(error))