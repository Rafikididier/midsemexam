package dao;

import model.AcademicUnit;
import model.EAcademicUnit;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Didier
 */
public class AcademicUnitDAO {
//    public static void main(String[] args) {
//        AcademicUnit aca = new AcademicUnit("0001","Information and Technology", EAcademicUnit.FACULTY);
//        addAcademicUnit(aca);
//        System.out.println("Academic uit"+ aca);
//    }
     public static void addAcademicUnit(AcademicUnit academicUnit) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(academicUnit);
            transaction.commit();
            session.close();
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public static AcademicUnit getAcademicUnitByCode(String code) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            AcademicUnit academicUnit = (AcademicUnit) session.get(AcademicUnit.class, code);
            session.close();
            return academicUnit;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return null;
        }
    }

//    public static List<AcademicUnit> getAllAcademicUnits() {
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            List<AcademicUnit> academicUnits = session.createQuery("FROM AcademicUnit", AcademicUnit.class).list();
//            session.close();
//            return academicUnits;
//        } catch (HibernateException ex) {
//            ex.printStackTrace();
//            return null;
//        }
//    }

    public static void updateAcademicUnit(AcademicUnit academicUnit) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(academicUnit);
            transaction.commit();
            session.close();
        } catch (HibernateException ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public static void deleteAcademicUnit(String code) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            AcademicUnit academicUnit = (AcademicUnit) session.get(AcademicUnit.class, code);
            if (academicUnit != null) {
                session.delete(academicUnit);
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
