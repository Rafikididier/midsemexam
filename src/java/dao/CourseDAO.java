package dao;

import model.Course;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Didier
 */
public class CourseDAO {
    
        public static void addCourse(Course course) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(course);
            transaction.commit();
            session.close();
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public static Course getCourseById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Course course = (Course) session.get(Course.class, id);
            session.close();
            return course;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    
}
