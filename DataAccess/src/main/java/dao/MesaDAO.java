/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import interfaces.IMesaDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Mesa;

/**
 *
 * @author martinez
 */
public class MesaDAO implements IMesaDAO{
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_DataAccess_jar_1.0-SNAPSHOTPU");
    
    @Override
    public void crearMesa(Mesa mesa){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(mesa);
        em.getTransaction().commit();
        em.close();
    }
    
    @Override
    public List<Mesa> getMesas(){
        EntityManager em = emf.createEntityManager();
        List<Mesa> mesas;
        try{
            mesas = em.createQuery("SELECT m FROM Mesa m", Mesa.class).getResultList();
        }
        finally{
            em.close();
        }
        return mesas;
    }
}
