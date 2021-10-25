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
```Java 

//Taquilla y salas
* Clase Sala
	* numero de sala: int
	* numero de asientos: int
	-------------------------
	agregarSala(): String
	editarSala(): String
	eliminarSala(): String
	mostrarSalas(): ArrayList<Sala>
	buscarSala(): Sala

* Clase Funcion
	* duracion: Date
	* genero: String
	* fechas de emision: ArrayList<Date>
	* salas de emision: ArrayList<Sala>
	* precio costo: Double
	* precio venta: Double
	-------------------------
	agregarFuncion(): String
	editarFuncion(): String
	eliminarFuncion(): String
	buscarFuncionPorDescripcion(): ArrayList<Funcion>   
	buscarTodasFuncionesPorHora(): ArrayList<Funcion> 	//todas las funciones que se acercan a tal hora
	buscarTodasFuncionesPorDia(): ArrayList<Funcion> 	//todas las funciones de ese dia
	buscarSalasDeFuncionPorDia(): ArrayList<Funcion>	//Salas donde estara la funcion ese dia

* Clase Boleto
	* fecha de venta: Date
	* funcion: Funcion
	* sala: Sala
	-------------------------
	agregarBoleto(): String
	eliminarBoleto(): String
	mostrarNumeroBoletosPorFuncionPorSalaPorFechaEmision():
	mostrarNumeroBoletosPorDiaTodasFunciones():
	mostrarNumeroTotalBoletosPorFuncion():

// Palomitas y dulceria
* Clase Articulo
	* codigo : String
	* descripcion: String
	* precio costo: Double
	* precio venta: Double

*Clase Venta
	* fecha de venta: Date
	* total de venta: Double
	* total de costo: Double
	* total de articulos: int
	* articulos: Arralist<Articulo>

//Accesos
Clase Empleado
	* nombre: String
	* nivel de acceso: int
	* user : String
	* password: String





```