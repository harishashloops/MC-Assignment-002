package com.devloper_haris.mc_assignment_002;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class gameScreen extends AppCompatActivity {
    int count=3;
    Button nextButton;
    int right_answer=0;
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
        nextButton=(Button) findViewById(R.id.button13);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(myToolbar);
        myToolbar.setTitle("hello world");

        TextView Text = (TextView) findViewById(R.id.textView);

        Text.setText(arabic[rand]);
    }
    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected( @NonNull MenuItem item ) {

        switch (item.getItemId()){
            case R.id.action_Favorite:
                Toast.makeText(this, "action_Favorite Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_Setting:
                Toast.makeText(this, "action_Setting Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_Share:
                Toast.makeText(this, "action_Share Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
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


    public void nextQuestion() {

        if (count==0)
        {
            count=3;
            CustomDialogClass cdd=new CustomDialogClass(this,right_answer);
            cdd.show();
        }
        else
        {
            count=count-1;
            int temp=new Random().nextInt(28);
            rand=temp;
            TextView Text = (TextView) findViewById(R.id.textView);
            Text.setText(arabic[temp]);
            Text.setBackgroundColor(Color.parseColor("#ffffff"));
        }
//        R.id.TXT_Exit:


    }
    public void buttonPress1(View v) throws InterruptedException {
        TextView Text = (TextView) findViewById(R.id.textView);
//        TextView Text2 = (TextView) findViewById(R.id.textView2);
//        TextView Text3 = (TextView) findViewById(R.id.textView3);


        switch (v.getId()) {


            case R.id.btn1:

                if(Ans[rand]==0)
                {
                    Text.setBackgroundColor(Color.parseColor("#008000"));
                    right_answer++;


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
                    right_answer++;

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
                    right_answer++;

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
                right_answer++;

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
                    right_answer++;

                }
                else
                {
                    Text.setBackgroundColor(Color.parseColor("#FF5555"));

                }
                // i'm lazy, do nothing
                break;
        }

//        TimeUnit.SECONDS.sleep(5);

//        random=new Random().nextInt(28) ;//[0, 27]
//        Text.setBackgroundColor(Color.parseColor("#FFFFFF"));

    }





}
