
package bl;
import java.util.LinkedHashMap;
import dao.*;
import dao.IBaseDAO;


/**
 *
 * @author admin
 */
public class BaseBL {
    private final LinkedHashMap<String, IBaseDAO> daos;

    public BaseBL() {
        daos = new LinkedHashMap();
        daos.put("domain.Usuarios",new UsuarioDAO());
        
    }
    /**
     *
     * @param className
     * @return
     */
    public IBaseDAO getDao(String className){
        return daos.get(className);
    }
}
