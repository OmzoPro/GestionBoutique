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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author omarndiaye
 *
 */
@Entity(name = "boutique")
public class Boutique implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBoutique;
	private String nomBoutique;
	private String adresseBoutique;
	private Integer telephoneBoutique;
	@OneToOne
	@JoinColumn(name = "idGerant")
	private Gerant gerant;
	@OneToMany
	private List<Produit> produits;

	/**
	 * 
	 */
	public Boutique() {
		// TODO Auto-generated constructor stub
	}


	public Boutique(Long idBoutique, String nomBoutique, String adresseBoutique, Integer telephoneBoutique,
			Gerant gerant, List<Produit> produits) {
		super();
		this.idBoutique = idBoutique;
		this.nomBoutique = nomBoutique;
		this.adresseBoutique = adresseBoutique;
		this.telephoneBoutique = telephoneBoutique;
		this.gerant = gerant;
		this.produits = produits;
	}


	public Boutique(Long idBoutique, String nomBoutique, String adresseBoutique, Integer telephoneBoutique,
			Gerant gerant) {
		super();
		this.idBoutique = idBoutique;
		this.nomBoutique = nomBoutique;
		this.adresseBoutique = adresseBoutique;
		this.telephoneBoutique = telephoneBoutique;
		this.gerant = gerant;
	}


	public Boutique(String nomBoutique, String adresseBoutique, Integer telephoneBoutique, Gerant gerant,
			List<Produit> produits) {
		super();
		this.nomBoutique = nomBoutique;
		this.adresseBoutique = adresseBoutique;
		this.telephoneBoutique = telephoneBoutique;
		this.gerant = gerant;
		this.produits = produits;
	}


	public Boutique(String nomBoutique, String adresseBoutique, Integer telephoneBoutique, Gerant gerant) {
		super();
		this.nomBoutique = nomBoutique;
		this.adresseBoutique = adresseBoutique;
		this.telephoneBoutique = telephoneBoutique;
		this.gerant = gerant;
	}


	public Long getIdBoutique() {
		return idBoutique;
	}

	public void setIdBoutique(Long idBoutique) {
		this.idBoutique = idBoutique;
	}

	public String getNomBoutique() {
		return nomBoutique;
	}

	public void setNomBoutique(String nomBoutique) {
		this.nomBoutique = nomBoutique;
	}

	public String getAdresseBoutique() {
		return adresseBoutique;
	}

	public void setAdresseBoutique(String adresseBoutique) {
		this.adresseBoutique = adresseBoutique;
	}

	public Integer getTelephoneBoutique() {
		return telephoneBoutique;
	}

	public void setTelephoneBoutique(Integer telephoneBoutique) {
		this.telephoneBoutique = telephoneBoutique;
	}


	public Gerant getGerant() {
		return gerant;
	}


	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}


	public List<Produit> getProduits() {
		return produits;
	}


	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}
