/**
 * 
 */
package sn.pro.gestionquincaillerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.pro.gestionquincaillerie.entity.Vente;

/**
 * @author omarndiaye
 *
 */
public interface VenteRepository extends JpaRepository<Vente, Long> {

}
