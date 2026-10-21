public class UsuarioFactory {
    public static Usuario criarUsuario(String tipo, String id, String nome, String email) {
        if (tipo.equalsIgnoreCase("CLIENTE")) {
            return new Cliente(id, nome, email);
        } else if (tipo.equalsIgnoreCase("TECNICO")) {
            return new Tecnico(id, nome, email);
        }
        throw new IllegalArgumentException("Tipo de usuário inválido: " + tipo);
    }
}
