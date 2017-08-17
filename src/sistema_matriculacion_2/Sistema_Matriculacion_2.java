/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_matriculacion_2;

/**
 *
 * @author HP
 */
public class Sistema_Matriculacion_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Vista.Interfaz_Institucion().setVisible(true);
        new Vista.Interfaz_Docentes().setVisible(true);
        new Vista.Interfaz_Estudiantes().setVisible(true);
    }
    
}
