package com.example.galiasaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class startPlanner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_planner);
    }

    public void btnColorsAndBackgrounds(View view) {
        Intent i= new Intent(this, chooseColorsAndBackgrounds.class);
        startActivity(i);
    }

    public void btnFont(View view) {
        Intent i= new Intent(this, chooseFont.class);
        startActivity(i);
    }

    public void btnInfoAndType(View view) {
        Intent i= new Intent(this, chooseInfoAndType.class);
        startActivity(i);
    }

    public void btnPreview(View view) {
        Intent i= new Intent(this, preview.class);
        startActivity(i);
    }
}