package com.example.deltech;

import com.example.deltech.R.string;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Student_timetable_adapter extends ArrayAdapter<String>{
	private final Context context;
	private final String[] days;
	
	public Student_timetable_adapter (Context context,String[] days) {
		super(context, R.layout.student_timetable, days);
		this.context = context;
		this.days= days;
	}
	
	@Override
	
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View rowView = inflater.inflate(R.layout.student_timetable_row, parent, false);
		TextView daysview = (TextView) rowView.findViewById(R.id.student_timetable_row_title);
		daysview.setText(days[position]);
		
		
		return rowView;
	}

}