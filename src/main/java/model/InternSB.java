package model;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

@Stateless
public class InternSB {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager em = entityManagerFactory.createEntityManager();

    public List getTutorLoginDetails(String requestedEmail){
        Query q = em.createQuery("select e from TutorEntity e where e.email like :requestedEmail")
                .setParameter("requestedEmail",requestedEmail);
        return q.getResultList();
    }

    ///TODO: only get the interns where the Tutor is right
    public List getInterns(){
        Query q = em.createQuery("select i from InternEntity i");
        return q.getResultList();
    }

    public List getInterns(int TutorId){
        Query q = em.createQuery("select i from InternEntity i where i.tutorid = :TutorId")
                .setParameter("TutorId",TutorId);
        return q.getResultList();
    }
}
