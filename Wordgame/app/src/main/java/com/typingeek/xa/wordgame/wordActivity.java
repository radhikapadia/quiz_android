package com.typingeek.xa.wordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class wordActivity extends AppCompatActivity {

    private Button mchkButton;
    private TextView mchances;
    private TextView mscore;
    private TextView mWord_tview;
    private Button mnxtButton;
    private EditText mtest;
    private String mword;
    private String mwordView;
    private Integer myListSize;
    private String mtest_val;
    private Integer mchances_val;
    private String mregex_str;
    private Integer mscoreVal;
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        mchkButton = (Button) findViewById(R.id.chk_btn);
        mchances = (TextView) findViewById(R.id.chance_val);
        mscore =(TextView) findViewById(R.id.score_val);
        mWord_tview = (TextView) findViewById(R.id.word_textview);
        mnxtButton = (Button) findViewById(R.id.nxt_btn);
        mtest = (EditText) findViewById(R.id.input);
        ArrayList<String> myList = (ArrayList<String>) getIntent().getSerializableExtra("mylist");

        myListSize = myList.size();
        mword = myList.get(r.nextInt(myListSize));
        mnxtButton.setEnabled(false);
        mchances_val = 7;
        mregex_str = "aeiou";
        mwordView = mword.replaceAll( "[^"+mregex_str+"]", "?" );
        mWord_tview.setText(mwordView);
        mscoreVal = 0;

        mchkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    mtest_val = mtest.getText().toString();
                    if (mtest_val.length() != 0) {
                        mtest.setText("");
                        if (mword.contains(mtest_val)) {
                            mregex_str += mtest_val;
                            mwordView = mword.replaceAll("[^" + mregex_str + "]", "?");
                            mWord_tview.setText(mwordView);
                            if ( ! mwordView.contains("?")) {
                                mchkButton.setEnabled(false);
                                mnxtButton.setEnabled(true);
                                mscoreVal +=1;
                                mscore.setText(mscoreVal.toString());
                            }
                            else {
                                Toast.makeText(wordActivity.this, "Nice Try", Toast.LENGTH_SHORT).show();
                            }

                        } else {
                            mchances_val -= 1;
                            Toast.makeText(wordActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
                            mchances.setText(mchances_val.toString());
                            if (mchances_val <= 1) {
                                Intent i = new Intent(wordActivity.this, Score.class);
                                i.putExtra("score",mscoreVal);
                                startActivity(i);
                            }
                        }

                    }
                    else{
                        Toast.makeText(wordActivity.this, "Please enter something", Toast.LENGTH_SHORT).show();

                    }

            }
        });

        mnxtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> myList = (ArrayList<String>) getIntent().getSerializableExtra("mylist");
                mword = myList.get(r.nextInt(myListSize));
                mnxtButton.setEnabled(false);
                mchances_val = 7;
                mregex_str = "aeiou";
                mwordView = mword.replaceAll( "[^"+mregex_str+"]", "?" );
                mWord_tview.setText(mwordView);
                mchkButton.setEnabled(true);
            }
        });

    }
}
