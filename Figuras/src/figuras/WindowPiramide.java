
package figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowPiramide extends javax.swing.JFrame implements ActionListener {
    private Container Layout;
    
    public WindowPiramide() {
        inicio();
        setTitle("Pirámide");
        setSize(280,240);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void inicio() {
        Layout = getContentPane();
        Layout.setLayout(null);
        TextoBase = new JLabel();
        TextoBase.setText("Base [cm]:");
        TextoBase.setBounds(20, 20, 135, 23);
        InputBase = new JTextField();
        InputBase.setBounds(120, 20, 135, 23);
        TextoAltura = new JLabel();
        TextoAltura.setText("Altura [cm]:");
        TextoAltura.setBounds(20, 50, 135, 23);
        InputAltura = new JTextField();
        InputAltura.setBounds(120, 50, 135, 23);
        TextoApotema = new JLabel();
        TextoApotema.setText("Apotema [cm]:");
        TextoApotema.setBounds(20, 80, 135, 23);
        InputApotema = new JTextField();
        InputApotema.setBounds(120, 80, 135, 23);
        BotonCalcular = new JButton();
        BotonCalcular.setText("Calcula");
        BotonCalcular.setBounds(75, 110, 135, 23);
        Color amarillo = new Color(253, 253, 150);
        BotonCalcular.setBackground(amarillo);
        BotonCalcular.addActionListener(this);
        TextoVolumen = new JLabel();
        TextoVolumen.setText("Volumen [cm^3]:");
        TextoVolumen.setBounds(20, 140, 200, 23);
        TextoSuperficie = new JLabel();
        TextoSuperficie.setText("Superficie [cm^2]:");
        TextoSuperficie.setBounds(20, 170, 200, 23);
        Layout.add(TextoBase);
        Layout.add(InputBase);
        Layout.add(TextoAltura);
        Layout.add(InputAltura);
        Layout.add(TextoApotema);
        Layout.add(InputApotema);
        Layout.add(BotonCalcular);
        Layout.add(TextoVolumen);
        Layout.add(TextoSuperficie);
    }
    
    public void actionPerformed(ActionEvent event) {
        Piramide piramide;
        boolean error = false;
        double base = 0;
        double altura = 0;
        double apotema = 0;
        try {
            base = Double.parseDouble(InputBase.getText());
            altura = Double.parseDouble(InputAltura.getText());
            apotema = Double.parseDouble(InputApotema.getText());
            piramide = new Piramide(base, altura, apotema);
            TextoVolumen.setText("Volumen [cm^3]: " + String.format("%.2f",piramide.VolumenPiramide()));
            TextoSuperficie.setText("Superficie [cm^2]: " + String.format("%.2f",piramide.SuperficiePiramide()));
        }
        catch (Exception e) {
            error = true;
        }
        finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "ERROR INGRESA LLENA LOS CAMPOS", "Error",JOptionPane.ERROR_MESSAGE);
            }   
        }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoBase = new javax.swing.JLabel();
        TextoAltura = new javax.swing.JLabel();
        TextoApotema = new javax.swing.JLabel();
        BotonCalcular = new javax.swing.JButton();
        TextoVolumen = new javax.swing.JLabel();
        TextoSuperficie = new javax.swing.JLabel();
        InputBase = new javax.swing.JTextField();
        InputAltura = new javax.swing.JTextField();
        InputApotema = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoBase.setText("Base [cm]:");

        TextoAltura.setText("Altura [cm]:");

        TextoApotema.setText("Apotema[cm]:");

        BotonCalcular.setBackground(new java.awt.Color(255, 204, 204));
        BotonCalcular.setText("Calcular");

        TextoVolumen.setText("Volumen [cm^3]:");

        TextoSuperficie.setText("Superficie [cm^2]:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextoBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoApotema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputApotema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextoVolumen))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextoSuperficie)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoBase)
                    .addComponent(InputBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoAltura)
                    .addComponent(InputAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoApotema)
                    .addComponent(InputApotema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCalcular)
                .addGap(18, 18, 18)
                .addComponent(TextoVolumen)
                .addGap(18, 18, 18)
                .addComponent(TextoSuperficie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(WindowPiramide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowPiramide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowPiramide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowPiramide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowPiramide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JTextField InputAltura;
    private javax.swing.JTextField InputApotema;
    private javax.swing.JTextField InputBase;
    private javax.swing.JLabel TextoAltura;
    private javax.swing.JLabel TextoApotema;
    private javax.swing.JLabel TextoBase;
    private javax.swing.JLabel TextoSuperficie;
    private javax.swing.JLabel TextoVolumen;
    // End of variables declaration//GEN-END:variables
}
