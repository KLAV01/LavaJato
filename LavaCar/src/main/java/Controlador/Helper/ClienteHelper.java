package Controlador.Helper;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.AgendaView;
import View.ClienteView;

public class ClienteHelper implements IHelper{
    
    private final ClienteView view;

    public ClienteHelper(ClienteView view) {
        this.view = view;
    }

    public void preencherTabela(List<Cliente> clientes) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTbCliente().getModel();
        tableModel.setNumRows(0);
        for (Cliente cliente : clientes) {
            tableModel.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getEndereco()
            });
        }
    }

	@Override
	public Object obterModelo() {
		return null;
	}

	@Override
	public void limparTela() {
	}
    
}
