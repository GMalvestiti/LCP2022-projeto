
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CriarConta extends javax.swing.JFrame {
    
    private JFrame login;

    public CriarConta(JFrame login) {
        initComponents();
        this.login = login;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        btnCriar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Click Games - Criar Conta");
        setName("frame2"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNome.setText("Usuário:");
        lbNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tfNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNome.setToolTipText("");

        lbSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbSenha.setText("Senha:");
        lbSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCriar.setText("Criar");
        btnCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCriarMouseClicked(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Criar Conta");
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
                        .addComponent(btnCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
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
                .addComponent(btnCriar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarMouseClicked
        
        if (Contas.adiciona(tfNome.getText(), tfSenha.getText()) == false) {
            JOptionPane.showMessageDialog(null, "Valores Inválidos!");
        } else {
            JOptionPane.showMessageDialog(null, "Conta Criada!");
        }
        tfNome.setText("");
        tfSenha.setText("");
    }//GEN-LAST:event_btnCriarMouseClicked

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        
        this.login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        this.login.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarConta(null).setVisible(true);
            }
        });
    }

    public JFrame getLogin() {
        return login;
    }

    public void setLogin(JFrame login) {
        this.login = login;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
