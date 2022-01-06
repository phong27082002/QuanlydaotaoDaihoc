
package com.mycompany.gui;

import com.mycompany.entyti.LopHoc;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class QuanLyLopJPanel extends javax.swing.JPanel {

    ArrayList<LopHoc> listLop = new ArrayList<LopHoc>();
    LopHoc l;
    
    public QuanLyLopJPanel() {
        initComponents();
        try {
            File file = new File("DanhsachLop.csv");
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String tenL = lineSplit[0].trim();
                String ss = lineSplit[1].trim();
                String kh = lineSplit[2].trim();
                l = new LopHoc(tenL,ss,kh);
                this.listLop.add(l);

            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        taoBangLop();
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
        QLLjTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TenLjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SSjTextField = new javax.swing.JTextField();
        KhoajTextField = new javax.swing.JTextField();
        ThemjButton = new javax.swing.JButton();
        LuujButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ LỚP");

        QLLjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên lớp", "Sĩ số", "Khoa"
            }
        ));
        jScrollPane1.setViewportView(QLLjTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tên lớp");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Sĩ số");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Khoa");

        ThemjButton.setBackground(new java.awt.Color(255, 0, 0));
        ThemjButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ThemjButton.setText("Thêm");
        ThemjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemjButtonActionPerformed(evt);
            }
        });

        LuujButton.setBackground(new java.awt.Color(255, 0, 0));
        LuujButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LuujButton.setText("Lưu");
        LuujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuujButtonActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(552, 552, 552)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SSjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenLjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KhoajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(ThemjButton)
                        .addGap(100, 100, 100)
                        .addComponent(LuujButton)
                        .addGap(89, 89, 89)
                        .addComponent(jButton3)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenLjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SSjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(KhoajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemjButton)
                    .addComponent(LuujButton)
                    .addComponent(jButton3))
                .addGap(108, 108, 108))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ThemjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemjButtonActionPerformed
        String tenL = this.TenLjTextField.getText();
        String ss = this.SSjTextField.getText();
        String kh = this.KhoajTextField.getText();
        l = new LopHoc(tenL,ss,kh);
        this.listLop.add(l);
        DefaultTableModel model = (DefaultTableModel) QLLjTable.getModel();
        String noi = tenL + ";" + ss + ";" +kh;
        model.addRow(noi.split(";"));
    }//GEN-LAST:event_ThemjButtonActionPerformed

    private void LuujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuujButtonActionPerformed
        try{           
            File file =new File("DanhsachLop.csv");
           if(!file.exists()){
            file.createNewFile();
            }

            FileWriter fw = new FileWriter("DanhsachLop.csv");
            
            for(LopHoc  WList : listLop){
                fw.write(WList.toString()+"\n");            }

            fw.close();

        }
        catch(IOException ioe){
            System.out.println("Exception occurred:");
            
        }
        try {
            File file = new File("DanhsachLop.csv");
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String line = reader.nextLine();
                String[] lineSplit = line.split(";");
                String tenL = lineSplit[0].trim();
                String ss = lineSplit[1].trim();
                String kh = lineSplit[2].trim();

            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_LuujButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.listLop.remove(QLLjTable.getSelectedRow());
        taoBangLop();
    }//GEN-LAST:event_jButton3ActionPerformed
    public void taoBangLop()
    {
        DefaultTableModel m = (DefaultTableModel)QLLjTable.getModel();
        m.getDataVector().removeAllElements();
        m.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(m); 
        QLLjTable.setRowSorter(sorter);  
        for(LopHoc i:listLop)
        {
            m.addRow(i.toArray());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField KhoajTextField;
    private javax.swing.JButton LuujButton;
    private javax.swing.JTable QLLjTable;
    private javax.swing.JTextField SSjTextField;
    private javax.swing.JTextField TenLjTextField;
    private javax.swing.JButton ThemjButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
