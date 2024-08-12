
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.model.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.Amasar;
import edu.unisabana.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.model.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.HorneadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.Horno;
import edu.unisabana.pizzafactory.model.Ingrediente;
import edu.unisabana.pizzafactory.model.Molde;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.Tamano;
import edu.unisabana.pizzafactory.model.Tipo;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp=new PreparadorPizza();  
            //pp.prepararPizza(ingredientes, Tamano.MEDIANO,Tipo.Normal, "grueso");
            pp.prepararPizza(ingredientes, Tamano.MEDIANO,Tipo.Normal, "delgado");//Tipos: normal, integral
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam,Tipo tip, String grosor)
            throws ExcepcionParametrosInvalidos {

        Amasar am;
        Horno hp;
        Molde mp;
        if(grosor=="delgado"){
            am = new AmasadorPizzaDelgada();
            hp = new HorneadorPizzaDelgada();
            mp = new MoldeadorPizzaDelgada();
        }
        else
        {
            am = new AmasadorPizzaGruesa();
            hp = new HorneadorPizzaGruesa();
            mp = new MoldeadorPizzaGruesa();
        }
        
        TipoMasa(tip);
        
        
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.molderarPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        
        hp.Hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }
    private void TipoMasa(Tipo tipo)
    {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "Tipo de masa:{0}", tipo.toString());
        
    }


}
