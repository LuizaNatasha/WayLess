package com.example.wayless;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn01, btn02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btn01 = (Button) findViewById(R.id.btn);
        btn02 = (Button) findViewById(R.id.btn2);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn01Activity();
            }
        });

    }
    private  void btn01Activity(){
        startActivity(new Intent(MainActivity.this, Tela_login.class));
    }
}

