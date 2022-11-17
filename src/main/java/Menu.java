
import javax.swing.JFrame;

public class Menu extends javax.swing.JFrame {

    private JFrame login;

    public Menu(JFrame login) {
        initComponents();
        this.login = login;
        this.lbNome.setText(Login.nome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        pnBarraHorizontal = new javax.swing.JPanel();
        pnBarraVertical = new javax.swing.JPanel();
        lbUsuario = new javax.swing.JLabel();
        btnDesconectar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        btnMaiorMenor = new javax.swing.JButton();
        btnMemoria = new javax.swing.JButton();
        btnVaca = new javax.swing.JButton();
        btnForca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Click Games - Menu");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Click Games");

        pnBarraHorizontal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout pnBarraHorizontalLayout = new javax.swing.GroupLayout(pnBarraHorizontal);
        pnBarraHorizontal.setLayout(pnBarraHorizontalLayout);
        pnBarraHorizontalLayout.setHorizontalGroup(
            pnBarraHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnBarraHorizontalLayout.setVerticalGroup(
            pnBarraHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnBarraVertical.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout pnBarraVerticalLayout = new javax.swing.GroupLayout(pnBarraVertical);
        pnBarraVertical.setLayout(pnBarraVerticalLayout);
        pnBarraVerticalLayout.setHorizontalGroup(
            pnBarraVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnBarraVerticalLayout.setVerticalGroup(
            pnBarraVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        lbUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbUsuario.setText("Usuário:");

        btnDesconectar.setText("Desconectar");
        btnDesconectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesconectarMouseClicked(evt);
            }
        });

        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnMaiorMenor.setText("Maior-Menor");
        btnMaiorMenor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaiorMenorMouseClicked(evt);
            }
        });

        btnMemoria.setText("Memória");
        btnMemoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemoriaMouseClicked(evt);
            }
        });

        btnVaca.setText("Vaca");
        btnVaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVacaMouseClicked(evt);
            }
        });

        btnForca.setText("Forca");
        btnForca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnForcaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDesconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnBarraHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addComponent(pnBarraVertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMemoria, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(btnMaiorMenor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnForca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnBarraHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(lbNome))
                .addGap(123, 123, 123)
                .addComponent(btnDesconectar)
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVaca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnForca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMaiorMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnBarraVertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.login.setVisible(true);
        Login.nome = null;
    }//GEN-LAST:event_formWindowClosing

    private void btnDesconectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesconectarMouseClicked

        this.login.setVisible(true);
        Login.nome = null;
        this.dispose();
    }//GEN-LAST:event_btnDesconectarMouseClicked

    private void btnMaiorMenorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaiorMenorMouseClicked

        MaiorMenor mm = new MaiorMenor(this);
        mm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMaiorMenorMouseClicked

    private void btnForcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnForcaMouseClicked

        Forca f = new Forca(this);
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnForcaMouseClicked

    private void btnVacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVacaMouseClicked
        
        VacaFrame v = new VacaFrame(this);
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVacaMouseClicked

    private void btnMemoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemoriaMouseClicked
        
        Memoria m = new Memoria(this);
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMemoriaMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(null).setVisible(true);
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
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JButton btnForca;
    private javax.swing.JButton btnMaiorMenor;
    private javax.swing.JButton btnMemoria;
    private javax.swing.JButton btnVaca;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel pnBarraHorizontal;
    private javax.swing.JPanel pnBarraVertical;
    // End of variables declaration//GEN-END:variables
}
