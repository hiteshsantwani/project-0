package com.example.hitesh.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    Button button;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);


        return true;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.button:
                toast=Toast.makeText(this, "This Button will launch SPOTIFY STREAMER", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button2:
                toast=Toast.makeText(this, "This Button will launch SCORES APP", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button3:
                toast=Toast.makeText(this, "This Button will launch LIBRARY APP", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button4:
                toast=Toast.makeText(this, "This Button will launch BUILD IT BIGGER", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button5:
                toast=Toast.makeText(this, "This Button will launch XYZ READER", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button6:
                toast=Toast.makeText(this, "This Button will launch my capstone project", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }


        // Do something
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
