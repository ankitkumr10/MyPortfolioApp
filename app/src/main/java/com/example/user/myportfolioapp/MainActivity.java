package com.example.user.myportfolioapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickSpotify(View view){
        Context context= getApplicationContext();
        CharSequence message = "This Button will launch Spotify Streamer!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast= Toast.makeText(context,message,duration);
        toast.show();
    }
    public void onClickScores(View view){
        Context context= getApplicationContext();
        CharSequence message = "This Button will launch Scores!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast= Toast.makeText(context,message,duration);
        toast.show();
    }
    public void onClickLibrary(View view){
        Context context= getApplicationContext();
        CharSequence message = "This Button will launch Library!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast= Toast.makeText(context,message,duration);
        toast.show();
    }public void onClickBig(View view){
        Context context= getApplicationContext();
        CharSequence message = "This Button will launch 'Build It Bigger'!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast= Toast.makeText(context,message,duration);
        toast.show();
    }public void onClickXYZ(View view){
        Context context= getApplicationContext();
        CharSequence message = "This Button will launch XYZ Reader!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast= Toast.makeText(context,message,duration);
        toast.show();
    }public void onClickCapstone(View view){
        Context context= getApplicationContext();
        CharSequence message = "This Button will launch My own Capstone Project!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast= Toast.makeText(context,message,duration);
        toast.show();
    }
}
