public class Cliente extends Usuario {
    public Cliente(String id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public String getPerfil() {
        return "CLIENTE";
    }
}
