package Principal;

import Modelo.Autor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class GeradorAutor {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bd_livraria");

        int qtdAutores = 0;
        Scanner nomeAutor = null, emailAutor = null, numeroAutores = null;
        numeroAutores = new Scanner(System.in);

        System.out.println("Informe a quantidade de autores a serem inseridos no banco: \n");
        qtdAutores = numeroAutores.nextInt();

        for(Integer i = 1; i <= qtdAutores; i++) {
            Autor autor = new Autor();
            nomeAutor = new Scanner(System.in);
            emailAutor = new Scanner(System.in);

            System.out.println("Informe o nome do Autor " + i.toString() + ": \n");
            autor.setNome(nomeAutor.nextLine());
            System.out.println("Informe o email do Autor " + i.toString() +  ": \n");
            autor.setEmail(emailAutor.nextLine());

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(autor);
            entityManager.getTransaction().commit();
            entityManager.close();
        }

        numeroAutores.close();
        nomeAutor.close();
        emailAutor.close();

        entityManagerFactory.close();
    }

}
