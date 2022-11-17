
import javax.swing.JFrame;

public class MaiorMenor extends javax.swing.JFrame {
    
    private JFrame menu;
    private int pontuacao;
    private int atual1;
    private int atual2;
    
    public MaiorMenor(JFrame menu) {
        initComponents();
        this.menu = menu;
        inicializa();
        this.btnMaior.setEnabled(true);
        this.btnMenor.setEnabled(true);
    }
    
    public int getNumber() {
        int max = 12;
        int min = 1;
        int range = max - min + 1;
        
        int rand = (int)(Math.random() * range) + min;
        
        return rand;
    }
    
    public void changePontuacao() {
        this.lbPontuacao.setText(Integer.toString(this.pontuacao));
    }
    
    public void decisao(int op) {
        int real = 0;
        if (this.atual1 < this.atual2) {
            real = 1;
        }
        
        if (op == real) {
            this.pontuacao++;
            changePontuacao();
            next();
        } else {
            this.btnMaior.setEnabled(false);
            this.btnMenor.setEnabled(false);
        }
    }
    
    public void next() {
        this.atual1 = getNumber();
        this.atual2 = getNumber();
        if (this.atual1 == this.atual2) {
            if(this.atual2 < 12) {
                this.atual2++;
            } else {
                this.atual2--;
            }
        }
        
        this.tfPlayer.setText(Integer.toString(this.atual1));
        this.tfDealer.setText("X");
    }
    
    public void inicializa() {
        this.pontuacao = 0;
        changePontuacao();
        
        next();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        tfDealer = new javax.swing.JTextField();
        tfPlayer = new javax.swing.JTextField();
        btnMaior = new javax.swing.JButton();
        btnMenor = new javax.swing.JButton();
        lbTituloPontuacao = new javax.swing.JLabel();
        lbPontuacao = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Click Games - Maior-Menor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Maior-Menor");

        tfDealer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfDealer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDealer.setText("4");
        tfDealer.setFocusable(false);

        tfPlayer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tfPlayer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPlayer.setText("4");
        tfPlayer.setFocusable(false);

        btnMaior.setText("Maior");
        btnMaior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaiorMouseClicked(evt);
            }
        });

        btnMenor.setText("Menor");
        btnMenor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenorMouseClicked(evt);
            }
        });

        lbTituloPontuacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTituloPontuacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloPontuacao.setText("Pontuação:");

        lbPontuacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPontuacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPontuacao.setText("0");

        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMaior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPlayer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMenor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDealer)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTituloPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbTitulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDealer, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMaior)
                    .addComponent(btnMenor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTituloPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked

        this.menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnMaiorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaiorMouseClicked
        
        this.tfDealer.setText(Integer.toString(this.atual2));
        decisao(1);
    }//GEN-LAST:event_btnMaiorMouseClicked

    private void btnMenorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenorMouseClicked
        
        this.tfDealer.setText(Integer.toString(this.atual2));
        decisao(0);
    }//GEN-LAST:event_btnMenorMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        
        this.btnMaior.setEnabled(true);
        this.btnMenor.setEnabled(true);
        inicializa();
    }//GEN-LAST:event_btnResetMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MaiorMenor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaiorMenor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaiorMenor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaiorMenor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaiorMenor(null).setVisible(true);
            }
        });
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getAtual1() {
        return atual1;
    }

    public void setAtual1(int atual1) {
        this.atual1 = atual1;
    }

    public int getAtual2() {
        return atual2;
    }

    public void setAtual2(int atual2) {
        this.atual2 = atual2;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMaior;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lbPontuacao;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTituloPontuacao;
    private javax.swing.JTextField tfDealer;
    private javax.swing.JTextField tfPlayer;
    // End of variables declaration//GEN-END:variables
}
