package com.cravcampos.tarea;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {

    List<T> productos;
    private int indiceProductos;
    private int max = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList();
    }

    public List<T> getProductos() {
        return productos;
    }

    public void addProducto(T p){
        if (this.productos.size() <=max){
            this.productos.add(p);
        }else {
            throw new RuntimeException("No hay mas espacio");
        }
    }
}
