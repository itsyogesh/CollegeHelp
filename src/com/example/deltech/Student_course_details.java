package com.example.deltech;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import java.util.List;
import android.view.*;

public class Student_course_details extends Activity {

	   private ListView listview;
			@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.student_course_details);
	             
	       String[] student_subjects=getResources().getStringArray(R.array.student_subjects);
	                   
				listview = (ListView)findViewById(R.id.student_course_title);
				
				listview.setAdapter(new Student_course_adapter(this, student_subjects));
				
				listview.setOnItemClickListener(new OnItemClickListener() {
			  	@Override
			  	
			  	public void onItemClick(AdapterView<?> parent, View view, int position, long id)  {
	        		
			  		String[] subject_list= getResources().getStringArray(R.array.student_subjects);
			  		String subject=subject_list[position];
			  		
			  		//Launching the subject chapters activity
			  		Intent i=new Intent(getApplicationContext(), Subject_chapters_list.class);
			  		//Sending data to the new activity
			  		i.putExtra("selected_subject", subject);
			  		startActivity(i);
	        	}
			
			    });
		    } 
	}     
