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

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPRemiumList);

        //Ejecución del método mayor de tres
        System.out.println("Máximo de 6, 8 y 10 es: " + maximo(6,8,10));
        System.out.println("Máximo de 3.9, 11.6, 7.78 es: " + maximo(3.9,11.6,7.78));
        System.out.println("Máximo de Yohana Juan Victor es: " + maximo("Yohana", "Juan", "Victor"));

    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    //Forma de volver un genérico que reciba un solo tipo de dato
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

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo (T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0){
            max = b;
        }

        if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
