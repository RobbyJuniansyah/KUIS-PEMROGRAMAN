package com.telkomunikas.appberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Klik(View view) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }

    public void KLIK(View view) {
        Intent intent = new Intent(MainActivity.this, Activity3.class);
        startActivity(intent);
    }


    public void kliK(View view) {
        Intent intent = new Intent(MainActivity.this, Activity4.class);
        startActivity(intent);
    }
}
