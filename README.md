# GestionInventarioSamuelBuitrago

Proyecto springboot de inventario con conexión a base de datos MySQL
Por: Samuel Buitrago Osorio

## Requisitos

- Java 17
- Maven 3.8+
- MySQL 8+

## Configuración de la base de datos

1. Crea una base de datos llamada `gestionInventario_db` en MySQL:

```sql
CREATE DATABASE gestionInventario_db;
```

PROPERTIES: 
spring.application.name=gestionInventarioSamuelBuitrago

spring.datasource.url=jdbc:mysql://localhost:3306/gestionInventario_db
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

management.endpoints.web.exposure.include=health


PRUEBAS DE SEGURIDAD CORRIENDO 
![image](https://github.com/user-attachments/assets/903f76c6-43b8-482f-8b72-201833b13cc4)

PRUEBAS UNITARIAS CORRIENDO 
![image](https://github.com/user-attachments/assets/3cfd807a-ad26-4bb6-85b0-37161c0f33fb)

PRUEBAS DE PERFORMANCE CORRIENDO 
![image](https://github.com/user-attachments/assets/5b62550c-0488-4b25-a5e9-86ad57db6321)
![image](https://github.com/user-attachments/assets/ccfe44d1-33df-4979-96d7-b4c9e1dc0836)
![image](https://github.com/user-attachments/assets/5848d85d-2029-479e-8ede-dacfc81120fe)
![image](https://github.com/user-attachments/assets/934dcd3f-a76d-4c2a-aab8-6283c3eb57d7)
![image](https://github.com/user-attachments/assets/49137743-97f6-4c23-93e3-55de97eb2b49)
![image](https://github.com/user-attachments/assets/2b53578e-d0ac-4ed7-bb54-c42dab172de7)



