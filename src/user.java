
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SULEIGOLDEN
 */
public class user extends javax.swing.JFrame {

    Connection conn;
      //Connection con;
    ResultSet rs ;
    PreparedStatement pst;
    
    static  String cadidate_reg_no;
    static String cadidate_name;

    /**
     * Creates new form user
     */
    public user() {
        initComponents();
        conn=conect_data.conect();
        
       this.setLocationRelativeTo ( null );
       this.setResizable(false);
       setIcon();
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
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_reg_no = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/test2.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Get Started");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Type In Your Name :");

        txt_reg_no.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_reg_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_reg_noActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear Test Memory");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View High Score");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 203, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(179, 179, 179))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_reg_no)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_reg_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
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

    public void insert_newcandidate(){
        Random rnd = new Random();
        int num = rnd.nextInt(20 * 22);
        String rg_no = String.format("%s","S" + num);
         try{
           String sqll ="INSERT INTO candidate_start(Name,Reg_no) VALUES (?,?)";
            pst=conn.prepareStatement(sqll);
            pst.setString(1, txt_reg_no.getText());
            pst.setString(2, rg_no);
            pst.execute();
            //JOptionPane.showMessageDialog(null,"Saved");
            //txt_reg_no.setText("");
            
            this.setCadidate_name( txt_reg_no.getText());
            this.setCadidate_reg_no(rg_no);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
        try{
            pst.close();
          // conn.close();
        }catch(Exception e){
          
        }
     }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
        if(txt_reg_no.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please Type in your Name");
        }else{
        String value1 = txt_reg_no.getText();
        try{
           
             String sql ="select * from candidate_start where Name ='"+value1+"' ";
              pst=conn.prepareStatement(sql);
              rs=pst.executeQuery();
             if(rs.next()){
                    //String add1 =rs.getString("Name");
                    //String add2 =rs.getString("Reg_no");
                    //user us = new user();
                    JOptionPane.showMessageDialog(null,"The Name Has Already  Been Use Please select another user name or clear The test Memory and try again!");
                    
                    
                    
            
             }else{
                    clear_start_test();
                    insert_newcandidate();
                    newtest ntest = new newtest();
                    ntest.setVisible(true);
                    dispose();
             }
        }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
        }finally{
        try{
            pst.close();
          // conn.close();
        }catch(Exception e){
          
        }
     }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_reg_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_reg_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_reg_noActionPerformed

    public void clear_all_result(){
         String sql ="DELETE FROM test_result";
            try{
                pst=conn.prepareStatement(sql);
               
                pst.execute();
                //JOptionPane.showMessageDialog(null,"Deleted");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
            try{
                pst.close();
                // conn.close();
            }catch(Exception e){

            }
        }
           
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int delet=JOptionPane.showConfirmDialog(this, "Are you sure you want to DELETE All Records ?",
            "Atencion", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(delet==0){
            String sql ="DELETE FROM candidate_start";
            try{
                pst=conn.prepareStatement(sql);
               
                pst.execute();
                clear_all_result();
                JOptionPane.showMessageDialog(null,"Deleted");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
            try{
                pst.close();
                // conn.close();
            }catch(Exception e){

            }
        }
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       high_scores hs = new high_scores();
       hs.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    public void clear_mark_test(){
         String sql ="DELETE FROM mark_test";
            try{
                pst=conn.prepareStatement(sql);
                pst.execute();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
            try{
                pst.close();
                // conn.close();
            }catch(Exception e){

            }
        }
    }
    public void clear_start_test(){
         String sql ="DELETE FROM start_test";
            try{
                pst=conn.prepareStatement(sql);
               
                pst.execute();
                clear_mark_test();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
            try{
                pst.close();
                // conn.close();
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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_reg_no;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cadidate_reg_no
     */
    public String getCadidate_reg_no() {
        return cadidate_reg_no;
    }

    /**
     * @param cadidate_reg_no the cadidate_reg_no to set
     */
    public void setCadidate_reg_no(String cadidate_reg_no) {
        this.cadidate_reg_no = cadidate_reg_no;
    }

    /**
     * @return the cadidate_name
     */
    public String getCadidate_name() {
        return cadidate_name;
    }

    /**
     * @param cadidate_name the cadidate_name to set
     */
    public void setCadidate_name(String cadidate_name) {
        this.cadidate_name = cadidate_name;
    }
}
