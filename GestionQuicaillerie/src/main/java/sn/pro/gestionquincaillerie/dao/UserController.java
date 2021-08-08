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

import sn.pro.gestionquincaillerie.entity.User;

/**
 * @author omarndiaye
 *
 */
@CrossOrigin("*")
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	//methode pour ajouter un utilisateur
	@PostMapping(path = "saveUser")
	public User saveUser(@RequestBody User user) {
		userRepository.save(user);
		return user;
	}
	
	//Methode pour modifier un utilisateur
	@PutMapping(path = "updateUser")
	public User updatUser(@PathVariable("id") Long id, @RequestBody User user) {
		user.setIdUser(id);
		userRepository.save(user);
		return user;
	}
	
	//Methode pour lister les utilisateur
	@GetMapping(path = "listeUser")
	public List<User> listeUser(){
		List<User> listeUser= userRepository.findAll();
		return listeUser;
	}
	
	//Methode pour afficher un utilisateur par son id
	@GetMapping(path = "userById")
	public Optional<User> userByID(@PathVariable("id") Long id) {
		return userRepository.findById(id);
		
	}
	
	//Methode pour supprimer un utilisateur
	@DeleteMapping(path = "deleteUser")
	public void deleteUser(@PathVariable("id") long id) {
		userRepository.deleteById(id);
	}
	

}
