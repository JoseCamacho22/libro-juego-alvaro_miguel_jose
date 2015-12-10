package es.dam.dragonballshadow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/**
 * Created by Alvaro Roizo, Miguel Angel Garcia y Jose Camacho.
 * Class to launch activity desc_krillin
 */
public class Desc_Krillin extends AppCompatActivity {
    private static final String TAG = "LOG_Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desc_krillin);
        Log.d(TAG, "onCreate desc_krillin");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart desc_krillin");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart desc_krillin");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume desc_krillin");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause desc_krillin");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop desc_krillin");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy desc_krillin");
    }
}
