package cursosonline;

import com.cursosonline.dao.CursoDao;
import com.cursosonline.dao.CursosDaoImpl;
import com.cursosonline.dao.EstudiantesDAO;
import com.cursosonline.dao.EstudiantesImplDAO;
import com.cursosonline.entidades.Curso;
import com.cursosonline.entidades.Estudiantes;
import java.util.List;

/**
 *
 * @author ROSADO RONALD
 */
public class CursosOnline {

    
    public static void main(String[] args) {
         
       CursoDao cursoDAO = new CursosDaoImpl();
       
       List<Estudiantes> estudiante= cursoDAO.getEstudiantePorCursos(4);
       System.out.println(estudiante);
       
       
       
       EstudiantesDAO estudianteDAO = new EstudiantesImplDAO();
       List<Curso> cursos1 = estudianteDAO.getCursosPorEstudiantes(1);        
       System.out.println(cursos1);
//
//       Curso newCurso = new Curso(1, "FUNDAMENTOS DE ANDROID");
//      
//       cursoDAO.ingresar(newCurso);
//       cursoDAO.actualizar(newCurso);
//       cursoDAO.eliminar(2);
//       List<Curso> cursos = cursoDAO.getCurso();
//       System.out.println(cursos);
//       
        
        
        List<Curso> cursos2 = estudianteDAO.getCursosPorEstudiantes(2);
        
//        System.out.println();
        System.out.println(cursos2);
//        
//        Estudiantes newEstudiante = new Estudiantes(4, "Juan", "Perez", "perez@gmail.com");
//        estudianteDAO.ingresar(newEstudiante);
//        estudianteDAO.actualizar(newEstudiante);
//        estudianteDAO.eliminar(4);
//        List<Estudiantes> estudiantes = estudianteDAO.getEstudiantes();
      
//        System.out.println(estudiantes);
    }
    
}
