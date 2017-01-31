package com.prathamesh.sheetio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionsActivity extends AppCompatActivity {

    private Button buttonGetData;
    private Button buttonEnterData;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        final String SSID = getIntent().getStringExtra("SSID");

        buttonGetData = (Button) findViewById(R.id.buttonGetData);
        buttonEnterData = (Button) findViewById(R.id.buttonEnterData);



        buttonGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OptionsActivity.this,GetDataActivity.class);
                intent.putExtra("SSID",SSID);
                startActivity(intent);

            }
        });

        buttonEnterData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(OptionsActivity.this,EnterDataActivity.class);
                intent.putExtra("SSID",SSID);
                startActivity(intent);

            }
        });
    }
}
