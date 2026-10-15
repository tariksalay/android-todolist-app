package com.example.umpirebuddy;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int countBall = 0;
    private int countStrike = 0;
    private TextView BallView;
    private TextView StrikeView;

    private void alertView(String message) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle(message)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        BallView = (TextView) findViewById(R.id.BallView);
        StrikeView = (TextView) findViewById(R.id.StrikeView);
        if (savedInstanceState != null) {
            countBall = savedInstanceState.getInt("balls", 0);
            countStrike = savedInstanceState.getInt("strikes", 0);
        }
        BallView.setText("Ball: " + countBall);
        StrikeView.setText("Strike: " + countStrike);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("balls", countBall);
        outState.putInt("strikes", countStrike);
        super.onSaveInstanceState(outState);
    }

    public void ballClicked(View view) {
        countBall++;
        if (countBall < 4) {
            BallView.setText("Ball: " + countBall);

        } else {
            alertView("Walk!!");
            countBall = 0;
            countStrike = 0;
            BallView.setText("Ball: " + countBall);
            StrikeView.setText("Strike: " + countStrike);
        }
    }

    public void strikeClicked(View view) {
        countStrike++;
        if (countStrike < 3) {
            StrikeView.setText("Strike: " + countStrike);
        } else {
            alertView("Out!!");
            countBall = 0;
            countStrike = 0;
            BallView.setText("Ball: " + countBall);
            StrikeView.setText("Strike: " + countStrike);


        }

    }
}
