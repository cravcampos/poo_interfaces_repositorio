package com.cravcampos.genericsclass;

public class EjemploGenericos {

    // implementando método genérico para imprimir los datos
    public static <T> void imprimirCamion(Camion<T> camion){
        for (T a: camion) {
            if (a instanceof Animal){
                System.out.println(((Animal)a).getNombre() + " tipo:" + ((Animal)a).getTipo());
            }
            if (a instanceof Maquinaria){
                System.out.println(((Maquinaria)a).getTipo());
            }

            if (a instanceof Automovil){
                System.out.println(((Automovil)a).getMarca());
            }
        }
    }


    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino","Caballo"));
        transporteCaballos.add(new Animal("Grillo","Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma","Caballo"));

        imprimirCamion(transporteCaballos);

        System.out.println("==================================================");

        Camion<Maquinaria> transporteMaquinas = new Camion<>(3);
        transporteMaquinas.add(new Maquinaria("Bulldozer"));
        transporteMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transporteMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(transporteMaquinas);

        System.out.println("==================================================");

        Camion<Automovil> transporteAuto = new Camion<>(3);
        transporteAuto.add(new Automovil("Renault"));
        transporteAuto.add(new Automovil("Mazda"));
        transporteAuto.add(new Automovil("Ferrari"));

        imprimirCamion(transporteAuto);
    }


}
