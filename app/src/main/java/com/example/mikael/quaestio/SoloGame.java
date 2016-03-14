package com.example.mikael.quaestio;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.R;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class SoloGame extends AppCompatActivity {
    private int difficultyLevel = 1;
    private int points = 0;
    private int score;
    private String difficultyString;
    private boolean answerValue;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_solo_game);
        //Initialize the settings
        initializeSettings();
        //Use the buttons.
        final Button answer1 = (Button) findViewById(R.id.btnAnswer1);
        final Button answer2 = (Button) findViewById(R.id.btnAnswer2);
        final Button answer3 = (Button) findViewById(R.id.btnAnswer3);
        final Button answer4 = (Button) findViewById(R.id.btnAnswer4);
        answer1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                checkAnswer();
                updateScore();
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                checkAnswer();
                updateScore();
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                checkAnswer();
                updateScore();
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                checkAnswer();
                updateScore();
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void initializeSettings() {
        //Set the difficultyString to represent the correct difficulty level
        if (difficultyLevel == 1) {
            difficultyString = "Very Easy";
        } else if (difficultyLevel == 2) {
            difficultyString = "Easy";
        } else if (difficultyLevel == 3) {
            difficultyString = "Medium";
        } else if (difficultyLevel == 4) {
            difficultyString = "Hard";
        } else if (difficultyLevel == 5) {
            difficultyString = "Impossible!";
        }
        //Set the difficulty string to the correct string
        TextView textDifficultyChange = (TextView) findViewById(R.id.lblDifficultyOutput);
        textDifficultyChange.setText(difficultyString);
        updateScore();
    }

    private void checkAnswer() {
        if (answerValue == true && difficultyLevel == 1) {
            points = 100;
        } else if (answerValue == true && difficultyLevel == 2) {
            points = 200;
        } else if (answerValue == true && difficultyLevel == 3) {
            points = 300;
        } else if (answerValue == true && difficultyLevel == 4) {
            points = 400;
        } else if (answerValue == true && difficultyLevel == 5) {
            points = 800;
        } else {
            points = points - 50;
        }
    }

    private void updateScore() {
        score = score + points;
        TextView textScoreChange = (TextView) findViewById(R.id.lblScoreOutput);
        textScoreChange.setText(score);
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "SoloGame Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.mikael.quaestio/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "SoloGame Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.mikael.quaestio/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
