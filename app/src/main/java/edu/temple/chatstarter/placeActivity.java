package edu.temple.chatstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class placeActivity extends AppCompatActivity {
    String[] info = {"place", "relationship", "mood"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);




        //Button workButton = findViewById(R.id.work);
        Button schoolButton = findViewById(R.id.school);
        Button homeButton = findViewById(R.id.home);




        schoolButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                info[0] = "school";
                //launch the new activity and pass it data
                Intent myIntent = new Intent(placeActivity.this, relationshipActivity.class);
                myIntent.putExtra("info",info); //Optional parameters
                placeActivity.this.startActivity(myIntent);
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                info[0] = "home";
                //launch the new activity and pass it data
                Intent myIntent = new Intent(placeActivity.this, relationshipActivity.class);
                myIntent.putExtra("info",info); //Optional parameters
                placeActivity.this.startActivity(myIntent);
            }
        });
    }
}
