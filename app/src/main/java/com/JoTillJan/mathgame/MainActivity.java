package com.JoTillJan.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.JoTillJan.mathgame.Helper.UIOptions;

public class MainActivity extends AppCompatActivity {

    private ImageButton button;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide the status and navigation bar
        getWindow().getDecorView().setSystemUiVisibility(UIOptions.STANDARD_UI_OPTIONS);

        //set color for privacy text to white
        text = (TextView) findViewById(R.id.Privacy_View);
        text.setTextColor(Color.parseColor("#FFFFFF"));

        //Button to MapSelect activity
        button = (ImageButton) findViewById(R.id.PlayButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapSelect();
            }
        });

        //Button to Privacy Policy
        button = (ImageButton) findViewById(R.id.Button_Privacy);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrivacyPolicy();
            }
        });
    }

    private void openMapSelect() {
        Intent intent = new Intent(this, MapSelectActivity.class);
        startActivity(intent);
    }

    private void openPrivacyPolicy(){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://policies.google.com/privacy")));
    }
}
