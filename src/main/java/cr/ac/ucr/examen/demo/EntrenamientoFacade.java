package cr.ac.ucr.examen.demo;

public class EntrenamientoFacade {
    public void verRutinaParteSuperiorCuerpo() {
        Entrenamiento entrenamiento = new ParteSuperiorCuerpo();
        entrenamiento.definirRutinaEntremiento();
        entrenamiento.verRutinaEntremiento();
    }

    public void verRutinaParteInteriorCuerpo () {
        Entrenamiento entrenamiento = new ParteInferiorCuerpo();
        entrenamiento.definirRutinaEntremiento();
        entrenamiento.verRutinaEntremiento();
    }
}