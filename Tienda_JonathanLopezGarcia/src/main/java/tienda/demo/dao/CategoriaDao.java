
package tienda.demo.dao;

import tienda.demo.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;//comunicacion de hibernate

/**
 *
 * @author Jonathan
 */
public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    //cualquier clase que implemente esta interfaz tiene que implementar Jpa, recibiendo un objeto
    
    
    
}//final de la clase
