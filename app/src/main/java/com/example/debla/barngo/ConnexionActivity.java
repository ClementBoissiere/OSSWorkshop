package com.example.debla.barngo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.debla.barngo.R.layout.activity_client;
import static com.example.debla.barngo.R.layout.activity_connexion;

public class ConnexionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        final Button btn_connexion = (Button) findViewById(R.id.btn_connexion);

        btn_connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (ConnexionActivity.this, ClientActivity.class);
                startActivity(intent);
            }
        });
    }
}
