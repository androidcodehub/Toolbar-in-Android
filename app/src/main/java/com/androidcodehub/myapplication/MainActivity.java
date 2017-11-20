package com.androidcodehub.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	
	Toolbar mtool;
	
	Button bt1;
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.activity_main);
		
    	mtool=(Toolbar)findViewById(R.id.toolbar);	
		
    bt1=(Button)findViewById(R.id.button1);	
    	
    	
    	
		
     	setSupportActionBar(mtool);
     	
     	
     
     	
	

bt1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	Intent i=new Intent(MainActivity.this,SecondActivity.class);
	
	startActivity(i);
	
	
	}
});	
     	
     	
     	
	}
}
