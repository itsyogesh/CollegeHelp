package com.example.deltech;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.*;
import android.view.View;
import android.view.View.OnClickListener;

public class Faculty_profile extends Activity implements OnClickListener{
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	       setContentView(R.layout.faculty_profile);
	       
	       View faculty_attendence = findViewById(R.id.faculty_attendence);
       	faculty_attendence.setOnClickListener(this);
      
       	View course_details = findViewById(R.id.course_details);
         course_details.setOnClickListener(this);
	  
         View faculty_classes = findViewById(R.id.faculty_classes);
         faculty_classes.setOnClickListener(this);
         	  
         View faculty_messages = findViewById(R.id.faculty_messages);
         faculty_messages.setOnClickListener(this);

         View take_attendance = findViewById(R.id.take_attendance);
         take_attendance.setOnClickListener(this);
         
         View enter_marks = findViewById(R.id.enter_marks);
         enter_marks.setOnClickListener(this);


	  }
	  
	  public void onClick(View v) {
	    	switch (v.getId())
	    	{
	    	case R.id.faculty_attendence:
	    		{
	    			Intent i = new Intent(this, Faculty_attendance.class);
	    			startActivity(i);
	    			break;
	    			//open faculty attendance.    		
	    		}
	    		
	    	case R.id.course_details:
    		{
    			Intent i = new Intent(this, Faculty_class_details.class);
    			startActivity(i);
    			break;
    			//open faculty course details.    		
    		}
	    	
	    	case R.id.faculty_classes:
    		{
    			Intent i = new Intent(this, Faculty_timetable.class);
    			startActivity(i);
    			break;
    			//open faculty classes.    		
    		}
	    	case R.id.faculty_messages:
	    		{	
	    			Intent i = new Intent(this,Student_messages.class);
	    			startActivity(i);
	    			//open faculty messages.
	    			break;
	    		}
	    	case R.id.take_attendance:
    		{	
    			Intent i = new Intent(this,Take_attendance.class);
    			startActivity(i);
    			//open faculty messages.
    			break;
    		}
	    	}

	    	
	  }
}