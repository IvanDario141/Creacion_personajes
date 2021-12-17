package logica.prototipos;

public class Humano extends Personaje{

    private String armaduras = "Armadura de pecho   ";
    private String armas = "Espada de acero   ";
    private String trans = "Caballo   ";
    private String url = "src\\presentacion\\images\\humanoPng.png";
   
    
    public String getArmaduras() {
        return armaduras;
    }

    public void setArmaduras(String armaduras) {
        this.armaduras = armaduras;
    }
    
    public String getArmas() {
        return armas;
    }

    public void setArmas(String arma) {
        this.armas = arma;
    }
    
    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
