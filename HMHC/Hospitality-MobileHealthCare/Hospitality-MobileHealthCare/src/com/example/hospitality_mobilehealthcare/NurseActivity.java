package com.example.hospitality_mobilehealthcare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class NurseActivity extends Activity {
	String s1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nurse);
		ImageButton ib1=(ImageButton)findViewById(R.id.imageButton1);
		ImageButton ib2=(ImageButton)findViewById(R.id.imageButton2);
		ImageButton ib3=(ImageButton)findViewById(R.id.imageButton3);
		
		ib1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				s1=getIntent().getStringExtra("data").toString();
				Intent it=new Intent(NurseActivity.this,NurseprofileActivity.class);
				it.putExtra("dataa", s1);
				startActivity(it);
				
			}
		});
		ib2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it=new Intent(NurseActivity.this,PatientlistActivity.class);
				startActivity(it);
				
				
			}
		});
		ib3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it=new Intent(NurseActivity.this,MainActivity.class);
				startActivity(it);
				
			}
		});
		
	}
}
