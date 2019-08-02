package simuladordeinventario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static simuladordeinventario.SimuladorDeInventario.*;

public class CargaCostos extends javax.swing.JFrame {

    private final String URL = "./test/Costos.txt";
    File archivo = null;
    
    public CargaCostos() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setTitle("Cargar costos");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cargar Demanda");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Simplified Arabic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cargar Costos");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Crear nuevo archivo");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 230, 25));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Cargar archivo");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 230, 25));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Seleccionar archivo");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 230, 25));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Agregar datos Manuelmente");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 230, 25));

        jButton5.setBackground(new java.awt.Color(0, 51, 102));
        jButton5.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Atras");
        jButton5.setFocusPainted(false);
        jButton5.setRequestFocusEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 110, 43));

        jButton6.setBackground(new java.awt.Color(0, 51, 102));
        jButton6.setFont(new java.awt.Font("Simplified Arabic", 1, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Continuar");
        jButton6.setFocusPainted(false);
        jButton6.setRequestFocusEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 120, 43));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FondoInicial.png"))); // NOI18N
        jLabel2.setFocusable(false);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 520, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        archivo = new File(URL);
        try {
            archivo.delete();
            if (archivo.createNewFile()){
                FileWriter FW = new FileWriter(archivo);
                PrintWriter PW = new PrintWriter(FW);
                PW.println("Costo de inventario" + "=" + "Costo 1$/unidad/año");
                PW.println("Costo de ordenar" + "=" + "Costo 2$/orden");
                PW.println("Costo de faltante con espera de cliente" + "=" + "Costo$/unidad");
                PW.println("Costo de faltante sin espera de cliente" + "=" + "Costo$/unidad");
                PW.println("Inventario inicial" + "=" + "inventario");
                PW.println("Cantidad de días a simular" + "=" + "dias");
                FW.close();
                PW.close();  
                ProcessBuilder PB = new ProcessBuilder(); 
                PB.command("cmd.exe","/c",archivo.getPath());
                PB.start();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error"); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            archivo = new File(URL);
            if (archivo.exists()){
                ProcessBuilder PB = new ProcessBuilder();
                PB.command("cmd.exe","/c",archivo.getPath());
                PB.start();
            } else {
               JOptionPane.showMessageDialog(null, "Cree un nuevo Archivo",
                "Archivo no existente",JOptionPane.ERROR_MESSAGE);  
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error"); 
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            JFileChooser browser = new JFileChooser(new File("./test/"));
            browser.setFileFilter(new FileTypeFilter(".txt","Text File"));
            int confirmation = browser.showDialog(null,"Seleccionar");
            if (confirmation != JFileChooser.APPROVE_OPTION){
                JOptionPane.showMessageDialog(null, "No Selecciono un archivo");
            } else {
                archivo = browser.getSelectedFile();
                ProcessBuilder PB = new ProcessBuilder();
                PB.command("cmd.exe","/c",archivo.getPath());
                PB.start();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error"); 
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new AgregarCostos().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new CargaTiempoDeEspera().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if ( archivo != null ){
            try {
                
                FileReader FR = new FileReader(archivo);
                BufferedReader BR = new BufferedReader(FR);
                String linea;
                linea = BR.readLine();
                costoInv =Double.parseDouble((String) linea.subSequence(linea.indexOf("=")+1,linea.indexOf("$")));
                linea = BR.readLine();
                costoOrd =Double.parseDouble((String) linea.subSequence(linea.indexOf("=")+1,linea.indexOf("$")));
                linea = BR.readLine();
                costoEscConEspera =Double.parseDouble((String) linea.subSequence(linea.indexOf("=")+1,linea.indexOf("$")));
                linea = BR.readLine();
                costoEscSinEspera =Double.parseDouble((String) linea.subSequence(linea.indexOf("=")+1,linea.indexOf("$")));
                linea = BR.readLine();
                invInicial =Integer.parseInt((String) linea.subSequence(linea.indexOf("=")+1,linea.length()));
                linea = BR.readLine();
                diasASimular =Integer.parseInt((String) linea.subSequence(linea.indexOf("=")+1,linea.length()));
                
                FR.close();
                BR.close();
                
                if(costoInv<=0 || costoOrd<=0 || costoEscConEspera<=0 || costoEscSinEspera<=0 || invInicial<0 || diasASimular<=0){
                    JOptionPane.showMessageDialog(null, "Error de formato");
                }else{
                    this.setVisible(false);
                    new VentanaSimulacion().setVisible(true);
                }    
            }  catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }   catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error de Formato",
                        "numberFormatException",JOptionPane.ERROR_MESSAGE);  
            }   catch(StringIndexOutOfBoundsException ex){
               JOptionPane.showMessageDialog(null, "Error de Formato",
                        "StringIndexOutOfBoundsException",JOptionPane.ERROR_MESSAGE);
            }
        } else {
                JOptionPane.showMessageDialog(null, "No Selecciono un archivo","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(CargaCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargaCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargaCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargaCostos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargaCostos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
