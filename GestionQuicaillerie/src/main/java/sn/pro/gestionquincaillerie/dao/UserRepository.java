/**
 * 
 */
package sn.pro.gestionquincaillerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.pro.gestionquincaillerie.entity.User;

/**
 * @author omarndiaye
 *
 */
public interface UserRepository extends JpaRepository<User, Long>{

}
