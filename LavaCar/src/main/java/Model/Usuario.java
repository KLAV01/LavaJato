package Model;

public class Usuario extends Pessoa{

    protected String senha;
    protected String nivelAcesso;

    public Usuario(int Id, String nome, String senha) {
        super(Id, nome);
        this.senha = senha;
    }

    public Usuario(int Id ,String nome,char sexo,String dataNascimento,String telefone,String email, String cpf,String senha, String nivelAcesso ) {
        super(Id, nome, sexo, dataNascimento, telefone, email, cpf);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
}
