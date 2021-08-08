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

import sn.pro.gestionquincaillerie.entity.Categorie;

/**
 * @author omarndiaye
 *
 */
@CrossOrigin("*")
@RestController
public class CategorieController {
	@Autowired
	private CategorieRepository categorieRepository;
	//methode pour ajouter une categorie
	@PostMapping(path = "saveCategorie")
	public Categorie saveCategorie(@RequestBody Categorie categrie) {
		categorieRepository.save(categrie);
		return categrie;
	}
	
	//Methode pour modifier une categorie
	@PutMapping(path = "updateCategorie")
	public Categorie updatCategorie(@PathVariable("id") Long id, @RequestBody Categorie categorie) {
		categorie.setIdCategorie(id);
		categorieRepository.save(categorie);
		return categorie;
	}
	
	//Methode pour lister les categories
	@GetMapping(path = "listeCategorie")
	public List<Categorie> listeCategorie(){
		List<Categorie> listeCategorie= categorieRepository.findAll();
		return listeCategorie;
	}
	
	//Methode pour afficher une categorie par son id
	@GetMapping(path = "categorieById")
	public Optional<Categorie> categorieByID(@PathVariable("id") Long id) {
		return categorieRepository.findById(id);
		
	}
	
	//Methode pour supprimer une categorie
	@DeleteMapping(path = "deleteCategorie")
	public void deleteCategorie(@PathVariable("id") long id) {
		categorieRepository.deleteById(id);
	}
	
}
