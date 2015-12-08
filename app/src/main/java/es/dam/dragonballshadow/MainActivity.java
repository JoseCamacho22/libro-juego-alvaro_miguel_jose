package es.dam.dragonballshadow;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button play, credits, listDragonBall, exit;
    private MediaPlayer sound;

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
    }

    public void onClick_play(View v) {
        Intent intent = new Intent(MainActivity.this, Play.class);
        startActivity(intent);
    }

    public void onClick_list(View v) {
                Intent nuevoform = new Intent(MainActivity.this, Menu_Personajes.class);
                startActivity(nuevoform);
    }

    public void onClick_about(View v) {
        Intent nuevoform = new Intent(MainActivity.this, About.class);
        startActivity(nuevoform);

    }

    public void onClick_video(View view){
        Intent nuevoform = new Intent(MainActivity.this, Video.class);
        startActivity(nuevoform);
    }

    public void onClick_url(View view){
        Intent i=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://boladedragon.com"));
        startActivity(i);
    }

    public void onClick_exit(View v) {
        finish();
    }



    @Override
    protected void onStop() {
        super.onStop();
        sound.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (sound.isPlaying()) {
            sound.stop();
            sound.release();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        sound.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        sound.pause();
    }
}
