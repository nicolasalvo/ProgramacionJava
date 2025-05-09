package view.gui;
import exceptions.InvalidDniException;
import exceptions.InvalidPostalCodeException;
import model.validations.UserDataValidations;
import ficheros.ClassFichero;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JFrameMain extends javax.swing.JFrame {

    
    public JFrameMain() throws FileNotFoundException {
        initComponents();
        initConfig();
        ClassFichero.createFile("user_data_NOS.csv");
    }
    
    private void initConfig() {
        jTextFieldCalculateAge.setEnabled(false);
        jButtonValidate.setEnabled(true);
        jButtonClear.setEnabled(true);

        jButtonCSV.setEnabled(false);

        jTextFieldName.setText("");
        jTextFieldNIF.setText("");
        jTextFieldEmail.setText("");
        jTextFieldPostalCode.setText("");
        jTextFieldBirthDate.setText("");
        jTextFieldCalculateAge.setText("");

        jLabelErrorName1.setText("");
        jLabelErrorNIF.setText("");
        jLabelErrorEmail.setText("");
        jLabelErrorPostalCode.setText("");
        jLabelErrorBirthDate.setText("");
        jLabelErrorCalculateAge.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLabelTitulo = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelErrorName = new javax.swing.JLabel();
        jButtonValidate = new javax.swing.JButton();
        jLabelErrorName1 = new javax.swing.JLabel();
        jLabelErrorNIF = new javax.swing.JLabel();
        jTextFieldNIF = new javax.swing.JTextField();
        jLabelName1 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelName2 = new javax.swing.JLabel();
        jLabelErrorEmail = new javax.swing.JLabel();
        jTextFieldBirthDate = new javax.swing.JTextField();
        jLabelErrorBirthDate = new javax.swing.JLabel();
        jLabelName3 = new javax.swing.JLabel();
        jLabelErrorPostalCode = new javax.swing.JLabel();
        jTextFieldPostalCode = new javax.swing.JTextField();
        jLabelName4 = new javax.swing.JLabel();
        jTextFieldCalculateAge = new javax.swing.JTextField();
        jLabelErrorCalculateAge = new javax.swing.JLabel();
        jLabelName5 = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jButtonCSV = new javax.swing.JButton();
        jLabelCorrectoCSV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        JLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        JLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        JLabelTitulo.setText("VALIDADOR DATOS USUARIO");

        jLabelLogo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/media/logomonlau.png"))); // NOI18N

        jLabelName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelName.setText("Nombre:");

        jTextFieldName.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jLabelErrorName.setBackground(new java.awt.Color(255, 255, 255));
        jLabelErrorName.setForeground(new java.awt.Color(204, 0, 0));

        jButtonValidate.setBackground(new java.awt.Color(0, 102, 102));
        jButtonValidate.setForeground(new java.awt.Color(0, 0, 0));
        jButtonValidate.setText("Validar");
        jButtonValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidateActionPerformed(evt);
            }
        });

        jLabelErrorName1.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorName1.setLabelFor(jLabelErrorName);

        jLabelErrorNIF.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorNIF.setLabelFor(jLabelErrorName);

        jTextFieldNIF.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNIFActionPerformed(evt);
            }
        });

        jLabelName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelName1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelName1.setText("NIF: ");

        jTextFieldEmail.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabelName2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelName2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelName2.setText("Email:");

        jLabelErrorEmail.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorEmail.setLabelFor(jLabelErrorName);

        jTextFieldBirthDate.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBirthDateActionPerformed(evt);
            }
        });

        jLabelErrorBirthDate.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorBirthDate.setLabelFor(jLabelErrorName);

        jLabelName3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelName3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelName3.setText("Fecha de Nacimiento:");

        jLabelErrorPostalCode.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorPostalCode.setLabelFor(jLabelErrorName);

        jTextFieldPostalCode.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPostalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPostalCodeActionPerformed(evt);
            }
        });

        jLabelName4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelName4.setForeground(new java.awt.Color(0, 0, 0));
        jLabelName4.setText("Código Postal:");

        jTextFieldCalculateAge.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldCalculateAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCalculateAgeActionPerformed(evt);
            }
        });

        jLabelErrorCalculateAge.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorCalculateAge.setLabelFor(jLabelErrorName);

        jLabelName5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelName5.setForeground(new java.awt.Color(0, 0, 0));
        jLabelName5.setText("Edad:");

        jButtonClear.setBackground(new java.awt.Color(0, 102, 102));
        jButtonClear.setForeground(new java.awt.Color(0, 0, 0));
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonCSV.setBackground(new java.awt.Color(0, 102, 102));
        jButtonCSV.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCSV.setText("CSV");
        jButtonCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCSVActionPerformed(evt);
            }
        });

        jLabelCorrectoCSV.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabelErrorName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelName1)
                                .addGap(109, 109, 109)
                                .addComponent(jTextFieldNIF, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelName2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelName3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelName4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelName5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldCalculateAge, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonValidate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCSV))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelName)
                                .addGap(85, 85, 85)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelErrorPostalCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelErrorBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelErrorEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelErrorNIF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelErrorName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelErrorCalculateAge, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClear)
                                .addGap(32, 32, 32)
                                .addComponent(jLabelCorrectoCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(JLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelLogo))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(JLabelTitulo)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorName1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelErrorNIF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelName1)
                        .addComponent(jTextFieldNIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName3)
                    .addComponent(jTextFieldBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName4)
                    .addComponent(jTextFieldPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName5)
                    .addComponent(jTextFieldCalculateAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorCalculateAge, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelErrorName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonValidate)
                            .addComponent(jButtonCSV)
                            .addComponent(jButtonClear)
                            .addComponent(jLabelCorrectoCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jButtonValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidateActionPerformed
        // TODO add your handling code here:
        boolean todoValido = true;
        String name = jTextFieldName.getText();
        if (!UserDataValidations.checkName(name)) {
            jLabelErrorName1.setText("Nombre incorrecto!");
            todoValido = false;
        }else {
            jLabelErrorName1.setText(""); 
        }
        try {
            String NIF = jTextFieldNIF.getText();
            UserDataValidations.checkId(1, NIF);
            jLabelErrorNIF.setText("");
        } catch (InvalidDniException e) {
            jLabelErrorNIF.setText(e.getMessage());
            todoValido = false;
        }
        String email = jTextFieldEmail.getText();
        if (!UserDataValidations.checkEmail(email)) {
            jLabelErrorEmail.setText("Email incorrecto!");
            todoValido = false;
        } else {
            jLabelErrorEmail.setText("");
        }
        try {
            String zip = jTextFieldPostalCode.getText();
            UserDataValidations.checkPostalCode(zip);
            jLabelErrorPostalCode.setText("");
        } catch (InvalidPostalCodeException e) {
            jLabelErrorPostalCode.setText(e.getMessage());
            todoValido = false;
        }
        String date = jTextFieldBirthDate.getText();
        if (!UserDataValidations.checkFormatDate(date)) {
            jLabelErrorBirthDate.setText("Formato de fecha incorrecto!");
            todoValido = false;
        } else {
            jLabelErrorBirthDate.setText("");
        }
        String birthDate = jTextFieldBirthDate.getText();
        if (!UserDataValidations.checkFormatDate(birthDate)) {
            jLabelErrorBirthDate.setText("Formato de fecha incorrecto!");
            todoValido = false;
        } else {
            int calculatedAge = UserDataValidations.calculateAge(birthDate);

            jTextFieldCalculateAge.setText(String.valueOf(calculatedAge));

            jLabelErrorCalculateAge.setText("");
        }

        if (todoValido) {
            jTextFieldName.setEditable(false);
            jTextFieldNIF.setEditable(false);
            jTextFieldEmail.setEditable(false);
            jTextFieldPostalCode.setEditable(false);
            jTextFieldBirthDate.setEditable(false);
            jTextFieldCalculateAge.setEditable(false);

            jButtonValidate.setEnabled(false);

            jButtonCSV.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonValidateActionPerformed

    private void jTextFieldNIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNIFActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBirthDateActionPerformed

    private void jTextFieldPostalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPostalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPostalCodeActionPerformed

    private void jTextFieldCalculateAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCalculateAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCalculateAgeActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jButtonValidate.setEnabled(true);
        jButtonClear.setEnabled(true);
        jButtonCSV.setEnabled(false);

        jTextFieldName.setEditable(true);
        jTextFieldNIF.setEditable(true);
        jTextFieldEmail.setEditable(true);
        jTextFieldPostalCode.setEditable(true);
        jTextFieldBirthDate.setEditable(true);
        jTextFieldCalculateAge.setEditable(false); 

        jLabelErrorName1.setText("");
        jLabelErrorNIF.setText("");
        jLabelErrorEmail.setText("");
        jLabelErrorPostalCode.setText("");
        jLabelErrorBirthDate.setText("");
        jLabelErrorCalculateAge.setText("");

        jTextFieldName.setText("");
        jTextFieldNIF.setText("");
        jTextFieldEmail.setText("");
        jTextFieldPostalCode.setText("");
        jTextFieldBirthDate.setText("");
        jTextFieldCalculateAge.setText("");
        jLabelCorrectoCSV.setText(""); 
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCSVActionPerformed
        // TODO add your handling code here:
        String name = jTextFieldName.getText();
        String nif = jTextFieldNIF.getText();
        String mail = jTextFieldEmail.getText();
        String fecha_nac = jTextFieldBirthDate.getText();
        String edad = jTextFieldCalculateAge.getText();
        String cod_post = jTextFieldPostalCode.getText();
        String line = name+";"+nif+";"+mail+";"+fecha_nac+";"+edad+";"+cod_post;
//        ClassFichero.writeFile(line+"\n");
        jLabelCorrectoCSV.setText("El usuario se registro.");
        jButtonCSV.setEnabled(false);
    }//GEN-LAST:event_jButtonCSVActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameMain().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JButton jButtonCSV;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonValidate;
    private javax.swing.JLabel jLabelCorrectoCSV;
    private javax.swing.JLabel jLabelErrorBirthDate;
    private javax.swing.JLabel jLabelErrorCalculateAge;
    private javax.swing.JLabel jLabelErrorEmail;
    private javax.swing.JLabel jLabelErrorNIF;
    private javax.swing.JLabel jLabelErrorName;
    private javax.swing.JLabel jLabelErrorName1;
    private javax.swing.JLabel jLabelErrorPostalCode;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelName1;
    private javax.swing.JLabel jLabelName2;
    private javax.swing.JLabel jLabelName3;
    private javax.swing.JLabel jLabelName4;
    private javax.swing.JLabel jLabelName5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBirthDate;
    private javax.swing.JTextField jTextFieldCalculateAge;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNIF;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPostalCode;
    // End of variables declaration//GEN-END:variables
}
