
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SULEIGOLDEN
 */
public class newtest extends javax.swing.JFrame {
   Connection conn;
      //Connection con;
    ResultSet rs ;
    PreparedStatement pst;
     static String subject_test_time;
    
     static String table_content;
    
    static String cadidate_test_reg_no;
    static String cadidate_test_name;
    /**
     * Creates new form newtest
     */
    public newtest() {
        initComponents();
        conn=conect_data.conect();
        set_subject_name();
        //get_subcomboitems();
        set_candidatename();
       
        this.setLocationRelativeTo ( null );
        this.setResizable(false);
        setIcon();
    }

    public void set_candidatename(){
        user us = new user();
        lb_candidate_name.setText(us.getCadidate_name());
    }
     private void setIcon() {
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images2.jpg")));  
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
        jPanel2 = new javax.swing.JPanel();
        bt_test1 = new javax.swing.JButton();
        bt_test2 = new javax.swing.JButton();
        bt_test3 = new javax.swing.JButton();
        bt_test4 = new javax.swing.JButton();
        bt_test5 = new javax.swing.JButton();
        bt_test6 = new javax.swing.JButton();
        bt_test7 = new javax.swing.JButton();
        bt_test8 = new javax.swing.JButton();
        bt_test16 = new javax.swing.JButton();
        bt_test15 = new javax.swing.JButton();
        bt_test14 = new javax.swing.JButton();
        bt_test13 = new javax.swing.JButton();
        bt_test12 = new javax.swing.JButton();
        bt_test11 = new javax.swing.JButton();
        bt_test10 = new javax.swing.JButton();
        bt_test9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_candidate_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Subject", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        bt_test1.setBackground(new java.awt.Color(0, 0, 102));
        bt_test1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test1.setForeground(new java.awt.Color(255, 255, 255));
        bt_test1.setText("Test 1");
        bt_test1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test1ActionPerformed(evt);
            }
        });

        bt_test2.setBackground(new java.awt.Color(0, 0, 102));
        bt_test2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test2.setForeground(new java.awt.Color(255, 255, 255));
        bt_test2.setText("Test 1");
        bt_test2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test2ActionPerformed(evt);
            }
        });

        bt_test3.setBackground(new java.awt.Color(0, 0, 102));
        bt_test3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test3.setForeground(new java.awt.Color(255, 255, 255));
        bt_test3.setText("Test 1");
        bt_test3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test3ActionPerformed(evt);
            }
        });

        bt_test4.setBackground(new java.awt.Color(0, 0, 102));
        bt_test4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test4.setForeground(new java.awt.Color(255, 255, 255));
        bt_test4.setText("Test 1");
        bt_test4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test4ActionPerformed(evt);
            }
        });

        bt_test5.setBackground(new java.awt.Color(0, 0, 102));
        bt_test5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test5.setForeground(new java.awt.Color(255, 255, 255));
        bt_test5.setText("Test 1");
        bt_test5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test5ActionPerformed(evt);
            }
        });

        bt_test6.setBackground(new java.awt.Color(0, 0, 102));
        bt_test6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test6.setForeground(new java.awt.Color(255, 255, 255));
        bt_test6.setText("Test 1");
        bt_test6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test6ActionPerformed(evt);
            }
        });

        bt_test7.setBackground(new java.awt.Color(0, 0, 102));
        bt_test7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test7.setForeground(new java.awt.Color(255, 255, 255));
        bt_test7.setText("Test 1");
        bt_test7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test7ActionPerformed(evt);
            }
        });

        bt_test8.setBackground(new java.awt.Color(0, 0, 102));
        bt_test8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test8.setForeground(new java.awt.Color(255, 255, 255));
        bt_test8.setText("Test 1");
        bt_test8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test8ActionPerformed(evt);
            }
        });

        bt_test16.setBackground(new java.awt.Color(0, 0, 102));
        bt_test16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test16.setForeground(new java.awt.Color(255, 255, 255));
        bt_test16.setText("Test 1");
        bt_test16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test16ActionPerformed(evt);
            }
        });

        bt_test15.setBackground(new java.awt.Color(0, 0, 102));
        bt_test15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test15.setForeground(new java.awt.Color(255, 255, 255));
        bt_test15.setText("Test 1");
        bt_test15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test15ActionPerformed(evt);
            }
        });

        bt_test14.setBackground(new java.awt.Color(0, 0, 102));
        bt_test14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test14.setForeground(new java.awt.Color(255, 255, 255));
        bt_test14.setText("Test 1");
        bt_test14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test14ActionPerformed(evt);
            }
        });

        bt_test13.setBackground(new java.awt.Color(0, 0, 102));
        bt_test13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test13.setForeground(new java.awt.Color(255, 255, 255));
        bt_test13.setText("Test 1");
        bt_test13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test13ActionPerformed(evt);
            }
        });

        bt_test12.setBackground(new java.awt.Color(0, 0, 102));
        bt_test12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test12.setForeground(new java.awt.Color(255, 255, 255));
        bt_test12.setText("Test 1");
        bt_test12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test12ActionPerformed(evt);
            }
        });

        bt_test11.setBackground(new java.awt.Color(0, 0, 102));
        bt_test11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test11.setForeground(new java.awt.Color(255, 255, 255));
        bt_test11.setText("Test 1");
        bt_test11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test11ActionPerformed(evt);
            }
        });

        bt_test10.setBackground(new java.awt.Color(0, 0, 102));
        bt_test10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test10.setForeground(new java.awt.Color(255, 255, 255));
        bt_test10.setText("Test 1");
        bt_test10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test10ActionPerformed(evt);
            }
        });

        bt_test9.setBackground(new java.awt.Color(0, 0, 102));
        bt_test9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_test9.setForeground(new java.awt.Color(255, 255, 255));
        bt_test9.setText("Test 1");
        bt_test9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_test9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_test1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(bt_test2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_test9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_test16, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_test9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_test10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_test11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_test12)
                        .addGap(18, 18, 18)
                        .addComponent(bt_test13)
                        .addGap(18, 18, 18)
                        .addComponent(bt_test14)
                        .addGap(18, 18, 18)
                        .addComponent(bt_test15)
                        .addGap(18, 18, 18)
                        .addComponent(bt_test16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bt_test1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_test2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_test3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_test4)
                        .addGap(18, 18, 18)
                        .addComponent(bt_test5)
                        .addGap(18, 18, 18)
                        .addComponent(bt_test6)
                        .addGap(18, 18, 18)
                        .addComponent(bt_test7)
                        .addGap(18, 18, 18)
                        .addComponent(bt_test8)))
                .addGap(28, 28, 28))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Hi");

        lb_candidate_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_candidate_name.setForeground(new java.awt.Color(0, 0, 102));
        lb_candidate_name.setText(".......................................................................................................................");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("SELECT YOUR TEST CATEGORY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_candidate_name, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_candidate_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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

    /**
     * @return the part_no
     */
    public static String getsubject_test_time() {
        return subject_test_time;
    }

    /**
     * @param aPart_no the part_no to set
     */
    public static void setsubject_test_time(String actsubject_test_time) {
        subject_test_time = actsubject_test_time;
    }
     /**
     * @return the part_no
     */
    public static String gettable_value() {
        return table_content;
    }

    /**
     * @param aPart_no the part_no to set
     */
    public static void settable_value(String act_table_content) {
        table_content = act_table_content;
    }
    private void bt_test1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test1ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test1.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_one";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test1ActionPerformed
 private void set_subject_name(){  
        try{
            String sql ="select * from addsubject";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            while(rs.next()){
                String name1 =rs.getString("subject_one");
                bt_test1.setText(name1);
                
                String name2 =rs.getString("subject_two");
                bt_test2.setText(name2);
                
                String name3 =rs.getString("subject_three");
                bt_test3.setText(name3);
                
                String name4 =rs.getString("subject_four");
                bt_test4.setText(name4);
                
                String name5 =rs.getString("subject_five");
                bt_test5.setText(name5);
                
                String name6 =rs.getString("subject_six");
                bt_test6.setText(name6);
                
                String name7 =rs.getString("subject_seven");
                bt_test7.setText(name7);
                
                String name8 =rs.getString("subject_eight");
                bt_test8.setText(name8);
                
                String name9 =rs.getString("subject_nine");
                bt_test9.setText(name9);
                
                String name10 =rs.getString("subject_ten");
                bt_test10.setText(name10);
                
                String name11 =rs.getString("subject_eleven");
                bt_test11.setText(name11);
                
                String name12 =rs.getString("subject_twelve");
                bt_test12.setText(name12);
                
                String name13 =rs.getString("subject_thirteen");
                bt_test13.setText(name13);
               
                String name14 =rs.getString("subject_fourteen");
                bt_test14.setText(name14);
                
                String name15 =rs.getString("subject_fifteen");
                bt_test15.setText(name15);
                
                String name16 =rs.getString("subject_sixteen");
                bt_test16.setText(name16);
                
            }
           
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }finally{
        try{
           
            pst.close();
        }catch(Exception e){
            
         }
        }
    }
    private void bt_test2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test2ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test2.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_two";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test2ActionPerformed

    private void bt_test3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test3ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test3.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_three";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test3ActionPerformed

    private void bt_test4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test4ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test4.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_four";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test4ActionPerformed

    private void bt_test5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test5ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test5.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_five";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test5ActionPerformed

    private void bt_test6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test6ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test6.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_six";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test6ActionPerformed

    private void bt_test7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test7ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test7.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_seven";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test7ActionPerformed

    private void bt_test8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test8ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test8.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_eight";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test8ActionPerformed

    private void bt_test16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test16ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test16.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_sixteen";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test16ActionPerformed

    private void bt_test15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test15ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test15.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_fifteen";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test15ActionPerformed

    private void bt_test14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test14ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test14.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_fourteen";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test14ActionPerformed

    private void bt_test13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test13ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test13.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_thirteen";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test13ActionPerformed

    private void bt_test12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test12ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test12.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_twelve";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test12ActionPerformed

    private void bt_test11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test11ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test11.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_eleven";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test11ActionPerformed

    private void bt_test10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test10ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test10.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_ten";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test10ActionPerformed

    private void bt_test9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_test9ActionPerformed
        user us = new user();
        newtest nt = new newtest();
        nt.setCadidate_test_name(us.getCadidate_name());
        nt.setCadidate_test_reg_no(us.getCadidate_reg_no());
        String btsub6 = bt_test9.getText();
        newtest.setsubject_test_time(btsub6);
        String tab_value = "subject_nine";
        newtest.settable_value(tab_value);

        intuction stopen = new intuction();
        stopen.setVisible(true);
        dispose();
    }//GEN-LAST:event_bt_test9ActionPerformed
   public void disablebnt(){
       if(bt_test1.getText().equals("Test 1")){bt_test1.setEnabled(false);}if(bt_test2.getText().equals("Test 1")){bt_test2.setEnabled(false); }
       if(bt_test3.getText().equals("Test 1")){bt_test3.setEnabled(false);} if(bt_test4.getText().equals("Test 1")){bt_test4.setEnabled(false);}
       if(bt_test5.getText().equals("Test 1")){bt_test5.setEnabled(false);} if(bt_test1.getText().equals("Test 1")){bt_test1.setEnabled(false);} 
       if(bt_test2.getText().equals("Test 1")){bt_test2.setEnabled(false);} if(bt_test3.getText().equals("Test 1")){bt_test3.setEnabled(false);}
       if(bt_test4.getText().equals("Test 1")){bt_test4.setEnabled(false);} if(bt_test5.getText().equals("Test 1")){bt_test5.setEnabled(false);}
   } 
