package es.dam.dragonballshadow;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    private VideoView playVideoView;
    private static final String TAG = "LOG_Android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        playVideoView = (VideoView) findViewById(R.id.videoView);

        Uri path = Uri.parse("android.resource://es.dam.dragonballshadow/"
                + R.raw.video);
        playVideoView.setVideoURI(path);
        playVideoView.start();
        Log.d(TAG, "oncreate Video");
    }
}
