import Curilef.framework.framework;

public class main {
    public static void main(String[] args) {
        try {
            //framework framework = new framework("src/main/resources/config.properties");
            framework framework = new framework("src/main/resources/config.json");
            framework.mostrarMenu();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
