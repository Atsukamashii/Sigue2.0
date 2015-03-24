/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.sige.tigo;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JOptionPane;

/**
 *
 * @author Nataly
 */
public class CRMMonto extends javax.swing.JFrame {

    /**
     * Creates new form montoPagar
     */
    public CRMMonto() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Monto a pagar v1.1");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextMonto = new javax.swing.JTextField();
        mEnero = new javax.swing.JCheckBox();
        mFebreo = new javax.swing.JCheckBox();
        mMarzo = new javax.swing.JCheckBox();
        mAbril = new javax.swing.JCheckBox();
        mMayo = new javax.swing.JCheckBox();
        mJunio = new javax.swing.JCheckBox();
        mJulio = new javax.swing.JCheckBox();
        mAgosto = new javax.swing.JCheckBox();
        mSeptiembre = new javax.swing.JCheckBox();
        mOctubre = new javax.swing.JCheckBox();
        mNoviembre = new javax.swing.JCheckBox();
        mDiciembre = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCRM = new javax.swing.JTextArea();
        Generar = new javax.swing.JButton();
        inicioGuardar = new javax.swing.JButton();
        btAtras = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        ShGenerar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Monto a pagar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("PERSONA QUE LLAMA:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("MONTO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("CORRESPONDE AL MES DE:");

        mEnero.setText("Enero");

        mFebreo.setText("Febrero");

        mMarzo.setText("Marzo");

        mAbril.setText("Abril");

        mMayo.setText("Mayo");

        mJunio.setText("Junio");

        mJulio.setText("Julio");

        mAgosto.setText("Agosto");

        mSeptiembre.setText("Septiembre");

        mOctubre.setText("Octubre");

        mNoviembre.setText("Noviembre");

        mDiciembre.setText("Diciembre");

        tCRM.setEditable(false);
        tCRM.setColumns(20);
        tCRM.setRows(5);
        jScrollPane1.setViewportView(tCRM);

        Generar.setText("Generar CRM");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        inicioGuardar.setText("Guardar y volver al inicio");
        inicioGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioGuardarActionPerformed(evt);
            }
        });

        btAtras.setText("Atras");
        btAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        ShGenerar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, 0));
        ShGenerar.setText("Generar");
        ShGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShGenerarActionPerformed(evt);
            }
        });
        jMenu1.add(ShGenerar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mJulio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mAgosto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mSeptiembre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mOctubre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mNoviembre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mDiciembre))
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mEnero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mFebreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mMarzo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mAbril)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mMayo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mJunio))
                            .addComponent(Generar))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inicioGuardar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jTextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mEnero)
                    .addComponent(mFebreo)
                    .addComponent(mMarzo)
                    .addComponent(mAbril)
                    .addComponent(mMayo)
                    .addComponent(mJunio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mJulio)
                    .addComponent(mAgosto)
                    .addComponent(mSeptiembre)
                    .addComponent(mOctubre)
                    .addComponent(mNoviembre)
                    .addComponent(mDiciembre))
                .addGap(18, 18, 18)
                .addComponent(Generar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioGuardar)
                    .addComponent(btAtras))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed

    String Nom= jTextNombre.getText().toString();
    String Mon= jTextMonto.getText().toString(); 
    String m1="";
    String m2="";
    String m3="";
    String m4="";
    String m5="";
    String m6="";
    String m7="";
    String m8="";
    String m9="";
    String m10="";
    String m11="";
    String m12="";
    
        if(mEnero.isSelected()){
             m1=("ENERO");
        }
        if(mFebreo.isSelected()){
             m2=(" FEBRERO");
        }
        if(mMarzo.isSelected()){
             m3=(" MARZO");
        }
        if(mAbril.isSelected()){
             m4=(" ABRIL");
        }
        if(mMayo.isSelected()){
             m5=(" MAYO");
        }
        if(mJunio.isSelected()){
             m6=(" JUNIO");
        }
        if(mJulio.isSelected()){
             m7=("JULIO");
        }
        if(mAgosto.isSelected()){
             m8=(" AGOSTO");
        }
        if(mSeptiembre.isSelected()){
             m9=(" SEPTIEMBRE");
        }
        if(mOctubre.isSelected()){
             m10=(" OCTUBRE");
        }
        if(mNoviembre.isSelected()){
             m11=(" NOVIEMBRE");
        }
        if(mDiciembre.isSelected()){
             m12=(" DICIEMBRE");
        }
    String vista="";
    vista=("PERSONA QUIEN LLAMA: "+Nom
            +"\nMONTO A PAGAR: ¢ "+Mon
            +"\nCORRESPONDIENTE AL MES: "+m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11+m12);
    tCRM.setText(vista);
    }//GEN-LAST:event_GenerarActionPerformed

    private void inicioGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioGuardarActionPerformed
        String Nom= jTextNombre.getText().toString();
    String Mon= jTextMonto.getText().toString(); 
    String m1="";
    String m2="";
    String m3="";
    String m4="";
    String m5="";
    String m6="";
    String m7="";
    String m8="";
    String m9="";
    String m10="";
    String m11="";
    String m12="";
    
        if(mEnero.isSelected()){
             m1=("ENERO");
        }
        if(mFebreo.isSelected()){
             m2=(" FEBRERO");
        }
        if(mMarzo.isSelected()){
             m3=(" MARZO");
        }
        if(mAbril.isSelected()){
             m4=(" ABRIL");
        }
        if(mMayo.isSelected()){
             m5=(" MAYO");
        }
        if(mJunio.isSelected()){
             m6=(" JUNIO");
        }
        if(mJulio.isSelected()){
             m7=(" JULIO");
        }
        if(mAgosto.isSelected()){
             m8=(" AGOSTO");
        }
        if(mSeptiembre.isSelected()){
             m9=(" SEPTIEMBRE");
        }
        if(mOctubre.isSelected()){
             m10=(" OCTUBRE");
        }
        if(mNoviembre.isSelected()){
             m11=(" NOVIEMBRE");
        }
        if(mDiciembre.isSelected()){
             m12=(" DICIEMBRE");
        }
    String vista="";
    vista=("PERSONA QUIEN LLAMA: "+Nom
            +"\nMONTO A PAGAR: ¢ "+Mon
            +"\nCORRESPONDIENTE AL MES: "+m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11+m12);
        tCRM.setText(vista);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection data = new StringSelection(""+vista);
        clipboard.setContents(data, data);
            AssistCRM obj=new AssistCRM();
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_inicioGuardarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
AssistCRM obj=new AssistCRM();
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ShGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShGenerarActionPerformed
    String Nom= jTextNombre.getText().toString();
    String Mon= jTextMonto.getText().toString(); 
    String m1="";
    String m2="";
    String m3="";
    String m4="";
    String m5="";
    String m6="";
    String m7="";
    String m8="";
    String m9="";
    String m10="";
    String m11="";
    String m12="";
    
        if(mEnero.isSelected()){
             m1=("ENERO");
        }
        if(mFebreo.isSelected()){
             m2=(" FEBRERO");
        }
        if(mMarzo.isSelected()){
             m3=(" MARZO");
        }
        if(mAbril.isSelected()){
             m4=(" ABRIL");
        }
        if(mMayo.isSelected()){
             m5=(" MAYO");
        }
        if(mJunio.isSelected()){
             m6=(" JUNIO");
        }
        if(mJulio.isSelected()){
             m7=("JULIO");
        }
        if(mAgosto.isSelected()){
             m8=(" AGOSTO");
        }
        if(mSeptiembre.isSelected()){
             m9=(" SEPTIEMBRE");
        }
        if(mOctubre.isSelected()){
             m10=(" OCTUBRE");
        }
        if(mNoviembre.isSelected()){
             m11=(" NOVIEMBRE");
        }
        if(mDiciembre.isSelected()){
             m12=(" DICIEMBRE");
        }
    String vista="";
    vista=("PERSONA QUIEN LLAMA: "+Nom
            +"\nMONTO A PAGAR: ¢ "+Mon
            +"\nCORRESPONDIENTE AL MES: "+m1+m2+m3+m4+m5+m6);
    tCRM.setText(vista);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection data = new StringSelection(""+vista);
        clipboard.setContents(data, data);
    }//GEN-LAST:event_ShGenerarActionPerformed

    private void btAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasActionPerformed
            AssistCRM obj=new AssistCRM();
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_btAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(CRMMonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRMMonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRMMonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRMMonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRMMonto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Generar;
    private javax.swing.JMenuItem ShGenerar;
    private javax.swing.JButton btAtras;
    private javax.swing.JButton inicioGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextMonto;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JCheckBox mAbril;
    private javax.swing.JCheckBox mAgosto;
    private javax.swing.JCheckBox mDiciembre;
    private javax.swing.JCheckBox mEnero;
    private javax.swing.JCheckBox mFebreo;
    private javax.swing.JCheckBox mJulio;
    private javax.swing.JCheckBox mJunio;
    private javax.swing.JCheckBox mMarzo;
    private javax.swing.JCheckBox mMayo;
    private javax.swing.JCheckBox mNoviembre;
    private javax.swing.JCheckBox mOctubre;
    private javax.swing.JCheckBox mSeptiembre;
    private javax.swing.JTextArea tCRM;
    // End of variables declaration//GEN-END:variables
}
