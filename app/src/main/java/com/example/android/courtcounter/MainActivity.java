package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int TWO_POINTS = 2;
    final int THREE_POINTS = 3;
    final int FREE_THROW = 1;

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // This method is called to display scores of Team A when points are addded
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    // This method is called to display scores of Team B when points are addded
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
//    public void displayReset(){
//        TextView teamA = (TextView) findViewById(R.id.team_a_score);
//        TextView teamB = (TextView) findViewById(R.id.team_b_score);
//
//        teamA.setText("0");
//        teamB.setText("0");
//    }


    // This method is called to when the +2 point button of Team A is clicked
    public void addTwoPointsForTeamA(View view){
        scoreTeamA += TWO_POINTS;
       displayForTeamA(scoreTeamA);
    }
    // This method is called to when the +2 point button of Team B is clicked
    public void addTwoPointsForTeamB(View view){
        scoreTeamB += TWO_POINTS;
        displayForTeamB(scoreTeamB);
    }


    // This method is called to when the +3 point button of Team A is clicked
    public void addThreePointsForTeamA(View view){
        scoreTeamA += THREE_POINTS;
        displayForTeamA(scoreTeamA);
    }
    // This method is called to when the +3 point button of Team B is clicked
    public void addThreePointsForTeamB(View view){
        scoreTeamB += THREE_POINTS;
        displayForTeamB(scoreTeamB);
    }


    // This method is called to when the free throw button of Team A is clicked
    public void addFreeThrowForTeamA(View view){
        scoreTeamA +=FREE_THROW;
        displayForTeamA(scoreTeamA);
    }
    // This method is called to when the free throw button of Team B is clicked
    public void addFreeThrowForTeamB(View view){
        scoreTeamB +=FREE_THROW;
        displayForTeamB(scoreTeamB);
    }

    // This method when called sets teamA and teamB scores to zero
    public void Reset(View view){
       displayForTeamA(0);
       displayForTeamB(0);
    }
}
