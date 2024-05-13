# TDP_5-Prueba-de-Evaluaci-n-Continua2023_2024

[Enlace al repositorio](https://github.com/HugoSanchezGallego/TDP_5-Prueba-de-Evaluaci-n-Continua2023_2024.git)

## Entrega 1: Patrón Singleton

En la primera entrega, se implementó el patrón de diseño Singleton. Este patrón es uno de los patrones de diseño más simples y se utiliza cuando solo se necesita una única instancia de una clase. El patrón Singleton garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a ella. Esto es útil cuando exactamente un objeto es necesario para coordinar acciones en todo el sistema.

Clase principal del patrón Singleton:
- `Singleton`: Esta clase tiene un método estático `getInstance` que proporciona un punto de acceso global a la única instancia de la clase.

## Entrega 2: Patrón Factory

La segunda entrega se centró en el patrón de diseño Factory. Este patrón proporciona una forma de encapsular las instancias de creación de clases concretas. En el patrón Factory, se crea un objeto sin exponer la lógica de creación al cliente y se hace referencia a los objetos recién creados a través de una interfaz común. Esto significa que el Factory permite a las subclases alterar el tipo de objetos que se crearán.

Clases principales del patrón Factory:
- `Factory`: Esta es la clase abstracta que define el método `crearProducto` que las subclases deben implementar.
- `Producto`: Esta es la interfaz que define los métodos que todos los productos deben tener.

## Entrega 3: Patrón Observer

En la tercera entrega, se utilizó el patrón de diseño Observer. Este patrón define una dependencia uno a muchos entre objetos, de manera que cuando un objeto cambia de estado, todos sus dependientes son notificados y se actualizan automáticamente. Este patrón es comúnmente utilizado en la programación de interfaces gráficas de usuario y en sistemas de manejo de eventos.

Clases principales del patrón Observer:
- `Sujeto`: Esta es la interfaz que define los métodos para agregar, eliminar y notificar a los observadores.
- `Observador`: Esta es la interfaz que define el método `actualizar` que los observadores deben implementar.

## Entrega 4: Patrones Composite y MVC

La cuarta y última entrega se centró en la implementación de los patrones de diseño Composite y MVC.

El patrón Composite se utilizó para gestionar la estructura de restaurantes. Este patrón permite tratar a los objetos individuales y a las composiciones de objetos de la misma manera, lo que puede simplificar el código al tratar con la jerarquía de objetos.

Clases principales del patrón Composite:
- `ComponenteRestaurante`: Esta es la interfaz que define los métodos que todos los componentes deben tener.
- `Restaurante` y `GrupoRestaurantes`: Estas son las clases concretas que implementan la interfaz `ComponenteRestaurante`.

El patrón MVC (Modelo-Vista-Controlador) se utilizó para separar la lógica de la interfaz de usuario de la lógica de negocio en el sistema de gestión del restaurante. En este patrón, el Modelo representa la capa de datos y la lógica de negocio, la Vista representa la capa de interfaz de usuario y el Controlador actúa como un intermediario que maneja la entrada del usuario y actualiza la Vista y el Modelo según sea necesario.

Clases principales del patrón MVC:
- `ModeloRestaurante`: Esta es la clase que representa la capa de datos y la lógica de negocio.
- `VistaRestaurante`: Esta es la clase que representa la capa de interfaz de usuario.
- `ControladorRestaurante`: Esta es la clase que actúa como un intermediario que maneja la entrada del usuario y actualiza la Vista y el Modelo según sea necesario.
