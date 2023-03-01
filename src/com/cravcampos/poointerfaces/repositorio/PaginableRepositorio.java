package com.cravcampos.poointerfaces.repositorio;

import com.cravcampos.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> listar(int desde, int hasta);
}
