package lex.uce.edu.facebookrecipieslex.login.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import lex.uce.edu.facebookrecipieslex.R;
import lex.uce.edu.facebookrecipieslex.RecipeMainActivity;
import retrofit2.Callback;

import static android.view.View.Y;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.btnLogin)
    LoginButton btnLogin;
    @BindView(R.id.container)
    RelativeLayout container;

    //necesito un callback manager de facebook y lo voy a declarar como una variable global

    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        //si tenemos un acces tokken ya dentro de nuestra aplicacion pues entonces le mandamos directo al main screen
        if (AccessToken.getCurrentAccessToken()!=null){
            navegateToMainScreen();
        }


        //lamada a factory . create
        callbackManager = CallbackManager.Factory.create();
        //el boton tenga ciertos permisos, en este caso de publicacion
        btnLogin.setPublishPermissions(Arrays.asList("publish_actions"));
        btnLogin.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                //nos lleva a la actividad de main
                navegateToMainScreen();
            }

            

            @Override
            public void onCancel() {
                // si se cancela mostramos el error
                Snackbar.make(container,R.string.login_cancel_error,Snackbar.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException error) {
                //si me da un error entonces hacemos lo siguient pero primero le damos el formato
                String msgError= String.format(getString(R.string.login_error),
                                                error.getLocalizedMessage());
                Snackbar.make(container,msgError,Snackbar.LENGTH_SHORT).show();
            }
        });
    }

//    // para tener analiticas
//    @Override
//    protected void onResume() {
//        super.onResume();
//        AppEventsLogger.activateApp(this);
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        AppEventsLogger.deactivateApp(this);
//
//    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //le mandamos con los mismos parametros que tenemos de esta forma administraremos la sesion
        callbackManager.onActivityResult(requestCode,resultCode,data);
    }

    private void navegateToMainScreen() {
        //Creamos el intent que sera redirigido
        Intent intent = new Intent(this, RecipeMainActivity.class );
        //creamos banderas para que no haya historia
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                |Intent.FLAG_ACTIVITY_NEW_TASK
                |Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }
}
