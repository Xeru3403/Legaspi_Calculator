package com.example.legaspi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText One,Two;
    Button Plus,Minus,Multiply,Divide,Percent;
    TextView Result;
    double UWU,UMU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Plus=findViewById(R.id.Plus);
        Minus=findViewById(R.id.Minus);
        Multiply=findViewById(R.id.Multiply);
        Divide=findViewById(R.id.Divide);
        Percent=findViewById(R.id.Percent);

        Result=findViewById(R.id.Result);

        Plus.setOnClickListener(this);
        Minus.setOnClickListener(this);
        Multiply.setOnClickListener(this);
        Divide.setOnClickListener(this);
        Percent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        One=findViewById(R.id.One);
        Two=findViewById(R.id.Two);
        UWU=Double.parseDouble(One.getText().toString());
        UMU=Double.parseDouble(Two.getText().toString());
        switch(view.getId()){
            case R.id.Plus:
                Result.setText(Double.toString(UWU+UMU));
                break;
            case R.id.Minus:
                Result.setText(Double.toString(UWU-UMU));
                break;
            case R.id.Multiply:
                Result.setText(Double.toString(UWU*UMU));
                break;
            case R.id.Divide:
                Result.setText(Double.toString(UWU/UMU));
                break;
            case R.id.Percent:
                Result.setText(Double.toString(UWU%UMU));
                break;

        }


    }
}