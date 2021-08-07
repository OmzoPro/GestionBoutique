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
@Entity(name = "gerant")
public class Gerant implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**
	 * 
	 */
	private Long idGerant;
	private String nomGerant;
	private String prenomGerant;
	private String adresseGerant;
	private Integer telephoneGerant;
	
	public Gerant() {
		// TODO Auto-generated constructor stub
	}

	public Gerant(Long idGerant, String nomGerant, String prenomGerant, String adresseGerant, Integer telephoneGerant) {
		super();
		this.idGerant = idGerant;
		this.nomGerant = nomGerant;
		this.prenomGerant = prenomGerant;
		this.adresseGerant = adresseGerant;
		this.telephoneGerant = telephoneGerant;
	}

	public Long getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
	}

	public String getNomGerant() {
		return nomGerant;
	}

	public void setNomGerant(String nomGerant) {
		this.nomGerant = nomGerant;
	}

	public String getPrenomGerant() {
		return prenomGerant;
	}

	public void setPrenomGerant(String prenomGerant) {
		this.prenomGerant = prenomGerant;
	}

	public String getAdresseGerant() {
		return adresseGerant;
	}

	public void setAdresseGerant(String adresseGerant) {
		this.adresseGerant = adresseGerant;
	}

	public Integer getTelephoneGerant() {
		return telephoneGerant;
	}

	public void setTelephoneGerant(Integer telephoneGerant) {
		this.telephoneGerant = telephoneGerant;
	}
	

}
