package lex.uce.edu.facebookrecipieslex.recipemain;

import lex.uce.edu.facebookrecipieslex.entities.Recipe;

/**
 * Created by Alexis on 30/05/2017.
 */

public interface RecipeMainRepository {
    /**
     * Variables
     * COUNT        ---------- cuantas recetas voy a obtener
     * RECENT_SORT  ---------- de que forma voy a querer ordenar
     * RECIPE_RANGE ---------- y el rango de recetas que tengo
     *
     *
     *La idea de estos metodos es quen voy a generar un numero aleatorio
     * en el interactuador, o en algun otro lugar solo el repositorio va a exponerlo
     * y con este numero aleatorio voy a hacerle un SET para ver que numero voy a pecir
     *
     * getNextRecipe
     * saveRecipe
     * setRecipePage
     *
     *
     *
     * NOTA En archivos bastantes es un poco molesto, es beno para saber a que archivo dirigirme,
     * sin embargo podemos usar un solo archivos RecipeMAINContract y dentor las interaces para el presentador
     * vista , etc, talvez un interactuadro talvez un repositorio
     */

    public final static int COUNT=1;
    public final static String RECENT_SORT="r";
    public final static int RECIPE_RANGE=100000;


    void getNextRecipe();
    void saveRecipe(Recipe recipe);
    void setRecipePage(int recipePage);

}

