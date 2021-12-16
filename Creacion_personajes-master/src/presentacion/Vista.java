/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import logica.prototipos.Personaje;

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
        buttonGroup1.add(orcoRadioBtn);
        buttonGroup1.add(elfoRadioBtn);
        getPersonajesContainer().setLayout(new GridLayout(2,5));
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

    public JRadioButton getOrcoRadioBtn() {
        return orcoRadioBtn;
    }
    
    public JPanel getPersonajesContainer(){
        return personajesContainer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        humanoRadioBtn = new javax.swing.JRadioButton();
        orcoRadioBtn = new javax.swing.JRadioButton();
        elfoRadioBtn = new javax.swing.JRadioButton();
        crearBtn = new javax.swing.JButton();
        numeroPersonajes = new javax.swing.JSpinner();
        personajesContainer = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        humanoRadioBtn.setText("Humano");

        orcoRadioBtn.setText("Orco");

        elfoRadioBtn.setText("Elfo");

        crearBtn.setText("Crear");
        crearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBtnActionPerformed(evt);
            }
        });

        numeroPersonajes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        personajesContainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout personajesContainerLayout = new javax.swing.GroupLayout(personajesContainer);
        personajesContainer.setLayout(personajesContainerLayout);
        personajesContainerLayout.setHorizontalGroup(
            personajesContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        personajesContainerLayout.setVerticalGroup(
            personajesContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearBtn)
                    .addComponent(numeroPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orcoRadioBtn)
                    .addComponent(humanoRadioBtn)
                    .addComponent(elfoRadioBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personajesContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(humanoRadioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orcoRadioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elfoRadioBtn)
                .addGap(8, 8, 8)
                .addComponent(numeroPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crearBtn)
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(personajesContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton crearBtn;
    private javax.swing.JRadioButton elfoRadioBtn;
    private javax.swing.JRadioButton humanoRadioBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner numeroPersonajes;
    private javax.swing.JRadioButton orcoRadioBtn;
    private javax.swing.JPanel personajesContainer;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
        getCrearBtn().addActionListener(getControlador());
    }
    
    private JPanel iconPersonaje(String rol){
        
        JPanel personajePanel = new JPanel();
        personajePanel.setLayout(new GridLayout(1,0));
        
        String personaje=null;
        if(rol.equals("Humano")){
            personaje="humanoPng.png";
        }else if(rol.equals("Orco")){
            personaje="orcoPng.png";
        }else if(rol.equals("Elfo")){
            personaje="elfoPng.jpg";
        }
        ImageIcon imagePersonaje = new ImageIcon("src\\presentacion\\images\\"+personaje);
        JLabel labelPersonaje = new JLabel(new ImageIcon(imagePersonaje.getImage().getScaledInstance(80, 90, SwingConstants.NORTH)));
        personajePanel.add(labelPersonaje);
        //JLabel lbl2 = new JLabel(rol);
        JLabel lb12 = new JLabel(rol, SwingConstants.LEFT);
        //lb12.setVerticalAlignment(SwingConstants.CENTER);
        Font font = new Font("SansSerif", Font.BOLD, 20);
        lb12.setFont(font);
        personajePanel.add(lb12);
         
        
        
        return personajePanel;
    }
    
    public void agregarPersonajes(Personaje[] personajes){
                getPersonajesContainer().setLayout(new GridLayout(2,5));

        getPersonajesContainer().removeAll();
        for(int i=0; i<personajes.length; i++){
            getPersonajesContainer().add(iconPersonaje(personajes[i].getRol()));
            this.setVisible(true);
            //getPersonajesContainer().add(new JLabel(personajes[i].Saludar(), JLabel.CENTER));
        }
    }
}
