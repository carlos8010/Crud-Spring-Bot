package com.pruebakomet.mvcpruebakomet.controllers;

import com.pruebakomet.mvcpruebakomet.models.Flor;
import com.pruebakomet.mvcpruebakomet.models.FlorNP;
import com.pruebakomet.mvcpruebakomet.models.Response;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
//@RequestMapping("/api")
public class FloresController {
    private static List<Flor> ArrayFlores;

    /**
     * Esta api recibe el array de flores
     *
     * @param NuevasFlores
     */
    @PostMapping("/flores")
    public String addFlores(@RequestBody List<Flor> NuevasFlores) {
        ArrayFlores = NuevasFlores;

        Response MensajeRespuesta = new Response("Agregado con exito",200);

        return MensajeRespuesta.toString();

    }

    /**
     *  Esta api es para trer todas las flores concantenando la palabra -komet sales y ordenandolo de manera descendente por su nombre, trae solo el nombre y su precio
     * @return
     */
    @GetMapping("/flores")
    public List<FlorNP> getFlores() {
        return ArrayFlores.stream()
        .map(flower -> new FlorNP(flower.getName()+"-kometsales", flower.getPrice()))
        .sorted(Comparator.comparing(FlorNP::getName).reversed())
        .collect(Collectors.toList());
    }

    /**
     *  Esta funcion es para traer las flores que tengan un precio mayor a 20
     * @return
     */
    @GetMapping("/flores/price")
    public List<Flor> getFloresPrice() {
        return ArrayFlores.stream()
        .filter(flower -> flower.getPrice() > 20)
        .collect(Collectors.toList());
    }


    /**
     *  Esta api es para borrar una flor de la lista flores mediante el id
     * @param id
     */
    @DeleteMapping("/flores/{id}")
    public String deleteFlores(@PathVariable String id) {
        ArrayFlores.removeIf(flower -> flower.getId().equals(id));

        Response MensajeRespuesta = new Response("Eliminado con exito",200);

        return MensajeRespuesta.toString();

    }

    /**
     *  Esta api es para traer una lista de flores por el atributo name
     * @param name
     * @return
     */
    @GetMapping("/flores/name/{name}")
    public List<Flor> getFloresByName(@PathVariable String name) {
        return ArrayFlores.stream()
        .filter(flower -> flower.getName().equals(name))
        .collect(Collectors.toList());
    }}