package com.example.cloudaltas;

import com.example.cloudaltas.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class first extends Activity {
	
		Button b1;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);
        
        Button b;

    	
             
    		
           super.onCreate(savedInstanceState);    
           setContentView(R.layout.chumma);
           
          b1 = (Button) findViewById(R.id.button12);
           b = (Button) findViewById(R.id.button12);
           b.setOnClickListener(new OnClickListener()
           {
        	   @Override
        	   public void onClick(View v)
        	   {Toast msg = Toast.makeText(getBaseContext(),
                       "Login /  Sign Up", Toast.LENGTH_LONG);
        	   
         msg.show();   
         Intent startNewActivityOpen = new Intent(first.this, LoginActivity.class);
         startActivityForResult(startNewActivityOpen, 0);
         
         //setContentView(R.layout.login);
     
          }
          }); 
        
       
        
        
        
        
     
        
        
        final View controlsView = findViewById(R.id.fullscreen_content);
        final View contentView = findViewById(R.id.fullscreen_content);

        // Set up an instance of SystemUiHider to control the system UI for
        // this activity.
      
    }
    
}
  
        
        
	


	