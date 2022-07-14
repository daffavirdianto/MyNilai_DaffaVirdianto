package com.example.mynilai_daffavirdianto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InputNilai extends AppCompatActivity {

    String TAG = "InputNilai";;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputnilai);

        TextView txtmatakuliah = findViewById(R.id.matakuliah);
        String namaA = getIntent().getStringExtra("matakuliah");
        txtmatakuliah.setText(namaA);
    }

    public void submit (View view) {

        TextView mataKuliah = findViewById(R.id.matakuliah);
        EditText Inputnim = findViewById(R.id.nim);
        EditText Inputnama = findViewById(R.id.nama);
        EditText Inputpresensi = findViewById(R.id.presensi);

        String Matakuliah = mataKuliah.getText().toString();
        Log.d(TAG, Matakuliah);

        String nim = Inputnim.getText().toString();
        Log.d(TAG, nim);
        String nama = Inputnama.getText().toString();
        Log.d(TAG, nama);
        String presensi = Inputpresensi.getText().toString();
        Log.d(TAG, presensi);



        Intent a = new Intent(this, BobotNilai.class);
        a.putExtra("matakuliah", Matakuliah);
        a.putExtra("nim", nim);
        a.putExtra("nama", nama);

        startActivity(a);

    }

}