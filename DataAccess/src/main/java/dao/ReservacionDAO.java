/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import models.Reservacion;
import javax.persistence.*;

/**
 *
 * @author martinez
 */
public class ReservacionDAO {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_DataAccess_jar_1.0-SNAPSHOTPU");
    
    public void crearReservacion(Reservacion reservacion){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(reservacion);
        em.getTransaction().commit();
        em.close();
    }
}
