package com.example.deltech;

import com.example.deltech.R.string;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Faculty_semester_list_adapter extends ArrayAdapter<String>{
	private final Context context;
	private final String[] semester;
	
	public Faculty_semester_list_adapter (Context context,String[] semester) {
		super(context, R.layout.faculty_semester_list, semester);
		this.context = context;
		this.semester= semester;
	}
	
	@Override
	
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View rowView = inflater.inflate(R.layout.faculty_semester_list_row, parent, false);
		TextView semesterview = (TextView) rowView.findViewById(R.id.faculty_semester_list_title);
		ImageView semester_icon= (ImageView) rowView.findViewById(R.id.semester_icon);
		semesterview.setText(semester[position]);
		semester_icon.setImageResource(R.drawable.semester_icon);
		
		return rowView;
	}

}
