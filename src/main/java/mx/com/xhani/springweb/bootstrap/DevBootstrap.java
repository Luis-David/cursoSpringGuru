package mx.com.xhani.springweb.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import mx.com.xhani.springweb.modelo.Autor;
import mx.com.xhani.springweb.modelo.Editorial;
import mx.com.xhani.springweb.modelo.Libro;
import mx.com.xhani.springweb.repositories.AutorRepository;
import mx.com.xhani.springweb.repositories.EditorialRepository;
import mx.com.xhani.springweb.repositories.LibroRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	private AutorRepository autorRepository;
	private LibroRepository libroRepository;
	private EditorialRepository editorialRepository;
	public DevBootstrap(AutorRepository ar,LibroRepository lr,EditorialRepository er){
		autorRepository=ar;
		libroRepository=lr;
		editorialRepository=er;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}
	private void initData() {
		Autor a = new Autor();
		a.setNombre("Eric");
		a.setApellidos("Evans");
		Libro l= new Libro();
		Editorial editorial= new Editorial();
		editorial.setNombre("Porrua");
		editorial.setDireccion("CDMx");
		editorialRepository.save(editorial);
		l.setNombre("Domain Driven Design");
		a.getLibros().add(l);
		l.setEditorial(editorial);
		libroRepository.save(l);
		autorRepository.save(a);
		System.out.println("*************** Se cargaron los datos a la base de datos");
		
	}
	
}
