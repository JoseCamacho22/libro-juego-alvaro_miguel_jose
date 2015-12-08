package es.dam.dragonballshadow;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class Play extends AppCompatActivity {

    //imagen personaje
    ImageView img;

    //Musica de fondo
    private MediaPlayer sound;

    //Tiempo espera entre personajes
    private final int TIME = 3000;

    //botones resultado
    private Button btn1, btn2, btn3, btn4;

    //Variable para generar imagen random
    int id_random_ok;
    ArrayList<Integer> array_num;

    //Variable para que no se repita el personaje uno detras de otro
    int prev_random =-1;

    //boolean guardar estado botones
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

    //Restauramos la instancia anterior
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
        btn1.setText(MethodArray.getNombre(array_num.get(0)));
        btn2.setText(MethodArray.getNombre(array_num.get(1)));
        btn3.setText(MethodArray.getNombre(array_num.get(2)));
        btn4.setText(MethodArray.getNombre(array_num.get(3)));

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
    }
    @Override
    protected void onResume() {
        super.onResume();
        sound.start();
    }

    @Override
    protected void onDestroy() {
        if (sound.isPlaying()) {
            sound.stop();
            sound.release();
        }
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        sound.pause();
    }

    //Inicialización de componenten utilizados en esta actividad.
    private void startComponents() {
        img = (ImageView) findViewById(R.id.miimagen);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
    }

    //Insertar sombra al imageview
    public void setShadow(int id) {
        int resId = getResources().getIdentifier(MethodArray.getSombra(id), "drawable", getPackageName());
        img.setImageResource(resId);
    }

    //Insertar imagen a color en el imageview
    public void setColor(int id) {
        int resId = getResources().getIdentifier(MethodArray.getNombre(id), "drawable", getPackageName());
        img.setImageResource(resId);
    }


    /*Comprobacion del resultado
    * Compara el nombre del boton con el nombre del personaje
    * */

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
    }

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
    }

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
    }

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
    }

    public void wait_time() {
        new CountDownTimer(TIME, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                generateRandomImage();
            }
        }.start();
    }

    //SI true todos los potones estan activos y visibles
    //Si false todos los botones invisible
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


        } else {
            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn1_visible=false;
            btn2_visible=false;
            btn3_visible=false;
            btn4_visible=false;
        }
    }
    /*Metodo para generar 4 numeros aleatorios dentro del rango de nuestros id de personajes.
    Con estos 4 numeros aleatorios daremos valor a nuestra imagen y nuestros botones de selección*/
    public void generateRandomImage() {
        int num;
        int cont = 0;
        int cont2 = 0;
        id_random_ok = -1;
        array_num = new ArrayList<>();
        do {
            num = ((int) (Math.random() * MethodArray.getTamaño()));
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
    }

    //Cambia los botones y la imagen
    public void setRandomImage(int id_random,ArrayList<Integer> array){
        //Condicion para que el personaje no se repita uno detras de otro
        if(id_random != prev_random) {
            MethodArray.NUMEROGENERADO = id_random;
            prev_random = id_random;
            setShadow(id_random);//Ponemos la sombra
            set_status_btn(true);//Todos los botones visibles

            //Damos texto a los botones con el array de numeros aleatorios
            btn1.setText(MethodArray.getNombre(array.get(0)));
            btn2.setText(MethodArray.getNombre(array.get(1)));
            btn3.setText(MethodArray.getNombre(array.get(2)));
            btn4.setText(MethodArray.getNombre(array.get(3)));
        }
        else{
            generateRandomImage();
        }
    }
}
