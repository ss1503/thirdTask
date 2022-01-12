package com.example.thirdtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCount;
    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCount = findViewById(R.id.btnClickCounter);

    }

    public void click(View view) {
        count++;
        btnCount.setText("This is a click number: " + count);

        if(count == 6){
            btnCount.setText("Enough to click. Go to new start!");
            count = 0;
        }
    }
}