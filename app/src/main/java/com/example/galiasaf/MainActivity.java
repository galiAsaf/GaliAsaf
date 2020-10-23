package com.example.galiasaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //stop voice
    }

    @Override
    protected void onResume() {
        super.onResume();
        //
    }

    public void btnLogin(View view) {
        Intent i= new Intent(this, MainActivity2.class);
        startActivity(i);
    }

    public void btnSignin(View view) {
        Intent i= new Intent(this, SignIn.class);
        startActivity(i);
    }

    public void btnGuest(View view) {
        Intent i= new Intent(this, ChooseOption.class);
        startActivity(i);
    }
}