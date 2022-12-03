package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    TextView t1,t2;
    EditText v1,v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        v1 = findViewById(R.id.v1);
        v2 = findViewById(R.id.v2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = Integer.parseInt(v1.getText().toString()) +Integer.parseInt(v2.getText().toString());
                t2.setText("Sum is "+sum);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dif = Integer.parseInt(v1.getText().toString()) -Integer.parseInt(v2.getText().toString());
                t2.setText("Difference  is "+dif);


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mul = Integer.parseInt(v1.getText().toString())  * Integer.parseInt(v2.getText().toString());
                t2.setText("Product  is "+mul);
            }
        });




    }
}