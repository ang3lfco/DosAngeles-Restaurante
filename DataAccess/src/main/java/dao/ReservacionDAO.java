/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import interfaces.IReservacionDAO;
import java.util.List;
import models.Reservacion;
import javax.persistence.*;

/**
 *
 * @author martinez
 */
public class ReservacionDAO implements IReservacionDAO{
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_DataAccess_jar_1.0-SNAPSHOTPU");
    
    @Override
    public void crearReservacion(Reservacion reservacion){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(reservacion);
        em.getTransaction().commit();
        em.close();
    }
    
    @Override
    public List<Reservacion> getReservaciones(){
        EntityManager em = emf.createEntityManager();
        List<Reservacion> reservaciones;
        try{
            reservaciones = em.createQuery("SELECT r FROM Reservacion r", Reservacion.class).getResultList();
        }
        finally{
            em.close();
        }
        return reservaciones;
    }
}
