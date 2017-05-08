package lex.uce.edu.facebookrecipieslex.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Alexis on 07/05/2017.
 * https://guides.codepath.com/android/DBFlow-Guide#compilation-issues
 *
 */
//en el moemnt que haga cambio es una buena idae que vaya acutilzando la
@Database(name = RecipesDatabase.NAME,version = RecipesDatabase.VERSION)
public class RecipesDatabase {
    public static final int VERSION=1;
    public static final String NAME="Recipes";


}
