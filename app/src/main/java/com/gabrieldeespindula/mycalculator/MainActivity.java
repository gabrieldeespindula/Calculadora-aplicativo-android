package com.gabrieldeespindula.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.firstNumber = findViewById(R.id.first_number);
        this.mViewHolder.secondNumber = findViewById(R.id.second_number);
        this.mViewHolder.additionButton = findViewById(R.id.addition_button);
        this.mViewHolder.subtractionButton = findViewById(R.id.subtraction_button);
        this.mViewHolder.multiplicationButton = findViewById(R.id.multiplication_button);
        this.mViewHolder.divisionButton = findViewById(R.id.division_button);

    }

    private static class ViewHolder {
        EditText firstNumber;
        EditText secondNumber;
        Button additionButton;
        Button subtractionButton;
        Button multiplicationButton;
        Button divisionButton;
    }

}
