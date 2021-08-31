package com.example.weightlosstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Entry> history;
    TextView tvFehlermeldung;
    EditText input;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFehlermeldung = (TextView) findViewById(R.id.tVFehlermeldung);
        input = (EditText) findViewById(R.id.editTextNumber);
        history = new ArrayList<Entry>();
        output = (TextView) findViewById(R.id.tvOutput);
    }

    public void addEntry(View view) {
        try{
            tvFehlermeldung.setVisibility(View.INVISIBLE);
            history.add(new Entry(Integer.parseInt(input.getText().toString()), java.time.LocalDate.now()));
        }catch (Exception e){
            tvFehlermeldung.setVisibility(View.VISIBLE);
        }
    }

    //print the ArrayList containing the data
    public void print(View view){
        output.setText("");
        for(int i = 0; i < history.size(); i++){
            String currentText;
            if(output.getText() != null){
                currentText = output.getText().toString();
            }else{
                currentText = "";
            }
            output.setText(currentText + history.get(i).getDate() + ": " + history.get(i).getWeight() + "\n");
        }
    }
}