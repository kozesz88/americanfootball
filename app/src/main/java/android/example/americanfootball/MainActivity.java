package android.example.americanfootball;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB (scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreB);
        scoreView.setText(String.valueOf(score));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    public void addSixForA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA (scoreTeamA);
    }
    public void addTwoForA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA (scoreTeamA);
    }
    public void addOneForA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA (scoreTeamA);
    }
    public void addThreeForA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA (scoreTeamA);
    }
    public void addSixForB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB (scoreTeamB);
    }
    public void addTwoForB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB (scoreTeamB);
    }
    public void addOneForB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB (scoreTeamB);
    }
    public void addThreeForB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB (scoreTeamB);
    }

}
