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
    
    private final Humano humano;    
    private final Orco orco;
    private final Elfo elfo;
    
    public PersonajeCreador(){
        
        humano = new Humano();        
        orco = new Orco();
        elfo = new Elfo();
                
        humano.setArma(new Arma_Humano());
        humano.setArmadura(new Armadura_Humano());
        humano.setTransporte(new Transporte_humano());
        humano.setRol("Humano");
        
        orco.setArma(new Arma_orco());
        orco.setArmadura(new Armadura_Elfo());
        orco.setTransporte(new Transporte_Elfo());
        orco.setRol("Orco");
                
        elfo.setArma(new Arma_elfo());
        elfo.setArmadura(new Armadura_Elfo());
        elfo.setTransporte(new Transporte_humano());
        elfo.setRol("Elfo");
        
    }
    
    public Personaje obtenerPersonaje(String personaje) {
        switch (personaje) {
            case "Humano":
                return (Humano) humano.clone();
            case "Orco":
                return (Orco) orco.clone();
            case "Elfo":
                return (Elfo) elfo.clone();
            default:
                break;
        }
        return null;
    }
    
    public String[] arreglo(String personaje){
        String partes[] = new String[4];
        
        switch (personaje) {
            case "Humano":
                partes[0] = humano.getArmaduras();
                partes[1] = humano.getArmas();
                partes[2] = humano.getTrans();
                partes[3] = humano.getUrl();
                break;
            case "Orco":
                partes[0] = orco.getArmaduras();
                partes[1] = orco.getArmas();
                partes[2] = orco.getTrans();
                partes[3] = orco.getUrl();
                break;
            case "Elfo":
                partes[0] = elfo.getArmaduras();
                partes[1] = elfo.getArmas();
                partes[2] = elfo.getTrans();
                partes[3] = elfo.getUrl();
                break;
            default:
                break;
        }
           
        return partes;
    }
    
}
