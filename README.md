# KometPrueba

Esta API ofrece servicios para administrar una lista de flores. Cada flor tiene los siguientes atributos:

- id: identificador único de la flor.
- name: nombre de la flor.
- price: precio de la flor.

La lista de flores se almacena en una variable estática en el servidor.

## Endpoints

### Agregar una lista de flores
- Método: POST
- URL: /flores
- Body (JSON):

[
    {
        "id" : 1,
        "name" : "rosa",
        "price" : 30
    },
    {
        "id" : 2,
        "name" : "petalo",
        "price" : 5
    },
    {
        "id" : 3,
        "name" : "clavel",
        "price" : 12.3
    },
    {
        "id" : 4,
        "name" : "azucena",
        "price" : 10
    }
]


### Obtener la lista de flores
- Método: GET
- URL: /flores
- Respuesta:
- Código: 200 OK
- Body (JSON)


### Obtener flores con precio mayor a 20
- Método: GET
- URL: /flores/price
- Respuesta:
- Código: 200 OK
- Body (JSON)


### Borrar una flor
- Método: DELETE
- URL: /flores/{id}
- Respuesta:
- Código: 200 OK

### Obtener flores por nombre
- Método: GET
- URL: /flores/{name}
- Respuesta:
- Código: 200 OK
- Body (JSON)








