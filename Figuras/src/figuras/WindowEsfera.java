
package figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowEsfera extends javax.swing.JFrame implements ActionListener {
    private Container Layout;
   
    public WindowEsfera() {
        inicio();
        setTitle("Esfera");
        setSize(280,200);
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
        BotonCalcular = new JButton();
        BotonCalcular.setText("Calcular");
        BotonCalcular.setBounds(75, 50, 135, 23);
        Color morado = new Color(221, 160, 221); 
        BotonCalcular.setBackground(morado);
        BotonCalcular.addActionListener(this);
        TextoVolumen = new JLabel();
        TextoVolumen.setText("Volumen [cm^3]:");
        TextoVolumen.setBounds(20, 90, 200, 23);
        TextoSuperficie = new JLabel();
        TextoSuperficie.setText("Superficie [cm^2]:");
        TextoSuperficie.setBounds(20, 120, 200, 23);
        Layout.add(TextoRadio);
        Layout.add(InputRadio);
        Layout.add(BotonCalcular);
        Layout.add(TextoVolumen);
        Layout.add(TextoSuperficie);
    }
    
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == BotonCalcular) {
            boolean error = false;
            try {
                double radio = Double.parseDouble(InputRadio.getText());
                Esfera esfera = new Esfera(radio);
                TextoVolumen.setText("Volumen (cm^3): " + String.format("%.2f", esfera.VolumenEsfera()));
                TextoSuperficie.setText("Superficie (cm^2): " + String.format("%.2f",esfera.SuperficieEsfera()));
            }
            catch (Exception e) {
                error = true;
            }
            finally {
                if(error) {
                    JOptionPane.showMessageDialog(null,"ERROR INGRESA LLENA LOS CAMPOS", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoRadio = new javax.swing.JLabel();
        BotonCalcular = new javax.swing.JButton();
        InputRadio = new javax.swing.JTextField();
        TextoVolumen = new javax.swing.JLabel();
        TextoSuperficie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextoRadio.setText("Radio [cm]:");

        BotonCalcular.setBackground(new java.awt.Color(204, 204, 255));
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
                        .addComponent(TextoRadio)
                        .addGap(18, 18, 18)
                        .addComponent(InputRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextoVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TextoSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoRadio)
                    .addComponent(InputRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(BotonCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(TextoVolumen)
                .addGap(18, 18, 18)
                .addComponent(TextoSuperficie)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]){
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WindowEsfera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowEsfera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowEsfera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowEsfera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowEsfera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JTextField InputRadio;
    private javax.swing.JLabel TextoRadio;
    private javax.swing.JLabel TextoSuperficie;
    private javax.swing.JLabel TextoVolumen;
    // End of variables declaration//GEN-END:variables
}
