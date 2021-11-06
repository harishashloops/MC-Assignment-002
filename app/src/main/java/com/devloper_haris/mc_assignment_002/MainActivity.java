package com.devloper_haris.mc_assignment_002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.net.URI;

import static android.content.Intent.*;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {

        Intent intent = new Intent(this, HomeScreen.class);
        EditText nameText = (EditText) findViewById(R.id.Name);
        EditText emailText = (EditText) findViewById(R.id.Email);

        String Name = nameText.getText().toString();
        String Email = emailText.getText().toString();
        intent.putExtra("name", Name);
        intent.putExtra("email", Email);
        startActivity(intent);

        // Calling
//        Uri uri= Uri.parse("tel:=923014298840");
//        Intent intent=new Intent(ACTION_DIAL,uri);
//        startActivity(intent);


    }


}