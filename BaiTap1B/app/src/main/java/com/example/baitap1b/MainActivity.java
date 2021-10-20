package com.example.baitap1b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relativelayout    );
    }
    public void showToast(View view){
        Toast.makeText(MainActivity.this, "Em chao thay",Toast.LENGTH_LONG).show();
    }
}