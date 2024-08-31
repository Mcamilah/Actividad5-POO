
package figuras;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainWindow extends javax.swing.JFrame implements ActionListener {
    private Container layout;
   
    
    public mainWindow() {
        inicio();
        setTitle("Figura");
        setSize(350,160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    private void inicio() {
        layout = getContentPane();
        layout.setLayout(null);
        BotonCilindro = new JButton();
        BotonCilindro.setText("Cilindro");
        BotonCilindro.setBounds(125, 25, 80, 23);
        Color azul = new Color(140, 216, 230);
        BotonCilindro.setBackground(azul);
        BotonCilindro.addActionListener(this);
        BotonEsfera = new JButton();
        BotonEsfera.setText("Esfera");
        BotonEsfera.setBounds(125, 55, 80, 23);
        Color morado = new Color(221, 160, 221); 
        BotonEsfera.setBackground(morado);
        BotonEsfera.addActionListener(this);
        BotonPiramide = new JButton();
        BotonPiramide.setText("Pirámide");
        BotonPiramide.setBounds(115, 85, 100, 23);
        Color amarillo = new Color(253, 253, 150);
        BotonPiramide.setBackground(amarillo);
        BotonPiramide.addActionListener(this);
        layout.add(BotonCilindro);
        layout.add(BotonEsfera);
        layout.add(BotonPiramide);
    }
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonCilindro = new javax.swing.JButton();
        BotonPiramide = new javax.swing.JButton();
        BotonEsfera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonCilindro.setText("Cilindro");
        BotonCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCilindroActionPerformed(evt);
            }
        });

        BotonPiramide.setText("Pirámide");
        BotonPiramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPiramideActionPerformed(evt);
            }
        });

        BotonEsfera.setText("Esfera");
        BotonEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEsferaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonCilindro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(BotonEsfera)
                .addGap(30, 30, 30)
                .addComponent(BotonPiramide)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCilindro)
                    .addComponent(BotonPiramide)
                    .addComponent(BotonEsfera))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCilindroActionPerformed
        WindowCilindro cilindro = new WindowCilindro();
        cilindro.setVisible(true);
    }//GEN-LAST:event_BotonCilindroActionPerformed

    private void BotonEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEsferaActionPerformed
        WindowEsfera esfera = new WindowEsfera();
        esfera.setVisible(true);
    }//GEN-LAST:event_BotonEsferaActionPerformed

    private void BotonPiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPiramideActionPerformed
        WindowPiramide piramide = new WindowPiramide();
        piramide.setVisible(true);
    }//GEN-LAST:event_BotonPiramideActionPerformed

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == BotonCilindro) {
            WindowCilindro cilindro = new WindowCilindro();
            cilindro.setVisible(true);
        }
        if (evento.getSource() == BotonEsfera) {
            WindowEsfera esfera = new WindowEsfera();
            esfera.setVisible(true);
        }
        if (evento.getSource() == BotonPiramide) {
            WindowPiramide pirámide = new WindowPiramide();
            pirámide.setVisible(true);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCilindro;
    private javax.swing.JButton BotonEsfera;
    private javax.swing.JButton BotonPiramide;
    // End of variables declaration//GEN-END:variables
 
    


}
