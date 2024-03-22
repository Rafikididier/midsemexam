package dao;

import java.util.ArrayList;
import model.CourseDefinition;
import model.Teacher;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Didier
 */
public class TeacherDAO {
    
        public static void addTeacher(Teacher teacher) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(teacher);
            transaction.commit();
            session.close();
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public static Teacher getTeacherByCode(String code) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Teacher teacher = (Teacher) session.get(Teacher.class, code);
            session.close();
            return teacher;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return null;
        }
    }
   public static ArrayList<Teacher>getAllTeachers(){
     ArrayList<Teacher> list = new ArrayList<>();
     Session session = HibernateUtil.getSessionFactory().openSession();
     session.beginTransaction();
     list = (ArrayList)session.createQuery("from Teacher").list();
     session.getTransaction().commit();
     session.close();
     return list;
  }
    
}
