package lex.uce.edu.facebookrecipieslex.recipemain;

import lex.uce.edu.facebookrecipieslex.entities.Recipe;

/**
 * Created by Alexis on 30/05/2017.
 * INterfaz del interactuador
 *
 */

public interface SaveRecipeInteractor {


    /**
     * Recibe un unico objeto a guardar
     * @param recipe objeto receta para ser gaurdada
     */
    void execute(Recipe recipe);
}
