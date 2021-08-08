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

import sn.pro.gestionquincaillerie.entity.Produit;
@CrossOrigin("*")
@RestController
public class ProduitController {
	@Autowired
	private ProduitRepository produitRepository;
	//methode pour ajouter un produit
	@PostMapping(path = "saveProduit")
	public Produit saveProduit(@RequestBody Produit produit) {
		produitRepository.save(produit);
		return produit;
	}
	
	//Methode pour modifier un produit
	@PutMapping(path = "updateProduit")
	public Produit updatProduit(@PathVariable("id") Long id, @RequestBody Produit produit) {
		produit.setIdProduit(id);
		produitRepository.save(produit);
		return produit;
	}
	
	//Methode pour lister les Produits
	@GetMapping(path = "listeProduit")
	public List<Produit> listeProduit(){
		List<Produit> listeProduit= produitRepository.findAll();
		return listeProduit;
	}
	
	//Methode pour afficher une Produit par son id
	@GetMapping(path = "produitById")
	public Optional<Produit> produitByID(@PathVariable("id") Long id) {
		return produitRepository.findById(id);
		
	}
	
	//Methode pour supprimer une Produit
	@DeleteMapping(path = "deleteProduit")
	public void deleteProduit(@PathVariable("id") long id) {
		produitRepository.deleteById(id);
	}
	

}
