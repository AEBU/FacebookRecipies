package lex.uce.edu.facebookrecipieslex.libs.base;

import com.facebook.share.widget.LikeView;

/**
 * Created by Alexis on 12/05/2017.
 * Hacemos uso de la libreria de Event Bus es decir que usamos un wrapper interfaz base con metodos necesarios
 * previiniendo asi que no dependamos en un futuro de esta libreria
 */

public interface EventBus {
    void register(Object subscriber);// se registra un subscriptor(presentador)
    void unregister(Object subscriber);//se acaba el subscriptor
    void post(Object event);    //enviamos algo

}
