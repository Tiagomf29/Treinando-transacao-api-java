package br.com.transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRespository2 extends JpaRepository<Cliente2, Integer>{

}
