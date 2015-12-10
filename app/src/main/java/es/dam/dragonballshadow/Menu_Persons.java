package es.dam.dragonballshadow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Menu_Persons extends AppCompatActivity {
    /**
     * Created by Alvaro Roizo, Miguel Angel Garcia y Jose Camacho.
     *
     * Class to launch activity_menu_persons and intents to launch activities description of persons
     */

    private static final String TAG = "LOG_Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__persons);
    }

    //Methos with intents
    public void onClick_gohan(View v) {
        Intent intent = new Intent(Menu_Persons.this, Desc_Gohan.class);
        startActivity(intent);
        Log.d(TAG, "onClick_gohan Menu_Persons");
    }

    public void onClick_goten(View v) {
        Intent intent = new Intent(Menu_Persons.this, Desc_Goten.class);
        startActivity(intent);
        Log.d(TAG, "onClick_goten Menu_Persons");
    }

    public void onClick_krillin(View v) {
        Intent intent = new Intent(Menu_Persons.this, Desc_Krillin.class);
        startActivity(intent);
        Log.d(TAG, "onClick_krillin Menu_Persons");
    }

    public void onClick_kaio(View v) {
        Intent intent = new Intent(Menu_Persons.this, Desc_Kaiodelnorte.class);
        startActivity(intent);
        Log.d(TAG, "onClick_kaio Menu_Persons");
    }

    public void onClick_goku(View v) {
        Intent intent = new Intent(Menu_Persons.this, Desc_Goku.class);
        startActivity(intent);
        Log.d(TAG, "onClick_goku Menu_Persons");
    }
}
