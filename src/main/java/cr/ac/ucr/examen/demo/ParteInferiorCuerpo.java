package cr.ac.ucr.examen.demo;

import java.util.ArrayList;
import java.util.List;

public class ParteInferiorCuerpo implements Entrenamiento {

    private List<Ejercicio> ejercicios = new ArrayList<>();

    @Override
    public void definirRutinaEntremiento() {
        ejercicios.add(new Ejercicio(1, "Squats"));
        ejercicios.add(new Ejercicio(2, "Calf raises"));
        ejercicios.add(new Ejercicio(3, "Lunges"));
        ejercicios.add(new Ejercicio(3, "Static stride"));
    }

    @Override
    public void verRutinaEntremiento() {
        System.out.println("LowerBody Workout");
        for (Ejercicio ejercicios : ejercicios) {
            System.out.println("Ejercicio: " + ejercicios.getNombre());
        }
    }
}