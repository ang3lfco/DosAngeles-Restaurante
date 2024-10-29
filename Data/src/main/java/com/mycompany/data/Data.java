/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import models.Cliente;
import models.Mesa;
import models.Reservacion;

/**
 *
 * @author martinez
 */
public class Data {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_Data_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
//        Mesa mesa = new Mesa("tipo","ubicacion",5,"codigo");
//        List<Reservacion> reservaciones = new ArrayList<>();
//        reservaciones = null;
        Cliente cliente = new Cliente("Angel Martinez", "6621946034", null);
//        Reservacion r = new Reservacion(cliente,  mesa, LocalDateTime.now(), 4, 2000.00);
        
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        System.out.println("Operacion terminada");
        System.out.println("Hello World!");
    }
}
