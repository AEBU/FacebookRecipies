package lex.uce.edu.facebookrecipieslex.recipemain;

import lex.uce.edu.facebookrecipieslex.entities.Recipe;
import lex.uce.edu.facebookrecipieslex.recipemain.events.RecipeMainEvent;
import lex.uce.edu.facebookrecipieslex.recipemain.ui.RecipeMainView;

/**
 * Created by Alexis on 30/05/2017.
 *
 *Interfaz del presentador
 *
 */

public interface RecipeMainPresenter {

    /**
     * registrar deregistrar y desturio la vista
     *  onCreate():
     *  onDestroy():
     *
     *  Acciones posibles que tengo
     *      que aunque no voy a guardar nada en niongun lugar me intersar
     *      llamara la animacion de la vista
     *          dismissRecipe()
     *      para obtener la siguiente receta de cocina
     *          getNextRecipe
     *      Este objeto se quede guardado en la base de datos
     *          saveRecipe()
     *      Evento en el que voy a recibir informacion de EvetnBus
     *          RecipeMainEvent()
     *
     *      Para motivos de testing
     *          veremos si la vista se volvio o no null
     *            getView()
     *
     */


    void onCreate();
    void onDestroy();

    void dismissRecipe();
    void getNextRecipe();
    void saveRecipe(Recipe recipe);
    void onEventMainThread(RecipeMainEvent event);

    RecipeMainView getView();

}
