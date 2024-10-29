/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Cliente;

/**
 *
 * @author martinez
 */
public class ClienteDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_DataAccess_jar_1.0-SNAPSHOTPU");
    
    public void crearCliente(Cliente cliente){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }
}
