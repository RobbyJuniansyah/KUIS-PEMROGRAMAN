package com.telkomunikas.appberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void kembali(View view) {

        Intent intent = new Intent(Activity2.this, MainActivity.class);
        startActivity(intent);
    }
}
