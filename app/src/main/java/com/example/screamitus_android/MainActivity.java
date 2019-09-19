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
        int until5 = 0;

        if(days <= 0)
        {
           resultsLabel.setText("-1");
            //Toast.makeText(getApplicationContext(),"-1 (please enter more than 1)",Toast.LENGTH_SHORT).show();
        }
else if (days >= 1 && days <= 7)
        {
            int days1 = days * 5;
            until5 = days;
            String str1 = Integer.toString(days1);
            resultsLabel.setText(str1);
           // Toast.makeText(getApplicationContext(),days,Toast.LENGTH_SHORT).show();

        }
else if ( days >= 8)
        {
            days  = days + until5;
            days = days * 8;
            String str1 = Integer.toString(days);
            resultsLabel.setText(str1);
           // Toast.makeText(getApplicationContext(),days,Toast.LENGTH_SHORT).show();
        }

// uncomment this code when you do your UI tests
        Infection infection = new Infection();
        int numInfected = infection.calculateTotalInfected(days);
        resultsLabel.setText(String.valueOf(numInfected) + " instructors infected");

    }
}
