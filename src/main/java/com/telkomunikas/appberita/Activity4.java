package com.telkomunikas.appberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void KEMBALI(View view) {
        Intent intent = new Intent(Activity4.this, MainActivity.class);
        startActivity(intent);
    }
}
