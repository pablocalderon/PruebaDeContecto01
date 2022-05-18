package cl.isisur.pruebadecontecto01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity1 extends AppCompatActivity {
    private EditText etNombre;
    private Button btAceptar;
    public Intent intentDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        etNombre =(EditText) findViewById(R.id.etNombre01);
        btAceptar =(Button) findViewById(R.id.btAceptar);
        intentDos = new Intent(this,MainActivity2.class);
        Bundle intentP=getIntent().getExtras();
        if (intentP != null){
            etNombre.setText( intentP.getString("nombre"));

        }
        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(intentDos);
            }
        });

    }
}