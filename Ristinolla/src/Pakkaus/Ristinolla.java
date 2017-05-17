/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pakkaus;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Joni
 */
public class Ristinolla extends javax.swing.JFrame {

    private String vuoro = "X";
    private String pelaaja1 = "Pelaaja 1";
    private String pelaaja2 = "Pelaaja 2";
    private int pelaaja1Voitot = 0;
    private int pelaaja2Voitot = 0;
    
    public Ristinolla() {
        initComponents();
        
        setLocationRelativeTo(null);
        tuoPelaajienNimet();
        asetaTulos();
    }
    
    private void asetaTulos() {
        tulos.setText(pelaaja1 + " | Tulos: " +
                String.valueOf(pelaaja1Voitot) + 
                "\t                                  " 
                + pelaaja2 + " | Tulos: " +
                String.valueOf(pelaaja2Voitot));
    }
    
    private void tuoPelaajienNimet() {
        pelaaja1 = JOptionPane.showInputDialog(this, "Pelaajan 1 nimi: ", "Pelaajan Nimi");
        pelaaja2 = JOptionPane.showInputDialog(this, "Pelaajan 2 nimi: ", "Pelaajan Nimi");
        
        if (pelaaja1.equals("")) {
            pelaaja1 = "Pelaaja 1"; // Jos kenttä jää tyhjäksi
        }
        
        if (pelaaja2.equals("")) {
            pelaaja2 = "Pelaaja 2";
        }
    }
    
    public void tarkistaKenenVuoro() {
        if (vuoro.equals("X")) {
            vuoro = "O";
        } else {
            vuoro = "X";
        }
    }
    
    public void tarkistaVoittaja() {
        
        String _1 = n1.getText();
        String _2 = n2.getText();
        String _3 = n3.getText();
        String _4 = n4.getText();
        String _5 = n5.getText();
        String _6 = n6.getText();
        String _7 = n7.getText();
        String _8 = n8.getText();
        String _9 = n9.getText();
        
        // Tarkista, voittaako X
        if (_1.equals("X") && _2.equals("X") && _3.equals("X")) {
            xVoittaa();
        }
        
        if (_4.equals("X") && _5.equals("X") && _6.equals("X")) {
            xVoittaa();
        }
        
        if (_7.equals("X") && _8.equals("X") && _9.equals("X")) {
            xVoittaa();
        }
        
        if (_1.equals("X") && _5.equals("X") && _9.equals("X")) {
            xVoittaa();
        }
        
        if (_1.equals("X") && _4.equals("X") && _7.equals("X")) {
            xVoittaa();
        }
        
        if (_2.equals("X") && _5.equals("X") && _8.equals("X")) {
            xVoittaa();
        }
        
        if (_3.equals("X") && _6.equals("X") && _9.equals("X")) {
            xVoittaa();
        }
        
        if (_7.equals("X") && _5.equals("X") && _3.equals("X")) {
            xVoittaa();
        }
        
        
        // Tarkista, voittaako O
        if (_1.equals("O") && _2.equals("O") && _3.equals("O")) {
            oVoittaa();
        }
        
        if (_4.equals("O") && _5.equals("O") && _6.equals("O")) {
            oVoittaa();
        }
        
        if (_7.equals("O") && _8.equals("O") && _9.equals("O")) {
            oVoittaa();
        }
        
        if (_1.equals("O") && _5.equals("O") && _9.equals("O")) {
            oVoittaa();
        }
        
        if (_1.equals("O") && _4.equals("O") && _7.equals("O")) {
            oVoittaa();
        }
        
        if (_2.equals("O") && _5.equals("O") && _8.equals("O")) {
            oVoittaa();
        }
        
        if (_3.equals("O") && _6.equals("O") && _9.equals("O")) {
            oVoittaa();
        }
        
        if (_7.equals("O") && _5.equals("O") && _3.equals("O")) {
            oVoittaa();
        }
        
    }
    
    private void xVoittaa() {
        JOptionPane.showMessageDialog(this, pelaaja1 + " on voittaja!");
        pelaaja1Voitot++;
        asetaTulos();
        aloitaPeliAlusta();
    }
    
