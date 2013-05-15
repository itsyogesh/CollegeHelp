package com.example.deltech;

import com.example.deltech.R.string;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Subject_chapter_list_adapter extends ArrayAdapter<String>{
	private final Context context;
	private final String[] subject_chapters;
	
	public Subject_chapter_list_adapter (Context context,String[] subject_chapters) {
		super(context, R.layout.subject_chapter_list, subject_chapters);
		this.context = context;
		this.subject_chapters= subject_chapters;
	}
	
	@Override
	
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View rowView = inflater.inflate(R.layout.subject_chapter_list_row, parent, false);
		TextView chapterview = (TextView) rowView.findViewById(R.id.subject_chapter_list_title);
		ImageView pageicon= (ImageView) rowView.findViewById(R.id.pageicon);
		chapterview.setText(subject_chapters[position]);
		pageicon.setImageResource(R.drawable.new_page);
	
		return rowView;
	}

}