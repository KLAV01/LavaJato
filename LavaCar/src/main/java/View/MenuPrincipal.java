package View;

import Controlador.MenuPrincipalControlador;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPrincipal extends javax.swing.JFrame {

	MenuPrincipalControlador controlador;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuItemAgenda;
    private javax.swing.JMenuItem MenuItemCliente;
    private javax.swing.JMenuItem MenuItemServico;
    private javax.swing.JMenu MenuOperacao;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
	
    public MenuPrincipal() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/View/icones/car.png")));
    	setTitle("LavaJato - AutoBrilho");
        initComponents();
        controlador = new MenuPrincipalControlador(this);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuItemCliente = new javax.swing.JMenuItem();
        MenuItemServico = new javax.swing.JMenuItem();
        MenuOperacao = new javax.swing.JMenu();
        MenuItemAgenda = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();
        MenuSair.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
            	Login login = new Login();
            	login.setVisible(true);
        	}
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setAlwaysOnTop(true);
        setResizable(false);
        setLocationRelativeTo(null); // Centralizar a janela na tela
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/fundo_menu.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -30, 1280, 720);

        MenuCadastro.setText("  Cadastro  ");
        MenuCadastro.setActionCommand("Cadastro  ");
        MenuCadastro.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N

        MenuItemCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/cliente32-icon.png"))); // NOI18N
        MenuItemCliente.setText("  Cliente");
        MenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClienteActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuItemCliente);

        MenuItemServico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icones/electric-car (1).png"))); // NOI18N
        MenuItemServico.setText("  Serviço");
        MenuCadastro.add(MenuItemServico);

        jMenuBar1.add(MenuCadastro);

        MenuOperacao.setText("Agendamento");
        MenuOperacao.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N

        MenuItemAgenda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MenuItemAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/agenda32-icon.png"))); // NOI18N
        MenuItemAgenda.setText("Agenda");
        MenuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAgendaActionPerformed(evt);
            }
        });
        MenuOperacao.add(MenuItemAgenda);

        jMenuBar1.add(MenuOperacao);

        MenuSair.setText("Sair");
        MenuSair.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        pack();
    }

    private void MenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClienteActionPerformed
    	System.out.println("Menu Cliente");
        this.controlador.clienteCadastro();
    }

    private void MenuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAgendaActionPerformed
    	System.out.println("Menu Agenda");
        this.controlador.navegarParaAgenda();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

}
