package com.example.deltech;

import com.example.deltech.R.string;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Take_attendance_adapter extends ArrayAdapter<String>{
	private final Context context;
	private final String[] student_names;
	
	public Take_attendance_adapter (Context context,String[] student_names) {
		super(context, R.layout.student_msg_list, student_names);
		this.context = context;
		this.student_names= student_names;
	}
	
	@Override
	
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View rowView = inflater.inflate(R.layout.take_attendance_row, parent, false);
		TextView msgview = (TextView) rowView.findViewById(R.id.take_attendance_row_title);
		msgview.setText(student_names[position]);
		
		
		return rowView;
	}

}
