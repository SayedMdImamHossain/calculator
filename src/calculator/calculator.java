/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author FAHIM
 */
public class calculator extends javax.swing.JFrame {

    /**
     * Creates new form calculator
     */
    
    double firstnum;
    double secondnum;
    double result;
    String op;
    
    public calculator() {
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

        jPanel2 = new javax.swing.JPanel();
        jtxtresult = new javax.swing.JTextField();
        jbtnPM = new javax.swing.JButton();
        jbtnBS = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnPLUS = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnMINUS = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnMUL = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnEQ = new javax.swing.JButton();
        jbtnDIV = new javax.swing.JButton();
        jbtnDOT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Made by Imam");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        setSize(new java.awt.Dimension(74, 74));
        setType(java.awt.Window.Type.UTILITY);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtresult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtresult.setForeground(new java.awt.Color(0, 0, 153));
        jtxtresult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtresultActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 60));

        jbtnPM.setBackground(new java.awt.Color(0, 0, 0));
        jbtnPM.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnPM.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPM.setText("+/-");
        jbtnPM.setActionCommand("");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 70, 50));

        jbtnBS.setBackground(new java.awt.Color(102, 102, 102));
        jbtnBS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnBS.setForeground(new java.awt.Color(0, 0, 204));
        jbtnBS.setText(">");
        jbtnBS.setActionCommand("");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 50));

        jbtnCE.setBackground(new java.awt.Color(102, 255, 102));
        jbtnCE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnCE.setForeground(new java.awt.Color(255, 255, 102));
        jbtnCE.setText("CE");
        jbtnCE.setActionCommand("");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 70, 50));

        jbtnC.setBackground(new java.awt.Color(153, 153, 153));
        jbtnC.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnC.setForeground(new java.awt.Color(255, 0, 51));
        jbtnC.setText("C");
        jbtnC.setActionCommand("");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 70, 50));

        jbtnDigit7.setBackground(new java.awt.Color(0, 0, 255));
        jbtnDigit7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.setActionCommand("");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 50));

        jbtnDigit9.setBackground(new java.awt.Color(0, 0, 204));
        jbtnDigit9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.setActionCommand("");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 70, 50));

        jbtnPLUS.setBackground(new java.awt.Color(0, 0, 0));
        jbtnPLUS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnPLUS.setForeground(new java.awt.Color(153, 51, 255));
        jbtnPLUS.setText("+");
        jbtnPLUS.setActionCommand("");
        jbtnPLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPLUSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPLUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 70, 50));

        jbtnDigit8.setBackground(new java.awt.Color(0, 0, 204));
        jbtnDigit8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.setActionCommand("");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 70, 50));

        jbtnDigit4.setBackground(new java.awt.Color(0, 0, 204));
        jbtnDigit4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.setActionCommand("");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 70, 50));

        jbtnDigit6.setBackground(new java.awt.Color(0, 0, 204));
        jbtnDigit6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.setActionCommand("");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 70, 50));

        jbtnMINUS.setBackground(new java.awt.Color(0, 0, 0));
        jbtnMINUS.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnMINUS.setForeground(new java.awt.Color(51, 51, 255));
        jbtnMINUS.setText("-");
        jbtnMINUS.setActionCommand("");
        jbtnMINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMINUSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMINUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 70, 50));

        jbtnDigit5.setBackground(new java.awt.Color(0, 0, 204));
        jbtnDigit5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.setActionCommand("");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, 50));

        jbtnDigit1.setBackground(new java.awt.Color(0, 0, 204));
        jbtnDigit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.setActionCommand("");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 70, 50));

        jbtnDigit3.setBackground(new java.awt.Color(0, 0, 204));
        jbtnDigit3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.setActionCommand("");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 70, 50));

        jbtnMUL.setBackground(new java.awt.Color(0, 0, 0));
        jbtnMUL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnMUL.setForeground(new java.awt.Color(51, 204, 255));
        jbtnMUL.setText("*");
        jbtnMUL.setActionCommand("");
        jbtnMUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMULActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 70, 50));

        jbtnDigit2.setBackground(new java.awt.Color(0, 0, 204));
        jbtnDigit2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.setActionCommand("");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 70, 50));

        jbtnDigit0.setBackground(new java.awt.Color(0, 0, 204));
        jbtnDigit0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.setActionCommand("");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 70, 50));

        jbtnEQ.setBackground(new java.awt.Color(51, 0, 102));
        jbtnEQ.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnEQ.setText("=");
        jbtnEQ.setActionCommand("");
        jbtnEQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEQActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 70, 50));

        jbtnDIV.setBackground(new java.awt.Color(0, 0, 0));
        jbtnDIV.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDIV.setForeground(new java.awt.Color(255, 0, 51));
        jbtnDIV.setText("/");
        jbtnDIV.setActionCommand("");
        jbtnDIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDIVActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDIV, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 70, 50));

        jbtnDOT.setBackground(new java.awt.Color(0, 0, 102));
        jbtnDOT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDOT.setForeground(new java.awt.Color(204, 0, 51));
        jbtnDOT.setText(".");
        jbtnDOT.setActionCommand("");
        jbtnDOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDOTActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 70, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EnterNumbers(String q)
    {
    String Nums = jtxtresult.getText() + q;
     jtxtresult.setText(Nums);
    }    
    private void jtxtresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtresultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtresultActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
