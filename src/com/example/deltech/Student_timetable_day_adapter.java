package com.example.deltech;

import com.example.deltech.R.string;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Student_timetable_day_adapter extends ArrayAdapter<String>{
	private final Context context;
	private final String[] timetable_subjects, class_timings;
	
	public Student_timetable_day_adapter (Context context,String[] timetable_subjects,String[] class_timings) {
		super(context, R.layout.student_timetable_day,timetable_subjects);
		this.context = context;
		this.timetable_subjects= timetable_subjects;
		this.class_timings=class_timings;
	
	}
	
	@Override
	
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View rowView = inflater.inflate(R.layout.student_timetable_day_row, parent, false);
		TextView timetable_subjects_view = (TextView) rowView.findViewById(R.id.timetable_subject);
		TextView timetable_time=(TextView) rowView.findViewById(R.id.timetable_time);
		timetable_subjects_view.setText(timetable_subjects[position]);
		timetable_time.setText(class_timings[position]);
			
		return rowView;
	}

}