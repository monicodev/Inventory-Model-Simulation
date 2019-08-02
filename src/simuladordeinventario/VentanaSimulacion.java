package simuladordeinventario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static simuladordeinventario.DistribucionNormal.calculaZ;
import static simuladordeinventario.SimuladorDeInventario.*;

public class VentanaSimulacion extends javax.swing.JFrame {
private DefaultTableModel model;

    public VentanaSimulacion() {
        ordenarListas();
        calcularQR();
        simulacionDeEventosExpress();
        initComponents();
        this.setTitle("Resultados de la simulación");
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        qSlider.setMinimum(qmin);
        qSlider.setMaximum(qmax);
        rSlider.setMinimum(rmin);
        rSlider.setMaximum(rmax);
        parametroCI.setText(String.format("%.2f",costoInv));
        parametroCO.setText(String.format("%.2f",costoOrd));
        parametroCFE.setText(String.format("%.2f",costoEscConEspera));
        parametroCFSE.setText(String.format("%.2f",costoEscSinEspera));
        
        actualizarTablaEventos();

        Collections.sort(tablaDeEventos ,new Comparator<SimulacionDeEventos>() {
                @Override
                    public int compare(SimulacionDeEventos evento2, SimulacionDeEventos evento1)
                    {
                        return  Double.compare(evento2.costoTotal,evento1.costoTotal);
                    }
                });
        labelROpt.setText("R* optimo:  " + (tablaDeEventos.get(0).r));
        labelQOpt.setText("Q* optimo:  " + (tablaDeEventos.get(0).q));
        labelCTOpt.setText("CT* optimo:  " + String.format("%.2f",tablaDeEventos.get(0).costoTotal));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaE = new javax.swing.JTable();
        qSlider = new javax.swing.JSlider();
        rSlider = new javax.swing.JSlider();
        rLabel = new javax.swing.JLabel();
        qLabel = new javax.swing.JLabel();
        labelCostoInventario = new javax.swing.JLabel();
        labelCostoOrden1 = new javax.swing.JLabel();
        labelCostoOrden = new javax.swing.JLabel();
        labelCostoEscasez1 = new javax.swing.JLabel();
        labelCostoEscasez = new javax.swing.JLabel();
        labelCostoInventario1 = new javax.swing.JLabel();
        labelCostoTotal1 = new javax.swing.JLabel();
        labelCostoTotal = new javax.swing.JLabel();
        labelCTOpt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelQOpt = new javax.swing.JLabel();
        labelROpt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        parametroCO = new javax.swing.JLabel();
        parametroCFSE = new javax.swing.JLabel();
        parametroCI = new javax.swing.JLabel();
        parametroCFE = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setOpaque(false);

        tablaE.setBackground(new java.awt.Color(255, 255, 255));
        tablaE.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        tablaE.setForeground(new java.awt.Color(0, 0, 0));
        tablaE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Día", "Inv. Ini.", "NA Demanda", "Demanda", "Inv. Fin.", "Inv. Pro.", "Faltante", "N° Orden", "NAT Entrega", "T Entrega", "NAT Espera", "T Espera"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaE.setToolTipText("");
        tablaE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaE.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tablaE.setFocusable(false);
        tablaE.setGridColor(new java.awt.Color(0, 0, 0));
        tablaE.setRowSelectionAllowed(false);
        tablaE.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tablaE.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaE.getTableHeader().setResizingAllowed(false);
        tablaE.getTableHeader().setReorderingAllowed(false);
        tablaE.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tablaEComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(tablaE);
        if (tablaE.getColumnModel().getColumnCount() > 0) {
            tablaE.getColumnModel().getColumn(0).setResizable(false);
            tablaE.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaE.getColumnModel().getColumn(1).setResizable(false);
            tablaE.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablaE.getColumnModel().getColumn(2).setResizable(false);
            tablaE.getColumnModel().getColumn(3).setResizable(false);
            tablaE.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaE.getColumnModel().getColumn(4).setResizable(false);
            tablaE.getColumnModel().getColumn(4).setPreferredWidth(50);
            tablaE.getColumnModel().getColumn(5).setResizable(false);
            tablaE.getColumnModel().getColumn(5).setPreferredWidth(50);
            tablaE.getColumnModel().getColumn(6).setResizable(false);
            tablaE.getColumnModel().getColumn(6).setPreferredWidth(50);
            tablaE.getColumnModel().getColumn(7).setResizable(false);
            tablaE.getColumnModel().getColumn(7).setPreferredWidth(50);
            tablaE.getColumnModel().getColumn(8).setResizable(false);
            tablaE.getColumnModel().getColumn(9).setResizable(false);
            tablaE.getColumnModel().getColumn(9).setPreferredWidth(50);
            tablaE.getColumnModel().getColumn(10).setResizable(false);
            tablaE.getColumnModel().getColumn(11).setResizable(false);
            tablaE.getColumnModel().getColumn(11).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 800, 180));

