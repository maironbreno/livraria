package Principal;


import Modelo.Autor;
import Modelo.Livro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionaLivroAutor {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_livraria");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        Autor a = new Autor();
        a.setNome("Rafael Cosentino");

        Livro l = new Livro();
        l.setNome("JPA2");
        l.getAutores().add(a);

        manager.persist(a);
        manager.persist(l);

        manager.getTransaction().commit();

        manager.close();
        factory.close();
    }
}
