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
        String b[] = new String[3];
        for(int i=0; i<numero; i++){
            personajes[i] = personajeCreador.obtenerPersonaje(personaje);
        }   
        
        b = personajeCreador.arreglo(personaje);
        System.out.println("Armadura: "+b[0]);
        System.out.println("Arma: "+b[1]);
        System.out.println("Transporte: "+b[2]);
        getVista().setSize(300, 400);
        getVista().setSize(300+(100*numero),400);
        getVista().agregarPersonajes(personajes);
    }
    
    public void iniciar(){
        getVista().setSize(300, 400);
        getVista().setResizable(false);
        getVista().setVisible(true);
        getVista().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
