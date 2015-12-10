package es.dam.dragonballshadow;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Alvaro on 8/12/15.
 */
public class MethodArray {
    private static final String TAG = "LOG_Android";

    //Array with all persons
    private static ArrayList<DragonBall> listaDragonBall = new ArrayList<>(Arrays.asList(
            new DragonBall(0, "gohan", "gohan_s")
            , new DragonBall(1, "goku", "goku_s")
            , new DragonBall(2, "kaio", "kaio_s")
            , new DragonBall(3, "goten", "goten_s")
            , new DragonBall(4, "krilin", "krilin_s")
    ));

    public static int NUMEROGENERADO =0;

    //returns the name of the person color
    public static String getName_array(int id)
    {
        Log.d(TAG, "getName_array MethodArray");
        return listaDragonBall.get(id).getName().toLowerCase();
    }

    //returns the name of the person shadow
    public static String getShadow_array(int id)
    {
        Log.d(TAG, "getShadow_array MethodArray");
        return listaDragonBall.get(id).getShadow().toLowerCase();
    }

    //Returns de size of array
    public static int getSize_array()
    {
        Log.d(TAG, "getSize_array MethodArray");
        return listaDragonBall.size();
    }

    /*Method to check whether the pressed button is correct.
    Check if the button name matches the name of the character*/
    public static boolean checkResult(String x)
    {
        Log.d(TAG, "chekcResult MethodArray");
        return listaDragonBall.get(NUMEROGENERADO).getName().equalsIgnoreCase(x);
    }

}
