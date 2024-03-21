package week11_day5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class BatchDaoImpl implements BatchDao {
    private SessionFactory sessionFactory;

    public BatchDaoImpl() {
        this.sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    @Override
    public void launchNewBatch(Batch batch, List<Student> students) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            batch.setStudents(students);
            session.save(batch);
            for (Student student : students) {
                student.setBatch(batch);
                session.save(student);
            }
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

