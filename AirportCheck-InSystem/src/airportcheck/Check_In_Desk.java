    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airportcheck;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohd Samir
 */
public class Check_In_Desk extends javax.swing.JFrame {
    int n =1;
         ArrayList<Check_In_Desk> checkqueueList;
         
    String header2 [] = new String [] {"  "};
    DefaultTableModel dftm25;
    int row, col;
    /**
     * Creates new form Check_In_Desk
     */
    public Check_In_Desk() {
        initComponents();
          checkqueueList =  new ArrayList<>();
       dftm25 = new DefaultTableModel(header2,0);
       jTable1.setModel(dftm25);
         this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 187, 232));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 780));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Check In Desk");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(472, 21, 287, 44);

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 150, 130, 40);

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(610, 150, 120, 40);

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(800, 150, 130, 40);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 132, 220), 3));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(410, 210, 530, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // multithreading
        Waiting_Queue waq= new Waiting_Queue();
        String firstname=waq.data[0];
        String lastname= waq.data[1];
        String firstname1= waq.data[2];
        String lastname1=waq.data[3];
        Baggage_Details1 bd = new Baggage_Details1();
        int excessBg = bd.array[2];
        int bagwt = bd.array[0];
        int bgfee= bd.array[3];
    //    System.out.println("1 "+firstname+" 2  "+lastname+"  3  "+excessBg+"  4 "+bagwt+"  5 "+bgfee);
        WaitingPass wpss= new WaitingPass();
        MultithreadingUse t1= new MultithreadingUse(wpss, firstname, lastname, excessBg, bagwt, bgfee);
      //   MultithreadingUse t2= new MultithreadingUse(wpss, firstname, lastname, excessBg, bagwt, bgfee);
       // MultithreadingUse t2= new MultithreadingUse(wpss, firstname, lastname, excessBg, bagwt, bgfee);
       // MultithreadingUse t1 = new MultithreadingUse(wpss, null, WIDTH, WIDTH, WIDTH);
        t1.start();
        WaitingPass pp = new WaitingPass();
        pp.checkInBag(firstname, lastname, excessBg, bagwt, bgfee);
        CheckCountForQueue csq = new CheckCountForQueue();
            int waitingInQueue = csq.checkCount();
        if(waitingInQueue<=bagwt && bagwt > 20){
        dftm25.insertRow(dftm25.getRowCount(), new Object[]{"Desk"+MultithreadingUse.noOfObjects+" \n "+ firstname +" "+lastname+ " is dropping off " + excessBg+ " bag of "+bagwt+" kg. A baggage fee of £"+bgfee+" is due."});
        }else{
            dftm25.insertRow(dftm25.getRowCount(),new Object[]{ "Desk"+MultithreadingUse.noOfObjects+" "+firstname +" "+lastname+ " is dropping off "+excessBg+" bag of "+bagwt+" kg. No baggage fee is due."} );
        }
        
            try {
                 String filepath = "C:\\Users\\Mohd Samir\\Documents\\NetBeansProjects\\AirportCheck-InSystem\\src\\airportcheck\\test2.csv";
          File file = new File(filepath);
          if(!file.exists()){
              file.createNewFile();
          }
                FileWriter fw = new FileWriter(file.getAbsoluteFile());// fileToSave
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    for (int j = 0; j < jTable1.getColumnCount(); j++) {
                        //write
                        bw.write(jTable1.getValueAt(i, j).toString()); // toString+" , "
                    }
                    bw.newLine();//record per line 
                }
              //  JOptionPane.showMessageDialog(this, "SUCCESSFULLY LOADED","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                bw.close();
                fw.close();
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(this, "ERROR","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         HomePage2 hp6 = new HomePage2();
       hp6.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    AirportCheckInSystem acs = new AirportCheckInSystem();
      this.dispose();
        
          
            
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // mouse click
       
//            try {
//                 String filepath = "C:\\Users\\Mohd Samir\\Documents\\NetBeansProjects\\AirportCheck-InSystem\\src\\airportcheck\\test.csv";
//          File file = new File(filepath);
//          if(!file.exists()){
//              file.createNewFile();
//          }
//                FileWriter fw = new FileWriter(file.getAbsoluteFile());// fileToSave
//                BufferedWriter bw = new BufferedWriter(fw);
//                for (int i = 0; i < jTable1.getRowCount(); i++) {
//                    for (int j = 0; j < jTable1.getColumnCount(); j++) {
//                        //write
//                        bw.write(jTable1.getValueAt(i, j).toString()); // toString+" , "
//                    }
//                    bw.newLine();//record per line 
//                }
//                JOptionPane.showMessageDialog(this, "SUCCESSFULLY LOADED","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
//                bw.close();
//                fw.close();
//            } catch (IOException ex) {
//               JOptionPane.showMessageDialog(this, "ERROR","ERROR MESSAGE",JOptionPane.ERROR_MESSAGE);
//            }
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Check_In_Desk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_In_Desk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_In_Desk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_In_Desk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_In_Desk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}