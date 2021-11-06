package com.devloper_haris.mc_assignment_002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class gameScreen extends AppCompatActivity {
    String [] arabic = {"أ", "ب",  "ت", "ث", "چ", "ح", "خ", "د", "ذ", "ر", "ز",  "س","ش", "ص", "ض", "ط", "ظ", "ع", "غ", "ف", "ق", "ک", "ل", "م", "ن", "و", "ه", "ی"};
    int [] Ans=         {1,   2,    0,   0,    0,   1,   1,   0,    0,  0,    0,   0,   0,   0,    4,   0,  0,   1  , 1 ,   2,   0,   0,   4,   3,   3,    2,  1,   0,};

    String [] option={"Mouth","Throat","Lips","Nose","Tongue"};
    int rand=new Random().nextInt(28) ;//[0, 27]

//  0 String [] Mouth={  "ت", "ث", "چ", "د", "ذ", "ر", "ز",  "س","ش", "ص", , "ط", "ظ", "ق", "ک", "ی"}
//  1 String [] Throat={" خ "," غ "," ح "," ع ", " هـ " ," ء "};
//  2 String Lips []={  "ب" ,"و" , "ف"};
//  3 String Nose []={  "م", "ن"};
//  4 String Tongue []={  "ل", "ض"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        TextView Text = (TextView) findViewById(R.id.textView);

        Text.setText(arabic[rand]);
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save the state of item position
        outState.putString("value", arabic[rand]);
//        outState.putString("value", "hel");

    }
    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        TextView Text = (TextView) findViewById(R.id.textView);
        String myString=savedInstanceState.getString("value");
        Text.setText(myString);

    }


    public void nextQuestion(View v) {
        int temp=new Random().nextInt(28);
        rand=temp;
        TextView Text = (TextView) findViewById(R.id.textView);
        Text.setText(arabic[temp]);
        Text.setBackgroundColor(Color.parseColor("#ffffff"));
    }
    public void buttonPress1(View v) {
        TextView Text = (TextView) findViewById(R.id.textView);
//        TextView Text2 = (TextView) findViewById(R.id.textView2);
//        TextView Text3 = (TextView) findViewById(R.id.textView3);


        switch (v.getId()) {


            case R.id.btn1:

                if(Ans[rand]==0)
                {
                    Text.setBackgroundColor(Color.parseColor("#008000"));

                }
                else
                {
                    Text.setBackgroundColor(Color.parseColor("#FF5555"));

                }


                // do something
                break;
            case R.id.btn2:
                if(Ans[rand]==4)
                {
                    Text.setBackgroundColor(Color.parseColor("#008000"));

                }
                else
                {
                    Text.setBackgroundColor(Color.parseColor("#FF5555"));

                }
                // do something else
                break;
            case R.id.btn3:
                if(Ans[rand]==2)
                {
                    Text.setBackgroundColor(Color.parseColor("#008000"));

                }
                else
                {
                    Text.setBackgroundColor(Color.parseColor("#FF5555"));

                }
                // i'm lazy, do nothing
                break;
            case R.id.btn4:
                if(Ans[rand]==1)
            {
                Text.setBackgroundColor(Color.parseColor("#008000"));

            }
                else
            {
                Text.setBackgroundColor(Color.parseColor("#FF5555"));

            }
                // i'm lazy, do nothing
                break;
            case R.id.btn5:
                if(Ans[rand]==3)
                {
                    Text.setBackgroundColor(Color.parseColor("#008000"));

                }
                else
                {
                    Text.setBackgroundColor(Color.parseColor("#FF5555"));

                }
                // i'm lazy, do nothing
                break;
        }
//        random=new Random().nextInt(28) ;//[0, 27]
//        Text.setBackgroundColor(Color.parseColor("#FFFFFF"));

    }





}
