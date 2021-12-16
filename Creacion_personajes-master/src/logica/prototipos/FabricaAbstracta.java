package logica.prototipos;

import logica.prototipos.componentes.Armadura;
import logica.prototipos.componentes.Arma;
import logica.prototipos.componentes.Transporte;

public interface FabricaAbstracta {

    public Armadura crearArmadura();

    public Arma crearEspada();

    public Transporte crearTransporte();
}
