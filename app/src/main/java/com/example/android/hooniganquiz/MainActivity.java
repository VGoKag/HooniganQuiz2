package com.example.android.hooniganquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    int correctAnswers = 0;
    //These variables hold the value of whether or not the Radio button questions were answer correctly. (0 = incorrect, 1 = correct)
    int answerQ1 = 0;
    int answerQ3 = 0;
    int answerQ6 = 0;
    int answerQ7 = 0;
    int answerQ8 = 0;
    // These variables hold the value of whether or not the Checkbox questions were answered correctly. (0 = incorrect, 1 = correct)
    int answerQ2 = 0;
    int answerQ4 = 0;
    int answerQ9 = 0;
    int answerQ10 = 0;
    // This variable holds the value of whether or not the user entered the correct names for question 5 (0 = incorrect, 1 = correct)
    int answerQ5 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * question 1
     */
    public void question1Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            //
            case R.id.q1_radio_motorsports:
                if (checked)
                    answerQ1 = 1;
                break;
            case R.id.q1_radio_skateboard:
                if (checked)
                    answerQ1 = 0;
                break;
            case R.id.q1_radio_metal:
                if (checked)
                    answerQ1 = 0;
                break;
        }
    }

    /**
     * question 2
     */
    private int question2Checked(boolean hasShirtsTanks, boolean hasHats, boolean hasHairStuff, boolean hasMotorOil) {
        int aQ2 = 0;

        if (hasShirtsTanks && hasHats && hasHairStuff) {
            aQ2 = aQ2 + 1;
        }
        if (hasMotorOil) {
            aQ2 = 0;
        }
        return answerQ2 = aQ2;
    }

    /**
     * question 3
     */
    public void question3Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            //
            case R.id.q3_radio_unprofessionals:
                if (checked)
                    answerQ3 = 0;
                break;
            case R.id.q3_radio_daily_trans:
                if (checked)
                    answerQ3 = 1;
                break;
            case R.id.q3_radio_field_trips:
                if (checked)
                    answerQ3 = 0;
                break;
            case R.id.q3_radio_tangents:
                if (checked)
                    answerQ3 = 0;
                break;
        }
    }

    /**
     * question 4
     */
    private int question4Checked(boolean hasLowriders, boolean hasOffRoadTrucks, boolean hasDriftBeasts, boolean hasClassics, boolean hasExoticSupers) {
        int aQ4 = 0;

        if (hasLowriders && hasOffRoadTrucks && hasDriftBeasts && hasClassics && hasExoticSupers) {
            aQ4 = aQ4 + 1;
        } else {
            aQ4 = 0;
        }
        return answerQ4 = aQ4;
    }

    /**
     * question 5
     */

    private int question5EditText() {
        int aQ5 = 0;
        EditText correctTextQ5 = (EditText) findViewById(R.id.q5_EditText);
        String whatTheNames = correctTextQ5.getText().toString();
        String coFounder1 = "Ken Block";

        if (whatTheNames.toLowerCase().equalsIgnoreCase(coFounder1)) {
            aQ5 += 1;
        }
        return answerQ5 = aQ5;
    }

    /**
     * question 6
     */
    public void question6Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            //
            case R.id.q6_radio_rob:
                if (checked)
                    answerQ6 = 0;
                break;
            case R.id.q6_radio_vinny:
                if (checked)
                    answerQ6 = 0;
                break;
            case R.id.q6_radio_hertz:
                if (checked)
                    answerQ6 = 1;
                break;
            case R.id.q6_radio_dan:
                if (checked)
                    answerQ6 = 0;
                break;
        }
    }

    /**
     * question 7
     */
    public void question7Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            //
            case R.id.q7_radio_100k:
                if (checked)
                    answerQ7 = 0;
                break;
            case R.id.q7_radio_400k:
                if (checked)
                    answerQ7 = 0;
                break;
            case R.id.q7_radio_1mil:
                if (checked)
                    answerQ7 = 0;
                break;
            case R.id.q7_radio_over1mil4thou:
                if (checked)
                    answerQ7 = 1;
                break;
        }
    }

    /**
     * question 8
     */
    public void question8Clicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            //
            case R.id.q8_radio_true:
                if (checked)
                    answerQ8 = 1;
                break;
            case R.id.q8_radio_false:
                if (checked)
                    answerQ8 = 0;
                break;
        }
    }

    /**
     * question 9
     */
    private int question9Checked(boolean hasMonsterEnergy, boolean hasMobileOne, boolean hasToyoTires, boolean hasCanAm, boolean hasSubaru) {
        int aQ9 = 0;

        if (hasMonsterEnergy && hasToyoTires && hasCanAm) {
            aQ9 = aQ9 + 1;
        }
        if (hasMobileOne) {
            aQ9 = 0;
        }
        if (hasSubaru) {
            aQ9 = 0;
        }
        return answerQ9 = aQ9;
    }

    /**
     * question 10
     */
    private int question10Checked(boolean hasBJBaldwinTrophyTruck, boolean hasBisimotoMinivan, boolean hasTwerkstallion, boolean hasLEahPritchettDragster) {
        int aQ10 = 0;

        if (hasBisimotoMinivan && hasLEahPritchettDragster) {
            aQ10 = aQ10 + 1;
        }
        if (hasTwerkstallion) {
            aQ10 = 0;
        }
        if (hasBJBaldwinTrophyTruck) {
            aQ10 = 0;
        }
        return answerQ10 = aQ10;
    }

    /**
     * This method is called when the Submit button is clicked at the end of the quiz
     */
    public void submitQuiz(View view) {

        EditText nameInputField = findViewById(R.id.name);
        String whatsYourName = nameInputField.getText().toString();

        //Check the status of question 2 checkboxes
        CheckBox q2ShirtsTanks = (CheckBox) findViewById(R.id.q2_shirts_tanks);
        boolean haveShirtsTanks = q2ShirtsTanks.isChecked();
        CheckBox q2Hats = (CheckBox) findViewById(R.id.q2_hats);
        boolean haveHats = q2Hats.isChecked();
        CheckBox q2HairStuff = (CheckBox) findViewById(R.id.q2_hair_stuff);
        boolean haveHairStuff = q2HairStuff.isChecked();
        CheckBox q2MotorOil = (CheckBox) findViewById(R.id.q2_motor_oil);
        boolean haveMotorOil = q2MotorOil.isChecked();

        //Check the status of question 4 checkboxes
        CheckBox q4Lowriders = (CheckBox) findViewById(R.id.q4_lowriders);
        boolean haveLowriders = q4Lowriders.isChecked();
        CheckBox q4OffRoadTrucks = (CheckBox) findViewById(R.id.q4_off_road_trucks);
        boolean haveOffRoadTrucks = q4OffRoadTrucks.isChecked();
        CheckBox q4DriftBeasts = (CheckBox) findViewById(R.id.q4_drift_beasts);
        boolean haveDriftBeasts = q4DriftBeasts.isChecked();
        CheckBox q4Classics = (CheckBox) findViewById(R.id.q4_classics);
        boolean haveClassics = q4Classics.isChecked();
        CheckBox q4ExoticSuperCars = (CheckBox) findViewById(R.id.q4_exotics_supercars);
        boolean haveExoticSuperCars = q4ExoticSuperCars.isChecked();

        //Check the status of question 9 checkboxes
        CheckBox q9MonsterEnergy = (CheckBox) findViewById(R.id.q9_monster_energy);
        boolean haveMonsterEnergy = q9MonsterEnergy.isChecked();
        CheckBox q9MobileOne = (CheckBox) findViewById(R.id.q9_mobile_one);
        boolean haveMobileOne = q9MobileOne.isChecked();
        CheckBox q9ToyoTires = (CheckBox) findViewById(R.id.q9_toyo_tires);
        boolean haveToyoTires = q9ToyoTires.isChecked();
        CheckBox q9CanAm = (CheckBox) findViewById(R.id.q9_can_am);
        boolean haveCanAm = q9CanAm.isChecked();
        CheckBox q9Subaru = (CheckBox) findViewById(R.id.q9_subaru);
        boolean haveSubaru = q9Subaru.isChecked();

        //Check the status of question 10 checkboxes
        CheckBox q10BJBaldwinTrophyTruck = (CheckBox) findViewById(R.id.q10_bj_baldwin_trophy_truck);
        boolean haveBJBaldwinTrophyTruck = q10BJBaldwinTrophyTruck.isChecked();
        CheckBox q10BisimotoMinivan = (CheckBox) findViewById(R.id.q10_bisimoto_minivan);
        boolean haveBisimotoMinivan = q10BisimotoMinivan.isChecked();
        CheckBox q10Twerkstallion = (CheckBox) findViewById(R.id.q10_twerkstallion);
        boolean haveTwerkstallion = q10Twerkstallion.isChecked();
        CheckBox q10LeahPritchettDragster = (CheckBox) findViewById(R.id.q10_leah_pritchett_dragster);
        boolean haveLeahPritchettDragster = q10LeahPritchettDragster.isChecked();

        //Call the method to assign a value to the answerQ# variable (0 or 1)
        question2Checked(haveShirtsTanks, haveHats, haveHairStuff, haveMotorOil);
        question4Checked(haveLowriders, haveOffRoadTrucks, haveDriftBeasts, haveClassics, haveExoticSuperCars);
        question9Checked(haveMonsterEnergy, haveMobileOne, haveToyoTires, haveCanAm, haveSubaru);
        question10Checked(haveBJBaldwinTrophyTruck, haveBisimotoMinivan, haveTwerkstallion, haveLeahPritchettDragster);

        //call the method to check the answer for the EditText in question 5
        question5EditText();

        //call the method to tally up the correct answers from the quiz
        calculateScore();

        //display the score onto the screen
        displayScore(correctAnswers);
    }

    /**
     * This method adds the points for each question to calulate a percentage Score
     */
    public void calculateScore() {
        correctAnswers = answerQ1 + answerQ3 + answerQ6 + answerQ7 + answerQ8;
        correctAnswers += answerQ2 + answerQ4 + answerQ9 + answerQ10;
        correctAnswers += answerQ5;
    }

    /**
     * This method displays the given Score on the screen.
     */
    private void displayScore(int correctAnswers) {
        TextView scoreOfQuiz = (TextView) findViewById(R.id.score);
        scoreOfQuiz.setText("" + correctAnswers);
    }

}