package lex.uce.edu.facebookrecipieslex.libs.base;

import android.widget.ImageView;

/**
 * Created by Alexis on 12/05/2017.
 */

public interface ImageLoader {
    void load(ImageView imageView,String URL);
    void setOnFinishedImageLoadingListener(Object listener);//object porque no le amarramos a la de glide si no a cualquier imagen

}
