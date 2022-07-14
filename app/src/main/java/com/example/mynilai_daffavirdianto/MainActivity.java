package com.example.mynilai_daffavirdianto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String TAG = "LihatHasil";

    String[] items = {"Mobile Computing", "Kalkulus", "Bahasa Inggris"};
    AutoCompleteTextView autoCompleteTxt;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTxt = findViewById(R.id.autoCompleteTextView);
        adapterItems = new ArrayAdapter<String>(this,R.layout.dropdown_item, items);
        autoCompleteTxt.setAdapter(adapterItems);
        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Item: "+item, Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void input (View view) {
        AutoCompleteTextView inputmatkul = findViewById(R.id.autoCompleteTextView);

        String autoCompleteTextView = inputmatkul.getText().toString();
        Log.d(TAG, autoCompleteTextView);

        Intent a = new Intent(this, InputNilai.class);
        a.putExtra("matakuliah", autoCompleteTextView);
        startActivity(a);

    }
}