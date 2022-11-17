
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Forca extends javax.swing.JFrame {
    
    private JFrame menu;
    private String[] palavras;
    private String palavra;
    private char[] atual;
    private String letras;
    private int tentativas;

    public Forca(JFrame menu) {
        initComponents();
        this.menu = menu;
        this.palavra = "";
        inicializaPalavras();
        inicializa();
    }
    
    public void inicializaPalavras() {
        this.palavras = new String[]{"sorriso", "integral", "aviador", "cordas", "centro", "marrom", "positivo", "jogada", "motocicleta", "zumbido", "aventura", "julgamento", "entrada",
            "camelo", "tristeza", "quadrado", "freio", "estado", "brilhante", "mulheres", "homens", "atlas", "formigueiro", "direito", "mental", "pobreza", "transbordar", "local",
            "talheres", "banho", "evaporar", "oriental", "ocidental", "mensageiro", "frio", "quente", "misturar", "livro", "carro", "biblioteca", "computador", "celular", "sair", "fogo",
            "madeira", "metal", "vento", "tsunami", "cidade", "estado", "museu", "escola", "faculdade", "piscina", "academia", "classe", "palavra", "texto", "controle", "garrafa", "teclado",
            "medalha", "cama", "travesseiro", "verdadeiro", "falso", "certo", "errado", "rede", "policial", "bombeiro", "espada", "escudo", "gato", "chachorro", "cavalo"};
    }
    
    public int getNumber() {
        int max = this.palavras.length;
        int min = 0;
        int range = max - min + 1;
        
        int rand = (int)(Math.random() * range) + min;
        
        return rand;
    }
    
    public String getPalavra() {
        
        int index = getNumber();
        
        if (this.palavras[index].equals(this.palavra)) {
            if (index != 0) {
                index--;
            } else {
                index++;
            }
        }
        
        return this.palavras[index].toUpperCase();
    }
    
    public void inicializa() {
        this.tentativas = 7;
        this.lbTentativas.setText(Integer.toString(this.tentativas));
        
        this.palavra = getPalavra();
        this.atual = new char[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            this.atual[i] = '_';
        }
        this.letras = "";
        
        this.lbAtual.setText(Arrays.toString(this.atual));
        this.lbLetras.setText(" ");
        
        this.tfTentativa.setText("");
        this.btnTentativa.setEnabled(true);
        
        this.tfAdivinhar.setText("");
        this.btnAdivinhar.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbPalavra = new javax.swing.JLabel();
        lbAtual = new javax.swing.JLabel();
        lbTituloLetras = new javax.swing.JLabel();
        lbLetras = new javax.swing.JLabel();
        tfTentativa = new javax.swing.JTextField();
        btnTentativa = new javax.swing.JButton();
        lbTituloTentativas = new javax.swing.JLabel();
        lbTentativas = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        tfAdivinhar = new javax.swing.JTextField();
        btnAdivinhar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Click Games - Forca");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Forca");

        lbPalavra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPalavra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPalavra.setText("Palavra");

        lbAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAtual.setText("jLabel3");

        lbTituloLetras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTituloLetras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLetras.setText("Letras");

        lbLetras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLetras.setText("jLabel5");

        tfTentativa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnTentativa.setText("Tentativa");
        btnTentativa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTentativaMouseClicked(evt);
            }
        });

        lbTituloTentativas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTituloTentativas.setText("Tentativas Restantes:");

        lbTentativas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTentativas.setText("0");

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

        btnAdivinhar.setText("Adivinhar");
        btnAdivinhar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdivinharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbPalavra)
                    .addComponent(lbTituloLetras)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfTentativa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTentativa))
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTituloTentativas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTentativas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfAdivinhar)
                    .addComponent(btnAdivinhar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPalavra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTituloLetras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLetras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTentativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTentativa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTituloTentativas)
                    .addComponent(lbTentativas))
                .addGap(12, 12, 12)
                .addComponent(tfAdivinhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdivinhar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVoltar)
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        this.menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        
        this.menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        
        inicializa();
    }//GEN-LAST:event_btnResetMouseClicked

    private void testaLetra(String str) {
        str = str.toUpperCase();
        
        if (this.letras.equals("")) {
            this.letras = str;
        } else {
            this.letras = this.letras + " " + str;
        }
        this.lbLetras.setText(this.letras);

        for (int i = 0; i < this.palavra.length(); i++) {
            if (str.charAt(0) == this.palavra.charAt(i)) {
                this.atual[i] = str.charAt(0);
            }
        }
        
        this.lbAtual.setText(Arrays.toString(this.atual));
    }
    
    private void btnTentativaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTentativaMouseClicked
        
        if (this.btnAdivinhar.isEnabled()) {
            if (this.tentativas > 0) {
                if (this.tfTentativa.getText().matches("[A-z]{1}")) {
                    testaLetra(this.tfTentativa.getText());
                    this.tentativas--;
                    if (this.tentativas == 0) {
                        this.btnTentativa.setEnabled(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Letra inválida!");
                }

                this.lbTentativas.setText(Integer.toString(this.tentativas));
            } else {
                JOptionPane.showMessageDialog(null, "Número máximo de tentativas atingido!");
            }

            this.tfTentativa.setText("");
        }
    }//GEN-LAST:event_btnTentativaMouseClicked

    private void btnAdivinharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdivinharMouseClicked
        
        if (this.btnAdivinhar.isEnabled()) {
            if (this.tfTentativa.getText().matches("[A-z]*")) {
                this.btnTentativa.setEnabled(false);
                this.btnAdivinhar.setEnabled(false);
                
                if (this.tfAdivinhar.getText().toUpperCase().equals(this.palavra)) {
                    JOptionPane.showMessageDialog(null, "Resposta Correta!");
                } else {
                    JOptionPane.showMessageDialog(null, "Resposta Incorreta!");
                }
                
                for (int i = 0; i < this.palavra.length(); i++) {
                    this.atual[i] = this.palavra.charAt(i);
                }

                this.lbAtual.setText(Arrays.toString(this.atual));
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            }
            
            this.tfAdivinhar.setText("");
        }
    }//GEN-LAST:event_btnAdivinharMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forca(null).setVisible(true);
            }
        });
    }

    public JFrame getMenu() {
        return menu;
    }

    public void setMenu(JFrame menu) {
        this.menu = menu;
    }

    public String[] getPalavras() {
        return palavras;
    }

    public void setPalavras(String[] palavras) {
        this.palavras = palavras;
    }

    public char[] getAtual() {
        return atual;
    }

    public void setAtual(char[] atual) {
        this.atual = atual;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdivinhar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTentativa;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lbAtual;
    private javax.swing.JLabel lbLetras;
    private javax.swing.JLabel lbPalavra;
    private javax.swing.JLabel lbTentativas;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTituloLetras;
    private javax.swing.JLabel lbTituloTentativas;
    private javax.swing.JTextField tfAdivinhar;
    private javax.swing.JTextField tfTentativa;
    // End of variables declaration//GEN-END:variables
}
