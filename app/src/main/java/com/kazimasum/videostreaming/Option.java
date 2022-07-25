package com.kazimasum.videostreaming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Option extends AppCompatActivity {
    public void audio(View view){
        Toast.makeText(this, "Opening audio page", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(getApplicationContext(), Main.class);
        startActivity(intent);
    }
    public void video(View view){
        Toast.makeText(this, "Opening video page", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(getApplicationContext(),dashboard.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option);
    }
}

