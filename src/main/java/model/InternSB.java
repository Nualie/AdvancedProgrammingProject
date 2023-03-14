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

    public List<TutorEntity> getTutorLoginDetails(String requestedEmail){
        Query q = em.createQuery("select e from TutorEntity e where e.email like :requestedEmail")
                .setParameter("requestedEmail",requestedEmail);
        return q.getResultList();
    }

    ///TODO: only get the interns where the Tutor is right
    public List<InternEntity> getInterns(){
        Query q = em.createQuery("select e from InternEntity e");
        return q.getResultList();
    }
}
