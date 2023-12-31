/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RYZEN
 */
public class Divisas extends javax.swing.JFrame {

    double valor;
    public Divisas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto_divisa = new javax.swing.JTextField();
        divisaInicial = new javax.swing.JComboBox<>();
        divisaFinal = new javax.swing.JComboBox<>();
        convertir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        titulo_moneda = new javax.swing.JLabel();
        de = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cantidad_temperatura = new javax.swing.JLabel();
        texto_temperatura = new javax.swing.JTextField();
        temperaturaInicial = new javax.swing.JComboBox<>();
        temperaturaFinal = new javax.swing.JComboBox<>();
        de1 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultadoTemperatura = new javax.swing.JTextArea();
        convertirTemperatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor Alura");
        setBackground(new java.awt.Color(79, 210, 195));

        texto_divisa.setColumns(10);
        texto_divisa.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        texto_divisa.setText("0");

        divisaInicial.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        divisaInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "COP" }));

        divisaFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "COP" }));

        convertir.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        convertir.setText("Convertir");
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });

        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        titulo_moneda.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        titulo_moneda.setText("Ingresa la cantidad");

        de.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        de.setText("De:");

        a.setText("A:");

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel1.setText("Conversor Alura");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel2.setText("Divisas");

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel3.setText("Temperatura");

        cantidad_temperatura.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cantidad_temperatura.setText("Ingresa la cantidad");

        texto_temperatura.setColumns(10);
        texto_temperatura.setText("0");

        temperaturaInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centigrados C°", "Fahrenheit °F", "Kelvin K" }));

        temperaturaFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centigrados C°", "Fahrenheit °F", "Kelvin K" }));

        de1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        de1.setText("De:");

        a1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        a1.setText("A:");

        resultadoTemperatura.setColumns(20);
        resultadoTemperatura.setRows(5);
        jScrollPane2.setViewportView(resultadoTemperatura);

        convertirTemperatura.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        convertirTemperatura.setText("Convertir");
        convertirTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(263, 263, 263))))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(convertirTemperatura))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texto_temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(temperaturaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(temperaturaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo_moneda)
                        .addGap(30, 30, 30)
                        .addComponent(de)
                        .addGap(82, 82, 82)
                        .addComponent(a))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texto_divisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(divisaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(convertir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(divisaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cantidad_temperatura)
                        .addGap(56, 56, 56)
                        .addComponent(de1)
                        .addGap(115, 115, 115)
                        .addComponent(a1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo_moneda)
                    .addComponent(de)
                    .addComponent(a))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_divisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(convertir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad_temperatura)
                    .addComponent(de1)
                    .addComponent(a1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temperaturaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temperaturaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(convertirTemperatura)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        double valor = Double.parseDouble(texto_divisa.getText());
        int Inicial = divisaInicial.getSelectedIndex();
        int Final = divisaFinal.getSelectedIndex();
        
        //puente
        Operaciones puente = new Operaciones();
        puente.setValor(valor);
        puente.setInicial(Inicial);
        puente.setFinal(Final);

        //Ejecutar el metodo
         double resultadofinal = puente.convertir();

         //Limpiar el resltado caa vez que le de clic
         resultado.setText("");

        //Mostrar
        resultado.append("" + resultadofinal);
    }//GEN-LAST:event_convertirActionPerformed

    private void convertirTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {
        //Valores a enviar a la clase operaciones de temperatura
        double valorTemperatura = Double.parseDouble(texto_temperatura.getText());
        int temperaturaInicia = temperaturaInicial.getSelectedIndex();
        int temperaturaFinaliza = temperaturaFinal.getSelectedIndex();

        //Puente para pasarlse los valores a la clase de operaciones con temperatura
        OperacionesTemperatura puenteTemperatura = new OperacionesTemperatura();
        puenteTemperatura.setValorTemperaura(valorTemperatura);
        puenteTemperatura.setTemperaturaInicial(temperaturaInicia);
        puenteTemperatura.setTemperaturaFinal(temperaturaFinaliza);

        //Ejecutar el metodo
        double resultadoFinalTemperatura = puenteTemperatura.convertirTemperatura();

        //Limpiar el resltado caa vez que le de clic
        resultadoTemperatura.setText("");

        //Mostrar
        resultadoTemperatura.append("" + resultadoFinalTemperatura);

    }

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
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Divisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel cantidad_temperatura;
    private javax.swing.JButton convertir;
    private javax.swing.JButton convertirTemperatura;
    private javax.swing.JLabel de;
    private javax.swing.JLabel de1;
    private javax.swing.JComboBox<String> divisaFinal;
    private javax.swing.JComboBox<String> divisaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextArea resultadoTemperatura;
    private javax.swing.JComboBox<String> temperaturaFinal;
    private javax.swing.JComboBox<String> temperaturaInicial;
    private javax.swing.JTextField texto_divisa;
    private javax.swing.JTextField texto_temperatura;
    private javax.swing.JLabel titulo_moneda;
    // End of variables declaration//GEN-END:variables
}
