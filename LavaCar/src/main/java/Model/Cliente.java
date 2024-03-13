package Model;

public class Cliente extends Pessoa{
 
    private String endereco;
    private String cep;

    public Cliente(int Id ,String nome,char sexo,String dataNascimento,String telefone,String email, String cpf,String endereco, String cep ) {
        super(Id, nome, sexo, dataNascimento, telefone, email, cpf);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int Id, String nome, String telefone, String cpf, String endereco) {
        super(Id, nome);
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

 @Override
 public String toString(){
     return getNome();
 }

}