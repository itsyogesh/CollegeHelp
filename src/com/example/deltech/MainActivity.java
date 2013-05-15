package com.example.deltech;

import android.os.Bundle;
import android.app.Activity;
import android.util.*;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener
{
	private String TAG="AMS";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Log.i(TAG,"The main activity has started");
        
        View studentlogin = findViewById(R.id.student_login);
        	studentlogin.setOnClickListener(this);
        View facultylogin = findViewById(R.id.faculty_login);
          facultylogin.setOnClickListener(this);
    }
  
    public void onClick(View v) {
    	switch (v.getId())
    	{
    	case R.id.student_login:
    		{
    			Intent i = new Intent(this, Student_login.class);
    			startActivity(i);
    			break;
    			//open student login form.    		
    		}
    	case R.id.faculty_login:
    		{	
    			Intent i = new Intent(this, Faculty_login.class);
    			startActivity(i);
    			//open faculty login form.
    			break;
    		}
    	}
    }

}
   

