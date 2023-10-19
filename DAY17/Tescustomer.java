package inventory;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.Customer;

public class Tescustomer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver_pubs");
		EntityManager em = emf.createEntityManager();
		Customer c=new Customer();
		c.setemail("saijahnavi203@gmail");
		c.setmobile("9493389973");
		c.setname("Jahnavi");
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();
		emf.close();

		
	}

}
