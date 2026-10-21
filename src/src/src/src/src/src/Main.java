public class Main {
    public static void main(String[] args) {
        // Testando Singleton
        GerenciadorOS gerenciador = GerenciadorOS.getInstance();

        // Testando Factory Method
        Usuario cliente = UsuarioFactory.criarUsuario("CLIENTE", "1", "Allyce", "allyce@email.com");
        Usuario tecnico = UsuarioFactory.criarUsuario("TECNICO", "2", "Carlos", "carlos@email.com");

        System.out.println("Usuário criado: " + cliente.nome + " | Perfil: " + cliente.getPerfil());
        System.out.println("Usuário criado: " + tecnico.nome + " | Perfil: " + tecnico.getPerfil());

        gerenciador.registrarOS("Conserto de ecrã/notebook");
    }
}