double nums = Double.parseDouble(String.valueOf (jtxtresult.getText()));
nums = nums * (-1);
jtxtresult.setText(String.valueOf(nums));
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
        
        String backsp = null;
        
        if(jtxtresult.getText().length() > 0)
        {
        StringBuilder sb = new StringBuilder(jtxtresult.getText());
        sb.deleteCharAt(jtxtresult.getText().length() - 1);
        backsp = sb.toString();
        jtxtresult.setText(backsp);
        }
        
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
      jtxtresult.setText("");
      
      String Fn, Sn;
      Fn = String.valueOf(firstnum);
      Sn =  String.valueOf(secondnum);
      Fn ="";
      Sn ="";
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
      jtxtresult.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
EnterNumbers("7");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
EnterNumbers("9");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnPLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPLUSActionPerformed
        firstnum = Double.parseDouble(jtxtresult.getText());
      jtxtresult.setText("");
      op = "+";
    }//GEN-LAST:event_jbtnPLUSActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
EnterNumbers("8");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
EnterNumbers("4");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
EnterNumbers("6");        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnMINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMINUSActionPerformed
        firstnum = Double.parseDouble(jtxtresult.getText());
      jtxtresult.setText("");
      op = "-";
    }//GEN-LAST:event_jbtnMINUSActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
        EnterNumbers("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
EnterNumbers("1");       
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
EnterNumbers("3");    
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnMULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMULActionPerformed
firstnum = Double.parseDouble(jtxtresult.getText());
      jtxtresult.setText("");
      op = "*";      
    }//GEN-LAST:event_jbtnMULActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
EnterNumbers("2");       
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
     EnterNumbers("0");   
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnEQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEQActionPerformed
        secondnum = Double.parseDouble(jtxtresult.getText());
        
        if (op == "+")
        {
            result = firstnum + secondnum;
            jtxtresult.setText(String.valueOf(result));
        }
        else if (op == "-")
        {
            result = firstnum - secondnum;
            jtxtresult.setText(String.valueOf(result));
        }
        else if (op == "*")
        {
            result = firstnum * secondnum;
            jtxtresult.setText(String.valueOf(result));
        }
        else if (op == "/")
        {
            result = firstnum / secondnum;
            jtxtresult.setText(String.valueOf(result));
        }
    }//GEN-LAST:event_jbtnEQActionPerformed

    private void jbtnDIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDIVActionPerformed
      firstnum = Double.parseDouble(jtxtresult.getText());
      jtxtresult.setText("");
      op = "/";
    }//GEN-LAST:event_jbtnDIVActionPerformed

    private void jbtnDOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDOTActionPerformed
    if (! jtxtresult.getText().contains("."))
    {
        jtxtresult.setText(jtxtresult.getText() + jbtnDOT.getText());
    }

    }//GEN-LAST:event_jbtnDOTActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
 
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDIV;
    private javax.swing.JButton jbtnDOT;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnEQ;
    private javax.swing.JButton jbtnMINUS;
    private javax.swing.JButton jbtnMUL;
    private javax.swing.JButton jbtnPLUS;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JTextField jtxtresult;
    // End of variables declaration//GEN-END:variables
}
