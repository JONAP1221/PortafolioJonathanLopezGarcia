
package tienda.demo.dao;

import tienda.demo.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Jonathan
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}//final de la clase
