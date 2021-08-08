/**
 * 
 */
package sn.pro.gestionquincaillerie.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sn.pro.gestionquincaillerie.entity.Vente;

/**
 * @author omarndiaye
 *
 */
@CrossOrigin("*")
@RestController
public class VenteConroller {
	@Autowired
	private VenteRepository venteRepository;
	//methode pour ajouter une Vente
	@PostMapping(path = "saveVente")
	public Vente saveVente(@RequestBody Vente vente) {
		venteRepository.save(vente);
		return vente;
	}
	
	//Methode pour modifier une Vente
	@PutMapping(path = "updateVente")
	public Vente updatVente(@PathVariable("id") Long id, @RequestBody Vente vente) {
		vente.setIdVente(id);
		venteRepository.save(vente);
		return vente;
	}
	
	//Methode pour lister les ventes
	@GetMapping(path = "listeVente")
	public List<Vente> listeVente(){
		List<Vente> listeVente= venteRepository.findAll();
		return listeVente;
	}
	
	//Methode pour afficher une Vente par son id
	@GetMapping(path = "venteById")
	public Optional<Vente> venteByID(@PathVariable("id") Long id) {
		return venteRepository.findById(id);
		
	}
	
	//Methode pour supprimer un Vente
	@DeleteMapping(path = "deleteVente")
	public void deleteVente(@PathVariable("id") long id) {
		venteRepository.deleteById(id);
	}
	
}
