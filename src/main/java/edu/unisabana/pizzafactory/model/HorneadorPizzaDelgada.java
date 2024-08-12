
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class HorneadorPizzaDelgada implements Horno{

    public void Hornear() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza delgada.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}
