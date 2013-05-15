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

public class Subject_chapters_list extends Activity {

	   private ListView listview;
			@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.subject_chapter_list);
	             
	       String[] subject_chapters=getResources().getStringArray(R.array.student_subjects);
	       ImageView selected_subject= (ImageView) findViewById(R.id.selected_subjecticon);
	       TextView selected_subject_header= (TextView) findViewById(R.id.subject_chapter_list_header);
			
	       //getting data from intent
	       		Intent i =getIntent();
	       		String subject=i.getStringExtra("selected_subject");
	       
	       selected_subject_header.setText(subject);
	       
	       	listview = (ListView)findViewById(R.id.subject_chapter_title);
				
				if (subject.equals("Mathematics")) {
					subject_chapters=getResources().getStringArray(R.array.maths_chapters);
					selected_subject.setImageResource(R.drawable.mathslogo);
				}
				else if (subject.equals("Communication Skills")) {
					subject_chapters=getResources().getStringArray(R.array.commskills_chapters);
					selected_subject.setImageResource(R.drawable.commskillslogo);
				}
				else if (subject.equals("Applied Physics")) {
					subject_chapters=getResources().getStringArray(R.array.physics_chapters);
					selected_subject.setImageResource(R.drawable.physicslogo);
				}
				else if (subject.equals("Applied Chemistry")) {
					subject_chapters=getResources().getStringArray(R.array.chemistry_chapters);
					selected_subject.setImageResource(R.drawable.chemistrylogo);
				}
				else if (subject.equals("Electrical Sciences")) {
					subject_chapters=getResources().getStringArray(R.array.electrical_chapters);
					selected_subject.setImageResource(R.drawable.electriclogo);
				}
				else if (subject.equals("Information Technology")) {
					subject_chapters=getResources().getStringArray(R.array.comp_chapters);
					selected_subject.setImageResource(R.drawable.complogo);
				}
				else if (subject.equals("Engineering Drawing")) {
					subject_chapters=getResources().getStringArray(R.array.ed_chapters);
					selected_subject.setImageResource(R.drawable.edlogo);
				}
				else if (subject.equals("Workshop Technology")) {
					subject_chapters=getResources().getStringArray(R.array.workshop_chapters);
					selected_subject.setImageResource(R.drawable.workshoplogo);
				}
				else if (subject.equals("Engineering Mechanics")) {
					subject_chapters=getResources().getStringArray(R.array.mechanics_chapters);
					selected_subject.setImageResource(R.drawable.mechanicslogo);
				}
				else if (subject.equals("Experiment Labs")) {
					subject_chapters=getResources().getStringArray(R.array.lab_chapters);
					selected_subject.setImageResource(R.drawable.experimentslogo);
				}
				
				listview.setAdapter(new Subject_chapter_list_adapter(this, subject_chapters));
				
				listview.setOnItemClickListener(new OnItemClickListener() {
			  	@Override
			  	
			  	public void onItemClick(AdapterView<?> parent, View view, int position, long id)  {
	        		
			  		String subject = ((TextView) view).getText().toString();
			  				  				  		
	        	}
			
			    });
		    } 
	}     
