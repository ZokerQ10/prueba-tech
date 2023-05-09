#PRUEBA TECNICA

Hola, la prueba tecnica con sus problemas fue desarrollada con exito, acontinuacion una introduccion a como fue posible y que herramientas se usaron.

- solucion problema uno, para darle solucion a el problema uno fue necesaria hacer una implementacion usando un algoritmo tipo fisher, pues este nos ayuda para la generacion de los 100 numeros d emanera aleatoria y validar de que so no se agreguen numeros repetidos
- el problema dos nos plantea un problema un poco mas complejo, ya que es necesario de usar algun sistema de recepcion de peticiones HTTP, en nuestro caso como estamos usando un framework de Java llamado Spring, este nos facilita el manejo de las peticiones basandonos en servicios REST, este servicio nos ayuda a recibir request en el cuerpo y cabecera de la solicitud, asi recibiendo el arreglo y devolviendo un response con los numeros ordenados y sin repetir
- el tercer problema nos obliga a usar un base de datos para almacenar los arreglos de los request, y hacer uso de Logger que en nuestro caso use una libreria "SLF4" que nos ayuda para el control de informacion entrante mediante loggers

#ENDPOINTS
url: localhost:9091/api/number
recibe en el body un arreglo de numeros, como enviar el arreglo,
se envia en formato JSON de la siguiente manera: 
peticion tipo POST
{
  "numeros": [37,30,11,44,96,36,1,39,33,51,9,50,6,26,20,3,45,47,32,97,88,31,19,58,46,82,65,49,17,84,18,23,27,90,57,77,25,99,72,62,5,60,53,22,38,74,95,24,13,55,63,35,98,52,48,68,61,80,12,75,56,94,76,59,66,81,43,85,14,16,73,10,41,87,67,100,92,71,93,29,91,15,2,70,42,8,83,40,7,69,28,21,4,54,78,86,64,34,79,89 ]
}

peticion GET para el listado de todas las request almacenadas
url: localhost:9091/api/number/list
obtenemos todas las peticiones guardadas en la db en un formato JSON

#herramientas

- Java 17
- Spring 3.0.1
- SLF4 para el control de logger
- arquitectura basica MVC 
- no hay manejo de excepciones ni configuraciones no requeridas
- base de datos H2 
- servicios REST

