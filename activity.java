package com.example.sam.npp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Home extends Activity {

    public Button button1;
    public EditText text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        button1 = (Button)findViewById(R.id.button1);
        text1 = (EditText)findViewById(R.id.text1);

    button1.setOnClickListener(
            new OnClickListener() {
                @Override
                public void onClick(View view) {
                    text1.setText("Hello Krishn");
                }
            }

    );



    }




}

