package com.jpa.cadastrocliente;

import com.jpa.cadastrocliente.model.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Cliente cliente = em.find(Cliente.class, 1);
        System.out.println(cliente);


        em.close();
        emf.close();


    }
}
