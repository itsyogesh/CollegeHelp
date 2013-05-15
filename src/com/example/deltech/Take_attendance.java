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
 

public class Take_attendance extends Activity {
    
	   private ListView listview;
		@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.take_attendance);
             
       String[] student_names=getResources().getStringArray(R.array.student_names);
                   
			listview = (ListView)findViewById(R.id.take_attendance_list);
			
			listview.setAdapter(new Take_attendance_adapter(this, student_names));
			
			listview.setOnItemClickListener(new OnItemClickListener() {
		  	@Override
		    public void onItemClick(AdapterView<?> parent, View view, int position, long id)  {
        		Toast msg = Toast.makeText(Take_attendance.this, "Selected list item is" + position, Toast.LENGTH_SHORT );
    		 	msg.setGravity(Gravity.BOTTOM,msg.getXOffset()/2 , msg.getYOffset()/2);
    		 	msg.show();
        	}
		
		    });
	    } 
}     
      
