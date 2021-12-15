package main;

import presentacion.Modelo;

public class App {
    
    private Modelo modelo;
    
    public App(){
        modelo = new Modelo();
        modelo.iniciar();
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new App();
    }
    
}