    private void oVoittaa() {
        JOptionPane.showMessageDialog(this, pelaaja2 + " on voittaja!");
        pelaaja2Voitot++;
        asetaTulos();
        aloitaPeliAlusta();
    }
    
    private void tasapeli() {
        if (n1.getText() != "" && n2.getText() != "" && n3.getText() != "" && n4.getText() != "" &&
                n5.getText() != "" && n6.getText() != "" && n7.getText() != "" && n8.getText()!= "" && n9.getText() != "") {
                JOptionPane.showMessageDialog(this, "Tasapeli!");
                aloitaPeliAlusta();
                
        }
    }
    
    private void aloitaPeliAlusta() {
        n1.setText("");
        n2.setText("");
        n3.setText("");
        n4.setText("");
        n5.setText("");
        n6.setText("");
        n7.setText("");
        n8.setText("");
        n9.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tulos = new javax.swing.JLabel();
        grid = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        n1 = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        n2 = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        n3 = new javax.swing.JButton();
        p4 = new javax.swing.JPanel();
        n4 = new javax.swing.JButton();
        p5 = new javax.swing.JPanel();
        n5 = new javax.swing.JButton();
        p6 = new javax.swing.JPanel();
        n6 = new javax.swing.JButton();
        p7 = new javax.swing.JPanel();
        n7 = new javax.swing.JButton();
        p8 = new javax.swing.JPanel();
        n8 = new javax.swing.JButton();
        p9 = new javax.swing.JPanel();
        n9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ristinolla");
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        tulos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tulos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tulos.setText("Place holder for scores");
        jPanel1.add(tulos, java.awt.BorderLayout.PAGE_END);

        grid.setBackground(new java.awt.Color(102, 102, 102));
        grid.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p1.setLayout(new java.awt.BorderLayout());

        n1.setFont(new java.awt.Font("Monospaced", 1, 100)); // NOI18N
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        p1.add(n1, java.awt.BorderLayout.CENTER);

        grid.add(p1);

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p2.setLayout(new java.awt.BorderLayout());

        n2.setFont(new java.awt.Font("Monospaced", 1, 100)); // NOI18N
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        p2.add(n2, java.awt.BorderLayout.CENTER);

        grid.add(p2);

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p3.setLayout(new java.awt.BorderLayout());

        n3.setFont(new java.awt.Font("Monospaced", 1, 100)); // NOI18N
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });
        p3.add(n3, java.awt.BorderLayout.CENTER);

        grid.add(p3);

        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p4.setLayout(new java.awt.BorderLayout());

        n4.setFont(new java.awt.Font("Monospaced", 1, 100)); // NOI18N
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });
        p4.add(n4, java.awt.BorderLayout.CENTER);

        grid.add(p4);

        p5.setBackground(new java.awt.Color(255, 255, 255));
        p5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p5.setLayout(new java.awt.BorderLayout());

        n5.setFont(new java.awt.Font("Monospaced", 1, 100)); // NOI18N
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });
        p5.add(n5, java.awt.BorderLayout.CENTER);

        grid.add(p5);

        p6.setBackground(new java.awt.Color(255, 255, 255));
        p6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p6.setLayout(new java.awt.BorderLayout());

        n6.setFont(new java.awt.Font("Monospaced", 1, 100)); // NOI18N
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });
        p6.add(n6, java.awt.BorderLayout.CENTER);

        grid.add(p6);

        p7.setBackground(new java.awt.Color(255, 255, 255));
        p7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p7.setLayout(new java.awt.BorderLayout());

        n7.setFont(new java.awt.Font("Monospaced", 1, 100)); // NOI18N
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });
        p7.add(n7, java.awt.BorderLayout.CENTER);

        grid.add(p7);

        p8.setBackground(new java.awt.Color(255, 255, 255));
        p8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p8.setLayout(new java.awt.BorderLayout());

        n8.setFont(new java.awt.Font("Monospaced", 1, 100)); // NOI18N
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });
        p8.add(n8, java.awt.BorderLayout.CENTER);

        grid.add(p8);

        p9.setBackground(new java.awt.Color(255, 255, 255));
        p9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p9.setLayout(new java.awt.BorderLayout());

        n9.setFont(new java.awt.Font("Monospaced", 1, 100)); // NOI18N
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });
        p9.add(n9, java.awt.BorderLayout.CENTER);

        grid.add(p9);

        jPanel1.add(grid, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        if (n1.getText() == "") {
            n1.setText(vuoro);
            // Tämä voisi myös olla metodin sisällä
            if (vuoro.equals("X")) {
                n1.setForeground(Color.RED);
            } else {
                n1.setForeground(Color.BLUE);
            }
            tarkistaVoittaja();
            tasapeli();
            tarkistaKenenVuoro();
        }
        
    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        if (n2.getText() == "") {
            n2.setText(vuoro);
            // Tämä voisi myös olla metodin sisällä
            if (vuoro.equals("X")) {
                n2.setForeground(Color.RED);
            } else {
                n2.setForeground(Color.BLUE);
            }
            tarkistaVoittaja();
            tasapeli();
            tarkistaKenenVuoro();
        }
        
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        if (n3.getText() == "") {
            n3.setText(vuoro);
            // Tämä voisi myös olla metodin sisällä
            if (vuoro.equals("X")) {
                n3.setForeground(Color.RED);
            } else {
                n3.setForeground(Color.BLUE);
            }
            tarkistaVoittaja();
            tasapeli();
            tarkistaKenenVuoro();
        }
        
    }//GEN-LAST:event_n3ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        if (n4.getText() == "") {
            n4.setText(vuoro);
            // Tämä voisi myös olla metodin sisällä
            if (vuoro.equals("X")) {
                n4.setForeground(Color.RED);
            } else {
                n4.setForeground(Color.BLUE);
            }
            tarkistaVoittaja();
            tasapeli();
            tarkistaKenenVuoro();
        }
        
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        if (n5.getText() == "") {
            n5.setText(vuoro);
            // Tämä voisi myös olla metodin sisällä
            if (vuoro.equals("X")) {
                n5.setForeground(Color.RED);
            } else {
                n5.setForeground(Color.BLUE);
            }
            tarkistaVoittaja();
            tasapeli();
            tarkistaKenenVuoro();
        }
        
    }//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        if (n6.getText() == "") {
            n6.setText(vuoro);
            // Tämä voisi myös olla metodin sisällä
            if (vuoro.equals("X")) {
                n6.setForeground(Color.RED);
            } else {
                n6.setForeground(Color.BLUE);
            }
            tarkistaVoittaja();
            tasapeli();
            tarkistaKenenVuoro();
        }
        
    }//GEN-LAST:event_n6ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        if (n7.getText() == "") {
            n7.setText(vuoro);
            // Tämä voisi myös olla metodin sisällä
            if (vuoro.equals("X")) {
                n7.setForeground(Color.RED);
            } else {
                n7.setForeground(Color.BLUE);
            }
            tarkistaVoittaja();
            tasapeli();
            tarkistaKenenVuoro();
        }
        
    }//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        if (n8.getText() == "") {
            n8.setText(vuoro);
            // Tämä voisi myös olla metodin sisällä
            if (vuoro.equals("X")) {
                n8.setForeground(Color.RED);
            } else {
                n8.setForeground(Color.BLUE);
            }
            tarkistaVoittaja();
            tasapeli();
            tarkistaKenenVuoro();
        }
        
    }//GEN-LAST:event_n8ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
        if (n9.getText() == "") {
            n9.setText(vuoro);
            // Tämä voisi myös olla metodin sisällä
            if (vuoro.equals("X")) {
                n9.setForeground(Color.RED);
            } else {
                n9.setForeground(Color.BLUE);
            }
            tarkistaVoittaja();
            tasapeli();
            tarkistaKenenVuoro();
        }
        
    }//GEN-LAST:event_n9ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ristinolla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ristinolla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ristinolla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ristinolla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ristinolla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel grid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JPanel p8;
    private javax.swing.JPanel p9;
    private javax.swing.JLabel tulos;
    // End of variables declaration//GEN-END:variables
}
