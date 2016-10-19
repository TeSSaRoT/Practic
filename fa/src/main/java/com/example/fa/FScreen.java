package com.example.fa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fscreen);
    }

    public void Button_Click(View v) {
        Intent intent = new Intent(this, SScreen.class);
        startActivity(intent);
    }
}
