package org.eparedes.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {

        String nombre = "Edwar";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }

        System.out.println(opt.isEmpty());
        opt.ifPresent( valor -> System.out.println("Hola " + valor));

        nombre = "John";
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        // Forma 1 - ifPresentOrElse
        opt.ifPresentOrElse(valor -> System.out.println("Hola " + valor), () -> System.out.println("No esta presente"));

        // Forma 2 - isPresent
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        } else{
            System.out.println("No esta presente");
        }

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());
    }
}
