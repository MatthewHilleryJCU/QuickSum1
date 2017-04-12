package au.com.hillnet.quicksum1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.Format;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    private Button buttonReset;
    private Button buttonOther;
    private ImageButton buttonSettings;

    private TextView totalView;

    private Double total = 0.00;

    private Boolean isOtherMode = false;

    private SharedPreferences preferences;
    private Integer backgroundColour;
    private Integer textColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // Create Shared Preference and put initial values
        preferences = getSharedPreferences("colours", MODE_PRIVATE);
        //preferences.edit().clear().apply();
        backgroundColour = preferences.getInt("backgroundColour", getColor(R.color.grey));
        textColour = preferences.getInt("textColour", getColor(R.color.black));
        getWindow().getDecorView().setBackgroundColor(backgroundColour);

        totalView = (TextView) findViewById(R.id.total);
        totalView.setTextColor(textColour);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (isOtherMode) {
                    total = total + 0.5;
                    button1.setText("1");
                    button2.setText("2");
                    button3.setText("3");
                    isOtherMode = false;
                } else {
                    total = total + 1;
                }
                totalView.setText(Double.toString(total));
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (isOtherMode) {
                    total = total + 0.333333;   
                    button1.setText("1");
                    button2.setText("2");
                    button3.setText("3");
                    isOtherMode = false;
                } else {
                    total = total + 2;
                }
                totalView.setText(Double.toString(total));
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (isOtherMode) {
                    total = total + 0.25;
                    button1.setText("1");
                    button2.setText("2");
                    button3.setText("3");
                    isOtherMode = false;
                } else {
                    total = total + 3;
                }
                totalView.setText(Double.toString(total));
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                total = total + 4;
                totalView.setText(Double.toString(total));
                button1.setText("1");
                button2.setText("2");
                button3.setText("3");
                isOtherMode = false;
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                total = total + 5;
                totalView.setText(Double.toString(total));
                button1.setText("1");
                button2.setText("2");
                button3.setText("3");
                isOtherMode = false;
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                total = total + 6;
                totalView.setText(Double.toString(total));
                button1.setText("1");
                button2.setText("2");
                button3.setText("3");
                isOtherMode = false;
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                total = total + 7;
                totalView.setText(Double.toString(total));
                button1.setText("1");
                button2.setText("2");
                button3.setText("3");
                isOtherMode = false;
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                total = total + 8;
                totalView.setText(Double.toString(total));
                button1.setText("1");
                button2.setText("2");
                button3.setText("3");
                isOtherMode = false;
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                total = total + 9;
                totalView.setText(Double.toString(total));
                button1.setText("1");
                button2.setText("2");
                button3.setText("3");
                isOtherMode = false;
            }
        });

        buttonReset = (Button) findViewById(R.id.buttonReset);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                total = 0.00;
                totalView.setText(Double.toString(total));
                button1.setText("1");
                button2.setText("2");
                button3.setText("3");
                isOtherMode = false;
            }
        });

        buttonOther = (Button) findViewById(R.id.buttonOther);
        buttonOther.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (isOtherMode) {
                    button1.setText("1");
                    button2.setText("2");
                    button3.setText("3");
                    isOtherMode = false;
                } else {
                    button1.setText("1/2");
                    button2.setText("1/3");
                    button3.setText("1/4");
                    isOtherMode = true;
                }


            }
        });

        buttonSettings = (ImageButton) findViewById(R.id.buttonSettings);
        buttonSettings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);

            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        backgroundColour = preferences.getInt("backgroundColour", getColor(R.color.grey));
        getWindow().getDecorView().setBackgroundColor(backgroundColour);
        textColour = preferences.getInt("textColour", getColor(R.color.black));
        totalView.setTextColor(textColour);
    }
}
