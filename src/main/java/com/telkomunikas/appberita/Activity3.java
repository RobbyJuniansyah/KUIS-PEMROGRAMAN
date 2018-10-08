package com.telkomunikas.appberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void Kembali(View view) {
        Intent intent = new Intent(Activity3.this, MainActivity.class);
        startActivity(intent);
    }
}
