package com.example.peopleconnect;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		TextView textView=(TextView)findViewById(R.id.textView1);
		textView.setText("People Connect");
		
	  	  Animation animation=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.moving);
	  	textView.startAnimation(animation);
	  	
	  	ImageView imageView=(ImageView)findViewById(R.id.imageView1);
	  	imageView.setBackgroundResource(R.drawable.splash);

	  	  Animation animation1=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);
	  	  imageView.startAnimation(animation1);
		
		
		Thread thread=new Thread(){
        	public void run(){
        		try{
        			sleep(5000);
        			     			     				
        			      			        			
        			startActivity(new Intent(getApplicationContext(),RegistrationActivity.class));
        			
        		}
        		catch(InterruptedException e){
        			e.printStackTrace();
        		}
        		
        	}
        	
        };
        thread.start();
		
	}
	


}
