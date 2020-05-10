package com.example.switchtogglebutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
    Button b=(Button) findViewById(R.id.button);
    Switch s=(Switch) findViewById(R.id.switch1);
    ToggleButton tb=(ToggleButton) findViewById(R.id.toggleButton);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
