package com.ionela.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ionela.rest.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Long> {

}
