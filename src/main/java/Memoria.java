
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class Memoria extends javax.swing.JFrame {
    private JFrame menu;
    public ArrayList<Integer> posicoesLiberadas = new  ArrayList<Integer>();
    public ArrayList<Integer> game = new  ArrayList<Integer>();
    public ArrayList<Integer> jogadaP = new ArrayList<Integer>();
    public Integer jogadas = 0;
    public Timer timer;
    
    public ArrayList<Integer> generateGame(Integer size) {
        
        Random rand = new Random();
        int range = size;
      
        HashMap<Integer, Integer> disponiveis = new HashMap<Integer, Integer>();
        
        for (Integer i =0; i < size ; i++) {
            disponiveis.put(i , 2);
        }
        
        ArrayList<Integer> elementosFinalizados = new ArrayList<Integer>();
        
        Integer elementos = size*2;
        
        for (Integer i=0; i < elementos; i++){
            Boolean isValid = false;
            
            while(!isValid) {
                int random = rand.nextInt(range);

                 if (!elementosFinalizados.contains(random) ) {
                     
                     isValid = true;
                     Integer qtdDisponivel = disponiveis.get(random);
                     qtdDisponivel--;
                     disponiveis.put(random, qtdDisponivel);
                     
                     if (qtdDisponivel == 0) {
                         elementosFinalizados.add(random);
                     }
                     
                     game.add(random);
                 }
            }
        }
        
        return game;
    }
    
    public void printGame(Boolean all) {
        Integer size = game.size() ;
        for (Integer i = 0 ; i < size; i++) {
            if (all || posicoesLiberadas.contains(i)) {
                System.out.println(game.get(i));
            } else {
                System.out.println("X");
            }
            System.out.println(" ");
        }
    }
    
    public void jogada() {
        if(jogadaP.size() == 2) {
            
            Integer posicao1 = jogadaP.get(0);
            Integer posicao2 = jogadaP.get(1);
            jogadas++;
            if (game.get(posicao1) == game.get(posicao2)) {
                
                posicoesLiberadas.add(posicao1);
                posicoesLiberadas.add(posicao2);
                if (fimDeJogo()) {
                    this.resultado.setText("Jogadas:"+String.valueOf(jogadas));
                }
            } else {
                desviraPressionados();
            }
            jogadaP.clear();
            this.repaint();
        }   
    }
    
    public void viraPressionados(){
    
        for (Integer i : jogadaP){
            switch (i) {
                case 0: 
                    A0.setText(String.valueOf(game.get(i)));
                    this.A0.setEnabled(false);
                    break;
                case 1: 
                    this.A1.setText(String.valueOf(game.get(i)));
                    this.A1.setEnabled(false);
                break;
                case 2: 
                    this.A2.setText(String.valueOf(game.get(i)));
                    this.A2.setEnabled(false);
                break;
                case 3: 
                    this.A3.setText(String.valueOf(game.get(i)));
                    this.A3.setEnabled(false);
                break;
                case 4: 
                    this.A4.setText(String.valueOf(game.get(i)));
                    this.A4.setEnabled(false);
                break;
                case 5: 
                    this.A5.setText(String.valueOf(game.get(i)));
                    this.A5.setEnabled(false);
                break;
                       
            }
        }
    }
    
    public void desviraPressionados(){
    
        for (Integer i : jogadaP){
            switch (i) {
                case 0: 
                    this.A0.setText("X");
                    this.A0.setEnabled(true);
                    break;
                case 1: 
                    this.A1.setText("X");
                    this.A1.setEnabled(true);
                    break;
                case 2: 
                    this.A2.setText("X");
                    this.A2.setEnabled(true);
                    break;
                case 3: 
                    this.A3.setText("X");
                    this.A3.setEnabled(true);
                    break;
            
                case 4: 
                    this.A4.setText("X");
                    this.A4.setEnabled(true);
                    break;
              
                case 5: 
                    this.A5.setText("X");
                    this.A5.setEnabled(true);
                    break;    
            }
        }
    
       
    }
    
    class bloqueiaGame extends TimerTask{
        
        public Memoria m;
        
        bloqueiaGame(Memoria memoria){
            this.m = memoria;
        }
        
        public void run(){
            m.desviraPressionados();
            m.jogadaP.clear();
            timer.cancel();
        }
    }
    
    private Boolean fimDeJogo() {
       
        return posicoesLiberadas.size() == game.size();
    }
    
    private void inicia() {
        game.clear();
        jogadaP.clear();
        posicoesLiberadas.clear();
        
        generateGame(3);
        
        jogadaP.add(0);
        jogadaP.add(1);
        jogadaP.add(2);
        jogadaP.add(3);
        jogadaP.add(4);
        jogadaP.add(5);

        viraPressionados();
        
        timer = new Timer();
        timer.schedule(new bloqueiaGame(this), 5000);
    }
    
    public Memoria(JFrame menu) {
        initComponents();
        this.menu = menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        A0 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        A1 = new javax.swing.JTextField();
        A2 = new javax.swing.JTextField();
        A3 = new javax.swing.JTextField();
        A5 = new javax.swing.JTextField();
        A4 = new javax.swing.JTextField();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Memoria");

        A0.setEditable(false);
        A0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A0.setText("X");
        A0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A0MouseClicked(evt);
            }
        });

        jButton1.setText("Inicio");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        A1.setEditable(false);
        A1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A1.setText("X");
        A1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });

        A2.setEditable(false);
        A2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A2.setText("X");
        A2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A2MouseClicked(evt);
            }
        });

        A3.setEditable(false);
        A3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A3.setText("X");
        A3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A3MouseClicked(evt);
            }
        });

        A5.setEditable(false);
        A5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A5.setText("X");
        A5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A5MouseClicked(evt);
            }
        });

        A4.setEditable(false);
        A4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A4.setText("X");
        A4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A4MouseClicked(evt);
            }
        });

        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A0, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void A0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A0MouseClicked
        
        if (!posicoesLiberadas.contains(0)) {
            jogadaP.add(0);
            viraPressionados();
            jogada();
        }
    }//GEN-LAST:event_A0MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (this.jButton1.getText() == "Inicio") {
            inicia();
            this.jButton1.setText("Reset");
        } else {
            inicia();
            this.jButton1.setText("Reset");
        }
        this.resultado.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void A2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A2MouseClicked
         if (!posicoesLiberadas.contains(2)) {
            jogadaP.add(2);
            viraPressionados();
            jogada();
        }
    }//GEN-LAST:event_A2MouseClicked

    private void A3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A3MouseClicked
         if (!posicoesLiberadas.contains(3)) {
            jogadaP.add(3);
            viraPressionados();
            jogada();
        }
    }//GEN-LAST:event_A3MouseClicked

    private void A5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A5MouseClicked
         if (!posicoesLiberadas.contains(5)) {
            jogadaP.add(5);
            viraPressionados();
            jogada();
        }
    }//GEN-LAST:event_A5MouseClicked

    private void A4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A4MouseClicked
         if (!posicoesLiberadas.contains(4)) {
            jogadaP.add(4);
            viraPressionados();
            jogada();
        }
    }//GEN-LAST:event_A4MouseClicked

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
        if (!posicoesLiberadas.contains(1)) {
            jogadaP.add(1);
            viraPressionados();
            jogada();
        }
    }//GEN-LAST:event_A1MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.menu.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Memoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Memoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Memoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Memoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memoria(null).setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A0;
    private javax.swing.JTextField A1;
    private javax.swing.JTextField A2;
    private javax.swing.JTextField A3;
    private javax.swing.JTextField A4;
    private javax.swing.JTextField A5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
