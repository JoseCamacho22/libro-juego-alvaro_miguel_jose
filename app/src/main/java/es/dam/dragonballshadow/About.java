package es.dam.dragonballshadow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/**
 * Created by Alvaro Roizo, Miguel Angel Garcia y Jose Camacho.
 * Class to launch activity_about
 */
public class About extends AppCompatActivity {
    private static final String TAG = "LOG_Android";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Log.d(TAG, "onCreate About");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart About");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart About");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume About");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause About");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop About");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy About");
    }
}
