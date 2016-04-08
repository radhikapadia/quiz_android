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
        easywordList.add("breeze");
        easywordList.add("poetry");
        easywordList.add("rhyme");
        easywordList.add("mysterious");
        easywordList.add("brick");
        easywordList.add("canal");
        easywordList.add("computer");
        easywordList.add("pride");
        easywordList.add("illuminate");
        easywordList.add("wild");
        easywordList.add("cricket");
        easywordList.add("video");
        easywordList.add("arrangement");
        easywordList.add("contrast");
        easywordList.add("advice");
        easywordList.add("garage");
        easywordList.add("hunter");
        easywordList.add("folks");
        easywordList.add("pride");
        easywordList.add("label");
        easywordList.add("vessels");
        easywordList.add("fruit");
        easywordList.add("shoes");
        easywordList.add("escape");
        easywordList.add("tune");
        easywordList.add("mouse");
        easywordList.add("control");

        final ArrayList<String> medwordList = new ArrayList<String>();
        medwordList.add("efficacy");
        medwordList.add("contrite");
        medwordList.add("abase");
        medwordList.add("commutation");
        medwordList.add("immutable");
        medwordList.add("hyperbole");
        medwordList.add("harangue");
        medwordList.add("alacrity");
        medwordList.add("condone");
        medwordList.add("luminous");
        medwordList.add("lucid");
        medwordList.add("commensurate");
        medwordList.add("guileless");
        medwordList.add("complaisant");
        medwordList.add("adulterate");
        medwordList.add("admonish");
        medwordList.add("lethargic");
        medwordList.add("abeyance");
        medwordList.add("distill");
        medwordList.add("coda");
        medwordList.add("laud");
        medwordList.add("dissolution");
        medwordList.add("coagulate");
        medwordList.add("garrulous");
        medwordList.add("latent");
        medwordList.add("gainsay");
        medwordList.add("disseminate");
        medwordList.add("chicanery");
        medwordList.add("abate");
        final ArrayList<String> hardwordList = new ArrayList<String>();
        hardwordList.add("probity");
        hardwordList.add("recondite");
        hardwordList.add("secrete");
        hardwordList.add("supposition");
        hardwordList.add("unwarrant");
        hardwordList.add("problematic");
        hardwordList.add("refractory");
        hardwordList.add("shard");
        hardwordList.add("tacit");
        hardwordList.add("prodigal");
        hardwordList.add("refute");
        hardwordList.add("skeptic");
        hardwordList.add("tangential");
        hardwordList.add("profound");
        hardwordList.add("relegate");
        hardwordList.add("tenuous");
        hardwordList.add("whimsical");
        hardwordList.add("reproach");
        hardwordList.add("soporific");
        hardwordList.add("tirade");
        hardwordList.add("zealot");
        hardwordList.add("proliferate");
        hardwordList.add("reprobate");
        hardwordList.add("specious");
        hardwordList.add("torpor");
        hardwordList.add("propensity");
        hardwordList.add("repudiate");
        hardwordList.add("spectrum");
        hardwordList.add("rendezvous");
        hardwordList.add("tryst");
        hardwordList.add("nexus");
        hardwordList.add("zeigeist");
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
