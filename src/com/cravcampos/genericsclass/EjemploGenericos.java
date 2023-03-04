package com.cravcampos.genericsclass;

public class EjemploGenericos {


    public static void main(String[] args) {
        Camion transporteCaballos = new Camion(5);
        transporteCaballos.add(new Animal("Peregrino","Caballo"));
        transporteCaballos.add(new Animal("Grillo","Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma","Caballo"));

        for (Object o: transporteCaballos) {
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }

        System.out.println("==================================================");

        Camion transporteMaquinas = new Camion(3);
        transporteMaquinas.add(new Maquinaria("Bulldozer"));
        transporteMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transporteMaquinas.add(new Maquinaria("Perforadora"));

        for (Object o: transporteMaquinas) {
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }

        System.out.println("==================================================");

        Camion transporteAuto = new Camion(3);
        transporteAuto.add(new Automovil("Renault"));
        transporteAuto.add(new Automovil("Mazda"));
        transporteAuto.add(new Automovil("Ferrari"));

        for (Object o : transporteAuto) {
            Automovil a = (Automovil) o;
            System.out.println(a.getMarca());
        }
    }


}
