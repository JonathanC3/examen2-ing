package cr.ac.ucr.examen.demo;

public class FacadeEntrenamientoTest {
    public static void main(String[] args) {
        EntrenamientoFacade entrenamientoFacade = new EntrenamientoFacade();

        entrenamientoFacade.verRutinaParteSuperiorCuerpo();
        System.out.println();
        entrenamientoFacade.verRutinaParteInteriorCuerpo ();
    }
}