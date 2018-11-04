package com.example.roy.buttonquestfour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int i,c,x,y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        i=0;
        c=0;


    }

    public void click(View view) {
        i=i+1;
        c=c+1;
        x=(i/10);
        y=(i%10);
        btn.setText("The click number is:"+i);
        if ((y==7)||(x==7))
            btn.setText("BOOM!");

        if (c>6){
            btn.setText("BOOM!");
            c=0;}


    }

    }

