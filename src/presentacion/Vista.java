/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.ScrollPane;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
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
        //getPersonajesContainer().setPreferredSize(new Dimension(500, 300));
        getPersonajesContainer().setLayout(new GridLayout(2,5));
        //JScrollPane scrollPane = new JScrollPane();
        //getPersonajesContainer().add(scrollPane);
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
                .addComponent(personajesContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(133, Short.MAX_VALUE))
            .addComponent(personajesContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton crearBtn;
    private javax.swing.JRadioButton elfoRadioBtn;
    private javax.swing.JRadioButton humanoRadioBtn;
    private javax.swing.JPanel jPanel1;
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
        personajePanel.setLayout(new GridLayout(1, 2));
        personajePanel.setSize(new Dimension(120,120));
        
        String personaje=null;
        if(rol.equals("Humano")){
            personaje="humanoPng.png";
        }else if(rol.equals("Orco")){
            personaje="orcoPng.png";
        }else if(rol.equals("Elfo")){
            personaje="elfoPng.jpg";
        }
        ImageIcon imagePersonaje = new ImageIcon("src\\presentacion\\images\\"+personaje);
        JLabel labelPersonaje = new JLabel(new ImageIcon(imagePersonaje.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        
        personajePanel.add(labelPersonaje);
        personajePanel.add(new JLabel(rol), JLabel.CENTER);
        
        
        return personajePanel;
    }
    
    public void agregarPersonajes(Personaje[] personajes){
                getPersonajesContainer().setLayout(new GridLayout(2,5));

        getPersonajesContainer().removeAll();
        for(int i=0; i<personajes.length; i++){
            getPersonajesContainer().add(iconPersonaje(personajes[i].getRol()));
            //getPersonajesContainer().add(new JLabel(personajes[i].Saludar(), JLabel.CENTER));
        }
    }
}
