/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.data;

import javax.persistence.*;
import models.Mesa;

/**
 *
 * @author martinez
 */
public class Data {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_Data_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        Mesa mesa = new Mesa("tipo","ubicacion",5,"codigo");
        em.getTransaction().begin();
        em.persist(mesa);
        em.getTransaction().commit();
        System.out.println("Operacion terminada");
        System.out.println("Hello World!");
    }
}
