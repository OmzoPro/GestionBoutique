/**
 * 
 */
package sn.pro.gestionquincaillerie.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sn.pro.gestionquincaillerie.entity.Gerant;

/**
 * @author omarndiaye
 *
 */
@CrossOrigin("*")
@RestController
public class GerantController {
	private GerantRepository gerantRepository;
	//methode pour ajouter un gerant
	@PostMapping(path = "saveGerant")
	public Gerant saveGerant(@RequestBody Gerant gerant) {
		gerantRepository.save(gerant);
		return gerant;
	}
	
	//Methode pour modifier un gerant
	@PutMapping(path = "updateGerant")
	public Gerant updatGerant(@PathVariable("id") Long id, @RequestBody Gerant gerant) {
		gerant.setIdGerant(id);
		gerantRepository.save(gerant);
		return gerant;
	}
	
	//Methode pour lister les gerants
	@GetMapping(path = "listeGerant")
	public List<Gerant> listeGerant(){
		List<Gerant> listeGerant= gerantRepository.findAll();
		return listeGerant;
	}
	
	//Methode pour afficher un gerant par son id
	@GetMapping(path = "gerantById")
	public Optional<Gerant> gerantByID(@PathVariable("id") Long id) {
		return gerantRepository.findById(id);
		
	}
	
	//Methode pour supprimer une Gerant
	@DeleteMapping(path = "deleteGerant")
	public void deleteGerant(@PathVariable("id") long id) {
		gerantRepository.deleteById(id);
	}
	

}
