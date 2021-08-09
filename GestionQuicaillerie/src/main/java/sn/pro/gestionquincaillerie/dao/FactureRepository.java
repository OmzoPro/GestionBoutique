/**
 * 
 */
package sn.pro.gestionquincaillerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.pro.gestionquincaillerie.entity.Facture;

/**
 * @author omarndiaye
 *
 */
public interface FactureRepository extends JpaRepository<Facture, Long> {

}
