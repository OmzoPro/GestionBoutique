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
@Entity(name = "vente")
public class Vente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVente;
	private Integer qteVendu;
	private String dateOperation;

	/**
	 * 
	 */
	public Vente() {
		// TODO Auto-generated constructor stub
	}

	public Vente(Long idVente, Integer qteVendu, String dateOperation) {
		super();
		this.idVente = idVente;
		this.qteVendu = qteVendu;
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
	

}
