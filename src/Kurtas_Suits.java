
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Kurtas_Suits extends javax.swing.JFrame {

    /**
     * Creates new form Kurtas_Suits
     */
    public Kurtas_Suits() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        r7 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        r9 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        r10 = new javax.swing.JRadioButton();
        r11 = new javax.swing.JRadioButton();
        r12 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(858, 455));
        setMinimumSize(new java.awt.Dimension(858, 455));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(858, 836));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(858, 836));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(858, 836));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(858, 836));
        jPanel1.setMinimumSize(new java.awt.Dimension(858, 836));
        jPanel1.setPreferredSize(new java.awt.Dimension(858, 836));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IS1.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 90, 183, 275);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IS2.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 90, 187, 269);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IS3.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 90, 195, 259);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IS5.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 460, 187, 270);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Women White Solid Kurta ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 370, 177, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" Price Rs. 3999 (Incl. of all taxes)");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 390, 215, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Women Green & Grey Embroidered Kurta");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(290, 370, 280, 20);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Price Rs. 10799 (Incl. of all taxes)");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(290, 390, 223, 20);

        jButton2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton2.setText("Add to Cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 420, 91, 25);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Size");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 420, 27, 20);

        buttonGroup1.add(r1);
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("S");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        jPanel1.add(r1);
        r1.setBounds(80, 420, 31, 23);

        buttonGroup1.add(r2);
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("M");
        jPanel1.add(r2);
        r2.setBounds(110, 420, 33, 23);

        buttonGroup1.add(r3);
        r3.setForeground(new java.awt.Color(255, 255, 255));
        r3.setText("L");
        jPanel1.add(r3);
        r3.setBounds(140, 420, 31, 23);

        jButton3.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton3.setText("Add to Cart");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(480, 420, 91, 25);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Size");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(310, 420, 27, 20);

        buttonGroup2.add(r4);
        r4.setForeground(new java.awt.Color(255, 255, 255));
        r4.setText("S");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });
        jPanel1.add(r4);
        r4.setBounds(360, 420, 31, 23);

        buttonGroup2.add(r5);
        r5.setForeground(new java.awt.Color(255, 255, 255));
        r5.setText("M");
        jPanel1.add(r5);
        r5.setBounds(390, 420, 33, 23);

        buttonGroup2.add(r6);
        r6.setForeground(new java.awt.Color(255, 255, 255));
        r6.setText("L");
        jPanel1.add(r6);
        r6.setBounds(420, 420, 31, 23);

        jButton4.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton4.setText("Add to Cart");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(730, 410, 91, 25);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Size");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(590, 410, 27, 20);

        buttonGroup3.add(r7);
        r7.setForeground(new java.awt.Color(255, 255, 255));
        r7.setText("S");
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });
        jPanel1.add(r7);
        r7.setBounds(630, 410, 31, 23);

        buttonGroup3.add(r8);
        r8.setForeground(new java.awt.Color(255, 255, 255));
        r8.setText("M");
        jPanel1.add(r8);
        r8.setBounds(660, 410, 33, 23);

        buttonGroup3.add(r9);
        r9.setForeground(new java.awt.Color(255, 255, 255));
        r9.setText("L");
        jPanel1.add(r9);
        r9.setBounds(690, 410, 31, 23);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Size");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(330, 790, 27, 20);

        buttonGroup4.add(r10);
        r10.setForeground(new java.awt.Color(255, 255, 255));
        r10.setText("S");
        r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10ActionPerformed(evt);
            }
        });
        jPanel1.add(r10);
        r10.setBounds(370, 790, 31, 23);

        buttonGroup4.add(r11);
        r11.setForeground(new java.awt.Color(255, 255, 255));
        r11.setText("M");
        jPanel1.add(r11);
        r11.setBounds(400, 790, 33, 23);

        buttonGroup4.add(r12);
        r12.setForeground(new java.awt.Color(255, 255, 255));
        r12.setText("L");
        jPanel1.add(r12);
        r12.setBounds(430, 790, 31, 23);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Price Rs. 9999 (Incl. of all taxes)");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 760, 215, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Women White Solid Kurta");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(590, 360, 173, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Women Pink Embroidered Kurta");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(330, 740, 217, 20);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" Price Rs. 5799 (Incl. of all taxes)");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(590, 380, 215, 20);

        jButton6.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton6.setText("Add to Cart");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(480, 790, 91, 25);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("KURTIS");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 20, 160, 51);

        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setText("Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(620, 30, 76, 27);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r10ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r7ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try {
            Class.forName("java.sql.DriverManager");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapp", "root", "");
            String i_code="", item_name = "", size = "", type = "", price = "", sql;
            
            sql = "select * from products where i_code=224;";
            System.out.print(sql);
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No such record exists");
            } else {
                price = rs.getString("price");
                i_code = rs.getString("i_code");
                type = rs.getString("type");
                item_name = rs.getString("item_name");
                
            }
            
            int price1 = Integer.parseInt(price);
            int i_code1 = Integer.parseInt(i_code);
            
            if (r1.isSelected())
                    size="S";
            if (r2.isSelected())
                    size="M";
             if (r3.isSelected())
                     size="L";
          
            sql = "Insert into cart Values("+i_code1+",'"+item_name+"','"+type+"','"+size+"',"+price1+");" ; 
         System.out.print(sql);
         st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }JOptionPane.showMessageDialog(this,"This item has been added to your cart");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try {
            Class.forName("java.sql.DriverManager");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapp", "root", "");
            String i_code="", item_name = "", size = "", type = "", price = "", sql;
                        sql = "select * from products where i_code=225;";
            System.out.print(sql);
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No such record exists");
            } else {
                price = rs.getString("price");
                i_code = rs.getString("i_code");
                type = rs.getString("type");
                item_name = rs.getString("item_name");
                
            }
            
            int price1 = Integer.parseInt(price);
            int i_code1 = Integer.parseInt(i_code);
            
            if (r4.isSelected())
                    size="S";
            if (r5.isSelected())
                    size="M";
             if (r6.isSelected())
                     size="L";
          
            sql = "Insert into cart Values("+i_code1+",'"+item_name+"','"+type+"','"+size+"',"+price1+");" ; 
         System.out.print(sql);
         st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } JOptionPane.showMessageDialog(this,"This item has been added to your cart");       // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try {
            Class.forName("java.sql.DriverManager");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapp", "root", "");
            String i_code="", item_name = "", size = "", type = "", price = "", sql;
            
            sql = "select * from products where i_code=226;";
            System.out.print(sql);
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No such record exists");
            } else {
                price = rs.getString("price");
                i_code = rs.getString("i_code");
                type = rs.getString("type");
                item_name = rs.getString("item_name");
                
            }
            
            int price1 = Integer.parseInt(price);
            int i_code1 = Integer.parseInt(i_code);
            
            if (r7.isSelected())
                    size="S";
            if (r8.isSelected())
                    size="M";
             if (r9.isSelected())
                     size="L";
          
            sql = "Insert into cart Values("+i_code1+",'"+item_name+"','"+type+"','"+size+"',"+price1+");" ; 
         System.out.print(sql);
         st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } JOptionPane.showMessageDialog(this,"This item has been added to your cart");       // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
