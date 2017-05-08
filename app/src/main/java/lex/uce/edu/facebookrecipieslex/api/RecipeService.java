package lex.uce.edu.facebookrecipieslex.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Alexis on 08/05/2017.
 *Para retorfit necesitamos 2 archivos basicos y me voy a apoyar en los que yame da la libreria
 *
 * Esta interfaz me ayuda  a ver como vamos a realizar las peticiones
 * aqui vamos a yusar un metoodo get y va sobre el metodo del API search y nos va adevolver cierta resupuesta
 * Respueta especificar con un Objeto mio RecipeSearchResponse.search()
 *
 * Este servicio requiere de un cliente RecipeClient
 *
 *
 * Entonces en coonclusion tenemos
 *  llamamos a nuestro repositorio donde      mandamos a llamar las recetas nuevas
 *  llmara a el metood getFirstRecipe a paritr de la respuesta que va a recibir el servicio y
 *  el servicio lo voy a construir a partir del cliente
 *  cascada de calses pero con esto tenemos listo loq ue uamos retrofit
 */

public interface RecipeService {
    @GET("search")
    Call<RecipeSearchResponse> search(
                                        @Query("key") String key,//como query el api key
                                        @Query("sort") String sort,//ordeamiento especial por los mas recientes
                                        @Query("count") int count,//normalmente 1
                                        @Query("page") int page//numero aleatorio
                                      );

}
