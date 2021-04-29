package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

            Session session = null;
            SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Employee.class)
                    .addAnnotatedClass(Detail.class)
                    .buildSessionFactory();
        try {
            /*Session session = factory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Smirnov", "SALES", 750);
            Detail detail = new Detail("Moscow", "978767673", "oleeg1@mail.com" );
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);

*/          session = factory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("DONE");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
