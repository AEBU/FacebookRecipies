package lex.uce.edu.facebookrecipieslex.api;

import java.util.List;

import lex.uce.edu.facebookrecipieslex.entities.Recipe;

/**
 * Created by Alexis on 08/05/2017.
 * esta es la tercera llegada de la cascada
 *  La respuesta como vimos incluye
 *      un conteo de cuantos recipes tenemos de respuesta, o cuantas recetas tenemos de respuesta.. siempre uno pero como es aleatorio talvez sea cero
 *      listado de estas recetas
 *
 */
public class RecipeSearchResponse {

    private int count;//conteo
    private List<Recipe> recipes;//listado de recetas que se reciben

    //getter and setter para que gson ponga las valores adecuados
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    //la primera receta que esta en este listado
    /*
    * nos va a servir para nuestro repositorio donde mandamos a llamar las recetas neuvas
    *   llamar a este metodo a partir de la respuesta que va arecibir el servicio
    *   y el servicio lo voy a construir a partir del cliente
    * */
    public Recipe getFirstRecipe(){
        Recipe first=null;
        if (!recipes.isEmpty()){
            first=recipes.get(0);
        }
        return first;

    }
}
