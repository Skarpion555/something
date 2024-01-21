package com.example.zilzar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String Teamname1, Teamname2, SurvivalTeamname;
    EditText editText;
    EditText editText2;
    EditText editTextsurvival;
    Button login;
    Button cancel;


    @SuppressLint({"MissingInflatedId", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survivalteamregistration);
        setContentView(R.layout.commonteamregistration);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.mainsurvival);
        setContentView(R.layout.scoretable);
        setContentView(R.layout.scoretablesurvival);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editTextsurvival = (EditText) findViewById(R.id.editTextsurvival);

        login = (Button) findViewById(R.id.login);
        cancel = (Button) findViewById(R.id.login);

        login.setOnClickListener((View.OnClickListener) this);
        cancel.setOnClickListener((View.OnClickListener) this);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLogin();

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCancel();

            }
        });
    }

    private void onLogin() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void onCancel() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}