        qSlider.setBackground(new java.awt.Color(255, 255, 255));
        qSlider.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        qSlider.setForeground(new java.awt.Color(0, 0, 0));
        qSlider.setMajorTickSpacing(1);
        qSlider.setMaximum(300);
        qSlider.setMinimum(100);
        qSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        qSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                qSliderStateChanged(evt);
            }
        });
        jPanel1.add(qSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 230, -1));

        rSlider.setBackground(new java.awt.Color(255, 255, 255));
        rSlider.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        rSlider.setForeground(new java.awt.Color(0, 0, 0));
        rSlider.setMajorTickSpacing(1);
        rSlider.setValue(0);
        rSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rSliderStateChanged(evt);
            }
        });
        jPanel1.add(rSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 230, -1));

        rLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        rLabel.setForeground(new java.awt.Color(0, 0, 0));
        rLabel.setText("  R : ");
        rLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(rLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 60, -1));

        qLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        qLabel.setForeground(new java.awt.Color(0, 0, 0));
        qLabel.setText("  Q : ");
        qLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(qLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 60, -1));

        labelCostoInventario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelCostoInventario.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoInventario.setText("-");
        jPanel1.add(labelCostoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 140, 20));

        labelCostoOrden1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelCostoOrden1.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoOrden1.setText("Costo de orden :");
        jPanel1.add(labelCostoOrden1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 140, 20));

        labelCostoOrden.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelCostoOrden.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoOrden.setText("-");
        jPanel1.add(labelCostoOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 140, 20));

        labelCostoEscasez1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelCostoEscasez1.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoEscasez1.setText("Costo de escasez :");
        jPanel1.add(labelCostoEscasez1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 140, 20));

        labelCostoEscasez.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelCostoEscasez.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoEscasez.setText("-");
        jPanel1.add(labelCostoEscasez, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 140, 20));

        labelCostoInventario1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelCostoInventario1.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoInventario1.setText("Costo de inventario :");
        jPanel1.add(labelCostoInventario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 140, 20));

        labelCostoTotal1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelCostoTotal1.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoTotal1.setText("Costo total :");
        jPanel1.add(labelCostoTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 140, 20));

        labelCostoTotal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelCostoTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelCostoTotal.setText("-");
        jPanel1.add(labelCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 140, 20));

        labelCTOpt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelCTOpt.setForeground(new java.awt.Color(0, 0, 0));
        labelCTOpt.setText("CT* optimo:");
        jPanel1.add(labelCTOpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 170, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Resultados de la simulación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 170, -1));

        labelQOpt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelQOpt.setForeground(new java.awt.Color(0, 0, 0));
        labelQOpt.setText("Q* optimo:  ");
        jPanel1.add(labelQOpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 170, -1));

        labelROpt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelROpt.setForeground(new java.awt.Color(0, 0, 0));
        labelROpt.setText("R* optimo:  ");
        jPanel1.add(labelROpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 170, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CAMBIAR COSTOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 140, -1));

        parametroCO.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        parametroCO.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(parametroCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 140, 20));

        parametroCFSE.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        parametroCFSE.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(parametroCFSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 140, 20));

        parametroCI.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        parametroCI.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(parametroCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 140, 20));

        parametroCFE.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        parametroCFE.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(parametroCFE, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 140, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Costo de faltante con espera ($/unidad)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 230, 20));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Costo de faltante sin espera ($/unidad)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 230, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Costo de Inventario($/unidad/año)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 230, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Costo por orden ($/orden)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 230, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FondoSimulacion.png"))); // NOI18N
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaEComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaEComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaEComponentHidden

    private void qSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_qSliderStateChanged
        actualizarTablaEventos();
    }//GEN-LAST:event_qSliderStateChanged

    private void rSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rSliderStateChanged
        actualizarTablaEventos();
    }//GEN-LAST:event_rSliderStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AgregarCostos ventana = new AgregarCostos('c');
        tablaDeEventos.clear();
        listaArticulosEnEspera.clear();
        
        ventana.setVisible(true);   
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    private void actualizarTablaEventos(){              // Si insertar es 1 inserta las filas en la tabla
        model= (DefaultTableModel) tablaE.getModel();   // Si es 0 modifica las filas ya existentes

        model.setRowCount(0);
        labelCostoInventario.setText("-");
        labelCostoOrden.setText("-");
        labelCostoEscasez.setText("-");
        labelCostoTotal.setText("-");

        qLabel.setText("  Q : "+qSlider.getValue());
        rLabel.setText("  R : "+rSlider.getValue());


        for(int i=0; i<tablaDeEventos.size(); i++){
            if(tablaDeEventos.get(i).getQ()==qSlider.getValue() && tablaDeEventos.get(i).getR()==rSlider.getValue()){
                for(int j=1; j<tablaDeEventos.get(i).getEvent().size(); j++){
                        model.addRow(new Object[]{ tablaDeEventos.get(i).getEvent().get(j).getDia(),
                                                   tablaDeEventos.get(i).getEvent().get(j).getInvInc(),
                                                   tablaDeEventos.get(i).getEvent().get(j).getNumAleatorioDemanda(),
                                                   tablaDeEventos.get(i).getEvent().get(j).getDemanda(),
                                                   tablaDeEventos.get(i).getEvent().get(j).getInvFinal(),
                                                   tablaDeEventos.get(i).getEvent().get(j).getInvPromedio(),
                                                   tablaDeEventos.get(i).getEvent().get(j).getFaltante(),
                                                   tablaDeEventos.get(i).getEvent().get(j).getNumOrden(),
                                                   tablaDeEventos.get(i).getEvent().get(j).getNumAleatorioTiempoDeEntrega(),
                                                   tablaDeEventos.get(i).getEvent().get(j).getTiempoDeEntrega(),
                                                   tablaDeEventos.get(i).getEvent().get(j).getNumAleatorioTiempoDeEspera(),
                                                   tablaDeEventos.get(i).getEvent().get(j).getTiempoDeEspera()});
                }
                labelCostoInventario.setText(String.format("%.2f",tablaDeEventos.get(i).getCostoInventario()));
                labelCostoOrden.setText(String.format("%.2f",tablaDeEventos.get(i).getCostoDeOrden()));
                labelCostoEscasez.setText(String.format("%.2f",tablaDeEventos.get(i).getCostoEscasez()));
                labelCostoTotal.setText(String.format("%.2f",tablaDeEventos.get(i).getCostoTotal()));
            break;
            }
        }
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VentanaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSimulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCTOpt;
    private javax.swing.JLabel labelCostoEscasez;
    private javax.swing.JLabel labelCostoEscasez1;
    private javax.swing.JLabel labelCostoInventario;
    private javax.swing.JLabel labelCostoInventario1;
    private javax.swing.JLabel labelCostoOrden;
    private javax.swing.JLabel labelCostoOrden1;
    private javax.swing.JLabel labelCostoTotal;
    private javax.swing.JLabel labelCostoTotal1;
    private javax.swing.JLabel labelQOpt;
    private javax.swing.JLabel labelROpt;
    private javax.swing.JLabel parametroCFE;
    private javax.swing.JLabel parametroCFSE;
    private javax.swing.JLabel parametroCI;
    private javax.swing.JLabel parametroCO;
    private javax.swing.JLabel qLabel;
    private javax.swing.JSlider qSlider;
    private javax.swing.JLabel rLabel;
    private javax.swing.JSlider rSlider;
    private javax.swing.JTable tablaE;
    // End of variables declaration//GEN-END:variables

    private void simulacionDeEventosExpress(){
        for (int i=qmin; i <= qmax; i++){
            for (int j=rmin; j <= rmax; j++){
                int orden = -2;
                int ordenesPerdidas = 0;
                int ordenesTardias=0;
                int pedidos=0;
                int invPromedio=0;
                ArrayList<Eventos> EventosPorQ_R = new ArrayList<>();
                EventosPorQ_R.clear();
                listaArticulosEnEspera.clear();
                EventosPorQ_R.add(new Eventos(0,invInicial,invInicial));
                for (int k=1; k < diasASimular+1; k++){
                    EventosPorQ_R.add(new Eventos());

                    EventosPorQ_R.get(k).dia = k;
                    //// set inv inicial
                    EventosPorQ_R.get(k).invInc = EventosPorQ_R.get(k-1).invFinal;
                    // Verificar se llego la orden
                    if (--orden == -1 ) { //Si llego la orden entonces avastece
                        EventosPorQ_R.get(k).invInc = EventosPorQ_R.get(k-1).invFinal + i;
                        for (int m=0; m < listaArticulosEnEspera.size();m++){
                           if (EventosPorQ_R.get(k).invInc - listaArticulosEnEspera.get(m).cantidadArticulos < 0){
                               ordenesTardias+=EventosPorQ_R.get(k).invInc ;
                               listaArticulosEnEspera.get(m).cantidadArticulos-=EventosPorQ_R.get(k).invInc;
                               EventosPorQ_R.get(k).invInc = 0;
                               break;
                           } else {
                               ordenesTardias+=listaArticulosEnEspera.get(m).cantidadArticulos;
                               EventosPorQ_R.get(k).invInc-=listaArticulosEnEspera.get(m).cantidadArticulos;
                               listaArticulosEnEspera.remove(m);
                               m--;
                           }
                        }
                    }
                    // Satisfacer ordenes pendientes
                    for (int m=0; m < listaArticulosEnEspera.size();m++){
                        if(--listaArticulosEnEspera.get(m).dias==0){
                           ordenesPerdidas+=listaArticulosEnEspera.get(m).cantidadArticulos;
                           listaArticulosEnEspera.remove(m);
                           m--;
                        }
                    }
                    // generar numero aleatorio para la demanda
                    // determinar demanda
                    EventosPorQ_R.get(k).demanda=determinar_x_random(EventosPorQ_R.get(k).numAleatorioDemanda = Math.random(),listaDemanda);

                    // determinar inv final del dia
                    EventosPorQ_R.get(k).invFinal = EventosPorQ_R.get(k).invInc - EventosPorQ_R.get(k).demanda;

                    // Si no hay inv suficiente Gestionar tiempo de entrega
                    // determinar ordenes faltante
                    if( EventosPorQ_R.get(k).invFinal < 0){
                    EventosPorQ_R.get(k).Faltante= -EventosPorQ_R.get(k).invFinal;
                    // generar numero aleatorio para la Espera
                    // determinar Espera
                    EventosPorQ_R.get(k).tiempoDeEspera=determinar_x_random(EventosPorQ_R.get(k).numAleatorioTiempoDeEspera = Math.random(),listaTiempoDeEspera);
                         if (EventosPorQ_R.get(k).tiempoDeEspera > 0){
                            listaArticulosEnEspera.add(new ArticulosEnEspera(EventosPorQ_R.get(k).tiempoDeEspera,-EventosPorQ_R.get(k).invFinal));
                        } else {
                            ordenesPerdidas+= -EventosPorQ_R.get(k).invFinal;
                        }
                        EventosPorQ_R.get(k).invFinal=0;
                    }
                // determinar inv promedio del dia
                EventosPorQ_R.get(k).invPromedio=(EventosPorQ_R.get(k).invInc+EventosPorQ_R.get(k).invFinal)/2;
                invPromedio+=EventosPorQ_R.get(k).invPromedio;
                // Si no hay inv suficiente Colocar nueva orden
                if( EventosPorQ_R.get(k).invFinal <= j){
                    // verificar si no hay una orden pendiente
                    if(orden<=-1){
                    // determinar Entrega
                    EventosPorQ_R.get(k).tiempoDeEntrega = determinar_x_random(EventosPorQ_R.get(k).numAleatorioTiempoDeEntrega = Math.random(),listaTiempoDeEntrega);
                        orden=EventosPorQ_R.get(k).tiempoDeEntrega;
                        pedidos++;
                        EventosPorQ_R.get(k).numOrden=pedidos;
                    }
                }                
            }
            tablaDeEventos.add(new SimulacionDeEventos(i,j,EventosPorQ_R,
                    (invPromedio*(costoInv/360)),// costoInventario
                    (pedidos*costoOrd),// costoDeOrden
                    ((ordenesPerdidas*costoEscSinEspera)+(ordenesTardias*costoEscConEspera)))// costoEscasez
                );
            }
        }
    }

    private void ordenarListas(){
        Collections.sort(listaDemanda ,new Comparator<ListaDeProbabilidad>() {
                @Override
                    public int compare(ListaDeProbabilidad demanda2, ListaDeProbabilidad demanda1)
                    {
                        return  Double.compare(demanda2.indicador,demanda1.indicador);
                    }
                });

        Collections.sort(listaTiempoDeEntrega ,new Comparator<ListaDeProbabilidad>() {
                    @Override
                        public int compare(ListaDeProbabilidad demanda2, ListaDeProbabilidad demanda1)
                        {
                            return  Double.compare(demanda2.indicador,demanda1.indicador);
                        }
                    });

        Collections.sort(listaTiempoDeEspera ,new Comparator<ListaDeProbabilidad>() {
                    @Override
                        public int compare(ListaDeProbabilidad demanda2, ListaDeProbabilidad demanda1)
                        {
                            return  Double.compare(demanda2.indicador,demanda1.indicador);
                        }
                    });
    }

    private int determinar_x_random(double random, ArrayList<ListaDeProbabilidad> lista){
        double randAcumulada = 0;
        for (int m=0; m<lista.size(); m++){
            randAcumulada += lista.get(m).probabilidad;
            if (random < randAcumulada){
                return lista.get(m).indicador;
            }
        }
        return 0;
    }
    
    private void calcularQR(){
        int seleccion = JOptionPane.showOptionDialog(
            null, // Componente padre
            "Tipo de simulacion", //Mensaje
            "Seleccione una opción", // Título
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,    // null para icono por defecto.
            new Object[] { "Simulacion normal", "Modelo Matematico"},    // null para YES, NO y CANCEL
            "Simulacion normal");
        if(seleccion!=-1)  {
            if(seleccion==0) {
                qmin= (int) Math.round(Math.sqrt((2*listaDemanda.get(0).indicador*costoOrd*360)/(costoInv)));//qmin
                qmax= (int) Math.round(Math.sqrt((2*listaDemanda.get(listaDemanda.size()-1).indicador*costoOrd*360*(costoInv+costoEscConEspera))/(costoInv*costoEscConEspera)));
                rmin= (int) ((listaTiempoDeEntrega.get(0).indicador)*listaDemanda.get(0).indicador);
                rmax= (int) ((listaTiempoDeEntrega.get(listaTiempoDeEntrega.size()-1).indicador)*listaDemanda.get(listaDemanda.size()-1).indicador);
            } else {
                double mediaDemanda = (((listaDemanda.get(listaDemanda.size()-1).indicador + listaDemanda.get(0).indicador))/2);
                double mediaTiempoEntrega = (((listaTiempoDeEntrega.get(listaTiempoDeEntrega.size()-1).indicador + listaTiempoDeEntrega.get(0).indicador))/2);
                double varianzaDemanda = (((listaDemanda.get(listaDemanda.size()-1).indicador - listaDemanda.get(0).indicador))/2);
                double varianzaTiempoEntrega = (((listaTiempoDeEntrega.get(listaTiempoDeEntrega.size()-1).indicador - listaTiempoDeEntrega.get(0).indicador))/2);
                qmin= (int) ((Math.round(Math.sqrt((2*costoOrd*mediaDemanda*360)/(costoInv)))));
                qmax=qmin;
                double mediaX = mediaDemanda*mediaTiempoEntrega;
                double varianzaX = mediaTiempoEntrega*varianzaDemanda + mediaDemanda*mediaDemanda*varianzaTiempoEntrega;
                rmin =  (int) (varianzaX * calculaZ(1 - ((costoInv*qmin)/(costoEscConEspera*mediaDemanda*360))) + mediaX);
                rmax =  (int) (varianzaX * calculaZ(1 - ((costoInv*qmax)/(costoInv*qmax + costoEscSinEspera*mediaDemanda*360))) + mediaX);
            }
        } else {
            calcularQR();
        }
    }
}