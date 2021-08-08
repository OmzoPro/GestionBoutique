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

import sn.pro.gestionquincaillerie.entity.Fournisseur;
@CrossOrigin("*")
@RestController
public class FournisseurController {
	@Autowired
	private FournisseurRepository fournisseurRepository;
	//methode pour ajouter un fournisseur
	@PostMapping(path = "saveFournisseur")
	public Fournisseur saveFournisseur(@RequestBody Fournisseur fournisseur) {
		fournisseurRepository.save(fournisseur);
		return fournisseur;
	}
	
	//Methode pour modifier un Fournisseur
	@PutMapping(path = "updateFournisseur")
	public Fournisseur updatFournisseur(@PathVariable("id") Long id, @RequestBody Fournisseur fournisseur) {
		fournisseur.setIdFournisseur(id);
		fournisseurRepository.save(fournisseur);
		return fournisseur;
	}
	
	//Methode pour lister les Fournisseurs
	@GetMapping(path = "listeFournisseur")
	public List<Fournisseur> listeFournisseur(){
		List<Fournisseur> listeFournisseur= fournisseurRepository.findAll();
		return listeFournisseur;
	}
	
	//Methode pour afficher une Fournisseur par son id
	@GetMapping(path = "fournisseurById")
	public Optional<Fournisseur> fournisseurByID(@PathVariable("id") Long id) {
		return fournisseurRepository.findById(id);
		
	}
	
	//Methode pour supprimer une Fournisseur
	@DeleteMapping(path = "deleteFournisseur")
	public void deleteFournisseur(@PathVariable("id") long id) {
		fournisseurRepository.deleteById(id);
	}
	
}
