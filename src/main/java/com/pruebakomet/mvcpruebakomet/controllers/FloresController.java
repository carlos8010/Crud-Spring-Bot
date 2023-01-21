package com.pruebakomet.mvcpruebakomet.controllers;


import com.pruebakomet.mvcpruebakomet.models.Flor;
import com.pruebakomet.mvcpruebakomet.models.FlorNP;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FloresController {
    private static List<Flor> ArrayFlores;

    @PostMapping("/flores")
    public void addFlores(@RequestBody List<Flor> NuevasFlores) {
        ArrayFlores = NuevasFlores;
    }

    @GetMapping("/flores")
    public List<FlorNP> getFlores() {
        return ArrayFlores.stream()
        .map(flower -> new FlorNP(flower.getName()+"-kometsales", flower.getPrice()))
        .sorted(Comparator.comparing(FlorNP::getName).reversed())
        .collect(Collectors.toList());
    }

    @GetMapping("/flores/price")
    public List<Flor> getFloresPrice() {
        return ArrayFlores.stream()
        .filter(flower -> flower.getPrice() > 20)
        .collect(Collectors.toList());
    }


    @DeleteMapping("/flores/{id}")
    public void deleteFlores(@PathVariable String id) {
        ArrayFlores.removeIf(flower -> flower.getId().equals(id));
    }

    @GetMapping("/flores/name/{name}")
    public List<Flor> getFloresByName(@PathVariable String name) {
        return ArrayFlores.stream()
        .filter(flower -> flower.getName().equals(name))
        .collect(Collectors.toList());
    }}