
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SULEIGOLDEN
 */
public class allcandidateresult extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs ;
    PreparedStatement pst;
    int v1  = 0 ;
    int v2  = 0;
    int v3 = 0;
    int v4  = 0;
    int v5  = 0;
    int v6  = 0;
    int v7  = 0;
    int v8  = 0;
    int v9  = 0;
    int v10  = 0;       
    /**
     * Creates new form allcandidateresult
     */
    public allcandidateresult() {
        initComponents();
        conn=conect_data.conect();
        set_progressbar();
        set_progressbar2();
        get_candidate_result();
        final_candidate_test_score();
        update_result();
        clear_start_test();
        setIcon() ;
        this.setLocationRelativeTo ( null );
        this.setResizable(false);
    }
     private void setIcon() {
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images2.jpg")));  
    }
 public void get_candidate_result(){
        admin st = new admin();
           String value1 = st.getId();
        try{
     
             String sql ="select * from test_result where Reg_no ='"+value1+"' ";
              pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                    String add1 =rs.getString("id");
                    String add2 =rs.getString("Name");
                    lb_name.setText(add2);
                    String add3 =rs.getString("Reg_no");
                    lb_reg_no.setText(add3);
                    String add4 =rs.getString("passing");
                    String add5 =rs.getString("obtain");
                    
                    String add6 =rs.getString("total_question");
                    lb_total_question.setText(add6);
                    String add7 =rs.getString("answered_correct");
                    lb_correct.setText(add7);
                    String add8 =rs.getString("answered_incorrect");
                    lb_incorrect.setText(add8);
                    String add9 =rs.getString("score");
                    lb_score.setText(add9);
                    String add10 =rs.getString("result");
                    lb_result.setText(add10);
                    String add11 =rs.getString("subject");
                    lb_subject.setText(add11);
                    
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
    public void set_progressbar(){
      
         jProgressBar3.setStringPainted(true);
        
         UIDefaults defaults = new UIDefaults();
            defaults.put("ProgressBar[Enabled].foregroundPainter", new MyPainter(Color.RED));
            defaults.put("ProgressBar[Enabled+Finished].foregroundPainter", new MyPainter(Color.RED));

            jProgressBar3.putClientProperty("Nimbus.Overrides.InheritDefaults", Boolean.TRUE);
            jProgressBar3.putClientProperty("Nimbus.Overrides", defaults);
           admin st = new admin();
           String value1 = st.getId();
        try{
     
             String sql ="select * from test_result where Reg_no ='"+value1+"' ";
              pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                    
                    String add4 =rs.getString("passing");
                      
                      int i=Integer.parseInt(add4) * 2;

                      jProgressBar3.setValue(i);
                    
                  
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
    
     public void set_progressbar2(){
       jProgressBar2.setStringPainted(true);
         UIDefaults defaults = new UIDefaults();
            defaults.put("ProgressBar[Enabled].foregroundPainter", new MyPainter(Color.GREEN));
            defaults.put("ProgressBar[Enabled+Finished].foregroundPainter", new MyPainter(Color.GREEN));

            jProgressBar2.putClientProperty("Nimbus.Overrides.InheritDefaults", Boolean.TRUE);
            jProgressBar2.putClientProperty("Nimbus.Overrides", defaults);

           
             admin st = new admin();
           String value1 = st.getId();
        try{
     
             String sql ="select * from test_result where Reg_no ='"+value1+"' ";
              pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
             if(rs.next()){
                    
                   
                    String add5 =rs.getString("obtain");  
                      int i=Integer.parseInt(add5);

                      jProgressBar2.setValue(i);
                    
                  
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
      public void final_candidate_test_score(){
        try{

            String sql ="select * from Grade ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){

                String add1 =rs.getString("Distinct1");
                String add2 =rs.getString("Distinct2");
                String add3 =rs.getString("Excellent1");
                String add4 =rs.getString("Excellent2");
                String add5 =rs.getString("Good1");
                String add6 =rs.getString("Good2");
                String add7 =rs.getString("Pass1");
                String add8 =rs.getString("Pass2");
                String add9 =rs.getString("Fail1");
                String add10 =rs.getString("Fail2");
                
                v1 = Integer.parseInt(add1);
                v2 = Integer.parseInt(add2);
                v3 = Integer.parseInt(add3);
                v4 = Integer.parseInt(add4);
                v5 = Integer.parseInt(add5);
                v6 = Integer.parseInt(add6);
                v7 = Integer.parseInt(add7);
                v8 = Integer.parseInt(add8);
                v9 = Integer.parseInt(add9);
                v10 =Integer.parseInt(add10);
                
               // starttest st = new starttest();
                 //st.setCnadidate_fnlscore(yes_final);
               
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
        
         int get_final_score=Integer.parseInt(lb_score.getText());
                
                if(get_final_score >=v1){
                   lb_result.setText("(A) PASS");
                }else if(get_final_score >=v3 && get_final_score <v1){
                   lb_result.setText("(B) PASS");
                }else if(get_final_score>=v5 && get_final_score<v3){
                  lb_result.setText("(C) PASS");
                }else if(get_final_score>=v7 && get_final_score<v5){
                    lb_result.setText("(P) PASS");
                }else {
                    lb_result.setText("(F) FAIL");
                }
    }
        public void clear_start_test(){
           try{
            String sql ="DELETE FROM start_test";
            pst=conn.prepareStatement(sql);
            pst.execute();
            //JOptionPane.showMessageDialog(null,"Deleted");
        }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
        }finally{
        try{ 
            pst.close();
        }catch(Exception e){
            
        }
    }
      }
   public void update_result(){
       
        try{
           
            String value1 = lb_result.getText();
            String value2 = lb_reg_no.getText();
           

            String sql="update test_result set result='"+value1+"' where Reg_no='"+value2+"' ";
            pst=conn.prepareStatement(sql);
            pst.execute();
            //JOptionPane.showMessageDialog(null,"Updated");
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
        lb_reg_no = new javax.swing.JLabel();
        lb_name = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_total_question = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        lb_score = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lb_result = new javax.swing.JLabel();
        lb_correct = new javax.swing.JLabel();
        lb_incorrect = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lb_subject = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Candidate Name : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Registration No :");

        lb_reg_no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_reg_no.setText("..................................................................................................................................");

        lb_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_name.setText("..................................................................................................................................");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Exam Result");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Number Answered Incorrectly :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Number Answered Correctly :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Total No of Question :");

        lb_total_question.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_total_question.setText("............");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 5));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Passing");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Obtained");

        jProgressBar2.setBackground(new java.awt.Color(0, 102, 0));
        jProgressBar2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jProgressBar2.setForeground(new java.awt.Color(0, 0, 153));
        jProgressBar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jProgressBar3.setBackground(new java.awt.Color(0, 0, 153));
        jProgressBar3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jProgressBar3.setForeground(new java.awt.Color(255, 255, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Exam Score :");

        lb_score.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_score.setText("00000");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("/   Result :");

        lb_result.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_result.setText(".........");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                            .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(lb_score)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_result, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(lb_result))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lb_score)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lb_correct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_correct.setText("............");

        lb_incorrect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_incorrect.setText("............");

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(302, 302, 302))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        lb_subject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_subject.setText("................................................................................................");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Subject : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(lb_total_question)
                .addGap(209, 209, 209)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(lb_correct, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_incorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_reg_no)
                            .addComponent(lb_name)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lb_subject))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_name))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lb_reg_no))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_subject)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lb_correct))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lb_incorrect)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lb_total_question))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        printComponenet();
    }//GEN-LAST:event_jButton2ActionPerformed
 public void printComponenet(){

  PrinterJob pj = PrinterJob.getPrinterJob();
  pj.setJobName(" Print Component ");

  pj.setPrintable (new Printable() {    
    public int print(Graphics pg, PageFormat pf, int pageNum){
      if (pageNum > 0){
      return Printable.NO_SUCH_PAGE;
      }

      Graphics2D g2 = (Graphics2D) pg;
      g2.translate(pf.getImageableX(), pf.getImageableY());
      jPanel1.paint(g2);
      return Printable.PAGE_EXISTS;
    }
  });
  if (pj.printDialog() == false)
  return;

  try {
        pj.print();
  } catch (PrinterException ex) {
        // handle exception
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
            java.util.logging.Logger.getLogger(allcandidateresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allcandidateresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allcandidateresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allcandidateresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allcandidateresult().setVisible(true);
            }
        });
    }
    class MyPainter implements Painter<JProgressBar> {

    private final Color color;

    public MyPainter(Color c1) {
        this.color = c1;
    }
    @Override
    public void paint(Graphics2D gd, JProgressBar t, int width, int height) {
        gd.setColor(color);
        gd.fillRect(0, 0, width, height);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JLabel lb_correct;
    private javax.swing.JLabel lb_incorrect;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_reg_no;
    private javax.swing.JLabel lb_result;
    private javax.swing.JLabel lb_score;
    private javax.swing.JLabel lb_subject;
    private javax.swing.JLabel lb_total_question;
    // End of variables declaration//GEN-END:variables
}
