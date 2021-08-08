package sn.pro.gestionquincaillerie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import sn.pro.gestionquincaillerie.dao.CategorieRepository;
import sn.pro.gestionquincaillerie.entity.Boutique;
import sn.pro.gestionquincaillerie.entity.Categorie;
import sn.pro.gestionquincaillerie.entity.Fournisseur;
import sn.pro.gestionquincaillerie.entity.Gerant;
import sn.pro.gestionquincaillerie.entity.Produit;
import sn.pro.gestionquincaillerie.entity.User;
import sn.pro.gestionquincaillerie.entity.Vente;

@SpringBootApplication
public class GestionQuicaillerieApplication implements CommandLineRunner{
	@Autowired
	CategorieRepository categorieRepository;
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(GestionQuicaillerieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Categorie.class);
		repositoryRestConfiguration.exposeIdsFor(Boutique.class);
		repositoryRestConfiguration.exposeIdsFor(Fournisseur.class);
		repositoryRestConfiguration.exposeIdsFor(Produit.class);
		repositoryRestConfiguration.exposeIdsFor(Gerant.class);
		repositoryRestConfiguration.exposeIdsFor(Vente.class);
		repositoryRestConfiguration.exposeIdsFor(User.class);
		// TODO Auto-generated method stub
		
	}

}
