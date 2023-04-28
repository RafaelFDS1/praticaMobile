package com.example.treinandinho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.essevai).into(imageView);


        // Adiciona um atraso para exibir a tela de splash screen por alguns segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Inicia a próxima atividade
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);

                // Encerra a atividade da splash screen
                finish();
            }
        }, 3000); // 3 segundos de atraso
    }

}