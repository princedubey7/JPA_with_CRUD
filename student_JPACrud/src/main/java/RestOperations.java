import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

public class RestOperations {

	public static void main(String[] args) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("stu");
		EntityManager entityManager=factory.createEntityManager();
		Query query=(Query) entityManager.createQuery("from student");
		List<Employee> list=query.list();
		for(Employee e:list)
		{
			System.out.println(e.getName());
		}


	}

}
