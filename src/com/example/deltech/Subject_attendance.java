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

public class Subject_attendance extends Activity {

	  	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.subject_attendance);
	       ImageView subject_pie_chart=(ImageView) findViewById(R.id.subject_attendance_pie);      
	       TextView present_value=(TextView) findViewById(R.id.present_value);
	       TextView absent_value=(TextView) findViewById(R.id.absent_value);
	       TextView days_left_value=(TextView) findViewById(R.id.days_left_value);
	       TextView absent_on_leave=(TextView) findViewById(R.id.absent_on_leave_value);
	       TextView subject_attendance_footer=(TextView) findViewById(R.id.subject_attendance_footer);
	       	       //getting data from intent
	       		Intent i =getIntent();
	       		String subject=i.getStringExtra("selected_subject");
	       
	       
	       
	       				
				if (subject.equals("Mathematics")) {
					subject_pie_chart.setImageResource(R.drawable.maths_attendence);
					present_value.setText("65 %");
					absent_value.setText("05 %");
					days_left_value.setText("16 %");
					absent_on_leave.setText("14 %");
					subject_attendance_footer.setText("Your have sufficient attendance in this subject.");
					
				}
				else if (subject.equals("Communication Skills")) {
					subject_pie_chart.setImageResource(R.drawable.commskills_attendence);
					present_value.setText("48 %");
					absent_value.setText("28 %");
					days_left_value.setText("16 %");
					absent_on_leave.setText("08 %");
					subject_attendance_footer.setText("Your are running low on attendance in this subject.");
				}
				else if (subject.equals("Applied Physics")) {
					subject_pie_chart.setImageResource(R.drawable.physics_attendance);
					present_value.setText("69 %");
					absent_value.setText("10 %");
					days_left_value.setText("16 %");
					absent_on_leave.setText("05 %");
					subject_attendance_footer.setText("Your have sufficient attendance in this subject.");

				}
				else if (subject.equals("Applied Chemistry")) {
					subject_pie_chart.setImageResource(R.drawable.chemistry_attendance);
					present_value.setText("55 %");
					absent_value.setText("15 %");
					days_left_value.setText("16 %");
					absent_on_leave.setText("14 %");
					subject_attendance_footer.setText("Your have sufficient attendance in this subject.");
				}
				else if (subject.equals("Electrical Sciences")) {
					subject_pie_chart.setImageResource(R.drawable.maths_attendence);
					present_value.setText("65 %");
					absent_value.setText("05 %");
					days_left_value.setText("16 %");
					absent_on_leave.setText("14 %");
					subject_attendance_footer.setText("Your have sufficient attendance in this subject.");

				}
				else if (subject.equals("Information Technology")) {
					subject_pie_chart.setImageResource(R.drawable.comp_attendance);
					present_value.setText("47 %");
					absent_value.setText("23 %");
					days_left_value.setText("16 %");
					absent_on_leave.setText("14 %");
					subject_attendance_footer.setText("Your are running low on attendance in this subject.");
				}
				else if (subject.equals("Engineering Drawing")) {
					subject_pie_chart.setImageResource(R.drawable.chemistry_attendance);
					present_value.setText("55 %");
					absent_value.setText("15 %");
					days_left_value.setText("16 %");
					absent_on_leave.setText("14 %");
					subject_attendance_footer.setText("Your have sufficient attendance in this subject.");
				}
				else if (subject.equals("Workshop Technology")) {
					subject_pie_chart.setImageResource(R.drawable.mechanics_attendance);
					present_value.setText("70 %");
					absent_value.setText("00 %");
					days_left_value.setText("16 %");
					absent_on_leave.setText("14 %");
					subject_attendance_footer.setText("Your have sufficient attendance in this subject.");

				}
				else if (subject.equals("Engineering Mechanics")) {
					subject_pie_chart.setImageResource(R.drawable.mechanics_attendance);
					present_value.setText("70 %");
					absent_value.setText("00 %");
					days_left_value.setText("16 %");
					absent_on_leave.setText("14 %");
					subject_attendance_footer.setText("Your have sufficient attendance in this subject.");
				}
				else if (subject.equals("Experiment Labs")) {
					subject_pie_chart.setImageResource(R.drawable.comp_attendance);
					present_value.setText("47 %");
					absent_value.setText("23 %");
					days_left_value.setText("16 %");
					absent_on_leave.setText("14 %");
					subject_attendance_footer.setText("Your are running low on attendance in this subject.");
				}
				
						  				  				  		
	        	}
			
			    
		    } 
   
