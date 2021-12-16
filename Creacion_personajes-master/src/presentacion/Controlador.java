package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logica.prototipos.Personaje;

public class Controlador implements ActionListener{
    
    private Vista vista;
    private Modelo modelo;
    
    public Controlador(Vista v){
        vista = v;
        modelo = v.getModelo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String personaje = null;
        Personaje[] personajes = null;
        if(vista.getHumanoRadioBtn().isSelected()){
            personaje = "Humano";
        }else if(vista.getOrcoRadioBtn().isSelected()){
            personaje = "Orco";
        }else if(vista.getElfoRadioBtn().isSelected()){
            personaje = "Elfo";
        }
        
        modelo.crearPersonaje(personaje, (int) vista.getNumeroPersonajes().getValue());
        
    }
    
}
