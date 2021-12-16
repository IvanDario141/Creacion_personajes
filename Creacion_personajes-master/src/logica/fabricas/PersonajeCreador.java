package logica.fabricas;

import logica.prototipos.Elfo;
import logica.prototipos.Humano;
import logica.prototipos.Orco;
import logica.prototipos.Personaje;
import logica.prototipos.componentes.Arma_elfo;
import logica.prototipos.componentes.Armadura_Humano;
import logica.prototipos.componentes.Transporte_humano;
import logica.prototipos.componentes.Arma_Humano;
import logica.prototipos.componentes.Arma_orco;
import logica.prototipos.componentes.Armadura_Elfo;
import logica.prototipos.componentes.Transporte_Elfo;

public class PersonajeCreador {
    
    private Humano humano;    
    private Orco orco;
    private Elfo elfo;

    public PersonajeCreador(){
        humano = new Humano();        
        orco = new Orco();
        elfo = new Elfo();
                
        humano.setArma(new Arma_Humano());
        humano.setArmadura(new Armadura_Humano());
        humano.setTransporte(new Transporte_humano());
        humano.setRol("Humano");
        humano.getArmaduras();
             
        orco.setArma(new Arma_orco());
        orco.setArmadura(new Armadura_Elfo());
        orco.setTransporte(new Transporte_Elfo());
        orco.setRol("Orco");
        orco.getArmadura();
        
        elfo.setArma(new Arma_elfo());
        elfo.setArmadura(new Armadura_Elfo());
        elfo.setTransporte(new Transporte_humano());
        elfo.setRol("Elfo");
        elfo.getArmadura();
        
        
    }
    
    public Personaje obtenerPersonaje(String personaje) {
        if ("Humano".equals(personaje)) {
            return (Humano) humano.clone();
            
        } else if ("Orco".equals(personaje)) {
            return (Orco) orco.clone();
        } else if ("Elfo".equals(personaje)){
            return (Elfo) elfo.clone();
        }
        
        return null;
    }
    
    public String[] arreglo(String personaje){
        String partes[] = new String[3];
        
        if("Humano".equals(personaje)){
            partes[0] = humano.getArmaduras();
            partes[1] = humano.getArmas();
            partes[2] = humano.getTrans();
        }else if ("Orco".equals(personaje)) {
            partes[0] = orco.getArmaduras();
            partes[1] = humano.getArmas();
            partes[2] = humano.getTrans();
        } else if ("Elfo".equals(personaje)){
            partes[0] = elfo.getArmaduras();
            partes[1] = humano.getArmas();
            partes[2] = humano.getTrans();
        }
           
        return partes;
    }
    
}
