package org.eparedes.optional.ejemplo;

import org.eparedes.optional.ejemplo.models.Computador;
import org.eparedes.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.eparedes.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        // Forma Funcional
        repositorio.filtrar(" rog ".trim())
                .ifPresentOrElse(System.out::println, () -> System.out.println("No se encontro"));

        // Forma Tradicional
//        Optional<Computador> pc = repositorio.filtrar("asus rog");
//        if(pc.isPresent()){
//            System.out.println(pc.get());
//        } else{
//            System.out.println("No se encontro");
//        }


    }
}
