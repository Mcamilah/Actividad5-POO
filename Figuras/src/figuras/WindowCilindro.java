
package figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowCilindro extends javax.swing.JFrame implements ActionListener {
    private Container Layout;
    
    public WindowCilindro() {
        inicio();
        setTitle("Cilindro");
        setSize(280,210);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio() {
        Layout = getContentPane();
        Layout.setLayout(null);
        TextoRadio = new JLabel();
        TextoRadio.setText("Radio [cm]:");
        TextoRadio.setBounds(20, 20, 135, 23);
        InputRadio = new JTextField();
        InputRadio.setBounds(100, 20, 135, 23);
        TextoAltura = new JLabel();
        TextoAltura.setText("Altura [cm]:");
        TextoAltura.setBounds(20, 50, 135, 23);
        InputAltura = new JTextField();
        InputAltura.setBounds(100, 50, 135, 23);
        BotonCalcular = new JButton();
        BotonCalcular.setText("Calcular");
        BotonCalcular.setBounds(75, 80, 135, 23);
        Color azul = new Color(140, 216, 230);
        BotonCalcular.setBackground(azul);
        BotonCalcular.addActionListener(this);
        TextoVolumen = new JLabel();
        TextoVolumen.setText("Volumen [cm^3]:");
        TextoVolumen.setBounds(20, 110, 200, 23);
        TextoSuperficie = new JLabel();
        TextoSuperficie.setText("Superficie [cm^2]:");
        TextoSuperficie.setBounds(20, 140, 200, 23);
        Layout.add(TextoRadio);
        Layout.add(InputRadio);
        Layout.add(TextoAltura);
        Layout.add(InputAltura);
        Layout.add(BotonCalcular);
        Layout.add(TextoVolumen);
        Layout.add(TextoSuperficie);
    }
    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double radio = 0;
        double altura = 0;
        try {
            radio = Double.parseDouble(InputRadio.getText());
            altura = Double.parseDouble(InputAltura.getText());
            Cilindro cilindro = new Cilindro(radio, altura);
            TextoVolumen.setText("Volumen (cm^3): " + String.format("%.2f",cilindro.VolumenCilindro()));
            TextoSuperficie.setText("Superficie (cm^2): " +  String.format("%.2f",cilindro.SuperficieCilindro()));
        }
        catch (Exception e){
            error = true;
        }
        finally {
            if(error) {
        JOptionPane.showMessageDialog(null,"ERROR INGRESA LLENA LOS CAMPOS", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoRadio = new javax.swing.JLabel();
        TextoAltura = new javax.swing.JLabel();
        InputRadio = new javax.swing.JTextField();
        InputAltura = new javax.swing.JTextField();
        BotonCalcular = new javax.swing.JButton();
        TextoVolumen = new javax.swing.JLabel();
        TextoSuperficie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoRadio.setText("Radio [cm]:");

        TextoAltura.setText("Altura [cm]:");

        BotonCalcular.setBackground(new java.awt.Color(204, 255, 204));
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoRadio)
                                .addGap(18, 18, 18)
                                .addComponent(InputRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoAltura)
                                .addGap(18, 18, 18)
                                .addComponent(InputAltura))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextoVolumen))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextoSuperficie)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoRadio)
                    .addComponent(InputRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoAltura)
                    .addComponent(InputAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotonCalcular)
                .addGap(18, 18, 18)
                .addComponent(TextoVolumen)
                .addGap(18, 18, 18)
                .addComponent(TextoSuperficie)
                .addContainerGap(11, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(WindowCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowCilindro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JTextField InputAltura;
    private javax.swing.JTextField InputRadio;
    private javax.swing.JLabel TextoAltura;
    private javax.swing.JLabel TextoRadio;
    private javax.swing.JLabel TextoSuperficie;
    private javax.swing.JLabel TextoVolumen;
    // End of variables declaration//GEN-END:variables
}