try {
            Class.forName("java.sql.DriverManager");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapp", "root", "");
            String i_code="", item_name = "", size = "", type = "", price = "", sql;
            
            sql = "select * from products where i_code=227;";
            System.out.print(sql);
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "No such record exists");
            } else {
                price = rs.getString("price");
                i_code = rs.getString("i_code");
                type = rs.getString("type");
                item_name = rs.getString("item_name");
                
            }
            
            int price1 = Integer.parseInt(price);
            int i_code1 = Integer.parseInt(i_code);
            
            if (r10.isSelected())
                    size="S";
            if (r11.isSelected())
                    size="M";
             if (r11.isSelected())
                     size="L";
          
            sql = "Insert into cart Values("+i_code1+",'"+item_name+"','"+type+"','"+size+"',"+price1+");" ; 
         System.out.print(sql);
         st.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } JOptionPane.showMessageDialog(this,"This item has been added to your cart");       // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
billing_section obj=new billing_section();
obj.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kurtas_Suits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kurtas_Suits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kurtas_Suits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kurtas_Suits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Kurtas_Suits().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r10;
    private javax.swing.JRadioButton r11;
    private javax.swing.JRadioButton r12;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r8;
    private javax.swing.JRadioButton r9;
    // End of variables declaration//GEN-END:variables
}
