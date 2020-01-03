package com.JoTillJan.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.JoTillJan.mathgame.Helper.UIOptions;

public class LevelSelectActivity extends AppCompatActivity {

    private ImageButton backButton;
    private ImageButton arViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);

        //hide the status and navigation bar
        getWindow().getDecorView().setSystemUiVisibility(UIOptions.STANDARD_UI_OPTIONS);

        //Button to LevelSelect activity
        backButton = (ImageButton) findViewById(R.id.Button_Back_LevelSelect);
        backButton.setOnClickListener(v -> openMapSelect());

        //Button to AR activity
        arViewButton = (ImageButton) findViewById(R.id.imageButton);
        arViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openARActivity();
            }
        });
    }

    private void openMapSelect(){
        Intent intent = new Intent(this, MapSelectActivity.class);
        startActivity(intent);
    }

    private void openARActivity(){
        Intent intent = new Intent(this, ARActivity.class);
        startActivity(intent);
    }
}
