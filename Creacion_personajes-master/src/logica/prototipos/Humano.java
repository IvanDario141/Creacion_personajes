package logica.prototipos;

public class Humano extends Personaje{
    
    private String armaduras = "Armadura de pecho";
    private String armas = "Espada de acero";
    private String trans = "Caballo";

    public String getArmaduras() {
        return armaduras;
    }

    public void setArmaduras(String armaduras) {
        this.armaduras = armaduras;
    }
    
    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armaduras = armaduras;
    }
    
    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }
}
