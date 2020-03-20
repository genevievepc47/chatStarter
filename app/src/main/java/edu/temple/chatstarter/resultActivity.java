package edu.temple.chatstarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class resultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //potential combinations
        //school, teacher, happy - Good morning! Our lesson yesterday was very interesting.
        //school, teacher, angry - Why did you give me a bad grade on my project? //right to the point
        //school, friend, happy - Hey! How was your weekend?
        //It was good, I had dinner with my grandma. Wanna hangout after school today and play wii?
        //Sure sounds great, see you then
        //school, friend, angry - I'm not talking to you until you apologize.
        //I'm not apologizing until you do. Fine, I guess we're not talking then. Fine
        //home, teacher, happy - I wanted to call you to thank you for doing a great job.
        //home, teacher, angry - I wanted to call you about my grade in your class.
        //home, friend, happy - It's so good to see you. Can I get you anything to drink?
        //yeah some water would be great.
        //home, friend, angry - Hey.
        //Hey. What do you want to do?
        //I don't know.
        //ok...
        //cool

    }
}
