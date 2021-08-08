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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author omarndiaye
 *
 */
@Entity(name = "produit")
public class Produit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	private String nomProduit;
	private String descriptionProduit;
	private Integer qteProduit;
	private Integer prix;
	private String matriculeProduit;
	private String dateFourni;
	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Categorie categorie;
	@ManyToOne
	@JoinColumn(name = "idBoutique")
	private Boutique boutique;
	@ManyToOne
	@JoinColumn(name = "idFournisseur")
	private Fournisseur fournisseur;
	
	@OneToMany
	private List<Vente> ventes;
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}
	

	public Produit(Long idProduit, String nomProduit, String descriptionProduit, Integer qteProduit, Integer prix,
			String matriculeProduit, String dateFourni, Categorie categorie, Boutique boutique, Fournisseur fournisseur,
			List<Vente> ventes) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.descriptionProduit = descriptionProduit;
		this.qteProduit = qteProduit;
		this.prix = prix;
		this.matriculeProduit = matriculeProduit;
		this.dateFourni = dateFourni;
		this.categorie = categorie;
		this.boutique = boutique;
		this.fournisseur = fournisseur;
		this.ventes = ventes;
	}


	public Produit(Long idProduit, String nomProduit, String descriptionProduit, Integer qteProduit, Integer prix,
			String matriculeProduit, String dateFourni, Categorie categorie, Boutique boutique,
			Fournisseur fournisseur) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.descriptionProduit = descriptionProduit;
		this.qteProduit = qteProduit;
		this.prix = prix;
		this.matriculeProduit = matriculeProduit;
		this.dateFourni = dateFourni;
		this.categorie = categorie;
		this.boutique = boutique;
		this.fournisseur = fournisseur;
	}


	public Produit(String nomProduit, String descriptionProduit, Integer qteProduit, Integer prix,
			String matriculeProduit, String dateFourni, Categorie categorie, Boutique boutique, Fournisseur fournisseur,
			List<Vente> ventes) {
		super();
		this.nomProduit = nomProduit;
		this.descriptionProduit = descriptionProduit;
		this.qteProduit = qteProduit;
		this.prix = prix;
		this.matriculeProduit = matriculeProduit;
		this.dateFourni = dateFourni;
		this.categorie = categorie;
		this.boutique = boutique;
		this.fournisseur = fournisseur;
		this.ventes = ventes;
	}


	public Produit(String nomProduit, String descriptionProduit, Integer qteProduit, Integer prix,
			String matriculeProduit, String dateFourni, Categorie categorie, Boutique boutique,
			Fournisseur fournisseur) {
		super();
		this.nomProduit = nomProduit;
		this.descriptionProduit = descriptionProduit;
		this.qteProduit = qteProduit;
		this.prix = prix;
		this.matriculeProduit = matriculeProduit;
		this.dateFourni = dateFourni;
		this.categorie = categorie;
		this.boutique = boutique;
		this.fournisseur = fournisseur;
	}


	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getDescriptionProduit() {
		return descriptionProduit;
	}

	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}

	public Integer getQteProduit() {
		return qteProduit;
	}

	public void setQteProduit(Integer qteProduit) {
		this.qteProduit = qteProduit;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public String getMatriculeProduit() {
		return matriculeProduit;
	}

	public void setMatriculeProduit(String matriculeProduit) {
		this.matriculeProduit = matriculeProduit;
	}

	public String getDateFourni() {
		return dateFourni;
	}

	public void setDateFourni(String dateFourni) {
		this.dateFourni = dateFourni;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Boutique getBoutique() {
		return boutique;
	}
	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}


	public Fournisseur getFournisseur() {
		return fournisseur;
	}


	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}


	public List<Vente> getVentes() {
		return ventes;
	}


	public void setVentes(List<Vente> ventes) {
		this.ventes = ventes;
	}
	

}
