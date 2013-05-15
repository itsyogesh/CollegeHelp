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


public class Student_login extends Activity implements OnClickListener {
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.student_login);
	        
	       	       	
	       	View login_student = findViewById(R.id.login_student);
	       	login_student.setOnClickListener(this); }
						
						
			public void onClick(View v) {
			
				String TAG="student_login";
			final EditText rollno = (EditText) findViewById(R.id.rollno);
	       	String rollno_value = rollno.getText().toString();
	       
	       final EditText student_password = (EditText) findViewById(R.id.student_password);
	       	String student_password_value =	student_password.getText().toString();
	       	Log.i(TAG,student_password_value);
	       	
	       	if (rollno_value.equals("90521008") && student_password_value.equals("yogesh"))
	       	{
	       	 
	       		Intent i = new Intent(this, Student_profile.class);
    			startActivity(i);
	       	}
	
	       	else 
	       	{
	       		Intent intent = getIntent();
	       		finish();
	       		startActivity(intent);
    		 Toast msg = Toast.makeText(Student_login.this, "Invalid Username or Password", Toast.LENGTH_SHORT );
    		 	msg.setGravity(Gravity.BOTTOM,msg.getXOffset()/2 , msg.getYOffset()/2);
    		 	msg.show();
	       	}
		}		       			     			
	           
	 
}
