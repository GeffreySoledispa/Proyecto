
package Controlador;

import Modelo.Docentes;
import Modelo.Estudiantes;
import Modelo.Institucion;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.lang.Character;

/**
 *
 * @author HP
 */
public class Operaciones {
    
    public void v_Institucion(Institucion inst){
        
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(inst);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog (null, "Dato de Administrador/a de la Institucion Registrado Correctamente!!");
        
    }
    
    public void v_Docente(Docentes docent){
        
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(docent);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog (null, "Dato de Docente de la Institucion Registrado Correctamente!!");
        
    }
    
    
    public void v_Estudiantes (Estudiantes estud){
        
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(estud);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog (null, "Dato de Estudiante de la Institucion Registrado Correctamente!!");
        
    }
    
}
