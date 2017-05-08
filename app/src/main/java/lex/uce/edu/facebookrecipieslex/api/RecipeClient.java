package lex.uce.edu.facebookrecipieslex.api;

import android.support.annotation.RestrictTo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Alexis on 08/05/2017.
 *
 * Especificacion de la llamada
 *
 * Defino un objeto retrofit, este objeto puedo hacer dos cosas
 *
 *              poder construir en el cliente
 *              puedo recibirlo como un paramatro, en este caso lo que haria es inyectarlo al construirlo
 *              lo estoy trabahjando aqui adentro,
 *                  el testin en este caso va a ser mas granular, LO VAMOS A DEJAR ENCERRADO EN ESTE CASO
 *                      entonces voy a saber que cuando haga las pruebas voy a poder hacer una prueba por encima no interna
 *                          por jemeplo a donde hago la peticion o cambiando como estoy reconociendo o haciendo el proceso de parsing de la peticion
 *                              pro esto hago el URL porque lo voy a hacer aqui adentro
 *
 *          De aqui vamos a REcipeSearchResponse
 */

public class RecipeClient {

    private final static String BASE_URL="http://food2fork.com/api";
    private Retrofit retrofit;

    public RecipeClient() {
        this.retrofit=new Retrofit.Builder()//
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())//si no queremos usar Gson podemos usar las otras 6 opciones de la docuemntacion oficial.. si no queremos usar ni uno podemos dejar  la de okhttp es decir por defecto
                .build();
    }

    //este clietne a la vez va a tener un servicio
    public RecipeService getRecipeService(){

        return this.retrofit.create(RecipeService.class);//vamos a devolver a partir del cliente la creacion de este servicio indicando que clase es la que tenemos
    }


}
