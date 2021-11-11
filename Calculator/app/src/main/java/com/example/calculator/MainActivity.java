package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.Nhapdulieu).equals(display.getText().toString()))
                    display.setText("");
            }
        });
    }
    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int CursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0,CursorPos);
        String rightStr = oldStr.substring(CursorPos);
        display.setText(String.format("%s%s%s",rightStr,strToAdd,leftStr));
    }
    public void AC (View view){
       display.setText("");
    }


    public void bacai (View view){
        updateText("-");
    }

    public void phantram (View view){
        updateText("%");
    }

    public void chia (View view){
        updateText("/");

    }

    public void bay (View view){
        updateText("7");
    }

    public void tam (View view){
        updateText("8");
    }

    public void chin (View view){
        updateText("9");
    }

    public void nhan (View view){
        updateText("X");
    }
    public void bon (View view){
        updateText("4");
    }

    public void nam (View view){
        updateText("5");
    }

    public void sau (View view){
        updateText("6");
    }
    public void tru (View view){
        updateText("-");
    }

    public void mot (View view){
        updateText("1");
    }

    public void hai (View view){
        updateText("2");
    }

    public void ba (View view){
        updateText("3");
    }

    public void cong (View view){
        updateText("+");
    }

    public void khong (View view){
        updateText("0");
    }

    public void phay (View view){
        updateText(",");
    }

    public void bang (View view){
        updateText("=");
    }



}