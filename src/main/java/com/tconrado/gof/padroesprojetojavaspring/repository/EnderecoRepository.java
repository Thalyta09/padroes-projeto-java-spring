package com.tconrado.gof.padroesprojetojavaspring.repository;

import com.tconrado.gof.padroesprojetojavaspring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
