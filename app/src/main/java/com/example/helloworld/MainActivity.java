package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate_age_layouts_android);
    }

    public void buttonClicked(View buttonView){
        TextView text = findViewById(R.id.tagLine);
        Log.v("MainActivity", "Tag:"+text.getText().toString());
        Toast.makeText(MainActivity.this,
                text.getText().toString(),
                Toast.LENGTH_LONG).show();
    }

    public void calculateAge(View buttonView){
        EditText year =findViewById(R.id.year);
        String s = year.getText().toString();
        int y;
        if(s.isEmpty()){
            y=0;
            Toast.makeText(this, "Please enter any year",Toast.LENGTH_SHORT).show();
        }
        else{
            y = Integer.parseInt(s);
            if(y<0){
                y=0;
                Toast.makeText(this, "Please enter Valid year.",Toast.LENGTH_SHORT).show();
            }
            else{
                int age = Calendar.getInstance().get(Calendar.YEAR) - y;
                TextView answer = findViewById(R.id.answer);
                answer.setText(age+"");
            }

        }
    }
}
