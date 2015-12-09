package es.dam.dragonballshadow;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    public  void onClick_activity(View view){

        Intent intent=new Intent();
        try{

            EditText nombre=(EditText)findViewById(R.id.editText);
            String snombre=nombre.getText().toString();
            intent.setData(Uri.parse(snombre));
            setResult(RESULT_OK,intent);
        }catch (Exception e){
            setResult(-1,intent);
        }
        finish();
    }
}
