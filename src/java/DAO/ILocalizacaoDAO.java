package DAO;

//import Models.Categoria;
import Models.Localizacao;
import java.util.List;

/**
 *
 * @author 'Rodolfo
 */
public interface ILocalizacaoDAO {
    
    public List getLocalizacoes() throws Exception;
    
    public void saveLocalizacao(Localizacao localizacao, String id) throws Exception;
    
    public Localizacao getLocalizacao(String id) throws Exception;
    
    public void deleteLocalizacao(String id) throws Exception;
     
}
