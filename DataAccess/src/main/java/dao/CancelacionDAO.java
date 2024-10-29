/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.Cancelacion;
import interfaces.ICancelacionDAO;
import java.util.List;

/**
 *
 * @author martinez
 */
public class CancelacionDAO implements ICancelacionDAO{
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_DataAccess_jar_1.0-SNAPSHOTPU");
    
    @Override
    public void crearCancelacion(Cancelacion cancelacion){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cancelacion);
        em.getTransaction().commit();
        em.close();
    }
    
    @Override
    public List<Cancelacion> getCancelaciones(){
        EntityManager em = emf.createEntityManager();
        List<Cancelacion> cancelaciones;
        try{
            cancelaciones = em.createQuery("SELECT can FROM Cancelacion can", Cancelacion.class).getResultList();
        }
        finally{
            em.close();
        }
        return cancelaciones;
    }
}
