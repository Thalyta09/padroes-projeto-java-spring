package com.tconrado.gof.padroesprojetojavaspring.repository;

import com.tconrado.gof.padroesprojetojavaspring.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
