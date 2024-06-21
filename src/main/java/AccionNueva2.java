import Curilef.framework.Accion;

public class AccionNueva2 implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Acción Nueva 2");
    }

    @Override
    public String nombreItemMenu() {
        return "Acción Nueva 2";
    }

    @Override
    public String descripcionItemMenu() {
        return "Esto es un boton de acción";
    }
}
