
public class Login extends javax.swing.JFrame {
    
    public static String nome;

    public Login() {
        initComponents();
        Login.nome = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnCriarConta = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNome.setText("Usuário:");
        lbNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tfNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNome.setToolTipText("");

        lbSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbSenha.setText("Senha:");
        lbSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnEntrar.setText("Entrar");
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });

        btnCriarConta.setText("Criar Conta");
        btnCriarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCriarContaMouseClicked(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("LOGIN");
        lbTitulo.setToolTipText("");
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbSenha)
                        .addComponent(lbNome)
                        .addComponent(tfSenha)
                        .addComponent(tfNome)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCriarConta, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNome)
                .addGap(4, 4, 4)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCriarConta)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        
        if (Contas.verifica(tfNome.getText(), tfSenha.getText())) {
            Login.nome = tfNome.getText();
            this.setVisible(false);
            
            Menu menu = new Menu(this);
            menu.setVisible(true);
        }
        tfNome.setText("");
        tfSenha.setText("");
    }//GEN-LAST:event_btnEntrarMouseClicked

    private void btnCriarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarContaMouseClicked

        CriarConta cc = new CriarConta(this);
        setVisible(false);
        cc.setVisible(true);
    }//GEN-LAST:event_btnCriarContaMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Login.nome = nome;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
