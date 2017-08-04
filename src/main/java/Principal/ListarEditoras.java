package Principal;

import Modelo.Editora;

import javax.persistence.EntityManager;

import javax.persistence.*;
import java.util.List;

public class ListarEditoras {

    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("bd_livraria");

        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("SELECT e FROM Editora e");
        List<Editora> editoras = query.getResultList();

        for(Editora e : editoras) {
            System.out.println("Editora: " + e.getNome() + " - " + e.getEmail());
        }
    }
}
