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
	private Integer idUser;
	
	//pour recuperer facilement la liste des factures de ce gerant, on fait une relation bidirectionnel
	@OneToMany(mappedBy = "gerant")
	private List<Facture> factures ;
	
	public Gerant() {
		// TODO Auto-generated constructor stub
	}

	

	public Gerant(Long idGerant, String nomGerant, String prenomGerant, String adresseGerant, Integer telephoneGerant,
			Integer idUser, List<Facture> factures) {
		super();
		this.idGerant = idGerant;
		this.nomGerant = nomGerant;
		this.prenomGerant = prenomGerant;
		this.adresseGerant = adresseGerant;
		this.telephoneGerant = telephoneGerant;
		this.idUser = idUser;
		this.factures = factures;
	}



	public Gerant(String nomGerant, String prenomGerant, String adresseGerant, Integer telephoneGerant, Integer idUser,
			List<Facture> factures) {
		super();
		this.nomGerant = nomGerant;
		this.prenomGerant = prenomGerant;
		this.adresseGerant = adresseGerant;
		this.telephoneGerant = telephoneGerant;
		this.idUser = idUser;
		this.factures = factures;
	}


	public Gerant(String nomGerant, String prenomGerant, String adresseGerant, Integer telephoneGerant,
			Integer idUser) {
		super();
		this.nomGerant = nomGerant;
		this.prenomGerant = prenomGerant;
		this.adresseGerant = adresseGerant;
		this.telephoneGerant = telephoneGerant;
		this.idUser = idUser;
	}



	public Gerant(Long idGerant, String nomGerant, String prenomGerant, String adresseGerant, Integer telephoneGerant,
			Integer idUser) {
		super();
		this.idGerant = idGerant;
		this.nomGerant = nomGerant;
		this.prenomGerant = prenomGerant;
		this.adresseGerant = adresseGerant;
		this.telephoneGerant = telephoneGerant;
		this.idUser = idUser;
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

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public List<Facture> getVentes() {
		return factures;
	}


	public void setVentes(List<Facture> factures) {
		this.factures = factures;
	}
	

}
