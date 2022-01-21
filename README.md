# API personas



**GET** Obtener todas las personas registradas

```sh
http://localhost:8081/app/api/personas/
```
Esta petición devolverá todos los personas registradas en la base de datos.

------------
**POST** Crear una nueva persona
```sh
http://localhost:8081/app/api/personas/

{
        "dni": 4,
        "nombre": "Jose",
        "apellido": "Gimenez",
        "empleado": true
}
```

Esta método permite la inserción de un registro en la base de datos(PK : dni)

------------
**PUT** Actualiza una persona
```sh
http://localhost:8081/app/api/personas/ ${dni}

{
        "nombre": "Juan",
        "apellido": "Gimenez",
        "empleado": true
}
```
Esta método permite la actualización de un registro en la base de datos recibiendo como parametro el dni

------------
**DELETE** Elimina una persona
```sh
http://localhost:8081/app/api/personas/ ${dni}
```
Esta método permite la actualización de un registro en la base de datos recibiendo como parametro el dni


