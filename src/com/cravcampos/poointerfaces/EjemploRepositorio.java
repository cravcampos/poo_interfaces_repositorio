package com.cravcampos.poointerfaces;

import com.cravcampos.poointerfaces.modelo.Cliente;
import com.cravcampos.poointerfaces.repositorio.ClienteListRepositorio;
import com.cravcampos.poointerfaces.repositorio.Direccion;
import com.cravcampos.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;

import java.util.List;

public class EjemploRepositorio {

    public static void main(String[] args) {
        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Victor", "Campos"));
        repo.crear(new Cliente("Yohana", "Trujillo"));
        repo.crear(new Cliente("Juan", "Trujillo"));
        repo.crear(new Cliente("Aquilino", "Campos"));
        repo.crear(new Cliente("Maria", "Rodriguez"));
        repo.crear(new Cliente("Libardo", "Ordoñez"));
        repo.crear(new Cliente("Jorge", "Ordoñez"));
        repo.crear(new Cliente("Carlos", "Ordoñez"));
        repo.crear(new Cliente("Isabel", "Ordoñez"));
        repo.crear(new Cliente("Stella", "Rodriguez"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("=============== imprimiendo paginable ========================");
        List<Cliente> paginable = repo.listar(0, 5);
        paginable.forEach(System.out::println);

        System.out.println("====================== Imprimiendo orden ascendente=========================");
        List<Cliente> clientesOrdenAscendente = repo.listar("nombre", Direccion.ASC);
        for (Cliente c : clientesOrdenAscendente) {
            System.out.println(c);
        }

        System.out.println("====================== Imprimiendo orden descendente=========================");
        List<Cliente> clientesOrdenDescendente = repo.listar("apellido", Direccion.DESC);
        for (Cliente c : clientesOrdenDescendente) {
            System.out.println(c);
        }

        System.out.println("===================== Editar ===============================");
        // creamos cliente al cual le queremos modificar el nombre o el apellido
        Cliente yohanaActualizar = new Cliente("Geli Yohana", "Trujillo Cruz");
        // buscamos el cliente por ID
        yohanaActualizar.setId(2);
        //pasamos al método editar() el cliente encontrado en el ID indicado
        repo.editar(yohanaActualizar);
        Cliente yhn = repo.porId(2);
        // Imprime el cliente editado
        System.out.println(yhn);
        // volver a listar los clientes después de la actualización
        clientes.forEach(System.out::println);

        System.out.println("===================== Eliminar ===============================");
        repo.eliminar(10);
        clientes.forEach(System.out::println);

        System.out.println("===================== total de registros ===============================");
        System.out.println("Total de registros: " + repo.total());
    }
}
