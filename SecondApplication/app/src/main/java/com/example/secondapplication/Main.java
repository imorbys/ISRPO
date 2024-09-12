package com.example.secondapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {
    TextView textView1, textView2;
    Button buttonAdd, buttonCopy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonCopy = findViewById(R.id.buttonCopy);
    }
    public void onAdd(View view){
        String s=textView1.getText().toString();
        textView1.setText(s + "*");
    }
    public void onCopy(View view){
        String s = textView1.getText().toString();
        textView2.setText(s);
    }
}
