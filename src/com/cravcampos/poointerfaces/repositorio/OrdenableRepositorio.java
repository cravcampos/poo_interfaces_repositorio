package com.cravcampos.poointerfaces.repositorio;

import com.cravcampos.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);

}
