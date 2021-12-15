package presentacion;

import logica.fabricas.PersonajeCreador;
import logica.prototipos.Personaje;

public class Modelo {
    
    private Vista vista;
    private PersonajeCreador personajeCreador;
    
    public Modelo(){
        personajeCreador = new PersonajeCreador();
    }
    
    public Personaje[] crearPersonaje(String personaje, int numero){
        Personaje[] personajes = new Personaje[numero];
        for(int i=0; i<numero; i++){
            personajes[i] = personajeCreador.obtenerPersonaje(personaje);
        }   
        return personajes;
    }

    public Vista getVista() {
        if(vista == null){
            vista = new Vista(this);
        }
        return vista;
    }
    
    public void iniciar(){
        getVista().setSize(300, 300);
        getVista().setResizable(false);
        getVista().setVisible(true);
    }
}
