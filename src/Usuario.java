public abstract class Usuario {
    protected String id;
    protected String nome;
    protected String email;

    public Usuario(String id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public abstract String getPerfil();
}
