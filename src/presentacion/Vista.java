/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;

/**
 *
 * @author CAMILO
 */
public class Vista extends javax.swing.JFrame {

    private Modelo modelo;
    private Controlador controlador;
    
    public Vista(Modelo m) {
        modelo = m;
        initComponents();
        buttonGroup1.add(humanoRadioBtn);
        buttonGroup1.add(orcoRdioBtn);
        buttonGroup1.add(elfoRadioBtn);
        capturarEventos();
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Controlador getControlador() {
        if(controlador == null){
            controlador = new Controlador(this);
        }
        return controlador;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JButton getCrearBtn() {
        return crearBtn;
    }

    public JRadioButton getElfoRadioBtn() {
        return elfoRadioBtn;
    }

    public JRadioButton getHumanoRadioBtn() {
        return humanoRadioBtn;
    }

    public JSpinner getNumeroPersonajes() {
        return numeroPersonajes;
    }

    public JRadioButton getOrcoRdioBtn() {
        return orcoRdioBtn;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSpinner1 = new javax.swing.JSpinner();
        humanoRadioBtn = new javax.swing.JRadioButton();
        orcoRdioBtn = new javax.swing.JRadioButton();
        elfoRadioBtn = new javax.swing.JRadioButton();
        crearBtn = new javax.swing.JButton();
        numeroPersonajes = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        humanoRadioBtn.setText("Humano");

        orcoRdioBtn.setText("Orco");

        elfoRadioBtn.setText("Elfo");

        crearBtn.setText("Crear");

        numeroPersonajes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numeroPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orcoRdioBtn)
                            .addComponent(humanoRadioBtn)
                            .addComponent(elfoRadioBtn)
                            .addComponent(crearBtn))
                        .addGap(53, 310, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(humanoRadioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orcoRdioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elfoRadioBtn)
                .addGap(8, 8, 8)
                .addComponent(numeroPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crearBtn)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton crearBtn;
    private javax.swing.JRadioButton elfoRadioBtn;
    private javax.swing.JRadioButton humanoRadioBtn;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner numeroPersonajes;
    private javax.swing.JRadioButton orcoRdioBtn;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
        getCrearBtn().addActionListener(getControlador());
    }
}
