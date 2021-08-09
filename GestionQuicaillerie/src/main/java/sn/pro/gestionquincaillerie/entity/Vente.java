/**
 * 
 */
package sn.pro.gestionquincaillerie.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author omarndiaye
 *
 */
@Entity
@Table(name = "vente")
public class Vente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVente;
	@ManyToOne
	@JoinColumn(name = "matriculeProduit")
	private Produit produit;
	private Integer qteVendu;
	private Integer totale;
	private String dateOperation;

	/**
	 * 
	 */
	public Vente() {
		// TODO Auto-generated constructor stub
	}

	public Vente(Long idVente, Produit produit, Integer qteVendu, Integer totale, String dateOperation) {
		super();
		this.idVente = idVente;
		this.produit = produit;
		this.qteVendu = qteVendu;
		this.totale = totale;
		this.dateOperation = dateOperation;
	}

	public Vente(Produit produit, Integer qteVendu, Integer totale, String dateOperation) {
		super();
		this.produit = produit;
		this.qteVendu = qteVendu;
		this.totale = totale;
		this.dateOperation = dateOperation;
	}


	public Long getIdVente() {
		return idVente;
	}

	public void setIdVente(Long idVente) {
		this.idVente = idVente;
	}

	public Integer getQteVendu() {
		return qteVendu;
	}

	public void setQteVendu(Integer qteVendu) {
		this.qteVendu = qteVendu;
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Integer getTotale() {
		return totale;
	}

	public void setTotale(Integer totale) {
		this.totale = totale;
	}



}
