package Principal;

import Modelo.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.Scanner;

public class GeradorAluno {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bd_livraria");

        int qtdAlunos = 0;
        Scanner nomeAluno = null, emailAluno = null, idadeAluno = null, numeroAlunos = null;
        numeroAlunos = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos a serem inseridos no banco: \n");
        qtdAlunos = numeroAlunos.nextInt();

        for(Integer i = 1; i <= qtdAlunos; i++) {
            Aluno aluno = new Aluno();
            nomeAluno = new Scanner(System.in);
            emailAluno = new Scanner(System.in);
            idadeAluno = new Scanner(System.in);

            System.out.println("Informe o nome do Aluno " + i.toString() + ": \n");
            aluno.setNome(nomeAluno.nextLine());
            System.out.println("Informe o email do Aluno " + i.toString() +  ": \n");
            aluno.setEmail(emailAluno.nextLine());
            System.out.println("Informe a idade do Aluno " + i.toString() + ": \n");
            aluno.setIdade(idadeAluno.nextInt());
            aluno.setNascimento(new Date());

            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(aluno);
            entityManager.getTransaction().commit();
            entityManager.close();
        }

        numeroAlunos.close();
        nomeAluno.close();
        emailAluno.close();
        idadeAluno.close();

        entityManagerFactory.close();
    }

}