const url = 'http://localhost:8080/cliente/listarClientes'
const contenedor = document.querySelector('tbody')
let resultados = ''

const mostrar = (clientes) => {
    clientes.forEach(cliente => {
        resultados += `<tr>
                                <td>${cliente.ID}</td>
                                <td>${cliente.Nombre}</td>
                                <td>${cliente.Apellido}</td>
                                <td>${cliente.DNI}</td>
                                <td>${cliente.Direccion}</td>
                                <td>${cliente.Email}</td>
                                <td>${cliente.Telefono}</td>
                                <td>${cliente.Empresa}</td>
                                <td>${cliente.CUIT}</td>
                                <td>${cliente.razon_social}</td>
                                <td>${cliente.fecha_inicio}</td>
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