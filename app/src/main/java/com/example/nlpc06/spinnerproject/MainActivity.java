package com.example.nlpc06.spinnerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner spinner;
    private EditText etName;
    private Button btnAdd;

    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line);

        initView();



        String[] nameArray =getResources().getStringArray(R.array.name_arrry);

        for(String x: nameArray){
            adapter.add(x);
        }
    }

    private void initView() {
        spinner = (Spinner) findViewById(R.id.spinner);
        etName = (EditText) findViewById(R.id.name);
        btnAdd = (Button) findViewById(R.id.add);
        btnAdd.setOnClickListener(this);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        String name = etName.getText().toString();
        adapter.add(name);
    }
}
