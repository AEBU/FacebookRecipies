package lex.uce.edu.facebookrecipieslex.entities;

import com.google.gson.annotations.SerializedName;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import lex.uce.edu.facebookrecipieslex.db.RecipesDatabase;

/**
 * Created by Alexis on 07/05/2017.
 */

@Table(database = RecipesDatabase.class)
public class Recipe extends BaseModel {

    @SerializedName("recipe_id")
    @PrimaryKey private  String recipeId;

    @Column private String title;

    @SerializedName("image_url")
    @Column private String imageURL;

    //enlace para ver detalles de la receta
    @SerializedName("source_url")
    @Column  private String sourceUtl;

    @Column private boolean favorite;

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getSourceUtl() {
        return sourceUtl;
    }

    public void setSourceUtl(String sourceUtl) {
        this.sourceUtl = sourceUtl;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }


    //vamos a verificar si este objetto que estoy recibiendo es una receta entonces con la validacion vamos a type casting a una receta y asignamos la comparacion a un equals
    //de los identificadores entonces comparo el identificador propio con el de que me estoy reciviendo
    //para verificar si ya existe una receta
    @Override
    public boolean equals(Object obj) {
        boolean equal=false;
        if (obj instanceof Recipe){
            Recipe rep= (Recipe) obj;
            equal=this.recipeId.equals(rep.getRecipeId());
        }

        return equal;
    }
}
