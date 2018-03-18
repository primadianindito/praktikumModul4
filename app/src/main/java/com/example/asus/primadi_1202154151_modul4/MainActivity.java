package com.example.asus.primadi_1202154151_modul4;

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

    public void cariNama(View view) {
        Intent a = new Intent(MainActivity.this, list_nama.class);
        startActivity(a);
    }

    public void cariGambar(View view) {
        Intent b = new Intent(MainActivity.this, CariGambar.class);
        startActivity(b);
    }
}
