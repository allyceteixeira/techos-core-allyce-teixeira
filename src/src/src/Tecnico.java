public class Tecnico extends Usuario {
    public Tecnico(String id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public String getPerfil() {
        return "TECNICO";
    }
}
