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

/**
 * @author omarndiaye
 *
 */
@Entity(name = "facture")
public class Facture implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacture;
	@ManyToOne
	@JoinColumn(name = "idVente")
	private Vente vente;
	@ManyToOne
	@JoinColumn(name = "idGerant")
	private Gerant gerant;
	private Integer totale;
	private String dateFacture;
	public Facture(Long idFacture, Vente vente, Gerant gerant, Integer totale, String dateFacture) {
		super();
		this.idFacture = idFacture;
		this.vente = vente;
		this.gerant = gerant;
		this.totale = totale;
		this.dateFacture = dateFacture;
	}
	public Facture(Vente vente, Gerant gerant, Integer totale, String dateFacture) {
		super();
		this.vente = vente;
		this.gerant = gerant;
		this.totale = totale;
		this.dateFacture = dateFacture;
	}
	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public Vente getVente() {
		return vente;
	}
	public void setVente(Vente vente) {
		this.vente = vente;
	}
	public Gerant getGerant() {
		return gerant;
	}
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	public Integer getTotale() {
		return totale;
	}
	public void setTotale(Integer totale) {
		this.totale = totale;
	}
	public String getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(String dateFacture) {
		this.dateFacture = dateFacture;
	}
	
	

}
