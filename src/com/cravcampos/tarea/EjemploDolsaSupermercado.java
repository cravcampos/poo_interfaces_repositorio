package com.cravcampos.tarea;

public class EjemploDolsaSupermercado {
    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        bolsaFrutas.addProducto(new Fruta("Fresa",1250.0,1.5,"Rojo"));
        bolsaFrutas.addProducto(new Fruta("Mango",1380.0,2.5,"Amarillo"));
        bolsaFrutas.addProducto(new Fruta("Pera",550.0,3.5,"Cafe"));
        bolsaFrutas.addProducto(new Fruta("Patilla", 2050.0,1.0,"Verde"));
        bolsaFrutas.addProducto(new Fruta("Ciruela",4500.0,1.0,"Morado"));

        bolsaLimpieza.addProducto(new Limpieza("antibacterial", 0.75, "Cif", 1690));
        bolsaLimpieza.addProducto(new Limpieza("lavaloza", 1.2, "Quix", 2290));
        bolsaLimpieza.addProducto(new Limpieza("cloro", 0.95, "Limpiador Crema", 1390));
        bolsaLimpieza.addProducto(new Limpieza("Gel con Lavandinca", 0.45, "Lysoform", 1380));
        bolsaLimpieza.addProducto(new Limpieza("Desinfectante Lavanda", 0.9, "Lysol", 1330));

        bolsaLacteos.addProducto(new Lacteo("Leche Sabor Chocolate Semidescremada", 1550.0, 32, 1150));
        bolsaLacteos.addProducto(new Lacteo("Crema de Leche caja", 450.0,50 , 800));
        bolsaLacteos.addProducto(new Lacteo("Leche Blanca Descremada Caja", 1580.0,30 , 720));
        bolsaLacteos.addProducto(new Lacteo("Yoghurt Batido Sabor Frutilla Bolsa", 3700.0,50 , 1190));
        bolsaLacteos.addProducto(new Lacteo("Mantequilla Con Sal Soprole", 2500.0,50 , 1750));

        bolsaNoPerecibles.addProducto(new NoPerecible("Atún Lomitos en Agua Angelmo", 9500.0, 170, 960));
        bolsaNoPerecibles.addProducto(new NoPerecible("Jurel Natural Lata", 5600.0, 425, 1120));
        bolsaNoPerecibles.addProducto(new NoPerecible("Porotos Negros Listos Para Servir Caja", 2340.0, 380, 1030));
        bolsaNoPerecibles.addProducto(new NoPerecible("Arroz Grano Largo Ancho Grado 1", 3340.5, 1000, 1320));
        bolsaNoPerecibles.addProducto(new NoPerecible("Porotos Hallado Bolsa", 3536.3, 1000, 1990));

        System.out.println("-------------------------------- Frutas ---------------------------------");
        for (Fruta fruta : bolsaFrutas.getProductos()) {
            System.out.println("-------------------------------- " +  fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso (gr): " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());
        }

        System.out.println("-------------------------------- Limpieza ---------------------------------");
        for (Limpieza prod : bolsaLimpieza.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Componentes: " + prod.getComponentes());
            System.out.println("Litros: " + prod.getLitros());
        }

        System.out.println("-------------------------------- Lacteo ---------------------------------");
        for (Lacteo prod : bolsaLacteos.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Cantidad (gr/cc): " + prod.getCantidad());
            System.out.println("Proteinas (gr): " + prod.getProteinas());
        }

        System.out.println("-------------------------------- NoPerecible ---------------------------------");
        for (NoPerecible prod : bolsaNoPerecibles.getProductos()) {
            System.out.println("-------------------------------- " +  prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Calorias (kCal): " + prod.getCalorias());
            System.out.println("Contenido neto (gr): " + prod.getContenido());
        }



    }
}
