package com.joseazavalac.mensajesemergentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMensaje = (Button) findViewById(R.id.btnGenerar);

        btnMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar.make(findViewById(R.id.activity_main), "Mensaje Emergente", Snackbar.LENGTH_SHORT)
                        .setAction("Boton", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(getApplicationContext(), "Presionado", Toast.LENGTH_SHORT).show();
                            }
                        });
                snackbar.show();

            }
        });
    }
}