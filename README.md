# ARSW-intro-react

Construir un sistema tablero interactivo de dibujo multiusuario

<p align="center">
    <img  src="img/gameInicio.JPG">
</p>

# app desplegada en heroku

sistema tablero interactivo de dibujo multiusuario 

* [tablero interactivo](https://tictactoe-arsw.herokuapp.com) - tablero interactivo


# Prerequisitos

Tener instalado Java jdk versiones 7+, Maven comandos, git y Spring Framework

# Documentación

la documentacion de este proyecto esta en la siguiente ruta del proyecto:

```
raiz /documentation
```

# Empezar

cargue las dependencias con:

```
mvn package
```

ejecute la aplicación web con cualquiera de los dos comandos:

```
java -jar target/intro-react-0.0.1-SNAPSHOT.jar
```

```
mvn spring-boot:run
```

visualize el juego en el navegador indicando la siguiente dirección:

```
http://localhost:8080/tablero.html
```

# Diseño (diagrama de clases)

<p align="center">
    <img  src="img/diseño.JPG">
</p>

# Built con

* [Maven](https://maven.apache.org/) - Dependency Management
* [JAVA JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html) - construcción
* [JUnit 3.8.1](https://mvnrepository.com/artifact/junit/junit/3.8.1) - Test Dependency

* [Spring Framework 3.8.1](https://spring.io/projects/spring-framework) - Framework



# Autor

* **ANDRES DAVID VASQUEZ IBAÑEZ** - *Initial work* - [VASHIGO](https://github.com/vashigo)