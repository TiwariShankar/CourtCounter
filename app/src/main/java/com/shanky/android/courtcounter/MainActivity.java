package com.shanky.android.courtcounter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA,scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        displayForTeamA(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void updateScore(View view){

        switch (view.getId()) {
            //For case A
            case R.id.updateBy3ForA:
                scoreTeamA = scoreTeamA + 3;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.updateBy2ForA:
                scoreTeamA = scoreTeamA + 2;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.updateByFreePointsForA:
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
                break;

            //For B case
            case R.id.updateBy3ForB:
                scoreTeamB = scoreTeamB + 3;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.updateBy2ForB:
                scoreTeamB = scoreTeamB + 2;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.updateByFreePointsForB:
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);
                break;
        }

    }

    public void Reset(View view){
        displayForTeamA(0);
        displayForTeamB(0);
        scoreTeamA = 0;
        scoreTeamB = 0;
    }
}
