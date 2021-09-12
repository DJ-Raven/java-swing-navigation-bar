package com.raven.main;

import com.raven.form.Form1;
import com.raven.form.Form2;
import com.raven.form.Form3;
import com.raven.form.Form4;
import com.raven.form.Form5;
import com.raven.swing.EventNavigationBar;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        getContentPane().setBackground(new Color(240, 240, 240));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/com/raven/icon/item1.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/com/raven/icon/item2.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/com/raven/icon/item3.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/com/raven/icon/item4.png")));
        navigationBar1.addItem(new ImageIcon(getClass().getResource("/com/raven/icon/item5.png")));
        navigationBar1.addEvent(new EventNavigationBar() {
            @Override
            public void beforeSelected(int index) {
                if (index == 0) {
                    panelTransaction1.display(new Form1(), navigationBar1.getAnimator());
                } else if (index == 1) {
                    panelTransaction1.display(new Form2(), navigationBar1.getAnimator());
                } else if (index == 2) {
                    panelTransaction1.display(new Form3(), navigationBar1.getAnimator());
                } else if (index == 3) {
                    panelTransaction1.display(new Form4(), navigationBar1.getAnimator());
                } else if (index == 4) {
                    panelTransaction1.display(new Form5(), navigationBar1.getAnimator());
                }
            }

            @Override
            public void afterSelected(int index) {

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationBar1 = new com.raven.swing.NavigationBar();
        panelTransaction1 = new com.raven.transaction.PanelTransaction();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout navigationBar1Layout = new javax.swing.GroupLayout(navigationBar1);
        navigationBar1.setLayout(navigationBar1Layout);
        navigationBar1Layout.setHorizontalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        navigationBar1Layout.setVerticalGroup(
            navigationBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTransaction1, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
            .addComponent(navigationBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTransaction1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(navigationBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        navigationBar1.initSelectedIndex(2);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.NavigationBar navigationBar1;
    private com.raven.transaction.PanelTransaction panelTransaction1;
    // End of variables declaration//GEN-END:variables
}
