package mx.com.xhani.springweb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.xhani.springweb.modelo.Autor;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Long>{

}
