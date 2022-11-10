package com.RachelLoren.NameStormer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class mNameGeneration extends AppCompatActivity {

    public static int ranNum, favNum, totNum, lettNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mname_generation);

        configureBackBtn();

        NumberPicker numberPicker = findViewById(R.id.numberPicker);
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(1);

        NumberPicker letterPicker = findViewById(R.id.letterPicker);
        letterPicker.setMaxValue(26);
        letterPicker.setMinValue(0);
        String[] lettPickerVals = new String[] {"Random", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        letterPicker.setDisplayedValues(lettPickerVals);

        Button generate = (Button) findViewById(R.id.generatebtn);
        generate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                totNum = numberPicker.getValue();
                lettNum = letterPicker.getValue();

                if(lettNum == 0){
                    ranNum = totNum;
                    favNum = 0;
                }else if(totNum == 1){
                    ranNum = 1;
                    favNum = 0;
                }else if(totNum ==2){
                    ranNum = 1;
                    favNum = 1;
                }else if(totNum == 3){
                    ranNum = 2;
                    favNum = 1;
                }else if(totNum == 4){
                    ranNum = 2;
                    favNum = 2;
                }else{
                    ranNum = 3;
                    favNum = 2;
                }

                startActivity(new Intent(mNameGeneration.this, mNameView.class));
            }
        });
    }

    private void configureBackBtn(){
        Button backBtn = (Button) findViewById(R.id.backbtn);
        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }

}