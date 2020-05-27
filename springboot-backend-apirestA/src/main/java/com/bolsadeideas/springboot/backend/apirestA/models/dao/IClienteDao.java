package com.bolsadeideas.springboot.backend.apirestA.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirestA.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>  {

}
