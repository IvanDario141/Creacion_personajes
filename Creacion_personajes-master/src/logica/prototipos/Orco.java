package logica.prototipos;

public class Orco extends Personaje{
    private String armaduras = "  Yelmo orco  ";
    private String armas = "  Hacha   ";
    private String trans = "  Huargos  ";
    private String url = "src\\presentacion\\images\\orcoPng.png";
    
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
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
