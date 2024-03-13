/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

public class LoginControle {

    private final Login view;
    private final LoginHelper helper;

    public LoginControle(Login view) {
        this.view = view;
        this.helper =  new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
       Usuario usuario = helper.obterModelo();
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
       if (usuarioAutenticado!=null){
           MenuPrincipal menu = new MenuPrincipal();
           menu.setVisible(true);
           this.view.dispose();
       }else{
           view.exibeMensagem("Usuario e senha invalidos");
       }
    }
    
	public void FizTarefa(){
	    System.out.println("Busque no banco");
	    this.view.exibeMensagem("Executei a aplicação");
	}
    
}
