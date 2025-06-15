/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import V1.Modelo.Alumno;
import V1.Modelo.Curso;
import V1.Modelo.Profesor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author bcastillo
 */
public class main {
    
    public static void main(String[] args) {
        Profesor juan = new Profesor(1, "Juan", "Perez", "juan@gmail.com", "M", "123");
        Profesor pedro = new Profesor(2, "Pedro", "Gonzales", "pedro@gmail.com", "M", "321");
        
        //Crear los cursos
        
        Curso ipc1 = new Curso(2019, "IPC1", 13, juan);
        Curso ipc2 = new Curso(2020, "IPC2", 13, juan);
        Curso apli1 = new Curso(2021, "apli1", 13, pedro);
        
        juan.agregarCurso(ipc1);
        juan.agregarCurso(ipc2);
        
        pedro.agregarCurso(apli1);
        
        
        Alumno Alejandro = new Alumno(2, "Alejandro", "Retana", "al@gmail.com", "M", "123");
        
        Alejandro.agregarCurso(apli1);
        
        
        
        
        
        
    }
   
    
    
    
}
