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

import sn.pro.gestionquincaillerie.entity.Facture;

/**
 * @author omarndiaye
 *
 */
@CrossOrigin("*")
@RestController
public class FactureController {
	@Autowired
	private FactureRepository factureRepository;
	//methode pour ajouter une Facture
	@PostMapping(path = "saveFacture")
	public Facture saveFacture(@RequestBody Facture facture) {
		factureRepository.save(facture);
		return facture;
	}
	
	//Methode pour modifier une Facture
	@PutMapping(path = "updateFacture")
	public Facture updatFacture(@PathVariable("id") Long id, @RequestBody Facture facture) {
		facture.setIdFacture(id);
		factureRepository.save(facture);
		return facture;
	}
	
	//Methode pour lister les Factures
	@GetMapping(path = "listeFacture")
	public List<Facture> listeFacture(){
		List<Facture> listeFacture= factureRepository.findAll();
		return listeFacture;
	}
	
	//Methode pour afficher une Facture par son id
	@GetMapping(path = "factureById")
	public Optional<Facture> factureByID(@PathVariable("id") Long id) {
		return factureRepository.findById(id);
		
	}
	
	//Methode pour supprimer un Facture
	@DeleteMapping(path = "deleteFacture")
	public void deleteFacture(@PathVariable("id") long id) {
		factureRepository.deleteById(id);
	}
	
}
