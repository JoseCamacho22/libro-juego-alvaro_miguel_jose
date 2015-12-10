package es.dam.dragonballshadow;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class Play extends AppCompatActivity {
    private static final String TAG = "LOG_Android";

    // character image
    ImageView img;

    //Background music
    private MediaPlayer sound;

    // Timeout between characters
    private final int TIME = 3000;

    // buttons result
    private Button btn1, btn2, btn3, btn4;

    // Variable to generate random image
    int id_random_ok;
    ArrayList<Integer> array_num;

    // Variable for the character not repeat one after another
    int prev_random =-1;

    // boolean state save buttons
    boolean btn1_visible=true;
    boolean btn2_visible=true;
    boolean btn3_visible=true;
    boolean btn4_visible=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_play);
        startComponents();
        sound = MediaPlayer.create(this, R.raw.bola_de_dragon_intro);
        sound.setLooping(true);
        sound.start();
        generateRandomImage();
        Log.d(TAG, "onCreate Play");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("ID", id_random_ok);
        savedInstanceState.putIntegerArrayList("ARRAY", array_num);
        savedInstanceState.putBoolean("BTN1", btn1_visible);
        savedInstanceState.putBoolean("BTN2", btn2_visible);
        savedInstanceState.putBoolean("BTN3", btn3_visible);
        savedInstanceState.putBoolean("BTN4", btn4_visible);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        id_random_ok = savedInstanceState.getInt("ID");
        array_num = savedInstanceState.getIntegerArrayList("ARRAY");
        btn1_visible = savedInstanceState.getBoolean("BTN1");
        btn2_visible = savedInstanceState.getBoolean("BTN2");
        btn3_visible = savedInstanceState.getBoolean("BTN3");
        btn4_visible = savedInstanceState.getBoolean("BTN4");
        MethodArray.NUMEROGENERADO = id_random_ok;
        prev_random = id_random_ok;
        setShadow(id_random_ok);
        //set_status_btn(true);
        btn1.setText(MethodArray.getName_array(array_num.get(0)));
        btn2.setText(MethodArray.getName_array(array_num.get(1)));
        btn3.setText(MethodArray.getName_array(array_num.get(2)));
        btn4.setText(MethodArray.getName_array(array_num.get(3)));

        if(btn1_visible==false){
            btn1.setVisibility(View.INVISIBLE);
        }
        if(btn2_visible==false){
            btn2.setVisibility(View.INVISIBLE);
        }
        if(btn3_visible==false){
            btn3.setVisibility(View.INVISIBLE);
        }
        if(btn4_visible==false){
            btn4.setVisibility(View.INVISIBLE);
        }
    }


    @Override
    protected void onStop() {
        super.onStop();
        sound.pause();
        Log.d(TAG, "onStop Play");
    }
    @Override
    protected void onResume() {
        super.onResume();
        sound.start();
        Log.d(TAG, "onResume Play");
    }

    @Override
    protected void onDestroy() {
        if (sound.isPlaying()) {
            sound.stop();
            sound.release();
        }
        Log.d(TAG, "onDestroy Play");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        sound.pause();
        Log.d(TAG, "onPause Play");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart Play");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart Play");
    }


    // Initialization components used in this activity.
    private void startComponents() {
        img = (ImageView) findViewById(R.id.miimagen);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        Log.d(TAG, "startComponents Play");
    }

    // Insert shadow imageview
    public void setShadow(int id) {
        int resId = getResources().getIdentifier(MethodArray.getShadow_array(id), "drawable", getPackageName());
        img.setImageResource(resId);
        Log.d(TAG, "setShadow Play");
    }

    // Insert color image in imageview
    public void setColor(int id) {
        int resId = getResources().getIdentifier(MethodArray.getName_array(id), "drawable", getPackageName());
        img.setImageResource(resId);
        Log.d(TAG, "setColor Play");
    }


    /* Check the results
    Compare the button name with the name of the character
    */
    public void onClick_btn1(View v) {
        Button boton = (Button) v;
        String namePerson = boton.getText().toString().toLowerCase();
        if (MethodArray.checkResult(namePerson)) {
            setColor(MethodArray.NUMEROGENERADO);
            set_status_btn(false);
            boton.setVisibility(View.VISIBLE);
            btn1_visible=true;
            boton.setClickable(false);
            wait_time();
        } else {
            Toast.makeText(getApplicationContext(), "Try Again", Toast.LENGTH_SHORT).show();
            v.setVisibility(View.INVISIBLE);
            btn1_visible=false;
        }
        Log.d(TAG, "onClick_btn1 Play");
    }

    /* Check the results
    Compare the button name with the name of the character
    */
    public void onClick_btn2(View v) {
        Button boton = (Button) v;
        String namePerson = boton.getText().toString().toLowerCase();
        if (MethodArray.checkResult(namePerson)) {
            setColor(MethodArray.NUMEROGENERADO);
            set_status_btn(false);
            boton.setVisibility(View.VISIBLE);
            btn2_visible=true;
            boton.setClickable(false);
            wait_time();
        } else {
            Toast.makeText(getApplicationContext(),"Try Again",Toast.LENGTH_SHORT).show();
            v.setVisibility(View.INVISIBLE);
            btn2_visible=false;
        }
        Log.d(TAG, "onClick_btn2 Play");
    }

    /* Check the results
    Compare the button name with the name of the character
    */
    public void onClick_btn3(View v) {
        Button boton = (Button) v;
        String namePerson = boton.getText().toString().toLowerCase();
        if (MethodArray.checkResult(namePerson)) {
            setColor(MethodArray.NUMEROGENERADO);
            set_status_btn(false);
            boton.setVisibility(View.VISIBLE);
            btn3_visible=true;
            boton.setClickable(false);
            wait_time();
        } else {
            Toast.makeText(getApplicationContext(),"Try Again",Toast.LENGTH_SHORT).show();
            v.setVisibility(View.INVISIBLE);
            btn3_visible=false;
        }
        Log.d(TAG, "onClick_btn3 Play");
    }

    /* Check the results
    Compare the button name with the name of the character
    */
    public void onClick_btn4(View v) {
        Button boton = (Button) v;
        String namePerson = boton.getText().toString().toLowerCase();
        if (MethodArray.checkResult(namePerson)) {
            setColor(MethodArray.NUMEROGENERADO);
            set_status_btn(false);
            boton.setVisibility(View.VISIBLE);
            btn4_visible=true;
            boton.setClickable(false);
            wait_time();
        } else {
            Toast.makeText(getApplicationContext(),"Try Again",Toast.LENGTH_SHORT).show();
            v.setVisibility(View.INVISIBLE);
            btn4_visible=false;
        }
        Log.d(TAG, "onClick_btn4 Play");
    }

    //Timeout between characters
    public void wait_time() {
        new CountDownTimer(TIME, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                Log.d(TAG, "finish time_wait Play");
                generateRandomImage();
            }
        }.start();
    }


    /* If true, all are active and visible potones
    If false all the invisible buttons */
    public void set_status_btn(boolean valor) {
        if (valor) {
            btn1.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
            btn3.setVisibility(View.VISIBLE);
            btn4.setVisibility(View.VISIBLE);
            btn1.setClickable(true);
            btn2.setClickable(true);
            btn3.setClickable(true);
            btn4.setClickable(true);
            btn1_visible=true;
            btn2_visible=true;
            btn3_visible=true;
            btn4_visible=true;
            Log.d(TAG, "set_status_btn true Play");

        } else {
            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn1_visible=false;
            btn2_visible=false;
            btn3_visible=false;
            btn4_visible=false;
            Log.d(TAG, "set_status_btn false Play");
        }
    }

    /* Method for generating random numbers within the range of our character id .
    With these 4 random numbers give value to our image and our selection buttons */
    public void generateRandomImage() {
        int num;
        int cont = 0;
        int cont2 = 0;
        id_random_ok = -1;
        array_num = new ArrayList<>();
        do {
            num = ((int) (Math.random() * MethodArray.getSize_array()));
            if (id_random_ok <= 0) {
                id_random_ok = num;
                cont++;
                array_num.add(num);
            } else if (!array_num.contains(num) && cont2 < 3) {
                array_num.add(num);
                cont++;
                cont2++;
            }
        } while (cont < 4);
        setRandomImage(id_random_ok,array_num);
        Log.d(TAG, "generateRandomImage Play");
    }

    //Change the buttons and image
    public void setRandomImage(int id_random,ArrayList<Integer> array){
        // Condition for the character repeats one after another
        if(id_random != prev_random) {
            MethodArray.NUMEROGENERADO = id_random;
            prev_random = id_random;
            setShadow(id_random);
            set_status_btn(true);

            btn1.setText(MethodArray.getName_array(array.get(0)));
            btn2.setText(MethodArray.getName_array(array.get(1)));
            btn3.setText(MethodArray.getName_array(array.get(2)));
            btn4.setText(MethodArray.getName_array(array.get(3)));
        }
        else{
            generateRandomImage();
        }
        Log.d(TAG, "setRandomeImage Play");
    }
}
