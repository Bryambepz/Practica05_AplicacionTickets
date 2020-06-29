# Practica05_AplicacionTickets
Desarrollar una aplicación que permita el registro de entra y salida de vehiculos en un parqueadero
## Lenguaje 
- Java JDK 1.8
- ID Netbeans Apache 11.3
## Librerias
- javax.swing.JOptionPane
- javax.swing.jLabel
- javax.swing.jTextField
- javax.swing.JButton
- java.time.Duration
- java.time.LocalDate
- java.time.LocalDateTime
- java.util.Locale
- java.util.ResourceBundle
- javax.swing.table.DefaultTableModel
- java.util.Date
- java.util.List
# 1. Creamos un repositorio en GitHub con el nombre de "Práctica de laboratorio 05: Gestión de tickets (Parqueadero)"
- El repositorio se encuentra en el siguiente enlace
- https://github.com/Bryambepz/Practica05_AplicacionTickets
# 2. Desarrollamos una aplicación que permita la gestión de tickets de un parquedero de vehículos  segun los requerimientos planteados en las instrucciones de la práctica
-	Primero al comenzar la practica desarrollamos el diagrama de clases UML en la pagina Lucidchart el cual puede ser visualizado en el siguiente link;
- https://app.lucidchart.com/documents/edit/66d9b0d8-13e9-4971-8bd0-7205ac6535a8/0_0 
- Posteriormente entendido y leídas las instrucciones procedemos a creer un programa en netbeans con sus respectivos paquetes y clases para desarrollar la aplicación:

