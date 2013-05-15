package com.example.deltech;

import android.os.Bundle;
import android.app.*;
import android.content.Intent;
import android.util.*;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class Faculty_login extends Activity implements OnClickListener {
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.faculty_login_2);
	        
	       	       	
	       	View login_student = findViewById(R.id.login_faculty);
	       	login_student.setOnClickListener(this); }
						
						
			public void onClick(View v) {
			
				String TAG="Faculty_login";
			final EditText userid = (EditText) findViewById(R.id.userid);
	       	String rollno_value = userid.getText().toString();
	       
	       final EditText faculty_password = (EditText) findViewById(R.id.faculty_password);
	       	String faculty_password_value =	faculty_password.getText().toString();
	       	Log.i(TAG,faculty_password_value);
	       	
	       	if (rollno_value.equals("nsit") && faculty_password_value.equals("nsit"))
	       	{
	       	 
	       		Intent i = new Intent(this, Faculty_profile.class);
    			startActivity(i);
	       	}
	
	       	else 
	       	{
	       		Intent intent = getIntent();
	       		finish();
	       		startActivity(intent);
    		 Toast msg = Toast.makeText(Faculty_login.this, "Invalid Username or Password", Toast.LENGTH_SHORT );
    		 	msg.setGravity(Gravity.BOTTOM,msg.getXOffset()/2 , msg.getYOffset()/2);
    		 	msg.show();
	       	}
		}		       			     			
	           
	 
}
