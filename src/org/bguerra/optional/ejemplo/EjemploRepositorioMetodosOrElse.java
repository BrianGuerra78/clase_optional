package org.bguerra.optional.ejemplo;

import org.bguerra.optional.ejemplo.models.Computador;
import org.bguerra.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.bguerra.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        Computador defecto = new Computador("HP Omen", "LA0001");
        Computador pc = repositorio.filtrar("asus2").orElse(valorDefecto());
        System.out.println(pc);

        /*pc = repositorio.filtrar("macbook").orElseGet(() -> {
            return defecto;
        });*/
        pc = repositorio.filtrar("macbook").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);
    }

    public static Computador valorDefecto() {
        System.out.println("Obteniendo valor por defecto!!!");
        return new Computador("HP Omen", "LA0001");
    }
}
