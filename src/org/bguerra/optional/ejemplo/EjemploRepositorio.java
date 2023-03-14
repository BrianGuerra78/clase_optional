package org.bguerra.optional.ejemplo;

import org.bguerra.optional.ejemplo.models.Computador;
import org.bguerra.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.bguerra.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        repositorio.filtrar("asus").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontro"));
        /*Optional<Computador> pc = repositorio.filtrar("Asus ROG");
        if (pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontro");
        }*/
    }
}
