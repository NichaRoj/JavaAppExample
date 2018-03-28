package com.example.nicha.javaappexample;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //Uninitialized variables.
    //We put it here so some of them can be used in onClick method
    private EditText editText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize those variables
        editText = findViewById(R.id.editText); //Make the variable editText points to EditText with id "editText"
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        /*
        We have to tell the app what to do when
        the user taps the screen.
        OnClickListener is an interface that listens for a click (or a tap)
         */
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //What to do when the user taps the screen
        if(v==button){ //if user taps at button
            RadioGroup radioGroup = findViewById(R.id.radioGroup);
            switch(radioGroup.getCheckedRadioButtonId()){
                case R.id.radioButton1:
                    textView.setTextColor(Color.BLACK);
                    break;
                case R.id.radioButton2:
                    textView.setTextColor(Color.RED);
                    break;
                case R.id.radioButton3:
                    textView.setTextColor(Color.BLUE);
                    break;
            }
            textView.setText(editText.getText().toString());
            editText.setText("");
        }
    }
}
