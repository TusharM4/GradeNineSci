/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lessonplan;

import javax.swing.JOptionPane;

/**
 *
 * @author Tushar
 */
public class Grade extends javax.swing.JFrame {

    /**
     * Creates new form Grade
     */
    public Grade() {
        initComponents();
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
        Title = new javax.swing.JLabel();
        HowtoUse = new javax.swing.JButton();
        Class = new javax.swing.JLabel();
        note = new javax.swing.JLabel();
        grads = new javax.swing.JLabel();
        Gr9 = new javax.swing.JButton();
        Gr10 = new javax.swing.JButton();
        Gr11 = new javax.swing.JButton();
        Gr12 = new javax.swing.JButton();
        hat = new javax.swing.JLabel();
        hat2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Title.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 255));
        Title.setText("Online Science Class");

        HowtoUse.setBackground(new java.awt.Color(0, 204, 255));
        HowtoUse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HowtoUse.setText("How To Use");
        HowtoUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HowtoUseActionPerformed(evt);
            }
        });

        Class.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Class.setForeground(new java.awt.Color(0, 255, 255));
        Class.setText("Mrs.Rymal's Class");

        note.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        note.setForeground(new java.awt.Color(255, 0, 0));
        note.setText("If you are in Mrs.Rymal's Grade 9 class, select grade 9");

        grads.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/celebration.png"))); // NOI18N

        Gr9.setBackground(new java.awt.Color(0, 204, 255));
        Gr9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Gr9.setText("Grade 9");
        Gr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gr9ActionPerformed(evt);
            }
        });

        Gr10.setBackground(new java.awt.Color(0, 204, 255));
        Gr10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Gr10.setText("Grade 10");
        Gr10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gr10ActionPerformed(evt);
            }
        });

        Gr11.setBackground(new java.awt.Color(0, 204, 255));
        Gr11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Gr11.setText("Grade 11");
        Gr11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gr11ActionPerformed(evt);
            }
        });

        Gr12.setBackground(new java.awt.Color(0, 204, 255));
        Gr12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Gr12.setText("Grade 12");
        Gr12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gr12ActionPerformed(evt);
            }
        });

        hat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/diploma.jpg"))); // NOI18N

        hat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/diploma.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(HowtoUse)
                .addGap(35, 35, 35)
                .addComponent(Title)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(Gr9)
                .addGap(81, 81, 81)
                .addComponent(Gr10)
                .addGap(88, 88, 88)
                .addComponent(Gr11)
                .addGap(71, 71, 71)
                .addComponent(Gr12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(hat2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(Class)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hat)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(note)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(grads)
                        .addGap(91, 91, 91))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Title))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(HowtoUse, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(hat))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Class))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hat2)))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gr9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gr10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gr11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gr12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(note, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(grads)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HowtoUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HowtoUseActionPerformed
        new HowtoUse().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HowtoUseActionPerformed

    private void Gr10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gr10ActionPerformed
        JOptionPane.showMessageDialog(null,"You are not in this grade!");
    }//GEN-LAST:event_Gr10ActionPerformed

    private void Gr11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gr11ActionPerformed
        JOptionPane.showMessageDialog(null,"You are not in this grade!");
    }//GEN-LAST:event_Gr11ActionPerformed

    private void Gr12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gr12ActionPerformed
        JOptionPane.showMessageDialog(null,"You are not in this grade!");
    }//GEN-LAST:event_Gr12ActionPerformed

    private void Gr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gr9ActionPerformed
        new Unitselect().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Gr9ActionPerformed

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
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Class;
    private javax.swing.JButton Gr10;
    private javax.swing.JButton Gr11;
    private javax.swing.JButton Gr12;
    private javax.swing.JButton Gr9;
    private javax.swing.JButton HowtoUse;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel grads;
    private javax.swing.JLabel hat;
    private javax.swing.JLabel hat2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel note;
    // End of variables declaration//GEN-END:variables
}
