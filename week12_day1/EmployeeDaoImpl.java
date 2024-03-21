package week12_day1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDaoImpl implements EmployeeDao {
    private final SessionFactory sessionFactory;

    public EmployeeDaoImpl() {
        this.sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void saveEmployeeDetails(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(employee);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

