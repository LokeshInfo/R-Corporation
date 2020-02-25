package com.icss.rcorporation;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Splash_activity extends AppCompatActivity
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Thread backgound = new Thread(){
            public void run()
            { try{
                sleep(2 * 1000);

                Intent in = new Intent(Splash_activity.this,MainActivity.class);
                startActivity(in);
                finish();

            }      catch(Exception e)
            {      e.printStackTrace();            } }
        };

        backgound.start();

    }
}
