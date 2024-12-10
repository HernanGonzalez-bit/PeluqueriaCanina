# Peluquería Canina - CRUD

## Descripción
Este es un sistema CRUD para gestionar clientes y mascotas de una peluquería canina. El proyecto está desarrollado en Java utilizando Maven y MySQL.

## Requisitos
- JDK 11 o superior
- Maven 3.6.0 o superior
- MySQL

## Configuración

1. Clona este repositorio:
   ```bash
   git clone https://github.com/HernanGonzalez-bit/PeluqueriaCanina.git
   cd PeluqueriaCanina
   ```

2. Configura la base de datos:
   - Crea una base de datos en MySQL llamada `peluqueriacanina`.
   - Ajusta la conexión en el archivo `src/main/resources/application.properties`:
     ```
     spring.datasource.url=jdbc:mysql://localhost:3306/peluqueriacanina
     spring.datasource.username=root
     spring.datasource.password=tu_contraseña
     ```

3. Compila el proyecto:
   ```bash
   mvn clean install
   ```

4. Ejecuta la aplicación:
   ```bash
   mvn exec:java
   ```

## Licencia
MIT
