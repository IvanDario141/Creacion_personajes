package logica.prototipos;

import logica.prototipos.componentes.Arma;
import logica.prototipos.componentes.Armadura;
import logica.prototipos.componentes.Transporte;

public class Personaje implements Cloneable{
    
    private String rol;
    private Arma arma;
    private Armadura armadura;
    private Transporte transporte;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
    
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    @Override
    public Personaje clone() {
        Personaje personajeClonado = null;
        try {
            personajeClonado = (Personaje) super.clone();
            personajeClonado.setArma(arma);            
            personajeClonado.setArmadura(armadura);
            personajeClonado.setTransporte(transporte);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } 
        return personajeClonado;
    }

    public String Saludar() {
        return "Hola soy un "+rol;
    }
    
}
