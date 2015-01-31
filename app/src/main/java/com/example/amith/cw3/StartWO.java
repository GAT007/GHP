package com.example.amith.cw3;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;


public class StartWO extends ActionBarActivity implements View.OnClickListener {
    private Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_wo);
        chronometer = (Chronometer) findViewById(R.id.chronometer);

        ((Button) findViewById(R.id.button3)).setOnClickListener(this);

        ((Button) findViewById(R.id.button4)).setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_start_wo, menu);
        return true;
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



    @Override

    public void onClick(View v) {

        switch(v.getId()) {

            case R.id.button3:

                chronometer.setBase(SystemClock.elapsedRealtime());

                chronometer.start();

                break;

            case R.id.button4:

                chronometer.stop();

                break;

        }

    }

    public void MM(View view)
    {
        startActivity(new Intent(StartWO.this,MainActivity.class));
    }
}
