package es.dam.dragonballshadow;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Alvaro Roizo, Miguel Angel Garcia y Jose Camacho.
 *
 * Class to launch activity_form and return intent result
 */
public class Form extends AppCompatActivity {
    private static final String TAG = "LOG_Android";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Log.d(TAG, "onCreate Form");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart Form");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart Form");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume Form");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause Form");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop Form");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy Form");
    }


    //Method management intent result
    public  void onClick_activity(View view){

        Intent intent=new Intent();
        try{

            EditText nombre=(EditText)findViewById(R.id.editText);
            String snombre=nombre.getText().toString();
            intent.setData(Uri.parse(snombre));
            setResult(RESULT_OK, intent);
            Log.d(TAG, "Intent Result OK");
        }catch (Exception e){
            setResult(-1,intent);
        }
        finish();
    }
}
