/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;

public class VistaPrueba extends JFrame{
    
    private Modelo modelo;
    private Controlador controlador;
    private ButtonGroup botonesPersonajes;
    private JRadioButton humanoRadioBtn;
    private JRadioButton orcoRadioBtn;
    private JRadioButton elfoRadioBtn;
    private JSpinner numeroPersonajes;
    private JButton crearPersonajesBtn;

    public Modelo getModelo() {
        return modelo;
    }

    /*public Controlador getControlador() {
        if(controlador==null){
            controlador = new Controlador(this);
        }
        return controlador;
    }*/

    public ButtonGroup getBotonesPersonajes() {
        return botonesPersonajes;
    }

    public JRadioButton getHumanoRadioBtn() {
        return humanoRadioBtn;
    }

    public JRadioButton getOrcoRadioBtn() {
        return orcoRadioBtn;
    }

    public JRadioButton getElfoRadioBtn() {
        return elfoRadioBtn;
    }

    public JSpinner getNumeroPersonajes() {
        return numeroPersonajes;
    }

    public JButton getCrearPersonajesBtn() {
        return crearPersonajesBtn;
    }
    
    
    
    public VistaPrueba(Modelo m){
        modelo = m;
        initComponents();
        //capturarEventos();
    }
    
    public void initComponents(){
        
    }

    /*private void capturarEventos() {
        getCrearPersonajesBtn().addActionListener(getControlador());
    }*/
    
}
