
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
public class Sweaters_sweatshirts extends javax.swing.JFrame {

    /**
     * Creates new form Sweaters_sweatshirts
     */
    public Sweaters_sweatshirts() {
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
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        r2 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        r9 = new javax.swing.JRadioButton();
        r10 = new javax.swing.JRadioButton();
        r11 = new javax.swing.JRadioButton();
        r12 = new javax.swing.JRadioButton();
        r13 = new javax.swing.JRadioButton();
        r14 = new javax.swing.JRadioButton();
        r15 = new javax.swing.JRadioButton();
        r16 = new javax.swing.JRadioButton();
        r17 = new javax.swing.JRadioButton();
        r18 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(859, 444));
        setMinimumSize(new java.awt.Dimension(859, 444));
        setPreferredSize(new java.awt.Dimension(859, 444));
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(842, 821));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(842, 821));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(842, 821));

        jPanel1.setBackground(new java.awt.Color(118, 104, 104));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(842, 821));
        jPanel1.setMinimumSize(new java.awt.Dimension(842, 821));
        jPanel1.setPreferredSize(new java.awt.Dimension(842, 821));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sw1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 110, 208, 230);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ss2.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 460, 198, 224);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ss3.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(550, 460, 225, 225);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sw2.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 110, 183, 230);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ss1.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 460, 225, 225);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sw3.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(560, 120, 198, 225);

        jButton18.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton18.setText("Add to Cart");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);
        jButton18.setBounds(200, 400, 90, 25);

        jButton19.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton19.setText("Add to Cart");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);
        jButton19.setBounds(460, 400, 90, 25);

        jButton20.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton20.setText("Add to Cart");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);
        jButton20.setBounds(720, 400, 91, 25);

        jButton21.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton21.setText("Add to Cart");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);
        jButton21.setBounds(200, 740, 90, 25);

        jButton22.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton22.setText("Add to Cart");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);
        jButton22.setBounds(450, 740, 91, 25);

        jButton23.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton23.setText("Add to Cart");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);
        jButton23.setBounds(710, 740, 90, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Men Black Woollen Sweater");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 350, 200, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Men Grey Woollen Sweater");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 350, 210, 16);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sports sweatshirt with a hood");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 690, 220, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Solid Green Army Shade Sweatshirt");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 690, 250, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Grey Solid Sweatshirt");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(560, 350, 180, 20);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Solid Black Sweatshirt");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(550, 690, 160, 20);

        buttonGroup1.add(r2);
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("M");
        jPanel1.add(r2);
        r2.setBounds(120, 400, 33, 23);

        buttonGroup1.add(r1);
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("S");
        jPanel1.add(r1);
        r1.setBounds(90, 400, 31, 23);

        buttonGroup1.add(r3);
        r3.setForeground(new java.awt.Color(255, 255, 255));
        r3.setText("L");
        jPanel1.add(r3);
        r3.setBounds(150, 400, 31, 23);

        buttonGroup2.add(r4);
        r4.setForeground(new java.awt.Color(255, 255, 255));
        r4.setText("S");
        jPanel1.add(r4);
        r4.setBounds(350, 400, 31, 23);

        buttonGroup2.add(r5);
        r5.setForeground(new java.awt.Color(255, 255, 255));
        r5.setText("M");
        jPanel1.add(r5);
        r5.setBounds(380, 400, 33, 23);

        buttonGroup2.add(r6);
        r6.setForeground(new java.awt.Color(255, 255, 255));
        r6.setText("L");
        jPanel1.add(r6);
        r6.setBounds(410, 400, 31, 23);

        buttonGroup3.add(r7);
        r7.setForeground(new java.awt.Color(255, 255, 255));
        r7.setText("S");
        jPanel1.add(r7);
        r7.setBounds(610, 400, 31, 23);

        buttonGroup3.add(r8);
        r8.setForeground(new java.awt.Color(255, 255, 255));
        r8.setText("L");
        jPanel1.add(r8);
        r8.setBounds(670, 400, 31, 23);

        buttonGroup3.add(r9);
        r9.setForeground(new java.awt.Color(255, 255, 255));
        r9.setText("M");
        jPanel1.add(r9);
        r9.setBounds(640, 400, 33, 23);

        buttonGroup4.add(r10);
        r10.setForeground(new java.awt.Color(255, 255, 255));
        r10.setText("S");
        jPanel1.add(r10);
        r10.setBounds(90, 740, 31, 23);

        buttonGroup4.add(r11);
        r11.setForeground(new java.awt.Color(255, 255, 255));
        r11.setText("L");
        jPanel1.add(r11);
        r11.setBounds(150, 740, 31, 23);

        buttonGroup4.add(r12);
        r12.setForeground(new java.awt.Color(255, 255, 255));
        r12.setText("M");
        jPanel1.add(r12);
        r12.setBounds(120, 740, 33, 23);

        buttonGroup6.add(r13);
        r13.setForeground(new java.awt.Color(255, 255, 255));
        r13.setText("S");
        jPanel1.add(r13);
        r13.setBounds(600, 740, 31, 23);

        buttonGroup6.add(r14);
        r14.setForeground(new java.awt.Color(255, 255, 255));
        r14.setText("L");
        jPanel1.add(r14);
        r14.setBounds(660, 740, 31, 23);

        buttonGroup6.add(r15);
        r15.setForeground(new java.awt.Color(255, 255, 255));
        r15.setText("M");
        jPanel1.add(r15);
        r15.setBounds(630, 740, 33, 23);

        buttonGroup5.add(r16);
        r16.setForeground(new java.awt.Color(255, 255, 255));
        r16.setText("S");
        jPanel1.add(r16);
        r16.setBounds(350, 740, 31, 23);

        buttonGroup5.add(r17);
        r17.setForeground(new java.awt.Color(255, 255, 255));
        r17.setText("L");
        jPanel1.add(r17);
        r17.setBounds(410, 740, 31, 23);

        buttonGroup5.add(r18);
        r18.setForeground(new java.awt.Color(255, 255, 255));
        r18.setText("M");
        jPanel1.add(r18);
        r18.setBounds(380, 740, 33, 23);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Price Rs 2000 Incl. of all taxes");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(50, 370, 210, 20);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Price Rs 1500 Incl. of all taxes");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(310, 370, 210, 20);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Price Rs 1800 Incl. of all taxes");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(560, 370, 210, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Price Rs 2000 Incl. of all taxes");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(50, 710, 210, 20);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Price Rs 1500 Incl. of all taxes");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(310, 710, 210, 20);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Price Rs 1900 Incl. of all taxes");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(550, 710, 210, 20);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 34)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SWEATERS AND SWEATSHIRTS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 20, 580, 56);

        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setText("Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(660, 40, 70, 27);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Size");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(570, 400, 30, 14);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("Size");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(310, 400, 30, 20);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("Size");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(560, 740, 30, 20);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setText("Size");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(310, 740, 30, 20);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setText("Size");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(50, 740, 30, 20);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("Size");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(50, 400, 30, 20);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 840, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapp","root","");
