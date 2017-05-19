package lex.uce.edu.facebookrecipieslex.libs.di;

import android.app.Activity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import lex.uce.edu.facebookrecipieslex.libs.GlideImageLoader;
import lex.uce.edu.facebookrecipieslex.libs.base.EventBus;
import lex.uce.edu.facebookrecipieslex.libs.base.GreenRobotEventBus;
import lex.uce.edu.facebookrecipieslex.libs.base.ImageLoader;

/**
 * Created by Alexis on 19/05/2017.
 */

@Module
public class LibsModule {
    //activididad encargada de hacer la carga de datos
    private Activity activity;

    public LibsModule(Activity activityñ) {
        this.activity = activityñ;
    }

    @Provides
    @Singleton
    ImageLoader providesImageLoader(RequestManager requestManager){
        return new GlideImageLoader(requestManager);
    }

    @Provides
    @Singleton
    RequestManager providesRequestManager(Activity activity){
        return Glide.with(activity);
    }

    @Provides
    @Singleton
    Activity providesActivity(){
        return this.activity;
    }

    @Provides
    @Singleton
    EventBus providesEventBus(org.greenrobot.eventbus.EventBus eventBus){
        return new GreenRobotEventBus(eventBus);
    }

    @Provides
    @Singleton
    org.greenrobot.eventbus.EventBus providesLibraryEventBus(){
        return org.greenrobot.eventbus.EventBus.getDefault();
    }


}
