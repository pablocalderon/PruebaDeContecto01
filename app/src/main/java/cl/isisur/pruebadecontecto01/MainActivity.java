package cl.isisur.pruebadecontecto01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btAceptarM;
    private EditText etNombreM;

    public Intent intentUno;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btAceptarM =(Button) findViewById(R.id.btAceptar);
        etNombreM=(EditText) findViewById(R.id.etNombre);
        intentUno = new Intent(this,MainActivity1.class);


        btAceptarM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentUno.putExtra("nombre",etNombreM.getText().toString());
                startActivity(intentUno);
            }
        });
    }


}