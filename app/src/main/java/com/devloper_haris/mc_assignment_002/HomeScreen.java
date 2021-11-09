package com.devloper_haris.mc_assignment_002;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.content.Intent.ACTION_VIEW;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");

        // Capture the layout's TextView and set the string as its text
        TextView nameView = findViewById(R.id.nameView);
        nameView.setText("welcome "+name);

//        TextView emailView = findViewById(R.id.emailView);
//        emailView.setText(email);
    }
    public void gotoWebPage(View view) {
//        Log.d("first log","hello");
//        Intent intent = new Intent(this, HomeScreen.class);
//        EditText editText = (EditText) findViewById(R.id.Name);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);

        // Calling
//        Uri uri= Uri.parse("tel:=923014298840");
//        Intent intent=new Intent(ACTION_DIAL,uri);
//        startActivity(intent);

        //open web page
        openWebPage("https://github.com/harishashloops/MC-Assignment-002");

    }
    public void startGame(View view) {
        Intent intent = new Intent(this,  Training.class);
//        Intent intent = new Intent(this, gameScreen.class);
        startActivity(intent);
    }

    public void openWebPage(String url)
    {
        Uri webpage=Uri.parse(url);
        Intent intent =new Intent(ACTION_VIEW,webpage);
        startActivity(intent);
    }
}