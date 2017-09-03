/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;
import java.util.List;
import domain.Usuarios;

/**
 *
 * @author admin
 */
public class UsuariosBL extends BaseBL implements IBaseBL<Usuarios,Integer>{
    public UsuariosBL() {
        super();
    }
    @Override
    public void save(Usuarios o) {
        this.getDao(o.getClass().getName()).save(o);
    }
    @Override
    public Usuarios merge(Usuarios o) {
        return (Usuarios) this.getDao(o.getClass().getName()).merge(o);
    }
    @Override
    public void delete(Usuarios o) {
        /*Ej: 1.1
          ELIMINAR UNA PERSONA SOLO SI TIENE MENOS DE 5 TELEFONOS Y
          3 DIRECCIONES
        */
        this.getDao(o.getClass().getName()).delete(o);
    }
    @Override
    public Usuarios findById(Integer o) {
        return (Usuarios) this.getDao(Usuarios.class.getName()).findById(o);
    }
    @Override
    public List<Usuarios> findAll(String className) {
        return this.getDao(className).findAll();
    }

}
