package org.eparedes.optional.ejemplo;

import org.eparedes.optional.ejemplo.models.Computador;
import org.eparedes.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.eparedes.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMetodoOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();
//        Computador defecto = new Computador("HP Omen", "LA0001");

        // Nota: En el orElse independiente si se encuentra o no invoca el método
        Computador pc = repositorio.filtrar(" rog".trim()).orElse(valorDefecto());
        System.out.println(pc);

        // Nota: Es mejor, ya que no invoca el método y no gasta recursos
        pc = repositorio.filtrar("macbook pro ".trim()).orElseGet(EjemploRepositorioMetodoOrElse::valorDefecto);
        System.out.println(pc);
    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo valor por defecto!!!");
        return new Computador("HP Omen", "LA0001");
    }
}
