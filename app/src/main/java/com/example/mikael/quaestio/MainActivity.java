package com.example.mikael.quaestio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;
import android.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Button soloGame = (Button) findViewById(R.id.btnNewSolo);
        //final Button playFriends = (Button) findViewById(R.id.btnPlayFriends);
        //final Button playRandoms = (Button) findViewById(R.id.btnPlayRandom);
        soloGame.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //When the user clicks the New Solo Game button, we want to set up
                // a new solo game for them to play.  Before this is done, we'll need
                // to know if the user wants to play very easy, easy, medium, hard, or
                // impossible difficulty of trivia. We will also need to know the category
                // of trivia they would like to play - Science, History, Geography, Math, Information
                // Technology, Pop Culture, or Random.
                //TODO: Make button open SoloGame activity
                //TODO: Create Difficulty Selection Menu && pass difficultyLevel to SoloGame activity
                //TODO: Create questions&answers database with SQLite for each difficultyLevel and category
                //TODO: Create point system for correct answers
                //TODO: Create Leaderboard for solo game]
            }

        });/*
        playFriends.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //When the user clicks the Play with Friends! button, we want to set up
                // a new game session between them and a friend of their choice.   Before this is done,
                // we'll need to know if the user wants to play very easy, easy, medium, hard, or
                // impossible difficulty of trivia.  We will also need to know the category
                // of trivia they would like to play - Science, History, Geography Math, Information
                // Technology, Pop Culture, or Random.
                //TODO: Create PlayFriends Activity && make button open PlayFriends Activity
                //TODO: Create Difficulty Selection Menu && pass difficultyLevel to PlayFriends activity
                //TODO: Create userAccount && method to look up friend's user accounts
                //      Maybe- a friend's list to keep track of known friends
                //TODO: Create rock, paper, scissors minigame for tie-breakers
                Toast.makeText(getBaseContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
            }
        });
        playRandoms.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //When the user clicks the Play Randoms! button, we want to set up
                // a new game session between them and a random player. Before this
                // is done, we'll need to know if they want to play very easy, easy, medium, hard, or
                // impossible difficulty of trivia.  We will also need to know the category
                // of trivia they would like to play - Science, History, Geography Math, Information
                // Technology, Pop Culture, or Random.
                //TODO: Create PlayRandoms Activity && make button open PlayRandoms activity
                //TODO: Figure out how we're going to decide which random player to use
                //TODO: Add option to add random player as a friend
                //TODO: Create Leaderboard for Randoms
                Toast.makeText(getBaseContext(), "Coming Soon!", Toast.LENGTH_SHORT).show();
            }
        });*/
    }
}
