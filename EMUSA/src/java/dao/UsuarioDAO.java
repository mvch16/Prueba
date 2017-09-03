package dao;
import java.util.List;
import org.hibernate.HibernateException;
import domain.Usuarios;
import utils.HibernateUtil;
import java.util.LinkedHashMap;

/**
 *
 * @author admin
 */
public class UsuarioDAO extends HibernateUtil implements IBaseDAO<Usuarios, Integer>{
    
    @Override
    public void save(Usuarios u) {
        try {
            iniciarOperacion();
            getSesion().save(u);
            getTransac().commit();
        } catch (HibernateException he) {
            manejarExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
    }
    
    
    
    @Override
    public Usuarios merge(Usuarios u) throws HibernateException {
        try {
            iniciarOperacion();
            u = (Usuarios) getSesion().merge(u);
            getTransac().commit();
        } catch (HibernateException he) {
            manejarExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
        return u;
    }
    
    
    
    
    
    

    @Override
    public void delete(Usuarios u) {
        try {
            iniciarOperacion();
            getSesion().delete(u);
            getTransac().commit();
        } catch (HibernateException he) {
            manejarExcepcion(he);
            throw he;
        } finally {
            getSesion().close();
        }
    }

    @Override
    public Usuarios findById(Integer id) {
        Usuarios u = null;

        try {
            iniciarOperacion();
            u = (Usuarios) getSesion().get(Usuarios.class, id);
        } finally {
            getSesion().close();
        }
        return u;
    }

    @Override
    public List<Usuarios> findAll() {
        List<Usuarios> listaUsuarios;
        try {
            iniciarOperacion();//HQL
            listaUsuarios = getSesion().createQuery("from Usuarios").list();
        } finally {
            getSesion().close();
        }

        return listaUsuarios;
    }

    public List createQueryHQL(LinkedHashMap<String, Object> parametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void manejarExcepcion(HibernateException he) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

