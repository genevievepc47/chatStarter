package edu.temple.chatstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class relationshipActivity extends AppCompatActivity {

    String[] info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relationship);

        Intent intent = getIntent();
        info = intent.getStringArrayExtra("info"); //get the info array


        //Button parentButton = findViewById(R.id.parent);
        Button teacherButton = findViewById(R.id.teacher);
        Button friendButton = findViewById(R.id.friend);




        teacherButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                info[1] = "teacher";
                //launch the new activity and pass it data
                Intent myIntent = new Intent(relationshipActivity.this, moodActivity.class);
                myIntent.putExtra("info",info); //Optional parameters
                relationshipActivity.this.startActivity(myIntent);
            }
        });

        friendButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                info[1] = "friend";
                //launch the new activity and pass it data
                Intent myIntent = new Intent(relationshipActivity.this, moodActivity.class);
                myIntent.putExtra("info",info); //Optional parameters
                relationshipActivity.this.startActivity(myIntent);
            }
        });

    }
}
