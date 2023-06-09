package org.bguerra.optional.ejemplo.repositorio;

import org.bguerra.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtrar(String nombre);
}
