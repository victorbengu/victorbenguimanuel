package com.example.exercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
        Button bt1,bt2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            bt1 = findViewById(R.Id.bt_um);
            bt2 = findViewById(R.Id.bt_dois);

            bt1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Toast.makeText(context:MainActivity.this,  text:"botao clicado",Toast.LENGTH_SHORT).show();
                }

            });
            bt2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent i = new Intent (packageContext:MainActivity.this,MainActivity2.class) ;
                    startActivity(i);
                }

            });





