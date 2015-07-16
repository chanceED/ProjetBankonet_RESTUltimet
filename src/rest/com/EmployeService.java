package rest.com;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Stateless
@TransactionManagement(value=TransactionManagementType.CONTAINER)
public class EmployeService {
    
    @PersistenceContext(unitName="bankodb") private EntityManager em;
    
    public EmployeService(){}
    
    public List<Employe> findAllEmployes(){ 
        List<Employe> listeEmployes = em.createQuery("SELECT e FROM Employe AS e", Employe.class).getResultList();
        return listeEmployes;
    }
    
    public Employe findById(int id){
        Employe employe=em.find(Employe.class, id); // permet de trouver l'employe avec l'id passé en parametre
        return employe;
    }
}
