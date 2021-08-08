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

import sn.pro.gestionquincaillerie.entity.Boutique;

/**
 * @author omarndiaye
 *
 */
@CrossOrigin("*")
@RestController
public class BoutiqueController {
	@Autowired
	private BoutiqueRepository boutiqueRepository;
	//methode pour ajouter une Boutique
	@PostMapping(path = "saveBoutique")
	public Boutique saveBoutique(@RequestBody Boutique boutique) {
		boutiqueRepository.save(boutique);
		return boutique;
	}
	
	//Methode pour modifier une Boutique
	@PutMapping(path = "updateBoutique")
	public Boutique updatBoutique(@PathVariable("id") Long id, @RequestBody Boutique boutique) {
		boutique.setIdBoutique(id);
		boutiqueRepository.save(boutique);
		return boutique;
	}
	
	//Methode pour lister les Boutiques
	@GetMapping(path = "listeBoutique")
	public List<Boutique> listeBoutique(){
		List<Boutique> listeBoutique= boutiqueRepository.findAll();
		return listeBoutique;
	}
	
	//Methode pour afficher une Boutique par son id
	@GetMapping(path = "boutiqueById")
	public Optional<Boutique> boutiqueByID(@PathVariable("id") Long id) {
		return boutiqueRepository.findById(id);
		
	}
	
	//Methode pour supprimer une Boutique
	@DeleteMapping(path = "deleteBoutique")
	public void deleteBoutique(@PathVariable("id") long id) {
		boutiqueRepository.deleteById(id);
	}
	
}
