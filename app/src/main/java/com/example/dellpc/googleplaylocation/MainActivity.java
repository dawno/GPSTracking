package com.example.dellpc.googleplaylocation;



import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;
import android.widget.ActionMenuView;

//Main Activity

public class MainActivity extends AppCompatActivity {
    
    private TextView lblLocation;
    private Button btnShowLocation, btnStartLocationUpdates;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
