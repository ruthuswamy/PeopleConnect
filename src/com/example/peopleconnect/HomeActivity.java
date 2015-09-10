package com.example.peopleconnect;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
	}
	 public void onBackPressed() {
  	   Intent intent = new Intent(Intent.ACTION_MAIN);
  	   intent.addCategory(Intent.CATEGORY_HOME);
  	   intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
  	   startActivity(intent);
  	 }
	
  
}
