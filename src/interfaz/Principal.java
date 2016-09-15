/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clase.Denominador0Exception;
import clase.NumerosMixtos;
import javax.swing.JOptionPane;

/**
 *
 * @author Payares
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        cmbConvertirFracion.setEnabled(false);
        cmbLimpiar.setEnabled(false);
    }

    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDenominador1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNumerador1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        cmbOperacion = new javax.swing.JComboBox<>();
        txtEntero1 = new javax.swing.JTextField();
        txtEntero2 = new javax.swing.JTextField();
        cmbCalcular = new javax.swing.JButton();
        cmbConvertirFracion = new javax.swing.JButton();
        cmbLimpiar = new javax.swing.JButton();
        txtDenominador2 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txtNumerador2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtEntero3 = new javax.swing.JTextField();
        txtNumerador3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtDenominador3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtNumerador4 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtDenominador4 = new javax.swing.JTextField();
        txtSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Calculadora de numeros mixtos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        txtDenominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 60, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, 10));

        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 60, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 60, 0));

        cmbOperacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicacion", "Division" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        txtEntero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntero1KeyTyped(evt);
            }
        });
        jPanel1.add(txtEntero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, 30));

        txtEntero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntero2KeyTyped(evt);
            }
        });
        jPanel1.add(txtEntero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 50, 30));

        cmbCalcular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbCalcular.setText("Calcular");
        cmbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        cmbConvertirFracion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbConvertirFracion.setText("Convertir a fraccion");
        cmbConvertirFracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConvertirFracionActionPerformed(evt);
            }
        });
        jPanel1.add(cmbConvertirFracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        cmbLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbLimpiar.setText("Limpiar");
        cmbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, -1));

        txtDenominador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 60, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 60, -1));

        txtNumerador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 60, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEntero3.setEditable(false);
        jPanel4.add(txtEntero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, 30));

        txtNumerador3.setEditable(false);
        jPanel4.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, -1));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 60, -1));

        txtDenominador3.setEditable(false);
        jPanel4.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 60, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 180, 100));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fraccion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumerador4.setEditable(false);
        jPanel5.add(txtNumerador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, -1));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, 10));

        txtDenominador4.setEditable(false);
        jPanel5.add(txtDenominador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 60, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 120, 100));

        txtSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSalir.setText("Salir");
        txtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalirActionPerformed(evt);
            }
        });
        jPanel1.add(txtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDenominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtDenominador1KeyTyped

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void txtEntero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntero1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtEntero1KeyTyped

    private void txtEntero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntero2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtEntero2KeyTyped

    private void cmbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCalcularActionPerformed
        int op, e1, e2, e3, n1, n2, d1, d2;
        NumerosMixtos m1, m2, m3 = null;

        if (txtEntero1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la parte entera del primer numero mixto por favor", "Atención", JOptionPane.INFORMATION_MESSAGE);
            txtEntero1.requestFocusInWindow();
        } else if (txtNumerador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el numuerador del primer numero mixto por favor", "Atención", JOptionPane.INFORMATION_MESSAGE);
            txtNumerador1.requestFocusInWindow();
        } else if (txtDenominador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el denominador del primer numero mixto por favor", "Atención", JOptionPane.INFORMATION_MESSAGE);
            txtDenominador1.requestFocusInWindow();
        } else if (txtEntero2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la parte entera del segundo numero mixto por favor", "Atención", JOptionPane.INFORMATION_MESSAGE);
            txtEntero2.requestFocusInWindow();
        } else if (txtNumerador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el numerador del segundo numero mixto por favor", "Atención", JOptionPane.INFORMATION_MESSAGE);
            txtNumerador2.requestFocusInWindow();
        } else if (txtDenominador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el denominador del segundo numero mixto por favor", "Atención", JOptionPane.INFORMATION_MESSAGE);
            txtDenominador2.requestFocusInWindow();
        } else {
            cmbConvertirFracion.setEnabled(true);

            op = cmbOperacion.getSelectedIndex();
            e1 = Integer.parseInt(txtEntero1.getText());
            n1 = Integer.parseInt(txtNumerador1.getText());
            d1 = Integer.parseInt(txtDenominador1.getText());
            e2 = Integer.parseInt(txtEntero2.getText());
            n2 = Integer.parseInt(txtNumerador2.getText());
            d2 = Integer.parseInt(txtDenominador2.getText());

            //convierto los numeros mixtos a fracciones para asi poder operar
            n1 = e1 * d1 + n1;
            n2 = e2 * d2 + n2;

            try {
                m1 = new NumerosMixtos(n1, d1);
                m2 = new NumerosMixtos(n2, d2);

                switch (op) {
                    case 0:
                    m3 = m1.Sumar(m2);
                    break;
                    case 1:
                    m3 = m1.Restar(m2);
                    break;
                    case 2:
                    m3 = m1.Multiplicar(m2);
                    break;
                    case 3:
                    m3 = m1.Dividir(m2);
                    break;

                }

                e3 = m3.getNumerador() / m3.getDenominador();
                txtEntero3.setText("" + e3);
                txtNumerador3.setText("" + m3.getNumerador() % m3.getDenominador());
                txtDenominador3.setText("" + m3.getDenominador());
            } catch (Denominador0Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                if (txtDenominador1.getText().equalsIgnoreCase("0")) {
                    txtDenominador1.requestFocusInWindow();
                    txtDenominador1.selectAll();
                } else if (txtDenominador2.getText().equalsIgnoreCase("0")) {
                    txtDenominador2.requestFocusInWindow();
                    txtDenominador2.selectAll();
                            cmbCalcular.setEnabled(false);
                            
                   
                }
            }

        }
        cmbLimpiar.setEnabled(true);
    }//GEN-LAST:event_cmbCalcularActionPerformed

    private void cmbConvertirFracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConvertirFracionActionPerformed
        int numerador, denominador, entero;

        entero = Integer.parseInt(txtEntero3.getText());
        numerador = Integer.parseInt(txtNumerador3.getText());
        denominador = Integer.parseInt(txtDenominador3.getText());

        numerador = entero * denominador + numerador;

        txtNumerador4.setText(String.valueOf(numerador));
        txtDenominador4.setText(String.valueOf(denominador));
        
        cmbConvertirFracion.setEnabled(false);
        cmbLimpiar.setEnabled(true);
        
    }//GEN-LAST:event_cmbConvertirFracionActionPerformed

    private void cmbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimpiarActionPerformed

        txtEntero1.setText("");
        txtEntero2.setText("");
        txtEntero3.setText("");
        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtNumerador4.setText("");
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtDenominador4.setText("");     
        txtEntero1.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
        cmbConvertirFracion.setEnabled(false);
        cmbLimpiar.setEnabled(false);

    }//GEN-LAST:event_cmbLimpiarActionPerformed

    private void txtDenominador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtDenominador2KeyTyped

    private void txtNumerador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador2KeyTyped

    private void txtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_txtSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbCalcular;
    private javax.swing.JButton cmbConvertirFracion;
    private javax.swing.JButton cmbLimpiar;
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtDenominador4;
    private javax.swing.JTextField txtEntero1;
    private javax.swing.JTextField txtEntero2;
    private javax.swing.JTextField txtEntero3;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumerador4;
    private javax.swing.JButton txtSalir;
    // End of variables declaration//GEN-END:variables
}
