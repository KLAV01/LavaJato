/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import Controlador.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import View.AgendaView;

public class AgendaControlador {
    
    private final AgendaView view;
    private final AgendaHelper helper;
    
    public AgendaControlador(AgendaView view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        List<Agendamento> agendamentos = agendamentoDAO.selectAll();
        helper.preencherTabela(agendamentos);
    }
    
    public void atualizaCliente(){
        ClienteDAO clienteDAO = new ClienteDAO();
        List<Cliente> clientes = clienteDAO.selectAll();
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
        List<Servico> servicos = servicoDAO.selectAll();
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
       Servico servico =  helper.obterServico();
       helper.setarValor(servico.getValor());
    }
    
    public void agendar(){
        Agendamento agendamento = (Agendamento) helper.obterModelo();
        new AgendamentoDAO().insert(agendamento);
        atualizaTabela();
        helper.limparTela();
    }
    
    public boolean validarDados() {
    	return true;
    }
}
