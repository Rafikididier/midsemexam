
package dao;

import model.CourseDefinition;
import model.Semester;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Didier
 */
public class SemesterDAO {
    
        public static void addSemester(Semester semester) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(semester);
            transaction.commit();
            session.close();
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public static Semester getSemesterById(String id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Semester semester = (Semester) session.get(Semester.class, id);
            session.close();
            return semester;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return null;
        }
    }
public static void addCourseToSemester(String courseCode, Long semesterId) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            CourseDefinition course = (CourseDefinition) session.get(CourseDefinition.class, courseCode);
            Semester semester = (Semester) session.get(Semester.class, semesterId);
            
            if (course != null && semester != null) {
                course.getSemesters().add(semester);
                semester.getCourses().add(course);
            }

            transaction.commit();
            session.close();
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    
}
