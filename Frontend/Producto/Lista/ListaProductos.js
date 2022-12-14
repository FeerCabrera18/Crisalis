const url = 'http://localhost:8080/bienes/listaProductos'
const contenedor = document.querySelector('tbody')
let resultados = ''

const mostrar = (Productos) => {
    Productos.forEach(producto=> {
        resultados += `<tr>
                                <td>${producto.id}</td>
                                <td>${producto.producto}</td>
                                <td>${producto.precio}</td>
                                <td>${producto.stock}</td>
                                <td class="text-center"><a class="btnEditar">Editar</a>
                                <a class="btnBorrar">Borrar</a></td>
                            </tr>`    
    })
    contenedor.innerHTML = resultados  
}
fetch(url)
    .then (response => response.json())
    .then (data => mostrar(data))
    .then (data => console.log(data))
    .catch (error => console.log(error))