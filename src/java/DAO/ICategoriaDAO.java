package DAO;

import Models.Categoria;
import java.util.List;

/**
 *
 * @author 'Rodolfo
 */
public interface ICategoriaDAO {
    
    public List getCategorias() throws Exception;
    
    public void saveCategoria(Categoria categoria, String id) throws Exception;
    
    public Categoria getCategoria(String id) throws Exception;
    
    public void deleteCategoria(String id) throws Exception;
     
}
