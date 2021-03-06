package mx.com.xhani.springweb.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String titulo;
	@OneToOne
	private Editorial editorial;
	@ManyToMany
	@JoinTable(name="autor_libro",joinColumns = @JoinColumn(name= "libro_id"),
	inverseJoinColumns = @JoinColumn(name = "autor_id"))
	private Set<Autor> autores= new HashSet<Autor>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String nombre) {
		this.titulo = nombre;
	}
	public Set<Autor> getAutores() {
		return autores;
	}
	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}
	
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + titulo + ", autores=" + autores + "]";
	}
	
}
