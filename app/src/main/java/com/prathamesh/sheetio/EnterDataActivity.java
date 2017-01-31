package com.prathamesh.sheetio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnterDataActivity extends AppCompatActivity {


    private EditText eID;
    private EditText eName;
    private EditText eDesignation;
    private EditText eSalary;
    private Button buttonEnterData1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_data);

        final String SSID = getIntent().getStringExtra("SSID");

        eID = (EditText) findViewById(R.id.eID);
        eName = (EditText) findViewById(R.id.eName);
        eDesignation = (EditText) findViewById(R.id.eDesignation);
        eSalary = (EditText) findViewById(R.id.eSalary);

        buttonEnterData1 = (Button) findViewById(R.id.buttonEnterData1);

        buttonEnterData1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(EnterDataActivity.this,PersonalDetailsActivity.class);
                intent.putExtra("SSID",SSID);
                intent.putExtra("eID",eID.getText().toString());
                intent.putExtra("eName",eName.getText().toString());
                intent.putExtra("eDesignation",eDesignation.getText().toString());
                intent.putExtra("eSalary",eSalary.getText().toString());

                startActivity(intent);

            }
        });

    }
}
