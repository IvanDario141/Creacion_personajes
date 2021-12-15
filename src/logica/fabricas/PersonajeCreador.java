package logica.fabricas;

import logica.prototipos.Elfo;
import logica.prototipos.Humano;
import logica.prototipos.Orco;
import logica.prototipos.Personaje;
import logica.prototipos.componentes.Arco;
import logica.prototipos.componentes.ArmaduraHierro;
import logica.prototipos.componentes.Caballo;
import logica.prototipos.componentes.Espada;
import logica.prototipos.componentes.Hacha;
import logica.prototipos.componentes.Harapo;
import logica.prototipos.componentes.Jabali;
import logica.prototipos.componentes.Tunica;

public class PersonajeCreador {
    
    private Humano humano;    
    private Orco orco;
    private Elfo elfo;

    public PersonajeCreador(){
        humano = new Humano();        
        orco = new Orco();
        elfo = new Elfo();
        
        humano.setArma(new Espada());
        humano.setArmadura(new ArmaduraHierro());
        humano.setTransporte(new Caballo());
        humano.setRol("Humano");
        
        orco.setArma(new Hacha());
        orco.setArmadura(new Harapo());
        orco.setTransporte(new Jabali());
        orco.setRol("Orco");
        
        elfo.setArma(new Arco());
        elfo.setArmadura(new Tunica());
        elfo.setTransporte(new Caballo());
        elfo.setRol("Elfo");

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
    
}
