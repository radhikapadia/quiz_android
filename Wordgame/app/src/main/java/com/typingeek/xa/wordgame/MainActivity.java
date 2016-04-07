package com.typingeek.xa.wordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button measyButton;
    private Button mmediumButton;
    private Button mhardButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        measyButton = (Button) findViewById(R.id.easy_btn);
        mmediumButton =(Button) findViewById(R.id.medium_btn);
        mhardButton = (Button) findViewById(R.id.hard_btn);
        final ArrayList<String> easywordList = new ArrayList<String>();
        easywordList.add("HelloWorld");
        easywordList.add("AkshayDahiya");
        easywordList.add("RadhikaMoti");
        easywordList.add("maurat");

        final ArrayList<String> medwordList = new ArrayList<String>();
        medwordList.add("Google");
        final ArrayList<String> hardwordList = new ArrayList<String>();
        hardwordList.add("TeslaMotors");
        measyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity.this, wordActivity.class);
                intent.putExtra("mylist", easywordList);

                startActivity(intent);

            }
        });

        mmediumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity.this, wordActivity.class);
                intent.putExtra("mylist", medwordList);

                startActivity(intent);

            }
        });

        mhardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(MainActivity.this, wordActivity.class);
                intent.putExtra("mylist", hardwordList);
                startActivity(intent);

            }
        });
    }
}
