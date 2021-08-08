package sn.pro.gestionquincaillerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.pro.gestionquincaillerie.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
