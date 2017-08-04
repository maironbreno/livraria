package Principal;

import Modelo.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;

/**
 * Created by mairon.nunes on 04/08/2017.
 */
public class AdicionarUsuario {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_livraria");


        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        Usuario usuario = new Usuario();
        usuario.setEmail("usuario@contato.com");
        usuario.setDataDeCadastro(Calendar.getInstance());

        manager.persist(usuario);

        manager.getTransaction().commit();

        manager.close();
        factory.close();
    }
}
