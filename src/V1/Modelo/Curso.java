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
public class Curso {
    private int codigo; 
    private String nombre;
    private int creditos;
    
    private Profesor profesor;
    private ArrayList<Alumno> alumnos;
    

    public Curso(int codigo, String nombre, int creditos, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
    }
    
    //Agregar Alumno
    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
}
