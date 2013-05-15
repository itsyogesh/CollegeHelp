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

public class Faculty_timetable extends Activity {

	   private ListView listview;
			@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.student_timetable);
	             
	       String[] timetable_days=getResources().getStringArray(R.array.timetable_days);
	                   
				listview = (ListView)findViewById(R.id.student_timetable_list);
				
				listview.setAdapter(new Student_timetable_adapter(this, timetable_days));
				
				listview.setOnItemClickListener(new OnItemClickListener() {
			  	@Override
			  	
			  	public void onItemClick(AdapterView<?> parent, View view, int position, long id)  {
	        		
			  		String[] timetable_days= getResources().getStringArray(R.array.timetable_days);
			  		String day=timetable_days[position];
			  		
			  		//Launching the subject chapters activity
			  		Intent i=new Intent(getApplicationContext(), Faculty_timetable_day.class);
			  		//Sending data to the new activity
			  		i.putExtra("selected_day", day);
			  		startActivity(i);
	        	}
			
			    });
		    } 
	} 