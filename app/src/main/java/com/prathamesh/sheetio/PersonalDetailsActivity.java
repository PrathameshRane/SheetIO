package com.prathamesh.sheetio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PersonalDetailsActivity extends AppCompatActivity {

    private RadioGroup groupGender;
    private RadioButton radioButtonGender;
    private Button buttonEnterData2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);

        onClickListenerButton();

    }

    public void onClickListenerButton() {

        groupGender = (RadioGroup) findViewById(R.id.groupGender);
        buttonEnterData2 = (Button) findViewById(R.id.buttonEnterData2);

        final String SSID = getIntent().getStringExtra("SSID");

        final String eID = getIntent().getStringExtra("eID");
        final String eName = getIntent().getStringExtra("eName");
        final String eDesignation = getIntent().getStringExtra("eDesignation");
        final String eSalary = getIntent().getStringExtra("eSalary");

        buttonEnterData2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedID = groupGender.getCheckedRadioButtonId();
                radioButtonGender = (RadioButton) findViewById(selectedID);

                Intent intent = new Intent(PersonalDetailsActivity.this,GetDataActivity.class);
                intent.putExtra("SSID",SSID);
                intent.putExtra("eID",eID);
                intent.putExtra("eName",eName);
                intent.putExtra("eDesignation",eDesignation);
                intent.putExtra("eSalary",eSalary);
                intent.putExtra("eGender",radioButtonGender.getText().toString());
                startActivity(intent);

            }
        });

    }
}
