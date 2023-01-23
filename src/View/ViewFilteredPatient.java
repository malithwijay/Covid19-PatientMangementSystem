/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author malith
 */
public class ViewFilteredPatient extends javax.swing.JFrame {

    /**
     * Creates new form AddPatient
     */
    public ViewFilteredPatient() {
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
        jLabel1 = new javax.swing.JLabel();
        BtnViewFilteredPatientCancel = new javax.swing.JButton();
        BtnViewFilteredPatientRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblViewFilteredPatientDetails = new javax.swing.JTable();
        BtnViewFilteredPatientRefresh1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtered Patient Details");

        BtnViewFilteredPatientCancel.setBackground(new java.awt.Color(255, 0, 0));
        BtnViewFilteredPatientCancel.setForeground(new java.awt.Color(255, 255, 255));
        BtnViewFilteredPatientCancel.setText("Cancel");
        BtnViewFilteredPatientCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnViewFilteredPatientCancelMouseClicked(evt);
            }
        });

        BtnViewFilteredPatientRefresh.setBackground(new java.awt.Color(102, 102, 255));
        BtnViewFilteredPatientRefresh.setForeground(new java.awt.Color(255, 255, 255));
        BtnViewFilteredPatientRefresh.setText("Refresh");

        TblViewFilteredPatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIC", "Name", "Admitted Date", "Quarantine Period", "Discharge Date"
            }
        ));
        TblViewFilteredPatientDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblViewFilteredPatientDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblViewFilteredPatientDetails);

        BtnViewFilteredPatientRefresh1.setBackground(new java.awt.Color(102, 102, 255));
        BtnViewFilteredPatientRefresh1.setForeground(new java.awt.Color(255, 255, 255));
        BtnViewFilteredPatientRefresh1.setText("Delete Hightest Value");
        BtnViewFilteredPatientRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewFilteredPatientRefresh1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Goto Developer Note");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnViewFilteredPatientRefresh1)
                        .addGap(18, 18, 18)
                        .addComponent(BtnViewFilteredPatientCancel)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnViewFilteredPatientRefresh)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BtnViewFilteredPatientRefresh)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnViewFilteredPatientCancel)
                    .addComponent(BtnViewFilteredPatientRefresh1)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setForeground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnViewFilteredPatientCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnViewFilteredPatientCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_BtnViewFilteredPatientCancelMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        insertDataToHeap();
        refreshTable();
        developerNote=developerNote+maxHeap.printToDevelopper();
    }//GEN-LAST:event_formWindowOpened

    private void refreshTable()
    {
        DefaultTableModel tmodel = (DefaultTableModel)TblViewFilteredPatientDetails.getModel();
        tmodel.setRowCount(0);
        int[] values = maxHeap.printView();
        for(int c=0;c<getHeapSize();c++)
        {
            if(values[c]!=0)
            {
                try {
                    ResultSet rs = db.selectData("select * from tb_patient where QuarantinePeriod = '"+String.valueOf(values[c])+"'");
                    while(rs.next())
                    {
                        String nic = rs.getString("NIC");
                        String name = rs.getString("Name");
                        String adDate = String.valueOf(rs.getDate("AdmittedDate"));
                        String qPeriod = String.valueOf(values[c]);
                        String disDate = String.valueOf(rs.getDate("DischargeDate"));
                        String[] tbData={nic,name,adDate,qPeriod,disDate};
                        tmodel.addRow(tbData);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Unable to Load Details Refresh and Try Again","Error..!",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    private void TblViewFilteredPatientDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblViewFilteredPatientDetailsMouseClicked
        // TODO add your handling code here:
        if(TblViewFilteredPatientDetails.getRowCount()>=0)
        {
            int row = TblViewFilteredPatientDetails.getSelectedRow();
            int i = JOptionPane.showConfirmDialog(this, "Are you sure to remove this data ? ","Confirm",JOptionPane.YES_NO_OPTION);
            if(i==0)
            {
                int selectedNumber = Integer.parseInt(TblViewFilteredPatientDetails.getValueAt(row, 3).toString());
                developerNote=developerNote+"\n Removing Element : "+maxHeap.deleteNode(selectedNumber)+"\n";
                developerNote=developerNote+maxHeap.printToDevelopper();
                refreshTable();
                JOptionPane.showMessageDialog(this, developerNote);
            }
        }
    }//GEN-LAST:event_TblViewFilteredPatientDetailsMouseClicked

    private void BtnViewFilteredPatientRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewFilteredPatientRefresh1ActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "Are you sure to remove this data ? ","Confirm",JOptionPane.YES_NO_OPTION);
        if(i==0)
        {
            developerNote=developerNote+"\n Removing Element : "+maxHeap.deleteRootNode()+"\n";
            developerNote=developerNote+maxHeap.printToDevelopper();
            refreshTable();
        }        
    }//GEN-LAST:event_BtnViewFilteredPatientRefresh1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        DevelopperView form=new DevelopperView();
        form.getText(developerNote);
        form.setVisible(true);
        
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked
    String developerNote="";
    DatabaseController db = new DatabaseController();
    private int getHeapSize()
    {
        int size=0;
        ResultSet rs = db.selectData("select count(NIC) as count from tb_patient");
        try {
            while(rs.next())
            {
                size = rs.getInt("count");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return size;
    }
    private void insertDataToHeap()
    {
        ResultSet rs=db.selectData("select QuarantinePeriod as qp from tb_patient");
        try {
            while(rs.next())
            {
                maxHeap.insert(rs.getInt("qp"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning...!",JOptionPane.WARNING_MESSAGE);
        }
    }
    Heap maxHeap = new Heap((getHeapSize()+1));
    
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
            java.util.logging.Logger.getLogger(ViewFilteredPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFilteredPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFilteredPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFilteredPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFilteredPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnViewFilteredPatientCancel;
    private javax.swing.JButton BtnViewFilteredPatientRefresh;
    private javax.swing.JButton BtnViewFilteredPatientRefresh1;
    private javax.swing.JTable TblViewFilteredPatientDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}