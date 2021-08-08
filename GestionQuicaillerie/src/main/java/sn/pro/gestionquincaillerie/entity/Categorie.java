/**
 * 
 */
package sn.pro.gestionquincaillerie.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author omarndiaye
 *
 */
@Entity(name = "categorie")
public class Categorie implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorie;
	private String libelle;
	@OneToMany
	private List<Categorie> categories;

	/**
	 * 
	 */
	public Categorie() {
		// TODO Auto-generated constructor stub
	}

	

	public Categorie(Long idCategorie, String libelle, List<Categorie> categories) {
		super();
		this.idCategorie = idCategorie;
		this.libelle = libelle;
		this.categories = categories;
	}



	public Categorie(Long idCategorie, String libelle) {
		super();
		this.idCategorie = idCategorie;
		this.libelle = libelle;
	}



	public Categorie(String libelle) {
		super();
		this.libelle = libelle;
	}



	public Categorie(String libelle, List<Categorie> categories) {
		super();
		this.libelle = libelle;
		this.categories = categories;
	}



	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	public List<Categorie> getCategories() {
		return categories;
	}



	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}
	

}
