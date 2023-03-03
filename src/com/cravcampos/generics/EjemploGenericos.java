package com.cravcampos.generics;

import com.cravcampos.poointerfaces.modelo.Cliente;
import com.cravcampos.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Victor", "Campos"));

        Cliente victor = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Victor", "Campos"),
                new Cliente("Yohana", "trujillo")};

        Integer[] enterosArreglo = {1, 2, 3, 4, 5};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(
                new String[]{"Victor", "Yohana", "Juan", "Aquilino", "Maria", "Jhonnatan", "Paula", "Ana", "Sofia", "Maicol"}, enterosArreglo);

        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPRemiumList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Yohana", "Trujillo")}
        );
    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    //Forma de volver un generico que reciba un solo tipo de dato
    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g) {
        for (G elemento : g) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
}
