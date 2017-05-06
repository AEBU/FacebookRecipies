package lex.uce.edu.facebookrecipieslex;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by Alexis on 05/05/2017.
 *
 * Esta clase hereda de application como hereda de este podemos sobrecargar
 * El metodo Oncreate
 * y vamos a usar el metodoo initfFacebbok
 * con lo que se realizara el iniciializacion del facebook
 *
 *
 */

public class FacebookRecipesApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initFacebook();
    }

    private void initFacebook() {
        FacebookSdk.sdkInitialize(this);
    }
}
