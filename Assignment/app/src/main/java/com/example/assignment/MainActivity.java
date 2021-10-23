package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tellmemore,moreaboutcovid,seeless,reagle,sendagift,mychildren,mycommunity,praynow;
    ImageView playvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tellmemore = findViewById(R.id.tellmemore);
        moreaboutcovid = findViewById(R.id.moreaboutcovid);
        seeless = findViewById(R.id.seeless);
        reagle = findViewById(R.id.reagle);
        sendagift = findViewById(R.id.giveagift);
        mychildren = findViewById(R.id.mychildren);
        mycommunity = findViewById(R.id.mycommunity);
        praynow = findViewById(R.id.praynow);
        playvideo = findViewById(R.id.playvideo);

        tellmemore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moreaboutcovid.setVisibility(View.VISIBLE);
                seeless.setVisibility(View.VISIBLE);
            }
        });
        seeless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moreaboutcovid.setVisibility(View.GONE);
                seeless.setVisibility(View.GONE);
            }
        });
        sendagift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Give a Gift is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        reagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Reagle is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        mychildren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "My children is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        mycommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "My Community is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        praynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pray Now is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        playvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Video is Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

}