package com.devloper_haris.mc_assignment_002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Training extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Halqiyah","Lahatiyah",
            "Shajariyah-Haafiyah","Tarfiyah",
            "Nit-eeyah","Lisaveyah","","Ghunna",
            "","",
    };

    String[] subtitle ={
            "أ ة  –  Sound produced from the End of Throat\n" +
            "\n" +
            "ع ح –  Sound produced from the Middle of Throat\n" +
            "\n" +
            "غ خ – Sound produced from the Start of Throat"
            ,
            "ق –  Base of Tongue which is near Uvula touching the mouth roof\n" +
            "\n" +
            "ك –  Portion of Tongue near its base touching the roof of mouth",
            "ج ش ى – Tongue touching the center of the mouth roof\n" +
                    "\n" +
                    "ض   – One side of the tongue touching the molar teeth",
            "ل  – Rounded tip of the tongue touching the base of the frontal 8 teeth\n" +
                    "\n" +
                    "ن  – Rounded tip of the tongue touching the base of the frontal 6 teeth\n" +
                    "\n" +
                    "ر  – Rounded tip of the tongue and some portion near it touching the base of the frontal 4 teeth",
            "ط د ت – Tip of the tongue touching the base of the front 2 teeth",
            "ظ  ذ  ث – Tip of the tongue touching the tip of the frontal 2 teeth",
            "ص ز س – Tip of the tongue comes between the front top and bottom teeth",
            "م ن – While pronouncing the ending sound of  م  or ن , bring the vibration to the nose",
            "ف – Tip of the two upper jaw teeth touches the inner part of the lower lip\n" +
                    "\n" +
                    "ب – Inner part of the both lips touch each other,  \n" +
                    "\n" +
                    "م –  Outer part of both lips touch each other,  \n" +
                    "\n" +
                    "و –  Rounding both lips and not closing the mouth",
            "Mouth empty space while speaking words like  باَ بوُ بىِ"
    };

    Integer[] imgid={
            R.drawable.image1,R.drawable.image2,
            R.drawable.image3,R.drawable.image4,
            R.drawable.image5, R.drawable.image6,R.drawable.image7,
            R.drawable.image8,R.drawable.image9,
            R.drawable.image9,
    };
    public void startQuiz(View view) {

        Intent intent = new Intent(this, gameScreen.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener((parent, view, position, id) -> {
            // TODO Auto-generated method stub
            if(position == 0) {
                //code specific to first list item
                Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
            }

            else if(position == 1) {
                //code specific to 2nd list item
                Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
            }

            else if(position == 2) {

                Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
            }
            else if(position == 3) {

                Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
            }
            else if(position == 4) {

                Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
            }
            else if(position == 5) {

                Toast.makeText(getApplicationContext(),"Place Your Sixth Option Code",Toast.LENGTH_SHORT).show();
            }
            else if(position == 6) {

                Toast.makeText(getApplicationContext(),"Place Your Seventh Option Code",Toast.LENGTH_SHORT).show();
            }

        });
    }
}