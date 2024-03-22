package dao;

import java.util.ArrayList;
import model.CourseDefinition;
import model.Semester;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Didier
 */
public class CourseDefinitionDAO {
    
        public static void addCourseDefinition(CourseDefinition courseDefinition) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(courseDefinition);
            transaction.commit();
            session.close();
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public static CourseDefinition getCourseByCode(String code) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CourseDefinition courseDefinition = (CourseDefinition) session.get(CourseDefinition.class, code);
            session.close();
            return courseDefinition;
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
      public static ArrayList<CourseDefinition>getAllCourses(){
     ArrayList<CourseDefinition> list = new ArrayList<>();
     Session session = HibernateUtil.getSessionFactory().openSession();
     session.beginTransaction();
     list = (ArrayList)session.createQuery("from CourseDefinition").list();
     session.getTransaction().commit();
     session.close();
     return list;
  }
      public static void deleteCourse(String id) {

		
		try  {
                      Session session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			Transaction transaction = session.beginTransaction();

			// Delete a student object
			CourseDefinition crsD = (CourseDefinition) session.get(CourseDefinition.class, id);
			if (crsD != null) {
				session.delete(crsD);
				//System.out.println("student is deleted");
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
          public static void updateCourse(CourseDefinition crsd) {
		
		try   {
                  Session session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			Transaction transaction = session.beginTransaction();
			// save the student object
			session.update(crsd);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
}
