package com.example.sam.npp;

//import android.support.v7.app.AppCompatActivity;
import android.app.IntentService;
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
    public EditText text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        button1 = (Button)findViewById(R.id.button1);
        text1 = (EditText)findViewById(R.id.text1);
        text2 = (EditText)findViewById(R.id.text2);
        button1.setOnClickListener(
            new OnClickListener() {
                @Override
                public void onClick(View view) {

                    String val1 = text1.getText().toString();
                    String val2 = text2.getText().toString();

                   int a = Integer.parseInt(val1);
                    int b = Integer.parseInt(val2);

                    int sum = a+b;

                    Toast.makeText(getApplicationContext(),String.valueOf(sum),Toast.LENGTH_LONG).show();


                }
            }

    );



    }




}

