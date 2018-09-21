package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;

@Entity
public class Pais {

	@Id
	private String nombre;
	private Integer habitantes;
	private String idioma;
	private Ciudad capital;
	@ManyToOne(cascade={CascadeType.ALL},fetch = FetchType.LAZY)
	private Continente continente;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(Integer habitantes) {
		this.habitantes = habitantes;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Ciudad getCapital() {
		return capital;
	}
	public void setCapital(Ciudad capital) {
		this.capital = capital;
	}
	public Continente getContinente() {
		return continente;
	}
	public void setContinente(Continente continente) {
		this.continente = continente;
	}
	
	
	
}
