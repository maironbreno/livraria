package Principal;

import Modelo.Autor;

import javax.persistence.EntityManager;

import javax.persistence.*;
import java.util.List;

public class ListarAutores {

    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_livraria");

        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("SELECT e FROM Autor e");
        List<Autor> autores = query.getResultList();

        for(Autor e : autores) {
            System.out.println("Autor: " + e.getNome() + " - " + e.getEmail());
        }
    }
}

