package autonoma.Vehiculo.views;
import autonoma.Vehiculo.models.Vehiculo;
/**
 *
 * @author Abraham Velasquez 
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private  Vehiculo auto;
    
    public VentanaPrincipal(Vehiculo auto1) {
        initComponents();
        this.auto = auto1;
    }

    public VentanaPrincipal() {
        initComponents();
    }
    

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }

    public Vehiculo getAuto() {
        return auto;
    }
     
    
    
    
    
    public void encender(){
        auto.encender();
    }
    public void apagar(){
        auto.apagar();
    }
    public void frenar(int frenado){
        auto.frenar(frenado);
    }
    public void acelerar(int acelerar){
        auto.acelerar(acelerar);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGoTaller = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnCoche = new javax.swing.JButton();
        btnTaller = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btnGoTaller.setText("Ir al taller");
        btnGoTaller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoTallerMouseClicked(evt);
            }
        });
        btnGoTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoTallerActionPerformed(evt);
            }
        });

        btnStart.setText("Empezar");
        btnStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartMouseClicked(evt);
            }
        });
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnCoche.setBackground(new java.awt.Color(0, 153, 153));
        btnCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/Vehiculo/images/coche.png"))); // NOI18N
        btnCoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCocheMouseClicked(evt);
            }
        });
        btnCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocheActionPerformed(evt);
            }
        });

        btnTaller.setBackground(new java.awt.Color(0, 153, 153));
        btnTaller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/Vehiculo/images/llave-inglesa.png"))); // NOI18N
        btnTaller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTallerMouseClicked(evt);
            }
        });
        btnTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTallerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Condensed", 0, 36)); // NOI18N
        jLabel1.setText("Simulador de Vehículo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnGoTaller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart)
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnTaller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCoche)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaller)
                    .addComponent(btnCoche))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGoTaller)
                    .addComponent(btnStart))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTallerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTallerActionPerformed

    private void btnGoTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoTallerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoTallerActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        VentanaVehiculo v = new VentanaVehiculo(this, true);
        v.setVisible(true);
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnCocheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCocheMouseClicked
        System.out.println("Conducir");
    }//GEN-LAST:event_btnCocheMouseClicked

    private void btnGoTallerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoTallerMouseClicked
        System.out.println("Configurar Vehiculo");
    }//GEN-LAST:event_btnGoTallerMouseClicked

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
        System.out.println("Conducir");
    }//GEN-LAST:event_btnStartMouseClicked

    private void btnTallerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTallerMouseClicked
        System.out.println("Configurar Vehiculo");
    }//GEN-LAST:event_btnTallerMouseClicked

    private void btnCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocheActionPerformed
       VentanaVehiculo v = new VentanaVehiculo(this, true);
       v.setVisible(true);
       
    }//GEN-LAST:event_btnCocheActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoche;
    private javax.swing.JButton btnGoTaller;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnTaller;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
