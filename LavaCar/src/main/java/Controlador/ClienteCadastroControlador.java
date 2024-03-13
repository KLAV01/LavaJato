/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.List;

import Controlador.Helper.ClienteHelper;
import Model.Cliente;
import Model.DAO.ClienteDAO;
import View.ClienteView;
import View.NovoCliente;

public class ClienteCadastroControlador {
    
    private final ClienteView view;
    private final ClienteHelper helper;

    public ClienteCadastroControlador(ClienteView view) {
        this.view = view;
        this.helper = new ClienteHelper(view);
    }
    
    public void novoCliente(){
    	NovoCliente tela = new NovoCliente();
        tela.setVisible(true);
    }
    
    public void alterarCliente(){
//        ClienteCadastroView cliente = new ClienteCadastroView();
//        cliente.setVisible(true);
    }
    
    public void removerCliente(){
//        ClienteCadastroView cliente = new ClienteCadastroView();
//        cliente.setVisible(true);
    }
    
    public void atualizaTabela(){
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> objeto = dao.selectAll();
        helper.preencherTabela(objeto);
    }
}
