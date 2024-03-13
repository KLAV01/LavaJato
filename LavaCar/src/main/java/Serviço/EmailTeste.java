package Serviço;

public class EmailTeste {

    public static void main(String[] args) {
        Email email = new Email("Senha e Usuário Sistema Service Desk", "Seggue usuário e senha para acesso ao sistema de auditoria\n"+"Usuario:FelipeSoster\n"+"Senha: 123456", "deyvinhonogueiraa@gmail.com");
        email.enviar();
    }
    
}
