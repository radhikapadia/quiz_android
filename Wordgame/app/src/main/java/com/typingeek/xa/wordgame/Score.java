package com.typingeek.xa.wordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    private Button mrestartButton;
    private TextView mscoreView;
    private String mscore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        mscoreView = (TextView) findViewById(R.id.score_val);
        mscore = getIntent().getSerializableExtra("score").toString();
        mscoreView.setText(mscore.toString());
        mrestartButton = (Button) findViewById(R.id.restart_btn);
        mrestartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Score.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
