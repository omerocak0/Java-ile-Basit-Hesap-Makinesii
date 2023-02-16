package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView sonucText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text = findViewById(R.id.editTextTextPersonName);
        number2Text = findViewById(R.id.editTextTextPersonName2);
        sonucText = findViewById(R.id.sonuc);
    }

    public void toplama(View view) {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            sonucText.setText("Sayı Girin!!!");
        }
        else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;
            sonucText.setText("Sonuc: " + result);
        }
    }
    public void cikarma(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            sonucText.setText("Sayı Girin!!!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;
            sonucText.setText("Sonuc: " + result);
        }
    }
    public void carpma(View view) {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            sonucText.setText("Sayı Girin!!!");
        }
        else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;
            sonucText.setText("Sonuc: " + result);
        }
    }
    public void bolme(View view) {
        if(number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")){
            sonucText.setText("Sayı Girin!!!");
        }
        else{
            double number1 = Integer.parseInt(number1Text.getText().toString());
            double number2 = Integer.parseInt(number2Text.getText().toString());

            double result = number1 / number2;
            sonucText.setText("Sonuc: " + result);
        }
    }


}