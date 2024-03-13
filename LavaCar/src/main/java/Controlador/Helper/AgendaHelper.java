package Controlador.Helper;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.AgendaView;

public class AgendaHelper implements IHelper {

	private final AgendaView view;

	public AgendaHelper(AgendaView view) {
		this.view = view;
	}

	public void preencherTabela(List<Agendamento> agendamentos) {
		DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
		tableModel.setNumRows(0);
		for (Agendamento agendamento : agendamentos) {
			tableModel.addRow(new Object[] { 
					agendamento.getId(), 
					agendamento.getCliente().getNome(),
					agendamento.getServico().getDescricao(), 
					agendamento.getValor(), 
					agendamento.getDataFormatada(),
					agendamento.getHoraFormatada(), 
					agendamento.getObservacao() 
			});
		}
	}

	public void preencherClientes(List<Cliente> clientes) {
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
		for (Cliente cliente : clientes) {
			comboBoxModel.addElement(cliente);
		}
	}

	public void preencherServicos(List<Servico> servicos) {
		DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
		for (Servico servico : servicos) {
			comboBoxModel.addElement(servico);
		}
	}

	public Cliente ObterCliente() {
		return (Cliente) view.getjComboBoxCliente().getSelectedItem();
	}

	public Servico obterServico() {
		return (Servico) view.getjComboBoxServico().getSelectedItem();
	}

	public void setarValor(double valor) {
		view.getTextValor().setText(valor + "");
	}

	@Override
	public Object obterModelo() {
		String idString = view.getTextId().getText();
		int id = Integer.parseInt(idString);
		Cliente cliente = (Cliente) view.getjComboBoxCliente().getSelectedItem();
		Servico servico = (Servico) view.getjComboBoxServico().getSelectedItem();
		String valorString = view.getTextValor().getText();
		float valor = Float.parseFloat(valorString);
		String data = view.getTextFormatedData().getText();
		String hora = view.getTextFormatedHora().getText();
		String dataHora = data + " " + hora;
		String observacao = view.getTextObservacao().getText();

		Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
		return agendamento;
	}

	@Override
	public void limparTela() {
		view.getTextId().setText("0");
		view.getTextFormatedData().setText("");
		view.getTextFormatedHora().setText("");
		view.getTextObservacao().setText("");
	}

}
