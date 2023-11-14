package pkg1.pkg1d.aed.views;

import java.io.File;
import pkg1.pkg1d.aed.Utils;

public class ContarPalabrasV extends javax.swing.JFrame {

    private File miFichero;

    public ContarPalabrasV() {
        initComponents();
    }

    public ContarPalabrasV(File miFichero, String contenido) {
        initComponents();
        this.miFichero = miFichero;
        this.ficheroTextArea.setText(contenido);
        this.rutaTextArea.setText(miFichero.getPath());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rutaTextArea = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ficheroTextArea = new javax.swing.JTextArea();
        contarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        palabrasTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mostrar texto del archivo:");

        ficheroTextArea.setEditable(false);
        ficheroTextArea.setColumns(20);
        ficheroTextArea.setRows(5);
        jScrollPane1.setViewportView(ficheroTextArea);

        contarButton.setText("Contar");
        contarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contarButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Total Palabras:");

        palabrasTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabrasTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rutaTextArea))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(contarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(palabrasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rutaTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contarButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(palabrasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palabrasTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabrasTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabrasTextFieldActionPerformed

    private void contarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contarButtonActionPerformed
        palabrasTextField.setText(Integer.toString(Utils.countWords(ficheroTextArea.getText())));
    }//GEN-LAST:event_contarButtonActionPerformed

  
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContarPalabrasV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contarButton;
    private javax.swing.JTextArea ficheroTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField palabrasTextField;
    private javax.swing.JTextField rutaTextArea;
    // End of variables declaration//GEN-END:variables
}
