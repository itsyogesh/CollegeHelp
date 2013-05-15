package com.example.deltech;

import com.example.deltech.R.string;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Student_msg_adapter extends ArrayAdapter<String>{
	private final Context context;
	private final String[] messages;
	
	public Student_msg_adapter (Context context,String[] messages) {
		super(context, R.layout.student_msg_list, messages);
		this.context = context;
		this.messages= messages;
	}
	
	@Override
	
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View rowView = inflater.inflate(R.layout.student_msg_list_row, parent, false);
		TextView msgview = (TextView) rowView.findViewById(R.id.student_msg_list_title);
		ImageView mailicon= (ImageView) rowView.findViewById(R.id.mailicon);
		msgview.setText(messages[position]);
		mailicon.setImageResource(R.drawable.mailicon);
		
		return rowView;
	}

}
