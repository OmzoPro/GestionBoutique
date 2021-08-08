package sn.pro.gestionquincaillerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.pro.gestionquincaillerie.entity.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {

}