String i_code="",item_name="",sql ,size="",price="",type="";

sql="select * from products where i_code = 110;";
//System.out.print(sql);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(sql);
if(!rs.next())
    JOptionPane.showMessageDialog(null,"no such record");
else{

i_code=rs.getString("i_code");
item_name=rs.getString("item_name");
price=rs.getString("price");
type=rs.getString("type");
}
int price1=Integer.parseInt(price);

int i_code1=Integer.parseInt(i_code);
if(r1.isSelected())
    size="S";
if(r2.isSelected())
    size="M";
if(r3.isSelected())
    size="L";
sql="insert into cart values ("+i_code1+", '"+item_name+"','"+type+"','"+size+"',"+price1+");";
System.out.print(sql);
st.executeUpdate(sql);


}    
catch(Exception e)
{  JOptionPane.showMessageDialog(null,"Error"+e.getMessage());

}JOptionPane.showMessageDialog(this,"This item has been added to your cart");            // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapp","root","");
String i_code="",item_name="",sql ,size="",price="",type="";

sql="select * from products where i_code = 111;";
//System.out.print(sql);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(sql);
if(!rs.next())
    JOptionPane.showMessageDialog(null,"no such record");
else{

i_code=rs.getString("i_code");
item_name=rs.getString("item_name");
price=rs.getString("price");
type=rs.getString("type");
}
int price1=Integer.parseInt(price);

int i_code1=Integer.parseInt(i_code);
if(r4.isSelected())
    size="S";
if(r5.isSelected())
    size="M";
if(r6.isSelected())
    size="L";
sql="insert into cart values ("+i_code1+", '"+item_name+"','"+type+"','"+size+"',"+price1+");";
System.out.print(sql);
st.executeUpdate(sql);


}    
catch(Exception e)
{  JOptionPane.showMessageDialog(null,"Error"+e.getMessage());

}JOptionPane.showMessageDialog(this,"This item has been added to your cart");            // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapp","root","");
String i_code="",item_name="",sql ,size="",price="",type="";

