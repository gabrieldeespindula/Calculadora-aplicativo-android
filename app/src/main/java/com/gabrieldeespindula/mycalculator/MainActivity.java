package com.gabrieldeespindula.mycalculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.firstNumber = findViewById(R.id.first_number);
        this.mViewHolder.secondNumber = findViewById(R.id.second_number);
        this.mViewHolder.result = findViewById(R.id.result);
        this.mViewHolder.additionButton = findViewById(R.id.addition_button);
        this.mViewHolder.subtractionButton = findViewById(R.id.subtraction_button);
        this.mViewHolder.multiplicationButton = findViewById(R.id.multiplication_button);
        this.mViewHolder.divisionButton = findViewById(R.id.division_button);

        this.mViewHolder.additionButton.setOnClickListener(this);
        this.mViewHolder.subtractionButton.setOnClickListener(this);
        this.mViewHolder.multiplicationButton.setOnClickListener(this);
        this.mViewHolder.divisionButton.setOnClickListener(this);


        clearResult();
    }

    @SuppressLint("DefaultLocale")
    public void onClick(View v) {
        String firstNumberString = this.mViewHolder.firstNumber.getText().toString();
        String secondNumberString = this.mViewHolder.secondNumber.getText().toString();

        if (v.getId() == R.id.addition_button) {
            if ("".equals(firstNumberString) || "".equals(secondNumberString)) {
                Toast.makeText(this, "Informe um número!", Toast.LENGTH_SHORT).show();
            } else {
                Double firstNumberDouble = Double.valueOf(firstNumberString);
                Double secondNumberDouble = Double.valueOf(secondNumberString);
                Double result = firstNumberDouble + secondNumberDouble;
                this.mViewHolder.result.setText(String.format("%.2f", result));
            }
        }
        if (v.getId() == R.id.subtraction_button){
            if ("".equals(firstNumberString) || "".equals(secondNumberString)) {
                Toast.makeText(this, "Informe um número!", Toast.LENGTH_SHORT).show();
            } else {
                Double firstNumberDouble = Double.valueOf(firstNumberString);
                Double secondNumberDouble = Double.valueOf(secondNumberString);
                Double result = firstNumberDouble - secondNumberDouble;
                this.mViewHolder.result.setText(String.format("%.2f", result));
            }
        }
        if (v.getId() == R.id.multiplication_button){
            if ("".equals(firstNumberString) || "".equals(secondNumberString)) {
                Toast.makeText(this, "Informe um número!", Toast.LENGTH_SHORT).show();
            } else {
                Double firstNumberDouble = Double.valueOf(firstNumberString);
                Double secondNumberDouble = Double.valueOf(secondNumberString);
                Double result = firstNumberDouble * secondNumberDouble;
                this.mViewHolder.result.setText(String.format("%.2f", result));
            }
        }
        if (v.getId() == R.id.division_button){
            if ("".equals(firstNumberString) || "".equals(secondNumberString)) {
                Toast.makeText(this, "Informe um número!", Toast.LENGTH_SHORT).show();
            } else {
                Double firstNumberDouble = Double.valueOf(firstNumberString);
                Double secondNumberDouble = Double.valueOf(secondNumberString);
                Double result = firstNumberDouble / secondNumberDouble;
                this.mViewHolder.result.setText(String.format("%.2f", result));
            }
        }
    }

    public void clearResult(){
        this.mViewHolder.result.setText("");
    }

    private static class ViewHolder {
        TextView result;
        EditText firstNumber;
        EditText secondNumber;
        Button additionButton;
        Button subtractionButton;
        Button multiplicationButton;
        Button divisionButton;
    }


}
