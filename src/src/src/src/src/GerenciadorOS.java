public class GerenciadorOS {
    private static GerenciadorOS instancia;

    private GerenciadorOS() {
        System.out.println("[SINGLETON] GerenciadorOS Inicializado");
    }

    public static synchronized GerenciadorOS getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorOS();
        }
        return instancia;
    }

    public void registrarOS(String descricao) {
        System.out.println("[SYSTEM] OS Registrada com sucesso: " + descricao);
    }
}
