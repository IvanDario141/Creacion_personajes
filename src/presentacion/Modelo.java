package presentacion;

import javax.swing.JFrame;
import logica.fabricas.PersonajeCreador;
import logica.prototipos.Personaje;

public class Modelo {
    
    private Vista vista;
    private PersonajeCreador personajeCreador;
    
    public Modelo(){
        personajeCreador = new PersonajeCreador();
    }
    
    public Vista getVista() {
        if(vista == null){
            vista = new Vista(this);
        }
        return vista;
    }
    
    public void crearPersonaje(String personaje, int numero){
        Personaje[] personajes = new Personaje[numero];
        for(int i=0; i<numero; i++){
            personajes[i] = personajeCreador.obtenerPersonaje(personaje);
        }   
        getVista().agregarPersonajes(personajes);
        //return personajes;
    }
    
    public void iniciar(){
        getVista().setSize(800, 400);
        getVista().setResizable(false);
        getVista().setVisible(true);
        getVista().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
