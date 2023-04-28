package com.example.treinandinho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundatela);
    }
    EditText mensalEditText = findViewById(R.id.mensalEditText);
    EditText anualEditText = findViewById(R.id.anualEditText);

    String mensalString = mensalEditText.getText().toString();
    String anualString = anualEditText.getText().toString();

    double rendaMensal = Double.parseDouble(mensalString);
    double rendaAnual = Double.parseDouble(anualString);

}