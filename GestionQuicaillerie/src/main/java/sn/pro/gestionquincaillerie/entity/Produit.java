/**
 * 
 */
package sn.pro.gestionquincaillerie.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	/**
	 * 
	 */
	public Produit() {
		// TODO Auto-generated constructor stub
	}

	public Produit(Long idProduit, String nomProduit, String descriptionProduit, Integer qteProduit, Integer prix,
			String matriculeProduit, String dateFourni) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.descriptionProduit = descriptionProduit;
		this.qteProduit = qteProduit;
		this.prix = prix;
		this.matriculeProduit = matriculeProduit;
		this.dateFourni = dateFourni;
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
	

}
