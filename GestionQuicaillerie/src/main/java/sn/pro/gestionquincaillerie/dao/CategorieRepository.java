/**
 * 
 */
package sn.pro.gestionquincaillerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.pro.gestionquincaillerie.entity.Categorie;

/**
 * @author omarndiaye
 *
 */
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
