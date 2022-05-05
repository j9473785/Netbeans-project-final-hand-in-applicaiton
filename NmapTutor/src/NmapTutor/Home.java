/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NmapTutor;

/**
 *
 * @author work
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hometextarea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Homemenu = new javax.swing.JMenu();
        faqsub = new javax.swing.JMenuItem();
        Instructionsmenu = new javax.swing.JMenu();
        NMAPmenu = new javax.swing.JMenu();
        Riskmenu = new javax.swing.JMenu();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Nmap Tutor");

        hometextarea.setEditable(false);
        hometextarea.setColumns(20);
        hometextarea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        hometextarea.setLineWrap(true);
        hometextarea.setRows(5);
        hometextarea.setText("Welcome to the NMAP tutor tool ! Through using this you will be able to understand how to run nmap commands to then understand  how secure your network is . This is done through a question and answer method which keeps the onus of learning on you  ! (so make sure you do not cheat !)\n\n\n\npolicy\n\nMake sure that when you use this tool that you are respectable of other people's networks , DO NOT use the commands that you have learnt to attack others . In addition DO NOT input other people's data into the software unless they have given you permission.\n\n\nNow that has been stated all that is left is for you to enjoy the application and get learning !");
        hometextarea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(hometextarea);

        Homemenu.setText("Home");
        Homemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomemenuMouseClicked(evt);
            }
        });

        faqsub.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        faqsub.setText("FAQ");
        faqsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqsubActionPerformed(evt);
            }
        });
        faqsub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                faqsubKeyPressed(evt);
            }
        });
        Homemenu.add(faqsub);

        jMenuBar1.add(Homemenu);

        Instructionsmenu.setText("Instructions");
        Instructionsmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InstructionsmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(Instructionsmenu);

        NMAPmenu.setText("NMAP");
        NMAPmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NMAPmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(NMAPmenu);

        Riskmenu.setText("Risk assessment");
        Riskmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RiskmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(Riskmenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(138, 138, 138))
        );

        setSize(new java.awt.Dimension(733, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomemenuMouseClicked
        // TODO add your handling code here:
        
        
        
          Home s = new Home();
                s.setVisible(true);
                
                
                  dispose();
                Home ul =new Home();
                ul.setVisible(false);
    }//GEN-LAST:event_HomemenuMouseClicked

    private void InstructionsmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InstructionsmenuMouseClicked
        // TODO add your handling code here:
        
        
         Instructions s = new Instructions();
                s.setVisible(true);
                
                
                  dispose();
                Instructions ul =new Instructions();
                ul.setVisible(false);
    }//GEN-LAST:event_InstructionsmenuMouseClicked

    private void RiskmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiskmenuMouseClicked
        // TODO add your handling code here:
        
        
        Riskassessment s = new Riskassessment();
                s.setVisible(true);
                
                
                  dispose();
                Riskassessment ul =new Riskassessment();
                ul.setVisible(false);
    }//GEN-LAST:event_RiskmenuMouseClicked

    private void faqsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqsubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faqsubActionPerformed

    private void faqsubKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_faqsubKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_faqsubKeyPressed

    private void NMAPmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMAPmenuMouseClicked

 Nmap s = new Nmap();
                s.setVisible(true);
                
                
                  dispose();
                Nmap ul =new Nmap();
                ul.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_NMAPmenuMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Homemenu;
    private javax.swing.JMenu Instructionsmenu;
    private javax.swing.JMenu NMAPmenu;
    private javax.swing.JMenu Riskmenu;
    private javax.swing.JMenuItem faqsub;
    private javax.swing.JTextArea hometextarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}