package com.example.mynilai_daffavirdianto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BobotNilai extends AppCompatActivity {

    String TAG = "LihatHasil";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bobotnilai);

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
    public void proses (View view) {

        TextView mataKuliah = findViewById(R.id.matakuliah);
        TextView Inputnim = findViewById(R.id.nim);
        TextView Inputnama = findViewById(R.id.nama);


        String Matakuliah = mataKuliah.getText().toString();
        Log.d(TAG, Matakuliah);
        String nim = Inputnim.getText().toString();
        Log.d(TAG, nim);
        String nama = Inputnama.getText().toString();
        Log.d(TAG, nama);

        Intent c = new Intent(this, LihatHasil.class);
        c.putExtra("matakuliah", Matakuliah);
        c.putExtra("nim", nim);
        c.putExtra("nama", nama);
        startActivity(c);

    }
}