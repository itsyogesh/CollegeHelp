package com.example.deltech;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class SplashScreen extends Activity {
    protected boolean _active = true;
    protected int _splashTime = 3000;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        // thread for displaying the SplashScreen
        Thread splashTread = new Thread() {
            @Override
            public void run() {
                try {
     
                			synchronized(this){
        
                           //wait 5 sec
                        wait(_splashTime);
                       }
                  } catch(InterruptedException e) {
                    // do nothing
                } finally {
                	 //start a new activity
                       Intent i = new Intent();
                       i.setClass(SplashScreen.this, MainActivity.class);
                       startActivity(i);
                       finish();
                }
            }
        };
        splashTread.start();
    }
    
  
}
