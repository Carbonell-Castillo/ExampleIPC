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
public class Profesor extends Usuario{

    //Sera el de cursos que imparte
    private ArrayList<Curso> cursos;
    
    public Profesor(){
        super();
        this.cursos = new ArrayList<>();
    }
    
    public Profesor(int codigo, String nombre, String apellido, String correo, String genero, String contraseña) {
        super(codigo, nombre, apellido, correo, genero, contraseña);
        this.cursos = new ArrayList<>();
    }

       
    //Agregar curso
    
    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }
    
    public void mostrarCursos(){
        for (int i = 0; i < cursos.size(); i++) {
            Curso cursoObtenido = cursos.get(i);
            System.out.println("Curso; "+cursoObtenido.getNombre());
        }
    }
    
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    
    
    
    
}
