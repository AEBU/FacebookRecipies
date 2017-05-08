package lex.uce.edu.facebookrecipieslex;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.raizlabs.android.dbflow.config.FlowManager;

import java.lang.annotation.Documented;

/**
 * Created by Alexis on 05/05/2017.
 *
 * Esta clase hereda de application como hereda de este podemos sobrecargar
 * El metodo Oncreate
 * y vamos a usar el metodoo initfFacebbok
 * con lo que se realizara el iniciializacion del facebook y vamos a iniciar nuestro DBFLow
 *
 *https://www.youtube.com/watch?v=UveI8_wfEoU
 */

public class FacebookRecipesApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        initFacebook();
        initDB();
        
    }

    /*
    * Tenemos un metodo qeu terminara ademas dde llamar al ancestro lo haremos FlowManager.destroy
    * */
    @Override
    public void onTerminate() {
        super.onTerminate();
        DBTearDown();
    }

    private void DBTearDown() {
        //demoler
        FlowManager.destroy();
    }

    /*
        * Tenemos un metodo que iniciara la base de datos
        * */
    private void initDB() {
        //inicializamos la base de datos
        FlowManager.init(this);
    }

//    private void initFacebook() {
//        FacebookSdk.sdkInitialize(this);
//    }
}