![image](https://user-images.githubusercontent.com/64825176/85982741-f473d700-b9ab-11ea-9c3f-5faa0218e76d.png)

## En el paquete modelo tenemos 3 clases:
### - Clase Cliente

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/modelo/Cliente.java

- En esta clase instanciamos primero los atributos indicados en las instrucciones después hacemos la respectiva asociación con la clase vehículo y obtenemos una lista de vehículos generamos los getter y setter de cada atributo, creamos los métodos del CRUD para poder manipular la lista de vehículos relacionados, instanciamos los métodos **"equals"** y **"hashcode"** del atributo cedula y creamos el toString para imprimir el cliente.
### - Clase Vehiculo

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/modelo/Vehiculo.java

- Instanciamos los atributos de la clase, realizamos la asociación de agregación con con la clase cliente y generamos sus getter y setters, para cargar los datos del cliente en la ventana ingresar vehículo para cargar los datos del cliente al generar el ticket. Instanciamos los métodos **equal** y **hashcode** del atributo placa y creamos el "toString"
### - Clase Ticket

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/modelo/Ticket.java

-Creamos sus atributos y asociamos la clase ticket con la clase vehículo, creamos sus getters y setters junto con los métodos **equals** y **hashcode** junto con el metodo toString

## En el paquete idao tenemos 3 interfaces:
### - Interfaz IClienteDAO

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/idao/IClienteDAO.java

- En esta interface instanciamos los métodos del CRUD para el cliente y un metodo que nos será de utilidad para buscar al cliente por vehiculo
### - Interfaz IVehiculoDAO

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/idao/IVehiculoDAO.java

- Instanciamos los métodos del CRUD
### - Interfaz ITicketDAO

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/idao/ITiketDAO.java

- Aparte de los métodos CRUD, creamos dos métodos, uno que genera el numero para el ticket que creamos y el otro para buscar por vehículo que luego nos servira para listar los tickets
### - ClienteDAO

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/dao/ClienteDAO.java

- Aqui se implementaran los métodos creados instanciados por la interfaz para despues llamarlos atravez de un controlador y llamados por la vista
### - VehículoDAO

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/dao/VehiculoDAO.java

- En esta clase se implementan los métodos instanciados por la interfaz para después ser usados por el controlador y llamados por la vista
### - TicketDAO

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/dao/TiketDAO.java

- Implementamos los métodos instanciados por la interfaz para después ser usados

## El paquete controlador contiene 3 clases:
### - ControladorCliente

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/controlador/ControladorCliente.java

- En esta clase tenemos varios métodos que después van a hacer llamados por las ventanas para poder manipular los datos del cliente es así como tenemos el método para crear el cliente, para buscar el cliente por medio de una cedula, para agregar un vehículo al cliente, un método para buscar el cliente por vehículo y por último un método para poder listar todos los clientes guardados en la lista del DAO 
### - ControladorVehículo

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/controlador/ControladorVehiculo.java

- En esta clase tenemos varios métodos que después van a hacer llamados por las ventanas para poder manipular los datos del vehículo, tenemos el método para crear un vehículo y pasarle al dao para que agrega a la lista y nos retorna un vehículo el cual pasaremos al cliente, el método de buscar vehículo por una placa y finalmente un listar vehículos de la lista del dao.
### - ControladorTicket

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/src/ec/edu/ups/controlador/ControladorTiket.java

- En esta clase tenemos varios métodos que después van a hacer llamados por las ventanas para poder manipular los datos del ticket, tenemos el método crear ticket el cual solo nos crea el inicio con un número, fecha y hora de ingreso y un vehículo porque solo se pasan estos datos al momento de que un vehículo ingresa al parqueadero, ya que después llamaremos al método actualizar el cual pasara los datos de la hora y fecha de salida y el total estos datos se le agregan o se le pasa al actualizar al momento de generar la salida de un vehículo del parqueadero, también tenemos el método de numero el cual es para generar el código automáticamente, el método buscar ticket al que le pasamos el numero de ticket y un buscar por vehículo el cual nos va a dar una lista de tickets relacionados con ese vehículo    
### Ventanas
-Los códigos de las siguientes ventanas se encuentran en el siguiente link debido a que son demasiado extenso por lo que decidimos poner el link en donde se encuentran las ventanas en nuestro proyecto del GitHub.

https://github.com/Bryambepz/Practica05_AplicacionTickets/tree/master/src/ec/edu/ups/vista

### Funcionalidad de las ventanas
- Ventana principal en donde damos clic en el menú y nos despliega los menús ítems del menú

![image](https://user-images.githubusercontent.com/64825176/85987464-4704c180-b9b3-11ea-80b0-f1de5f9f6ee5.png)

- Al presionar registrar entrada se despliega la siguiente ventana

![image](https://user-images.githubusercontent.com/64825176/85987578-64399000-b9b3-11ea-8172-0b7f34acc5f7.png)

- Al presionar emitir ticket sin ningún dato nos sale la siguiente venta 

![image](https://user-images.githubusercontent.com/64825176/85987627-7adfe700-b9b3-11ea-8909-9a6b11b9f984.png)

- Presionamos ok y al no tener datos en la tabla para seleccionar damos clic en el botón gestión vehículo y se nos abre la siguiente ventana para ingresar un vehículo

![image](https://user-images.githubusercontent.com/64825176/85987692-96e38880-b9b3-11ea-92b4-53f93b4d140a.png)

- Al llenar los datos del vehículo nos pide que le pasemos la cedula del cliente para poder buscar el cliente y agregar el vehículo, pero al no encontrarlo nos sale lo siguiente.

![image](https://user-images.githubusercontent.com/64825176/85987783-bda1bf00-b9b3-11ea-8fcf-a0c00d74d33b.png)

- Al presionar que si se nos abre la ventana para crear el cliente

![image](https://user-images.githubusercontent.com/64825176/85987874-de6a1480-b9b3-11ea-83ca-10098b0d2884.png)

- Al presionar crear vehículo con todos los datos ingresados nos sale que a sido creado con éxito

![image](https://user-images.githubusercontent.com/64825176/85987946-f6da2f00-b9b3-11ea-8cce-8923ef019b02.png)

- Entonces se cierra la ventana crear cliente y presionamos en el botón de buscar y nos recupera los datos del cliente y se activa el botón crear vehículo

![image](https://user-images.githubusercontent.com/64825176/85988017-12453a00-b9b4-11ea-913f-f7420d0441c7.png)

- Presionamos el botón registrar vehículo y nos sale que a sido creado exitosamente 

![image](https://user-images.githubusercontent.com/64825176/85988074-25580a00-b9b4-11ea-8bfe-8cb706f45fd8.png)

- Y se cargan los datos en la tabla

![image](https://user-images.githubusercontent.com/64825176/85988209-53d5e500-b9b4-11ea-97a7-98fb84760b8b.png)

- Presionamos el dato de la tabla y se cargan los datos al ticket 

![image](https://user-images.githubusercontent.com/64825176/85988264-68b27880-b9b4-11ea-83bf-f540fc4017be.png)

- Presionamos en emitir ticket y nos sale que ah sido creado exitosamente 

![image](https://user-images.githubusercontent.com/64825176/85988322-7b2cb200-b9b4-11ea-9b40-7c52b8a2c59b.png)

- Presionamos en el menú ítem de ticket salida y nos aparece la siguiente ventana la cual nos pide que ingresemos el número de ticket

![image](https://user-images.githubusercontent.com/64825176/85988412-93043600-b9b4-11ea-8976-a246a34d8c63.png)

- Ponemos el numero y le damos a información ticket y se nos cargan los datos del ticket

![image](https://user-images.githubusercontent.com/64825176/85988447-a1eae880-b9b4-11ea-9725-0a68ef7e0448.png)

- Presionamos el botón de generar ticket salida y nos sale un mensaje con el valor a cancelar

![image](https://user-images.githubusercontent.com/64825176/85988622-ed9d9200-b9b4-11ea-950f-05373356a1ae.png)

- Nos vamos al menú listar y nos da dos opciones si desea listar por cedula o por placa del vehículo

![image](https://user-images.githubusercontent.com/64825176/85988665-0017cb80-b9b5-11ea-931d-83cef74a790a.png)

- Al presionar lista por placa nos sale la siguiente ventana

![image](https://user-images.githubusercontent.com/64825176/85988736-1a51a980-b9b5-11ea-9ff3-ff4eb0c38554.png)

- Escribimos la placa del vehículo presionamos en listar Ticket y se cargan los datos automáticamente

![image](https://user-images.githubusercontent.com/64825176/85988793-2e95a680-b9b5-11ea-9d8b-077a334b4140.png)

# 3. Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación desde principio a fin. Los commits deben ser realizados por todos los integrantes del grupo. 

- En el siguiente Enlace se encuentra el historial de commits realizados por el grupo hacia el repositorio de GitHub:

https://github.com/Bryambepz/Practica05_AplicacionTickets/commits/master

# 4. Implementar el README del repositorio del proyecto con la misma información del informe de la práctica (incluidas las imágenes y versiones de las herramientas)
- En el siguiente enlace se encuentra el readme realizado por el grupo:

https://github.com/Bryambepz/Practica05_AplicacionTickets/blob/master/README.md

# RESULTADOS:
- Implementar un patrón de diseño MVC Y DAO con interface grafica haciendo uso de la librería Swing de Java         
# Conclusiones:
- En conclusión, la practica nos ayudó a aumentar y a sustentar los conocimientos vistos debido a la implementación de los mismos ya en una aplicación funcional, dándonos así la oportunidad de realizar códigos de una manera más complicada que al final conseguir hacer nuestra primera aplicación con interface grafica funcional  




















