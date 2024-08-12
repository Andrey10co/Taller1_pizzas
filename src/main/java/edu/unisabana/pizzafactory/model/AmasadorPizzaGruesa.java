
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class AmasadorPizzaGruesa implements Amasar{

    
    
    public void amasar() {
        
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
                .log(Level.INFO, "[@@] Amasando la pizza gruesa");
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
    }
    
}
