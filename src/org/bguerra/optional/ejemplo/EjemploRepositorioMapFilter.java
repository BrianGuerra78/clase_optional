package org.bguerra.optional.ejemplo;

import org.bguerra.optional.ejemplo.models.Computador;
import org.bguerra.optional.ejemplo.models.Fabricante;
import org.bguerra.optional.ejemplo.models.Procesador;
import org.bguerra.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.bguerra.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        /*Fabricante f = repositorio.filtrar("asus")
                        .map(Computador::getProcesador)
                        .map(Procesador::getFabricante)
                                .orElseThrow();

        System.out.println(f.getNombre());*/
        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab->"intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");
        System.out.println(f);

    }
}
