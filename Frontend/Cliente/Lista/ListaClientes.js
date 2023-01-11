const url = 'http://localhost:8080/clientes/listaClientes'
const contenedor = document.querySelector('tbody')
let resultados = ''

const mostrar = (clientes) => {
        clientes.forEach(cliente => {
            resultados += `<tr>
                                    <td>${cliente.id}</td>
                                    <td>${cliente.empresa}</td>
                                    <td>${cliente.razon_social}</td>
                                    <td>${cliente.fecha_inicio}</td>
                                    <td>${cliente.cuit}</td>
                                    <td>${cliente.nombre}</td>
                                    <td>${cliente.apellido}</td>
                                    <td>${cliente.dni}</td>
                                    <td>${cliente.direccion}</td>
                                    <td>${cliente.email}</td>
                                    <td>${cliente.telefono}</td>
                                    <td class="text-center">
                                    <a id= "btnEditar">Editar</a>
                                    <a id= "btnBorrar" onclick="borrarCliente(${cliente.id})">Borrar</a></td>
                                </tr>`
        })
        contenedor.innerHTML = resultados  
    }
    fetch(url)
        .then (response => response.json())
        .then (data => mostrar(data))
        .then (data => console.log(data))
        .catch (error => console.log(error))
    


function borrarCliente(id){
    const urlBorrar = `http://localhost:8080/clientes/borrarCliente/${id}`
    fetch(urlBorrar,{ 
        method: 'DELETE'
    })
}