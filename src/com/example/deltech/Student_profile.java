package com.example.deltech;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.*;
import android.view.View;
import android.view.View.OnClickListener;

public class Student_profile extends Activity implements OnClickListener{
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	       setContentView(R.layout.student_profile);
	       
	       View student_attendence = findViewById(R.id.student_attendence);
       	student_attendence.setOnClickListener(this);
      
       	View course_details = findViewById(R.id.course_details);
         course_details.setOnClickListener(this);
	  
         View student_classes = findViewById(R.id.student_classes);
         student_classes.setOnClickListener(this);
         	  
         View student_messages = findViewById(R.id.student_messages);
         student_messages.setOnClickListener(this);
	  
         View study_materials = findViewById(R.id.study_materials);
         study_materials.setOnClickListener(this);
	  
	  }
	  
	  public void onClick(View v) {
	    	switch (v.getId())
	    	{
	    	case R.id.student_attendence:
	    		{
	    			Intent i = new Intent(this, Student_attendance.class);
	    			startActivity(i);
	    			break;
	    			//open student attendance.    		
	    		}
	    		
	    	case R.id.course_details:
    		{
    			Intent i = new Intent(this, Student_course_details.class);
    			startActivity(i);
    			break;
    			//open student course details.    		
    		}
	    	
	    	case R.id.student_classes:
    		{
    			Intent i = new Intent(this, Student_timetable.class);
    			startActivity(i);
    			break;
    			//open student classes.    		
    		}
	    	case R.id.student_messages:
	    		{	
	    			Intent i = new Intent(this,Student_messages.class);
	    			startActivity(i);
	    			//open student messages.
	    			break;
	    		}
	       	case R.id.study_materials:
    		{	
    			Intent i = new Intent(this,Study_materials.class);
    			startActivity(i);
    			//open student messages.
    			break;
    		}
 
	    	}

	    	
	  }
}