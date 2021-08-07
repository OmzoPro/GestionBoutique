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

	/**
	 * 
	 */
	public Boutique() {
		// TODO Auto-generated constructor stub
	}

	public Boutique(Long idBoutique, String nomBoutique, String adresseBoutique, Integer telephoneBoutique) {
		super();
		this.idBoutique = idBoutique;
		this.nomBoutique = nomBoutique;
		this.adresseBoutique = adresseBoutique;
		this.telephoneBoutique = telephoneBoutique;
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

}
