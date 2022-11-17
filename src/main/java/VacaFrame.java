import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.Timer;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class VacaFrame extends javax.swing.JFrame {
    
    private JFrame menu;
    
    public VacaFrame(JFrame menu) {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.menu = menu;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 0));
        setMinimumSize(new java.awt.Dimension(720, 520));
        setPreferredSize(new java.awt.Dimension(720, 520));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ache a vaca Invisível");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(95, 140, 480, 140);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Você achou a vaca!!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 90);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton2.setText("Jogar de novo");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 410, 170, 50);

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 310, 30, 30);

        jPanel2.setBackground(new java.awt.Color(102, 153, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 720, 520);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 520));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 520));
        jPanel1.add(jLabel4);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   

        this.menu.setVisible(true);
    } 
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(false);
        jButton2.setVisible(true);
        jPanel2.setVisible(false);
        jLabel4.setIcon(new javax.swing.ImageIcon("vacaVesga.png"));
        
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        inicializar();
    }

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {
        mugido();
    }

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
        inicializar();
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
            java.util.logging.Logger.getLogger(VacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VacaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacaFrame(null).setVisible(true);
            }
        });
    }

    private void mugido(){
        try {
            File wavFile = new File("cow-moo3.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(wavFile));
            clip.start();
        } catch (Exception e) {
        }
    }  
    
    private void inicializar(){
        jPanel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(true);
        jButton1.setVisible(true);
        jButton2.setVisible(false);
        jPanel2.setVisible(true);
        
        Random a = new Random();
        int x = a.nextInt(650-0)+0;
        Random b = new Random();
        int y = b.nextInt((350-0))+0;
        jButton1.setLocation(x, y); 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
