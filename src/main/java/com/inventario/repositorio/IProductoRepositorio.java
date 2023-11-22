package com.inventario.repositorio;

import com.inventario.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepositorio extends JpaRepository<Producto, Integer> {

}
