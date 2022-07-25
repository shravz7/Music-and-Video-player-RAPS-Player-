package com.kazimasum.videostreaming;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    public void singUp(View view){
        Toast.makeText(this, "Opening Sign Up page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void logIn(View view){
        Toast.makeText(this, "Opening LogIn page", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,login.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
