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
 

public class Faculty_class_details extends Activity {
    
	   private ListView listview;
		@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty_semester_list);
             
       String[] faculty_semester=getResources().getStringArray(R.array.semester);
                   
			listview = (ListView)findViewById(R.id.faculty_semester_title);
			
			listview.setAdapter(new Faculty_semester_list_adapter(this, faculty_semester));
			
			listview.setOnItemClickListener(new OnItemClickListener() {
		  	@Override
		    public void onItemClick(AdapterView<?> parent, View view, int position, long id)  {
        		Toast msg = Toast.makeText(Faculty_class_details.this, "Selected list item is" + position, Toast.LENGTH_SHORT );
    		 	msg.setGravity(Gravity.BOTTOM,msg.getXOffset()/2 , msg.getYOffset()/2);
    		 	msg.show();
        	}
		
		    });
	    } 
}     
      
