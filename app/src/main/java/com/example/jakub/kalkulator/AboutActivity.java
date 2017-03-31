package com.example.jakub.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView allInfoText = (TextView)findViewById(R.id.allInfo);
        allInfoText.setText("Kalkulator\nOlczak Jakub\nver. 0.1\n\n" +
                "Prosta aplikacja typu kalkulator z możliwością wyboru trybu zaawansowania");
    }
}
