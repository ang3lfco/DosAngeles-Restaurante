/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Mesa;

/**
 *
 * @author martinez
 */
public class MesaDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_DataAccess_jar_1.0-SNAPSHOTPU");
    
    public void crearMesa(Mesa mesa){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(mesa);
        em.getTransaction().commit();
        em.close();
    }
}