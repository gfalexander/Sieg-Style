/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sieg.system;

/**
 *
 * @author alexander
 */
public class TelaMonitoramento extends javax.swing.JFrame {
    GenMonitoramento teste = new GenMonitoramento();
    /**
     * Creates new form TelaMonitoramento
     */
    public TelaMonitoramento() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblUsoCpu2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblUsoCpu4 = new javax.swing.JLabel();
        pgbDisco = new javax.swing.JProgressBar();
        pgbCpu = new javax.swing.JProgressBar();
        pgbRam = new javax.swing.JProgressBar();
        btnNovaLeitura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblUsoCpu = new javax.swing.JLabel();
        lblUsoRam = new javax.swing.JLabel();
        lblUsoDisco = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMinCpu = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMedCpu = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblMaxCpu = new javax.swing.JLabel();
        lblMaxRam = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblMinRam = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblMedRam = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblMaxDisco = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblMinDisco = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblMedDisco = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel3.setText("Cpu:");

        jLabel6.setText("Min:");

        lblUsoCpu2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblUsoCpu2.setText("0");

        jLabel8.setText("Med:");

        lblUsoCpu4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblUsoCpu4.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNovaLeitura.setText("Novas leituras");
        btnNovaLeitura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fnNovaLeitura(evt);
            }
        });

        jLabel1.setText("RAM:");

        jLabel2.setText("CPU:");

        jLabel4.setText("Disco:");

        lblUsoCpu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblUsoCpu.setText("0");

        lblUsoRam.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblUsoRam.setText("0");

        lblUsoDisco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblUsoDisco.setText("0");

        jLabel5.setText("Min:");

        lblMinCpu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMinCpu.setText("0");

        jLabel7.setText("Med:");

        lblMedCpu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMedCpu.setText("0");

        jLabel9.setText("Máx:");

        lblMaxCpu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMaxCpu.setText("0");

        lblMaxRam.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMaxRam.setText("0");

        jLabel10.setText("Min:");

        lblMinRam.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMinRam.setText("0");

        jLabel11.setText("Med:");

        lblMedRam.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMedRam.setText("0");

        jLabel12.setText("Máx:");

        lblMaxDisco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMaxDisco.setText("0");

        jLabel13.setText("Min:");

        lblMinDisco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMinDisco.setText("0");

        jLabel14.setText("Med:");

        lblMedDisco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMedDisco.setText("0");

        jLabel15.setText("Máx:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsoRam)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMaxRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedRam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinRam))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pgbDisco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovaLeitura)
                        .addComponent(pgbRam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblUsoDisco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMaxDisco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMedDisco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMinDisco))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblUsoCpu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMaxCpu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMedCpu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMinCpu))
                        .addComponent(pgbCpu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblUsoCpu)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblMinCpu)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblMedCpu)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(lblMaxCpu)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUsoRam)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(lblMinRam)
                        .addComponent(jLabel11)
                        .addComponent(lblMedRam)
                        .addComponent(jLabel12)
                        .addComponent(lblMaxRam)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgbRam, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblUsoDisco)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(lblMinDisco)
                        .addComponent(jLabel14)
                        .addComponent(lblMedDisco)
                        .addComponent(jLabel15)
                        .addComponent(lblMaxDisco)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovaLeitura)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnNovaLeitura(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fnNovaLeitura
        // TODO add your handling code here:
        teste.geradorAleatorios();
        teste.historico();
        lblUsoCpu.setText(String.format("%d", teste.registroCpu));
        lblUsoRam.setText(String.format("%d", teste.registroRam));
        lblUsoDisco.setText(String.format("%d", teste.registroDisco));
        pgbCpu.setValue(Integer.valueOf(lblUsoCpu.getText()));
        pgbRam.setValue(Integer.valueOf(lblUsoRam.getText()));
        pgbDisco.setValue(Integer.valueOf(lblUsoDisco.getText()));
        lblMaxCpu.setText(String.format("%d", teste.historicoMaxCpu));
        lblMedCpu.setText(String.format("%d", teste.historicoMedCpu));
        lblMinCpu.setText(String.format("%d", teste.historicoMinCpu));
        lblMaxRam.setText(String.format("%d", teste.historicoMaxRam));
        lblMedRam.setText(String.format("%d", teste.historicoMedRam));
        lblMinRam.setText(String.format("%d", teste.historicoMinRam));
        lblMaxDisco.setText(String.format("%d", teste.historicoMaxDisco));
        lblMedDisco.setText(String.format("%d", teste.historicoMedDisco));
        lblMinDisco.setText(String.format("%d", teste.historicoMinDisco));
    }//GEN-LAST:event_fnNovaLeitura

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
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMonitoramento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMonitoramento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovaLeitura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMaxCpu;
    private javax.swing.JLabel lblMaxDisco;
    private javax.swing.JLabel lblMaxRam;
    private javax.swing.JLabel lblMedCpu;
    private javax.swing.JLabel lblMedDisco;
    private javax.swing.JLabel lblMedRam;
    private javax.swing.JLabel lblMinCpu;
    private javax.swing.JLabel lblMinDisco;
    private javax.swing.JLabel lblMinRam;
    private javax.swing.JLabel lblUsoCpu;
    private javax.swing.JLabel lblUsoCpu2;
    private javax.swing.JLabel lblUsoCpu4;
    private javax.swing.JLabel lblUsoDisco;
    private javax.swing.JLabel lblUsoRam;
    private javax.swing.JProgressBar pgbCpu;
    private javax.swing.JProgressBar pgbDisco;
    private javax.swing.JProgressBar pgbRam;
    // End of variables declaration//GEN-END:variables
}