package calcip;
public class calculadora extends javax.swing.JFrame {

    public calculadora() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        mask = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        binAddress = new javax.swing.JLabel();
        binMask = new javax.swing.JLabel();
        binNetwork = new javax.swing.JLabel();
        binBroadcast = new javax.swing.JLabel();
        decAddress = new javax.swing.JLabel();
        decMask = new javax.swing.JLabel();
        decNetwork = new javax.swing.JLabel();
        decBroadcast = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        availableHost = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        availableNet = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        claseIP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dirección IP:");

        jLabel2.setText("/");

        jLabel3.setText("BINARIO");

        jLabel4.setText("Mascara:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Network:");

        jLabel7.setText("Broadcast:");

        jLabel8.setText("DECIMAL");

        jLabel9.setText("Dirección:");

        jLabel10.setText("Mascara:");

        jLabel11.setText("Network:");

        jLabel12.setText("Broadcast:");

        btnCalcular.setText("Calcular");
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcularMouseClicked(evt);
            }
        });

        jLabel13.setText("Total de hosts disponibles:");

        jLabel14.setText("Total de network disponibles:");

        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel15.setText("Clase de IP:");

        claseIP.setText("jLabel16");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mask, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(decBroadcast, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(binAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(binNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(binBroadcast, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(binMask, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(decNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(decMask, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(availableHost))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(availableNet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(claseIP, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(mask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(binAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(binMask))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(binNetwork))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(binBroadcast))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(decAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(decMask))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(decNetwork))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(decBroadcast))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(availableHost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(availableNet, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(claseIP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseClicked
        // TODO add your handling code here:
        String bq1 = Integer.toBinaryString(Integer.parseInt(q1.getText()));
        String bq2 = Integer.toBinaryString(Integer.parseInt(q2.getText()));
        String bq3 = Integer.toBinaryString(Integer.parseInt(q3.getText()));
        String bq4 = Integer.toBinaryString(Integer.parseInt(q4.getText()));
        
        //Tomamos los 8 digitos y los pasamos de byte a string
        String ipByte1 = String.format("%08d", Integer.parseInt(bq1));
        String ipByte2 = String.format("%08d", Integer.parseInt(bq2));
        String ipByte3 = String.format("%08d", Integer.parseInt(bq3));
        String ipByte4 = String.format("%08d", Integer.parseInt(bq4));
        
        //Creamos un integer para la mascara
        int bitMask = Integer.valueOf(mask.getText());
        //Integer de 32 bits para unir toda la IP de los digitos ya metidos
        int ipBin = Integer.parseInt(ipByte1+ipByte2+ipByte3,2);
        //Parseamos a 31 bits
        ipBin = (ipBin << 8) + Integer.parseInt(ipByte4,2);
        //Creamos la mascara a 32 bits
        int maskBin = ~0 << (32-bitMask);
        //Definimos la operacion para netBin
        int netBin = ipBin & maskBin;
        //O una operacion para el broadcast
        int bcBin  = ipBin | ~maskBin;
        
        String strIpBin = Integer.toBinaryString(ipBin);
        String[] printIpBin=strIpBin.split("(?<=\\G........)");
        String strMaskBin = Integer.toBinaryString(maskBin);
        String[] printMaskBin=strMaskBin.split("(?<=\\G........)");
        String strNetBin = Integer.toBinaryString(netBin);
        String[] printNetBin = strNetBin.split("(?<=\\G........)");
        String strBcBin = Integer.toBinaryString(bcBin);
        String[] printBcBin = strBcBin.split("(?<=\\G........)");
        
        //Imprimimos resultado en la etiqueta correspondiente
        binAddress.setText(printIpBin[0]+"."+printIpBin[1]+"."+printIpBin[2]+"."+printIpBin[3]);
        binMask.setText(printMaskBin[0]+"."+printMaskBin[1]+"."+printMaskBin[2]+"."+printMaskBin[3]);
        binNetwork.setText(printNetBin[0]+"."+printNetBin[1]+"."+printNetBin[2]+"."+printNetBin[3]);
        binBroadcast.setText(printBcBin[0]+"."+printBcBin[1]+"."+printBcBin[2]+"."+printBcBin[3]);
        
        decAddress.setText(
                q1.getText()+"."+
                q2.getText()+"."+
                q3.getText()+"."+
                q4.getText()
        );
        
        decMask.setText(
                String.valueOf(Integer.parseInt(printMaskBin[0],2)) + "." +
                String.valueOf(Integer.parseInt(printMaskBin[1],2)) + "." +
                String.valueOf(Integer.parseInt(printMaskBin[2],2)) + "." +
                String.valueOf(Integer.parseInt(printMaskBin[3],2))        
        );
        
        decNetwork.setText (
                String.valueOf(Integer.parseInt(printNetBin[0],2)) + "." +
                String.valueOf(Integer.parseInt(printNetBin[1],2)) + "." +
                String.valueOf(Integer.parseInt(printNetBin[2],2)) + "." +
                String.valueOf(Integer.parseInt(printNetBin[3],2)) 
        );
        
        decBroadcast.setText (
                String.valueOf(Integer.parseInt(printBcBin[0],2)) + "." +
                String.valueOf(Integer.parseInt(printBcBin[1],2)) + "." +
                String.valueOf(Integer.parseInt(printBcBin[2],2)) + "." +
                String.valueOf(Integer.parseInt(printBcBin[3],2))
        );
        
        availableHost.setText(String.valueOf( ~maskBin ) );
        availableNet.setText( String.valueOf( ~(~0 << bitMask) ));
        
        int oct1 = Integer.parseInt(q1.getText());
        int oct2 = Integer.parseInt(q2.getText());
        int oct3 = Integer.parseInt(q3.getText());
        int oct4 = Integer.parseInt(q4.getText());
        
        if (oct1 <= 127 && oct2 <= 255 && oct3 <= 255 && oct4 <= 254) {
            claseIP.setText("La Dirección IP Es clase A");
        } else if (oct1 <= 191 && oct2 <= 255 && oct3 <= 255 && oct4 <= 254) {
            claseIP.setText("La Dirección IP es Clase B");
        } else if (oct1 <= 223 && oct2 <= 255 && oct3 <= 255 && oct4 <= 254) {
            claseIP.setText("La Dirección IP es Clase C");
        } else if (oct1 <= 239 && oct2 <= 255 && oct3 <= 255 && oct4 <= 254) {
            claseIP.setText("La Dirección IP es Clase D");
    }
    }//GEN-LAST:event_btnCalcularMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel availableHost;
    private javax.swing.JLabel availableNet;
    private javax.swing.JLabel binAddress;
    private javax.swing.JLabel binBroadcast;
    private javax.swing.JLabel binMask;
    private javax.swing.JLabel binNetwork;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel claseIP;
    private javax.swing.JLabel decAddress;
    private javax.swing.JLabel decBroadcast;
    private javax.swing.JLabel decMask;
    private javax.swing.JLabel decNetwork;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField mask;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    // End of variables declaration//GEN-END:variables
}
