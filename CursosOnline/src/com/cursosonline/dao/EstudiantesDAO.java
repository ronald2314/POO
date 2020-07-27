package com.cursosonline.dao;

import com.cursosonline.entidades.Curso;
import com.cursosonline.entidades.Estudiantes;
import java.util.List;

/**
 *
 * @authorROSADO RONALD
 */
public interface EstudiantesDAO {
    void ingresar(Estudiantes estudiante);
    void actualizar(Estudiantes estudiante);
    void eliminar(int id);
    List<Curso > getCursosPorEstudiantes(int estudianteId);
    List<Estudiantes > getEstudiantes();
}

