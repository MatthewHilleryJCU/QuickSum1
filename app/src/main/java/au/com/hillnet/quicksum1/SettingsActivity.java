package au.com.hillnet.quicksum1;


import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity {

    private Button buttonAqua;
    private Button buttonBlack;
    private Button buttonBlue;
    private Button buttonGreen;
    private Button buttonGrey;
    private Button buttonLime;
    private Button buttonMaroon;
    private Button buttonNavy;
    private Button buttonOlive;
    private Button buttonPurple;

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        this.setTitle("QuickSum Settings");
        preferences = getSharedPreferences("colours", MODE_PRIVATE);

        buttonAqua = (Button) findViewById(R.id.buttonAqua);
        buttonAqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.aqua)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.black)).apply();
                finish();
            }
        });

        buttonBlack = (Button) findViewById(R.id.buttonBlack);
        buttonBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.black)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

        buttonBlue = (Button) findViewById(R.id.buttonBlue);
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.blue)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.green)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

        buttonGrey = (Button) findViewById(R.id.buttonGrey);
        buttonGrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.grey)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.black)).apply();
                finish();
            }
        });

        buttonLime = (Button) findViewById(R.id.buttonLime);
        buttonLime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.lime)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.black)).apply();
                finish();
            }
        });

        buttonMaroon = (Button) findViewById(R.id.buttonMaroon);
        buttonMaroon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.maroon)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

        buttonNavy = (Button) findViewById(R.id.buttonNavy);
        buttonNavy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.navy)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

        buttonOlive = (Button) findViewById(R.id.buttonOlive);
        buttonOlive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.olive)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.black)).apply();
                finish();
            }
        });

        buttonPurple = (Button) findViewById(R.id.buttonPurple);
        buttonPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferences.edit().putInt("backgroundColour", getColor(R.color.purple)).apply();
                preferences.edit().putInt("textColour", getColor(R.color.white)).apply();
                finish();
            }
        });

    }
}
