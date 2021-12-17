package logica.prototipos;

public class Elfo extends Personaje{
    private String armaduras = "  Armadura de Protección  ";
    private String armas = "  Arco   ";
    private String trans = "  Aparicion   ";
    private String url = "src\\presentacion\\images\\elfoPng.jpg";
    
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
