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
@Entity(name = "fournisseur")
public class Fournisseur implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFournisseur;
	private String nomFournisseur;
	private String adresseFournisseur;
	private Integer telephoneFournisseur;
	@OneToMany
	private List<Produit> produits;

	/**
	 * 
	 */
	public Fournisseur() {
		// TODO Auto-generated constructor stub
	}


	public Fournisseur(Long idFournisseur, String nomFournisseur, String adresseFournisseur,
			Integer telephoneFournisseur) {
		super();
		this.idFournisseur = idFournisseur;
		this.nomFournisseur = nomFournisseur;
		this.adresseFournisseur = adresseFournisseur;
		this.telephoneFournisseur = telephoneFournisseur;
	}


	public Fournisseur(String nomFournisseur, String adresseFournisseur, Integer telephoneFournisseur) {
		super();
		this.nomFournisseur = nomFournisseur;
		this.adresseFournisseur = adresseFournisseur;
		this.telephoneFournisseur = telephoneFournisseur;
	}


	public Fournisseur(String nomFournisseur, String adresseFournisseur, Integer telephoneFournisseur,
			List<Produit> produits) {
		super();
		this.nomFournisseur = nomFournisseur;
		this.adresseFournisseur = adresseFournisseur;
		this.telephoneFournisseur = telephoneFournisseur;
		this.produits = produits;
	}


	public Fournisseur(Long idFournisseur, String nomFournisseur, String adresseFournisseur,
			Integer telephoneFournisseur, List<Produit> produits) {
		super();
		this.idFournisseur = idFournisseur;
		this.nomFournisseur = nomFournisseur;
		this.adresseFournisseur = adresseFournisseur;
		this.telephoneFournisseur = telephoneFournisseur;
		this.produits = produits;
	}


	public Long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getNomFournisseur() {
		return nomFournisseur;
	}

	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}

	public String getAdresseFournisseur() {
		return adresseFournisseur;
	}

	public void setAdresseFournisseur(String adresseFournisseur) {
		this.adresseFournisseur = adresseFournisseur;
	}

	public Integer getTelephoneFournisseur() {
		return telephoneFournisseur;
	}

	public void setTelephoneFournisseur(Integer telephoneFournisseur) {
		this.telephoneFournisseur = telephoneFournisseur;
	}


	public List<Produit> getProduits() {
		return produits;
	}


	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	

}
