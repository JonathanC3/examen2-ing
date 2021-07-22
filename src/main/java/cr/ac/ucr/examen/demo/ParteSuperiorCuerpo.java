package cr.ac.ucr.examen.demo;
import java.util.ArrayList;
import java.util.List;

public class ParteSuperiorCuerpo implements Entrenamiento {

    private List<Ejercicio> ejercicios = new ArrayList<>();
    @Override
    public void definirRutinaEntremiento() {
        ejercicios.add(new Ejercicio(1, "Bench Press"));
        ejercicios.add(new Ejercicio(2, "Push Ups"));
        ejercicios.add(new Ejercicio(3, "Inline Bench Press"));
        ejercicios.add(new Ejercicio(3, "Standing barbell bicep curl"));
        
    }

    @Override
    public void verRutinaEntremiento() {
        System.out.println("UpperBody Workout");
        for(Ejercicio ejercicio : ejercicios){
            System.out.println("Exercise: " + ejercicio.getNombre());
        }
        
    }
    
}
