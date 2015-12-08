package es.dam.dragonballshadow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Personajes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__personajes);
    }

    public void onClick_gohan(View v) {
        Intent intent = new Intent(Menu_Personajes.this, Desc_Gohan.class);
        startActivity(intent);
    }

    public void onClick_goten(View v) {
        Intent intent = new Intent(Menu_Personajes.this, Desc_Goten.class);
        startActivity(intent);
    }

    public void onClick_krillin(View v) {
        Intent intent = new Intent(Menu_Personajes.this, Desc_Krillin.class);
        startActivity(intent);
    }

    public void onClick_kaio(View v) {
        Intent intent = new Intent(Menu_Personajes.this, Desc_Kaiodelnorte.class);
        startActivity(intent);
    }

    public void onClick_goku(View v) {
        Intent intent = new Intent(Menu_Personajes.this, Desc_Goku.class);
        startActivity(intent);
    }
}