sql="select * from products where i_code = 115;";
//System.out.print(sql);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(sql);
if(!rs.next())
    JOptionPane.showMessageDialog(null,"no such record");
else{

i_code=rs.getString("i_code");
item_name=rs.getString("item_name");
price=rs.getString("price");
type=rs.getString("type");
}
int price1=Integer.parseInt(price);

int i_code1=Integer.parseInt(i_code);
if(r7.isSelected())
    size="S";
if(r8.isSelected())
    size="M";
if(r9.isSelected())
    size="L";
sql="insert into cart values ("+i_code1+", '"+item_name+"','"+type+"','"+size+"',"+price1+");";
System.out.print(sql);
st.executeUpdate(sql);


}    
catch(Exception e)
{  JOptionPane.showMessageDialog(null,"Error"+e.getMessage());

}JOptionPane.showMessageDialog(this,"This item has been added to your cart");            // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapp","root","");
String i_code="",item_name="",sql ,size="",price="",type="";

sql="select * from products where i_code = 114;";
//System.out.print(sql);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(sql);
if(!rs.next())
    JOptionPane.showMessageDialog(null,"no such record");
else{

i_code=rs.getString("i_code");
item_name=rs.getString("item_name");
price=rs.getString("price");
type=rs.getString("type");
}
int price1=Integer.parseInt(price);

int i_code1=Integer.parseInt(i_code);
if(r10.isSelected())
    size="S";
if(r11.isSelected())
    size="M";
if(r12.isSelected())
    size="L";
sql="insert into cart values ("+i_code1+", '"+item_name+"','"+type+"','"+size+"',"+price1+");";
System.out.print(sql);
st.executeUpdate(sql);


}    
catch(Exception e)
{  JOptionPane.showMessageDialog(null,"Error"+e.getMessage());

}JOptionPane.showMessageDialog(this,"This item has been added to your cart");            // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapp","root","");
String i_code="",item_name="",sql ,size="",price="",type="";

sql="select * from products where i_code = 112;";
//System.out.print(sql);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(sql);
if(!rs.next())
    JOptionPane.showMessageDialog(null,"no such record");
else{

i_code=rs.getString("i_code");
item_name=rs.getString("item_name");
price=rs.getString("price");
type=rs.getString("type");
}
int price1=Integer.parseInt(price);

int i_code1=Integer.parseInt(i_code);
if(r16.isSelected())
    size="S";
if(r18.isSelected())
    size="M";
if(r17.isSelected())
    size="L";
sql="insert into cart values ("+i_code1+", '"+item_name+"','"+type+"','"+size+"',"+price1+");";
System.out.print(sql);
st.executeUpdate(sql);


}    
catch(Exception e)
{  JOptionPane.showMessageDialog(null,"Error"+e.getMessage());

}JOptionPane.showMessageDialog(this,"This item has been added to your cart");            // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
try{
Class.forName("java.sql.DriverManager");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaapp","root","");
String i_code="",item_name="",sql ,size="",price="",type="";

sql="select * from products where i_code = 120;";
//System.out.print(sql);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(sql);
if(!rs.next())
    JOptionPane.showMessageDialog(null,"no such record");
else{

i_code=rs.getString("i_code");
item_name=rs.getString("item_name");
price=rs.getString("price");
type=rs.getString("type");
}
int price1=Integer.parseInt(price);

int i_code1=Integer.parseInt(i_code);
if(r13.isSelected())
    size="S";
if(r15.isSelected())
    size="M";
if(r14.isSelected())
    size="L";
sql="insert into cart values ("+i_code1+", '"+item_name+"','"+type+"','"+size+"',"+price1+");";
System.out.print(sql);
st.executeUpdate(sql);


}    
catch(Exception e)
{  JOptionPane.showMessageDialog(null,"Error"+e.getMessage());

}JOptionPane.showMessageDialog(this,"This item has been added to your cart");            // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

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
            java.util.logging.Logger.getLogger(Sweaters_sweatshirts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sweaters_sweatshirts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sweaters_sweatshirts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sweaters_sweatshirts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Sweaters_sweatshirts().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r10;
    private javax.swing.JRadioButton r11;
    private javax.swing.JRadioButton r12;
    private javax.swing.JRadioButton r13;
    private javax.swing.JRadioButton r14;
    private javax.swing.JRadioButton r15;
    private javax.swing.JRadioButton r16;
    private javax.swing.JRadioButton r17;
    private javax.swing.JRadioButton r18;
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
