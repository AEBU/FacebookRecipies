package lex.uce.edu.facebookrecipieslex.recipemain.ui;

import lex.uce.edu.facebookrecipieslex.entities.Recipe;

/**
 * Created by Alexis on 30/05/2017.
 * in this package we have structure MVP for our analysis
 * Aqui vamos a colocar todo lo necesario para la vista
 */

public interface RecipeMainView {


    /**
     * showProgress:    mostrar mi barra de progreso
     * hideProgress:    ocultar mi barra de progreso
     *
     * a la vez voy a tener elementos de UI que voy a querer mostrar y ocultar
     *en base al proggressbar, es decir este no va estar al mismo tiempo que los elementos de UI
     * showUIElements()
     * hideUIElements()
     *
     * Animaciones
     *
     * Estas el presentador se va a enccargar de llamar
     *
     *saveAnimation(), salvar la receta
     * dismissAnimation(), no salvar la receta
     *
     * Luego, cuando decida salvar la receta vamos a tener un reaccion de la vista
     *y a la vez sea posible que esta receta no sea la unica que yo visualice si no visualice varias
     *
     *onRecipeSaved()//reaccion de la vista\
     * setRecipe(recipe)//cuando lo reciba para cambiar la imagen y recibo los datos de la recteta y estos voy a guardar si decido hacerlo
     *
     * //si yo decido desacerme de esta receta,
     * puedo guardar el identifidacor en un listado persistente en la base de datos
     * y cuando saque el numero aleatorio asegurarme que este listado no esta ahi
     *
     * NOTA: vamos a correr un riesgo de que el numero aleatorio se repita
     * con un rango amplio, y en este caso se va a ver dos veces la receta, es posible  que ya este guardada
     * o haya decidido no conservarla
     *
     */
    void showProgress();
    void hideProgress();

    void showUIElements();
    void hideUIElements();

    void saveAnimation();
    void dismissAnimation();


    void onRecipeSaved();

    void setRecipe(Recipe recipe);
    void onGetRecipeError(String error);
}