public void get_subcomboitems(){        
//         ComboBoxModel model = suject_combo.getModel();
//                int size = model.getSize();
//                for(int i=0; i < size; i++) {
//                    Object element = model.getElementAt(i);
//                   // System.out.println("Element at " + i + " = " + element);
//                    switch(i){
//                        case 0:bt_test1.setText(String.format("%s",element)); break;
//                        case 1:bt_test2.setText(String.format("%s",element)); break;
//                        case 2:bt_test3.setText(String.format("%s",element)); break;
//                        case 3:bt_test4.setText(String.format("%s",element)); break;
//                        case 4:bt_test5.setText(String.format("%s",element)); break;
//                        case 5:bt_test1.setText(String.format("%s",element)); break;
//                        case 6:bt_test2.setText(String.format("%s",element)); break;
//                        case 7:bt_test3.setText(String.format("%s",element)); break;
//                        case 8:bt_test4.setText(String.format("%s",element)); break;
//                        case 9:bt_test5.setText(String.format("%s",element)); break;
//                    }
//                   
//                }
//               disablebnt();
              // suject_combo.setVisible(false);
    } 
   
      private void Fill_suject(){  
        try{
            String sql ="select * from addsubject";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            while(rs.next()){
                String name =rs.getString("subject_Name");
              //  suject_combo.addItem(name);
            }
           
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }finally{
        try{
            rs.close();
            pst.close();
        }catch(Exception e){
            
         }
        }
    }
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
            java.util.logging.Logger.getLogger(newtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newtest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_test1;
    private javax.swing.JButton bt_test10;
    private javax.swing.JButton bt_test11;
    private javax.swing.JButton bt_test12;
    private javax.swing.JButton bt_test13;
    private javax.swing.JButton bt_test14;
    private javax.swing.JButton bt_test15;
    private javax.swing.JButton bt_test16;
    private javax.swing.JButton bt_test2;
    private javax.swing.JButton bt_test3;
    private javax.swing.JButton bt_test4;
    private javax.swing.JButton bt_test5;
    private javax.swing.JButton bt_test6;
    private javax.swing.JButton bt_test7;
    private javax.swing.JButton bt_test8;
    private javax.swing.JButton bt_test9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_candidate_name;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cadidate_test_reg_no
     */
    public String getCadidate_test_reg_no() {
        return cadidate_test_reg_no;
    }

    /**
     * @param cadidate_test_reg_no the cadidate_test_reg_no to set
     */
    public void setCadidate_test_reg_no(String cadidate_test_reg_no) {
        this.cadidate_test_reg_no = cadidate_test_reg_no;
    }

    /**
     * @return the cadidate_test_name
     */
    public String getCadidate_test_name() {
        return cadidate_test_name;
    }

    /**
     * @param cadidate_test_name the cadidate_test_name to set
     */
    public void setCadidate_test_name(String cadidate_test_name) {
        this.cadidate_test_name = cadidate_test_name;
    }
}