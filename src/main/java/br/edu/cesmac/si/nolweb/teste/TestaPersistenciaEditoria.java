package br.edu.cesmac.si.nolweb.teste;

import br.edu.cesmac.si.nolweb.domain.Editoria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestaPersistenciaEditoria {
    public static void main(String[] args) {
        EntityManagerFactory managerFactory = Persistence. createEntityManagerFactory("jsfPU");
        EntityManager entityManager = managerFactory.createEntityManager() ;
        Editoria editoria = new Editoria();
        editoria.setNome( "Uma editoria de teste" );
        EntityTransaction entityTransaction = entityManager.getTransaction() ;
        entityTransaction.begin() ;
        entityManager.persist(editoria) ;
        entityTransaction.commit() ;
        entityManager.close() ;
        managerFactory.close() ;
    }
}