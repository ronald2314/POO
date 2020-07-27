
package com.cursosonline.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ROSADO RONALD
 */
public class Curso {
    private int id;
    private String nombre;
    private List<Estudiantes> estudiantes = new ArrayList<>();

    public Curso(){}
    
    public Curso(int id, String nombre) {
        super();
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }
    

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
