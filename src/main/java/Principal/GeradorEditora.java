package Principal;

import Modelo.Editora;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class GeradorEditora {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bd_livraria");

        int qtdEditoras = 0;
        Scanner nomeEditora = null, emailEditora = null, numeroEditoras = null;
        numeroEditoras = new Scanner(System.in);

        System.out.println("Informe a quantidade de editoras a serem inseridos no banco: \n");
        qtdEditoras = numeroEditoras.nextInt();

        for(Integer i = 1; i <= qtdEditoras; i++) {
            Editora editora = new Editora();
            nomeEditora = new Scanner(System.in);
            emailEditora = new Scanner(System.in);

            System.out.println("Informe o nome da Editora " + i.toString() + ": \n");
            editora.setNome(nomeEditora.nextLine());
            System.out.println("Informe o email da Editora " + i.toString() +  ": \n");
            editora.setEmail(emailEditora.nextLine());

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(editora);
            entityManager.getTransaction().commit();
            entityManager.close();
        }

        numeroEditoras.close();
        nomeEditora.close();
        emailEditora.close();

        entityManagerFactory.close();
    }

}