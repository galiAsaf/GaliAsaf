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

    public void btnStartPlanner(View view) {
        Intent i= new Intent(this, startPlanner.class);
        startActivity(i);
    }

    public void btnTheme(View view) {
        Intent i= new Intent(this, theme.class);
        startActivity(i);
    }
}