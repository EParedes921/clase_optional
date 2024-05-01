package org.eparedes.optional.ejemplo;

import org.eparedes.optional.ejemplo.models.Computador;
import org.eparedes.optional.ejemplo.models.Fabricante;
import org.eparedes.optional.ejemplo.models.Procesador;
import org.eparedes.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.eparedes.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar(" asus".trim())
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);
    }
}
