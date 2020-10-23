package com.example.galiasaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChooseOption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_option);
    }

    public void btnBack1(View view) {
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}