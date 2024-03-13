package Model.DAO;

import java.util.ArrayList;
import java.util.List;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Banco {
    
    public static List<Usuario> usuario;
    public static List<Cliente> cliente;
    public static List<Servico> servico;
    public static List<Agendamento> agendamento;
    
    
    public static void inicia(){
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        Usuario usuario1 = new Usuario(1, "Deyvid", 'M', "05/03/1999", "75988439017", "deyvid_nogueira@hotmail.com", "07336928501", "123123", "administrador");
        Usuario usuario2 = new Usuario(2, "Luan", 'M', "09/05/1996", "30212122", "estagiario@barbershop.com", "451244123", "321321", "funcionario");
        Usuario usuario3 = new Usuario(3, "klav", 'M', "01/01/2000", "75987654321", "klav@gmail.com", "11122233344", "1234", "administrador");
         
        Cliente cliente1 = new Cliente(1, "Luan Queiroz", 'M', "30/01/1995", "30212126", "tiagoluz.h607@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Cliente cliente2 = new Cliente(2, "Deyvid Nogueira", 'F', "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Cliente cliente3 = new Cliente(3, "Nathan Rodriguez", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Cliente cliente4 = new Cliente(4, "Alison Felipe", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        Cliente cliente5 = new Cliente(5, "João Victor", 'M', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        Cliente cliente6 = new Cliente(6, "João Guilherme", 'M', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        
        Servico servico1 = new Servico(1, "LAVAGEM SIMPLES - CARRO", 40);
        Servico servico2 = new Servico(2, "LAVAGEM DETALHADA - CARRO", 100);
        Servico servico3 = new Servico(3, "LAVAGEM PREMIUM - CARRO", 200);
        Servico servico4 = new Servico(4, "POLIMENTO - CARRO", 30);
        Servico servico5 = new Servico(5, "LAVAGEM DE MOTOR - CARRO", 50);
        Servico servico6 = new Servico(6, "REVITALIZAÇÃO DE FARÓIS - CARRO", 50);
        Servico servico7 = new Servico( 7 , "LAVAGEM SIMPLES - MOTO ", 20);
        Servico servico8 = new Servico( 8 , "LAVAGEM DETALHADA - MOTO ", 50);
        Servico servico9 = new Servico( 9 , "LAVAGEM PREMIUM - MOTO ", 100);
        
        Agendamento agendamento1 = new Agendamento(1, cliente1, servico2, 30, "14/02/2024 09:30");
        Agendamento agendamento2 = new Agendamento(2, cliente3, servico4, 40, "14/02/2024 10:00");
        Agendamento agendamento3 = new Agendamento(3, cliente4, servico1, 18, "14/02/2024 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        usuario.add(usuario3);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);

        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        servico.add(servico7);
        servico.add(servico8);
        servico.add(servico9);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
        System.out.println("Banco criado com sucesso!!");
    }
    
}
