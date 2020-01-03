package com.JoTillJan.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.JoTillJan.mathgame.Helper.UIOptions;

public class MapSelectActivity extends AppCompatActivity {

    private ImageButton backButton;
    private ImageButton mapButton01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_select);

        //hide the status and navigation bar
        getWindow().getDecorView().setSystemUiVisibility(UIOptions.STANDARD_UI_OPTIONS);

        //Button to StartScreen activity
        backButton = (ImageButton) findViewById(R.id.Button_Back_MapSelect);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStartScreen();
            }
        });

        //Button to Map01 activity
        mapButton01 = (ImageButton) findViewById(R.id.Button_Map_01);
        mapButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap01();
            }
        });
    }

    private void openStartScreen(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void openMap01(){
        Intent intent = new Intent(this, LevelSelectActivity.class);
        startActivity(intent);
    }
}
