package com.JoTillJan.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide the status and navigation bar
        getWindow().getDecorView().setSystemUiVisibility(UIOptions.STANDARD_UI_OPTIONS);

        //Button to MapSelect activity
        button = (ImageButton) findViewById(R.id.PlayButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapSelect();
            }
        });
    }

    private void openMapSelect() {
        Intent intent = new Intent(this, MapSelectActivity.class);
        startActivity(intent);
    }
}
