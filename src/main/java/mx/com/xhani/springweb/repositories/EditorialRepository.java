package mx.com.xhani.springweb.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.xhani.springweb.modelo.Editorial;

@Repository
public interface EditorialRepository extends CrudRepository<Editorial, Long>{

}
