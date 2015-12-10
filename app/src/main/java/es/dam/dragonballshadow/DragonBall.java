package es.dam.dragonballshadow;

import android.util.Log;

/**
 * Created by Alvaro Roizo, Miguel Angel Garcia y Jose Camacho.
 *
 * Class to management object DragonBall
 */
public class DragonBall {
    private static final String TAG = "LOG_Android";

    private int id;
    private String name;
    private String sombra;

    public DragonBall(int id, String name, String shadow) {
        this.id=id;
        this.name =name;
        this.sombra=shadow;
    }

    public int getId() {
        Log.d(TAG, "method getId");
        return id;
    }

    public void setId(int id) {
        Log.d(TAG, "method setId");
        this.id = id;
    }

    public String getName() {
        Log.d(TAG, "method getName_array");
        return name;
    }

    public String getShadow() {
        Log.d(TAG, "method getShadow_array");
        return sombra;
    }

}
