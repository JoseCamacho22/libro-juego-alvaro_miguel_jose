package es.dam.dragonballshadow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/**
 * Created by Alvaro Roizo, Miguel Angel Garcia y Jose Camacho.
 * Class to launch activity desc_goku
 */
public class Desc_Goku extends AppCompatActivity {
    private static final String TAG = "LOG_Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desc_goku);
        Log .d(TAG, "onCreate Desc_Goku");
    }

    @Override
    protected void onStart() {
        super.onStart();
       Log .d(TAG, "onStart Desc_Goku");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart Desc_Goku");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume Desc_Goku");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause Desc_Goku");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop Desc_Goku");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy Desc_Goku");
    }
}
