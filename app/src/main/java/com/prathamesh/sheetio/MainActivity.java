package com.prathamesh.sheetio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText SSID;
    private Button buttonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SSID = (EditText) findViewById(R.id.SSID);
        buttonNext = (Button) findViewById(R.id.buttonNext);


        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,OptionsActivity.class);

                intent.putExtra("SSID",SSID.getText().toString());
                startActivity(intent);
            }
        });


    }
}
