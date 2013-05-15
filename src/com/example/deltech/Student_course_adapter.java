package com.example.deltech;

import com.example.deltech.R.string;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Student_course_adapter extends ArrayAdapter<String>{
	private final Context context;
	private final String[] subjects;
	
	public Student_course_adapter (Context context,String[] subjects) {
		super(context, R.layout.student_course_details, subjects);
		this.context = context;
		this.subjects= subjects;
	}
	
	@Override
	
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View rowView = inflater.inflate(R.layout.student_course_details_row, parent, false);
		TextView subjectview = (TextView) rowView.findViewById(R.id.student_course_details_title);
		ImageView subjecticon= (ImageView) rowView.findViewById(R.id.subjecticon);
		subjectview.setText(subjects[position]);
		String s= subjects[position];
		
		if (s.equals("Mathematics")) {
			subjecticon.setImageResource(R.drawable.mathslogo);
		}
		else if (s.equals("Communication Skills")) {
			subjecticon.setImageResource(R.drawable.commskillslogo);
		}
		else if (s.equals("Applied Physics")) {
			subjecticon.setImageResource(R.drawable.physicslogo);
		}
		else if (s.equals("Applied Chemistry")) {
			subjecticon.setImageResource(R.drawable.chemistrylogo);
		}
		else if (s.equals("Electrical Sciences")) {
			subjecticon.setImageResource(R.drawable.electriclogo);
		}
		else if (s.equals("Information Technology")) {
			subjecticon.setImageResource(R.drawable.complogo);
		}
		else if (s.equals("Engineering Drawing")) {
			subjecticon.setImageResource(R.drawable.edlogo);
		}
		else if (s.equals("Workshop Technology")) {
			subjecticon.setImageResource(R.drawable.workshoplogo);
		}
		else if (s.equals("Engineering Mechanics")) {
			subjecticon.setImageResource(R.drawable.mechanicslogo);
		}
		else if (s.equals("Experiment Labs")) {
			subjecticon.setImageResource(R.drawable.experimentslogo);
		}
		
		return rowView;
	}

}