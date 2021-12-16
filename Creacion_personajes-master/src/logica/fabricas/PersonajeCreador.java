package logica.fabricas;

import logica.prototipos.Elfo;
import logica.prototipos.Humano;
import logica.prototipos.Orco;
import logica.prototipos.Personaje;
import logica.prototipos.componentes.Espada_acero_punzante_elfo;
import logica.prototipos.componentes.Armadura_Humano;
import logica.prototipos.componentes.Transporte_humano;
import logica.prototipos.componentes.Espada_humano;
import logica.prototipos.componentes.EspadaUruk_hai_orco;
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
                
        humano.setArma(new Espada_humano());
        humano.setArmadura(new Armadura_Humano());
        humano.setTransporte(new Transporte_humano());
        humano.setRol("Humano");
        
                
        orco.setArma(new EspadaUruk_hai_orco());
        orco.setArmadura(new Armadura_Elfo());
        orco.setTransporte(new Transporte_Elfo());
        orco.setRol("Orco");
        
        elfo.setArma(new Espada_acero_punzante_elfo());
        elfo.setArmadura(new Armadura_Elfo());
        elfo.setTransporte(new Transporte_humano());
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
