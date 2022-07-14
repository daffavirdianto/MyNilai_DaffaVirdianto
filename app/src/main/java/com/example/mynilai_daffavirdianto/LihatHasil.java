package com.example.mynilai_daffavirdianto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class LihatHasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihathasil);

        TextView txtmatakuliah = findViewById(R.id.matakuliah);
        String namaA = getIntent().getStringExtra("matakuliah");
        txtmatakuliah.setText(namaA);

        TextView txtnim = findViewById(R.id.nim);
        String namaB = getIntent().getStringExtra("nim");
        txtnim.setText(namaB);

        TextView txtnama = findViewById(R.id.nama);
        String namaC = getIntent().getStringExtra("nama");
        txtnama.setText(namaC);

    }
}