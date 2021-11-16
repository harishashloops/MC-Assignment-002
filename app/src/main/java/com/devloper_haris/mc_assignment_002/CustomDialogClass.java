package com.devloper_haris.mc_assignment_002;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public TextView d;
    public TextView congratulation;
    public TextView Score;
    public Button yes, no;
    public int scr;

    public CustomDialogClass(Activity a,int s) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
        this.scr=s;
//        Score.setText("Your Score is "+scr);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        yes = (Button) findViewById(R.id.btn_yes);
        no = (Button) findViewById(R.id.btn_no);
        congratulation=(TextView) findViewById((R.id.txt_Cong));
        congratulation.setText("Conratulations");

        Score=(TextView) findViewById((R.id.txt_scr));
        Score.setText("Your Score is "+this.scr);
        d=(TextView) findViewById((R.id.txt_shr));
        d.setText("Would you like to share your Score?");
        yes.setOnClickListener(this);
        no.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yes:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Hey, i Scored"+this.scr+" in this awsome app (app link).");
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                c.startActivity(shareIntent);
                break;
            case R.id.btn_no:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
        
    }

}