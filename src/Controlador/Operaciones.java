
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
    JOptionPane.showMessageDialog (null, "Dato del Administrador/a de la Institución Registrado/a Correctamente!!");
        
    }
    
    public void v_Docente(Docentes docent){
        
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(docent);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog (null, "Dato del Docente de la Institución Registrado/a Correctamente!!");
        
    }
    
    
    public void v_Estudiantes (Estudiantes estud){
        
    SessionFactory sesion = NewHibernateUtil.getSessionFactory();
    Session session;
    session = sesion.openSession();
    Transaction tx = session.beginTransaction();
    session.save(estud);
    tx.commit();
    session.close();
    JOptionPane.showMessageDialog (null, "Dato del Estudiante de la Institución Registrado/a Correctamente!!");
        
    }
    
}
