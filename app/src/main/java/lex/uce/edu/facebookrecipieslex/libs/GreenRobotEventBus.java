package lex.uce.edu.facebookrecipieslex.libs.base;

/**
 * Created by Alexis on 12/05/2017.
 * Tenemos la clase que implemneta mi event BUus creado
 * recibe un green robot event bos en el constructor y tiene la implementacion de los metodos
 *
 */

public class GreenRobotEventBus  implements EventBus{
    org.greenrobot.eventbus.EventBus eventBus;

    public GreenRobotEventBus(org.greenrobot.eventbus.EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void register(Object subscriber) {

    }

    @Override
    public void unregister(Object subscriber) {

    }

    @Override
    public void post(Object event) {

    }
}
