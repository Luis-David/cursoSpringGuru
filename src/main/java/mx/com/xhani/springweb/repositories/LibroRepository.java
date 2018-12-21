package mx.com.xhani.springweb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.xhani.springweb.modelo.Libro;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Long>{

}
