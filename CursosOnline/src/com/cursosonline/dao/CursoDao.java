package com.cursosonline.dao;

import com.cursosonline.entidades.Curso;
import com.cursosonline.entidades.Estudiantes;
import java.util.List;


public interface CursoDao {
    void ingresar(Curso curso);
    void actualizar(Curso curso);
    void eliminar(int id);
    List<Curso> getCurso();
    List<Estudiantes> getEstudiantePorCursos(int cursoId);
}
