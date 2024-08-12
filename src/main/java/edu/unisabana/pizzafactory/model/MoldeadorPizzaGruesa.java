
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class MoldeadorPizzaGruesa implements Molde{

    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza gruesa pequena.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR

    }

    public void molderarPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza gruesa mediana.");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

}
