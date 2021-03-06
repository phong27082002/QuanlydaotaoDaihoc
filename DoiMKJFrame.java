
package com.mycompany.gui;

import com.mycompany.entyti.Admin;
import com.mycompany.entyti.GiaoVien;
import com.mycompany.entyti.SinhVien;
import com.mycompany.utills.XImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class DoiMKJFrame extends javax.swing.JFrame {
    
    ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
    ArrayList<GiaoVien> listGV = new ArrayList<GiaoVien>();
    ArrayList<Admin> ListAd = new ArrayList<Admin>();
    
    SinhVien sv;
    GiaoVien gv;
    Admin ad;
    
    int index1;
    int index2;
    int index3;
    
    void init() {
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("ĐỔI MẬT KHẨU");
        
    }
    public DoiMKJFrame() {
        initComponents();
        init();
        index1 = ManHinhSvJFrame.a;
        index2 = ManHinhGvJFrame.b;
        index3 = ManhinhAdJFrame.c;
        try {
            File sinhVien = new File("Danhsachsv.csv");
            File giaoVien =new File("Danhsachgv.csv");
            File Admin = new File("DanhsachAd.csv");
            Scanner myReader1 = new Scanner(sinhVien);
            Scanner myReader2 = new Scanner(giaoVien);
            Scanner myReader3 = new Scanner(Admin);
            
            while(myReader1.hasNext()){
                String line = myReader1.nextLine();
                String[] lineSplit = line.split(";");
                String ms = lineSplit[0].trim();
                String ten = lineSplit[1].trim();
                String gt = lineSplit[2].trim();
                String ns = lineSplit[3].trim();
                String k = lineSplit[4].trim();
                String dc = lineSplit[5].trim();
                String sdt = lineSplit[6].trim();
                String mk = lineSplit[7].trim();
                sv = new SinhVien(ms, ten,  gt, ns, k,  dc,  sdt, mk);
                this.listSV.add(sv);
            }
            myReader1.close();
            
            while(myReader2.hasNext()){
                String line = myReader2.nextLine();
                String[] lineSplit = line.split(";");
                String ms = lineSplit[0].trim();
                String ten = lineSplit[1].trim();
                String gt = lineSplit[2].trim();
                String k = lineSplit[3].trim();
                String dc = lineSplit[4].trim();
                String sdt = lineSplit[5].trim();
                String mk = lineSplit[6].trim();
                gv = new GiaoVien(ms, ten,  gt,  k,  dc,  sdt, mk);
                this.listGV.add(gv);
            }
            myReader2.close();
            
            while(myReader3.hasNext()){
                String line = myReader3.nextLine();
                String[] lineSplit = line.split(";");
                String tk = lineSplit[0].trim();
                String mk = lineSplit[1].trim();
                ad = new Admin(tk,mk);
                this.ListAd.add(ad);

            }
            myReader3.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        this.sv = listSV.get(index1);
        this.gv = listGV.get(index2);
        this.ad = ListAd.get(index3);
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
        jLabel2 = new javax.swing.JLabel();
        OkjButton = new javax.swing.JButton();
        ThoatjButton = new javax.swing.JButton();
        MKCjPasswordField = new javax.swing.JPasswordField();
        MKMjPasswordField = new javax.swing.JPasswordField();
        TBjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mật khẩu mới :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mật khẩu cũ :");

        OkjButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OkjButton.setForeground(new java.awt.Color(0, 51, 153));
        OkjButton.setText("OK");
        OkjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkjButtonActionPerformed(evt);
            }
        });

        ThoatjButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ThoatjButton.setForeground(new java.awt.Color(0, 51, 153));
        ThoatjButton.setText("Thoát");
        ThoatjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatjButtonActionPerformed(evt);
            }
        });

        MKCjPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MKCjPasswordFieldActionPerformed(evt);
            }
        });

        MKMjPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MKMjPasswordFieldActionPerformed(evt);
            }
        });

        TBjLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TBjLabel.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(OkjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(ThoatjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TBjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MKCjPasswordField)
                            .addComponent(MKMjPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MKCjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MKMjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OkjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThoatjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TBjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void checkSv() {
        if(MKCjPasswordField.getText().equals(this.sv.getMk())) {
            this.sv.setMk(MKMjPasswordField.getText());
            listSV.set(index1,this.sv);
            try{

            File file =new File("Danhsachsv.csv");
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter("Danhsachsv.csv");

            for(SinhVien  WList : listSV){
                fw.write(WList.toString()+"\n");
            }

            fw.close();

            }
            catch(IOException e){
                System.out.println("Exception occurred:");
                e.printStackTrace();
            }
            TBjLabel.setText("Đổi mật khẩu thành công");
        }
        
    }
    public void checkGv() {
        if(MKCjPasswordField.getText().equals(this.gv.getMk())) {
            this.gv.setMk(MKMjPasswordField.getText());
            listGV.set(index2,this.gv);
            try{           
            File file =new File("Danhsachgv.csv");
            if(!file.exists()){
            file.createNewFile();
            }

            FileWriter fw = new FileWriter("Danhsachgv.csv");
            
            for(GiaoVien  WList : listGV){
                fw.write(WList.toString()+"\n");            }

            fw.close();

            }
            catch(IOException ioe){
                System.out.println("Exception occurred:");
            
            }
            TBjLabel.setText("Đổi mật khẩu thành công");
        }
    }
    public void checkAd() {
        if(MKCjPasswordField.getText().equals(this.ad.getMk())) {
            this.ad.setMk(MKMjPasswordField.getText());
            ListAd.set(index3, this.ad);
            try{           
            File file =new File("DanhsachAd.csv");
            if(!file.exists()){
            file.createNewFile();
            }

            FileWriter fw = new FileWriter("DanhsachAd.csv");
            
            for(Admin  WList : ListAd){
                fw.write(WList.toString()+"\n");            }

            fw.close();

            }
            catch(IOException ioe){
                System.out.println("Exception occurred:");
            
            }
            TBjLabel.setText("Đổi mật khẩu thành công");
        }
    }
    private void ThoatjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatjButtonActionPerformed
        this.dispose();
        
        
    }//GEN-LAST:event_ThoatjButtonActionPerformed

    private void OkjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkjButtonActionPerformed
        checkSv();
        checkGv();
        checkAd();
    }//GEN-LAST:event_OkjButtonActionPerformed

    private void MKMjPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MKMjPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MKMjPasswordFieldActionPerformed

    private void MKCjPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MKCjPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MKCjPasswordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(DoiMKJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMKJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMKJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMKJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMKJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField MKCjPasswordField;
    private javax.swing.JPasswordField MKMjPasswordField;
    private javax.swing.JButton OkjButton;
    private javax.swing.JLabel TBjLabel;
    private javax.swing.JButton ThoatjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
