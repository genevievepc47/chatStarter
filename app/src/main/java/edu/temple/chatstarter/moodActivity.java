package edu.temple.chatstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class moodActivity extends AppCompatActivity {

    String[] info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);

        Intent intent = getIntent();
        info = intent.getStringArrayExtra("info"); //get the info array


        Button happyButton = findViewById(R.id.happy);
        Button angryButton = findViewById(R.id.angry);
        //Button excitedButton = findViewById(R.id.excited);


        happyButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                info[2] = "happy";
                //launch the new activity and pass it data
                Intent myIntent = new Intent(moodActivity.this, resultActivity.class);
                myIntent.putExtra("info",info); //Optional parameters
                moodActivity.this.startActivity(myIntent);
            }
        });

        angryButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                info[2] = "angry";
                //launch the new activity and pass it data
                Intent myIntent = new Intent(moodActivity.this, resultActivity.class);
                myIntent.putExtra("info",info); //Optional parameters
                moodActivity.this.startActivity(myIntent);
            }
        });


    }
}
