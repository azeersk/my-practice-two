package com.example.fragapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.green);
        b2 = (Button) findViewById(R.id.yellow);
        linearLayout = (LinearLayout) findViewById(R.id.linearLay);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_Fragment fragmentOne = new first_Fragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLay, fragmentOne);
                transaction.commit();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second_fragment fragmentTwo = new second_fragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLay, fragmentTwo);
                transaction.commit();
            }
        });
    }
}