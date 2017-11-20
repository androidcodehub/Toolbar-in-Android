package com.androidcodehub.myapplication;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;

public class SecondActivity extends AppCompatActivity{
	
	
	Toolbar mtool;
	
	
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.second);
		
	mtool=(Toolbar)findViewById(R.id.toolbar);	
	
	
	setSupportActionBar(mtool);
	
	 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    

//set Color of back Arrow in toolbar 

		Drawable drawable = mtool.getNavigationIcon();
		drawable.setColorFilter(ContextCompat.getColor(SecondActivity.this, R.color.blue_light), PorterDuff.Mode.SRC_ATOP);


//click listener on toolbar arrow

    mtool.setNavigationOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
	
		
		onBackPressed();
		
		
		}
	});
    
    
    
		
		
		
	}

}
