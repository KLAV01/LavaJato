package View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controlador.LoginControle;
import Model.Usuario;
import Model.DAO.Banco;
import Model.DAO.UsuarioDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class Login extends JFrame {

    private final LoginControle controlador;
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelTituloLogin;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel jLabel1;

    public Login() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/View/icones/car.png")));
    	setTitle("LavaJato - AutoBrilho");
        initComponents();
        controlador = new LoginControle(this);
        Banco.inicia();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        LabelTituloLogin = new javax.swing.JLabel();
        LabelUsuario = new javax.swing.JLabel();
        LabelSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JTextField();
        TextSenha = new javax.swing.JPasswordField();
        TextSenha.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		if(e.getKeyChar() == e.VK_ENTER)
        			controlador.entrarNoSistema();
        	}
        });
        ButtonEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(680, 680));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setAlwaysOnTop(true);
        setResizable(false);
        setLocationRelativeTo(null); // Centralizar a janela na tela
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTituloLogin.setFont(new java.awt.Font("Courier 10 Pitch", 1, 48)); // NOI18N
        LabelTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        LabelTituloLogin.setText("Login");
        getContentPane().add(LabelTituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        LabelUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsuario.setText("Usuário");
        getContentPane().add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        TextUsuario.setBackground(new java.awt.Color(153, 153, 153));
        TextUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 400, 40));

        LabelSenha.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        LabelSenha.setText("Senha");
        getContentPane().add(LabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        TextSenha.setBackground(new java.awt.Color(153, 153, 153));
        TextSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextSenha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 400, 40));

        ButtonEntrar.setBackground(new java.awt.Color(153, 0, 0));
        ButtonEntrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEntrar.setText("Entrar");
        ButtonEntrar.setBorder(null);
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 400, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/tela de login.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        
        pack();
    }
    
    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {
    	this.controlador.entrarNoSistema();
    	
//    	String nome = getTextUsuario().getText();
//        String senha = getTextSenha().getText();
//        Usuario modelo = new Usuario(0, nome, senha);
//        
//        UsuarioDAO usuarioDAO = new UsuarioDAO();
//        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(modelo);
//        
//        if (usuarioAutenticado!=null){
//            MenuPrincipal menu = new MenuPrincipal();
//            menu.setVisible(true);
//            this.dispose();
//        }else{
//            JOptionPane.showMessageDialog(this, "Usuario e senha invalidos");
//        }
    }
    
    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }

    public JPasswordField getTextSenha() {
        return TextSenha;
    }

    public void setTextSenha(JPasswordField TextSenha) {
        this.TextSenha = TextSenha;
    }

    public JTextField getTextUsuario() {
        return TextUsuario;
    }

    public void setTextUsuario(JTextField TextUsuario) {
        this.TextUsuario = TextUsuario;
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

}
