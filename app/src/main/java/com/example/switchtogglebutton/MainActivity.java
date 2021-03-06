package com.example.switchtogglebutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{
    Button b;
    Switch s;
    ToggleButton tb;
    LinearLayout l;

    boolean bo1;
    boolean bo2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button) findViewById(R.id.clickMe);
        s=(Switch) findViewById(R.id.switch1);
        tb=(ToggleButton) findViewById(R.id.toggleButton);
        l=(LinearLayout) findViewById(R.id.layout);
    }

    public void buttonPressed(View view)
    {
        bo1=s.isChecked();
        bo2=tb.isChecked();

        if (bo1 && bo2)  l.setBackground(getResources().getDrawable(R.drawable.edinburgh));
        else if (!bo1 && bo2) l.setBackground(getResources().getDrawable(R.drawable.edinburghcastle));
        else if (bo1 && !bo2) l.setBackground(getResources().getDrawable(R.drawable.fountain));
        else if (!bo1 && !bo2) l.setBackground(getResources().getDrawable(R.drawable.oorwullie));
    }
}
