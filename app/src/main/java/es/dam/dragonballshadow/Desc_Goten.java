package es.dam.dragonballshadow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/**
 * Created by Alvaro Roizo, Miguel Angel Garcia y Jose Camacho.
 *
 * Class to launch activity desc_goten
 */
public class Desc_Goten extends AppCompatActivity {
    private static final String TAG = "LOG_Android";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desc_goten);
        Log.d(TAG, "onCreate Desc_Goten");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart Desc_Goten");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart Desc_Goten");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume Desc_Goten");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause Desc_Goten");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop Desc_Goten");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy Desc_Goten");
    }
}
