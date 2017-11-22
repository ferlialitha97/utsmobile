package com.example.windows.utsmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.microsoft.utsmobile.R;

public class MainTrapesium extends AppCompatActivity {

    TextView tampil;
    EditText masukan, masukan2, masukan3;;
    Button tekan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_trapesium);
        tampil = (TextView) findViewById(R.id.text);
        masukan = (EditText) findViewById(R.id.edit1);
        masukan2 = (EditText) findViewById(R.id.edit2);
        masukan3 = (EditText) findViewById(R.id.edit3);
        tekan = (Button) findViewById(R.id.tekan);


        tekan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    int nilaiA = Integer.parseInt(masukan.getText().toString());
                    int nilaiB = Integer.parseInt(masukan2.getText().toString());
                    int nilaiC = Integer.parseInt(masukan3.getText().toString());
                    int hasil = nilaiA + nilaiB  * nilaiC;
                    Intent i = new Intent(MainTrapesium.this, MainHasil.class);
                    i.putExtra("nilai", "" + hasil);
                    startActivity(i);
                } catch (Exception ex) {
                }
            }
        });
    }

    public void tekan2(View view) {
        try {
            int nilaiA = Integer.parseInt(masukan.getText().toString());
            int nilaiB = Integer.parseInt(masukan2.getText().toString());
            int nilaiC = Integer.parseInt(masukan3.getText().toString());

            int hasil = nilaiA + nilaiB + nilaiC + nilaiA;
            Intent i = new Intent(MainTrapesium.this, MainHasil.class);
            i.putExtra("nilai", "" + hasil);
            startActivity(i);
        } catch (Exception ex) {
        }

    }
}
