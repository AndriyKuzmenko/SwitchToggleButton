package com.example.switchtogglebutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
    Button b;
    Switch s;
    ToggleButton tb;

    boolean bo1;
    boolean bo2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button) findViewById(R.id.button);
        s=(Switch) findViewById(R.id.switch1);
        tb=(ToggleButton) findViewById(R.id.toggleButton);
    }

    public void buttonPressed(View view)
    {
        bo1=s.isChecked();
        bo2=tb.isChecked();
    }
}
