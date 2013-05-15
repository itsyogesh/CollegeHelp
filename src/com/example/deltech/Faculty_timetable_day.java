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

public class Faculty_timetable_day extends Activity {

	   private ListView listview;
			@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.student_timetable_day);
	             
	       String[] class_timings=getResources().getStringArray(R.array.class_timings);
	       String[] timetable_subjects=getResources().getStringArray(R.array.monday_timetable_faculty);
	       
			
	       //getting data from intent
	       		Intent i =getIntent();
	       		String day=i.getStringExtra("selected_day");
	       
	       	       
	       	listview = (ListView)findViewById(R.id.student_timetable_day_list);
				
				if (day.equals("Monday")) {
					timetable_subjects=getResources().getStringArray(R.array.monday_timetable_faculty);
				}
				else if (day.equals("Tuesday")) {
					timetable_subjects=getResources().getStringArray(R.array.tuesday_timetable_faculty);
				}
				else if (day.equals("Wednesday")) {
					timetable_subjects=getResources().getStringArray(R.array.wed_timetable_faculty);
				}
				else if (day.equals("Thursday")) {
					timetable_subjects=getResources().getStringArray(R.array.thurs_timetable_faculty);
				}
				
				else if (day.equals("Friday")) {
					timetable_subjects=getResources().getStringArray(R.array.friday_timetable_faculty);
				}
				
				listview.setAdapter(new Student_timetable_day_adapter(this,timetable_subjects,class_timings ));
				
				listview.setOnItemClickListener(new OnItemClickListener() {
			  	@Override
			  	
			  	public void onItemClick(AdapterView<?> parent, View view, int position, long id)  {
	        		
			  		String subject = ((TextView) view).getText().toString();
			  				  				  		
	        	}
			
			    });
		    } 
	}     
