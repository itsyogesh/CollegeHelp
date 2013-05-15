package com.example.deltech;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.*;
import android.view.View;
import android.view.View.OnClickListener;

public class Study_materials extends Activity implements OnClickListener{
	  @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	       setContentView(R.layout.student_study_materials);
	       
	       View lecture_notes = findViewById(R.id.lecture_notes);
       	lecture_notes.setOnClickListener(this);
      
	  }
	  public void onClick(View v) {
	    	switch (v.getId())
	    	{
	    	case R.id.lecture_notes:
	    		{
	    			Intent i = new Intent(this, Student_course_details.class);
	    			startActivity(i);
	    			break;
	    			//open student attendance.    		
	    		}
	    	}
	  
	    	
	  }
}