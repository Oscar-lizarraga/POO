# Proyecto POO

##### Tabla de contenido
* Objetivos
* Requerimentos
* Diseño

##### Introduccion
Se requiere crear un programa para la gestion de horarios de salas, para la venta al publico de articulos como sodas, golosinas, palomitas, etc. Asi como un punto de venta para los boletos en taquilla

##### Objetivos
* Crear un POS para la venta de articulos.
* Crear un sistema de gestion de horarios para las salas
* Crear un POS para la venta de taquillas

##### Requrimentos
* Que contenga interfaz

##### Diseño
*Capa de datos*
```Java 

//Taquilla y salas
* Clase Sala
	- id sala: int
	- numero de asientos: int
	-------------------------
	+ agregarSala(): String
	+ editarSala(): String
	+ eliminarSala(): String
	+ mostrarSalas(): ArrayList<Sala>
	+ buscarSala(): Sala

* Clase Funcion
	- id funcion: int
	- descripcion: String
	- duracion: Date
	- genero: String
	- fechas de emision: ArrayList<Date>
	- salas de emision: ArrayList<Sala>
	- precio costo: Double
	- precio venta: Double
	-------------------------
	+ agregarFuncion(Funcion funcion): String
	+ editarFuncion(Funcion funcion): String
	+ eliminarFuncion(): String
	+ mostrarTodasLasFuncionesActivas():
	+ mostrarTodasLasFuncionesFuera(): 
	+ buscarFuncionPorDescripcion(String descripcion): ArrayList<Funcion>   
	+ buscarTodasFuncionesPorHora(Date hora): ArrayList<Funcion> 	
	+ buscarTodasFuncionesPorDia(Date dia): ArrayList<Funcion> 	
	+ buscarSalasDeFuncionPorDia(Date dia): ArrayList<Funcion>	

* Clase Boleto
 	- id boleto: int
	- fecha de venta: Date
	- funcion: Funcion
	- sala: Sala
	-------------------------
	+ agregarBoleto(): String
	+ eliminarBoleto(): String
	+ mostrarNumeroBoletosPorFuncionPorSalaPorFechaEmision():
	+ mostrarNumeroBoletosPorDiaTodasFunciones():
	+ mostrarNumeroTotalBoletosPorFuncion():

// Palomitas y dulceria
* Clase Articulo
	- codigo : String
	- descripcion: String
	- precio costo: Double
	- precio venta: Double

*Clase Venta
	- id venta: int
	- fecha de venta: Date
	- total de venta: Double
	- total de costo: Double
	- total de articulos: int
	- articulos: Arralist<Articulo>

//Accesos
Clase Empleado
	- id empleado: int
	- nombre: String
	- nivel de acceso: int
	- user : String
	- password: String





```

*Capa de la logica*
```Java

```