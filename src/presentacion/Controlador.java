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
        }else if(vista.getOrcoRdioBtn().isSelected()){
            personaje = "Orco";
        }else if(vista.getElfoRadioBtn().isSelected()){
            personaje = "Elfo";
        }
        
        personajes = modelo.crearPersonaje(personaje, (int) vista.getNumeroPersonajes().getValue());
        
        for(int i=0; i<personajes.length; i++){
            System.out.println(personajes[i].Saludar()+", numero "+i);
        }
        //System.out.println(vista.getNumeroPersonajes().getValue() + " "+ personaje +"s");
        
    }
    
}
