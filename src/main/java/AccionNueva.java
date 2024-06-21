import Curilef.framework.Accion;

public class AccionNueva implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando Acción Nueva");
    }

    @Override
    public String nombreItemMenu() {
        return "Acción Nueva";
    }

    @Override
    public String descripcionItemMenu() {
        return "Esto reproduce una cancion";
    }
}
