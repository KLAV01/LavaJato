/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import View.AgendaView;
import View.ClienteView;
import View.MenuPrincipal;
import View.Login;

public class MenuPrincipalControlador {
    
    private final MenuPrincipal view;

    public MenuPrincipalControlador(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        AgendaView agenda = new AgendaView();
        agenda.setVisible(true);
    }
    
    public void clienteCadastro(){
        ClienteView cliente = new ClienteView();
        cliente.setVisible(true);
    }
    
    public void login(){
        Login login = new Login();
        login.setVisible(true);
    }
}
