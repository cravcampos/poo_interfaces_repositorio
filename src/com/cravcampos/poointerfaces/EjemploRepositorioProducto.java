package com.cravcampos.poointerfaces;

import com.cravcampos.poointerfaces.modelo.Producto;
import com.cravcampos.poointerfaces.repositorio.Direccion;
import com.cravcampos.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import com.cravcampos.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {

    public static void main(String[] args) {
        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Iphone 11 128 GB Blanco", 2650000.0));
        repo.crear(new Producto("Amazon alexa", 650000.0));
        repo.crear(new Producto("Monitor HP 27\"", 999900.0));
        repo.crear(new Producto("Amd Rayzen 5600G", 750000.0));
        repo.crear(new Producto("Ipad 10\" 128GB 9na Generación", 1650000.0));

        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);

        System.out.println("=============== imprimiendo paginable ========================");
        List<Producto> paginableProducto = repo.listar(0, 5);
        paginableProducto.forEach(System.out::println);

        System.out.println("====================== Imprimiendo orden ascendente=========================");
        List<Producto> productosOrdenAscendente = repo.listar("descripcion", Direccion.ASC);
        for (Producto p : productosOrdenAscendente) {
            System.out.println(p);
        }

        System.out.println("====================== Imprimiendo orden descendente=========================");
        List<Producto> productosOrdenDescendente = repo.listar("precio", Direccion.DESC);
        for (Producto p : productosOrdenDescendente) {
            System.out.println(p);
        }

        System.out.println("===================== Editar ===============================");
        // creamos producto al cual le queremos modificar el nombre o el apellido
        Producto actualizar = new Producto("Samsung tablet 16\"", 1550000.0);
        // buscamos el producto por ID
        actualizar.setId(5);
        //pasamos al método editar() el cliente encontrado en el ID indicado
        repo.editar(actualizar);
        Producto tablet = repo.porId(2);
        // Imprime el cliente editado
        System.out.println(tablet);
        // volver a listar los clientes después de la actualización
        productos.forEach(System.out::println);

        System.out.println("===================== Eliminar ===============================");
        repo.eliminar(2);
        productos.forEach(System.out::println);

        System.out.println("===================== total de registros ===============================");
        System.out.println("Total de registros: " + repo.total());
    }
}
