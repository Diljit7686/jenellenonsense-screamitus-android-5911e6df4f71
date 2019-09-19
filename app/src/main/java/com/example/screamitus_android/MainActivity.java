package com.example.screamitus_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateButtonPressed(View view) {

        TextView resultsLabel = findViewById(R.id.resultsLabel);
        EditText tbDays = findViewById(R.id.daysTextBox);
        int days = Integer.parseInt(tbDays.getText().toString());

        String nothing = "-1";

        if(days >= 0)
        {
            Toast.makeText(getApplicationContext(),"-1 (please enter more than 1)",Toast.LENGTH_SHORT).show();
        }
else if (days <= 1 && days >= 7)
        {
            days = days * 5;

        }


//        // uncomment this code when you do your UI tests
//        Infection infection = new Infection();
//        int numInfected = infection.calculateTotalInfected(days);
//        resultsLabel.setText(String.valueOf(numInfected) + " instructors infected");

    }
}
