package es.dam.dragonballshadow;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Created by Alvaro Roizo, Miguel Angel Garcia y Jose Camacho.
     *
     * Class to launch activity_main and intents to launch activities
     */

    private static final String TAG = "LOG_Android";

    private Button play, credits, listDragonBall, exit;
    private MediaPlayer sound;
    private final static int ACTIVIDAD_Form = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);//Quitamos barra titulo
        setContentView(R.layout.activity_main);

        play = (Button) findViewById(R.id.btnPlay);
        credits = (Button) findViewById(R.id.btnAbout);
        listDragonBall = (Button) findViewById(R.id.btnList);
        exit = (Button) findViewById(R.id.btnExit);

        sound = MediaPlayer.create(this, R.raw.bola_de_dragon);
        sound.setLooping(true);
        sound.start();
        Log.d(TAG, "onCreate MainActivity");
    }

    //Methods with intents to launch activities

    public void onClick_play(View v) {
        Intent intent = new Intent(MainActivity.this, Play.class);
        startActivity(intent);
        Log.d(TAG, "onClick_play MainActivity");
    }

    public void onClick_list(View v) {
                Intent nuevoform = new Intent(MainActivity.this, Menu_Persons.class);
                startActivity(nuevoform);
        Log.d(TAG, "onClick_list MainActivity");
    }

    public void onClick_about(View v) {
        Intent nuevoform = new Intent(MainActivity.this, About.class);
        startActivity(nuevoform);
        Log.d(TAG, "onClick_about MainActivity");

    }

    public void onClick_video(View view){
        Intent nuevoform = new Intent(MainActivity.this, Video.class);
        startActivity(nuevoform);
        Log.d(TAG, "onClick_video MainActivity");
    }

    public void onClick_url(View view){
        Intent i=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://boladedragon.com"));
        startActivity(i);
        Log.d(TAG, "onClick_url MainActivity");
    }

    public void onClick_Form(View v) {
        Intent nuevoform = new Intent(MainActivity.this, Form.class);
        startActivityForResult(nuevoform, ACTIVIDAD_Form);
        Log.d(TAG, "onClick_Form MainActivity");
    }

    public void onClick_exit(View v) {
        Log.d(TAG, "onClick_exit MainActivity");
        finish();
    }

    //Method with intent result
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult MainActivity");
        if(requestCode==ACTIVIDAD_Form){
            if(resultCode==RESULT_OK){
                try {
                    String name=data.getData().toString();
                    Toast.makeText(this, "New user "+name, Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(this,"Exception",Toast.LENGTH_LONG).show();
                }
            }else if(resultCode==RESULT_CANCELED){
                Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();
            }


        }
    }

    //Management audio
    @Override
    protected void onStop() {
        super.onStop();
        sound.pause();
        Log.d(TAG, "onStop MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (sound.isPlaying()) {
            sound.stop();
            sound.release();
        }
        Log.d(TAG, "onDestroy MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        sound.start();
        Log.d(TAG, "onResume MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        sound.pause();
        Log.d(TAG, "onPause MainActivity");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart MainActivity");
    }



}
