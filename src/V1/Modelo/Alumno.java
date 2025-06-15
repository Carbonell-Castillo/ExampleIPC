/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1.Modelo;

import java.util.ArrayList;

/**
 *
 * @author bcastillo
 */
public class Alumno extends Usuario{
    
    //Listado de cursos que tiene el alumno
    private ArrayList<Curso> cursos;

    public Alumno() {
        this.cursos = new ArrayList<>();
    }

    public Alumno(int codigo, String nombre, String apellido, String correo, String genero, String contraseña) {
        super(codigo, nombre, apellido, correo, genero, contraseña);
        this.cursos = new ArrayList<>();
    }
    
    //Metodo para agregar cursos al alumno
    
    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }
    

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
    
    
}
