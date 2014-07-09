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


public class FullscreenActivity extends Activity {
	
		Button b1;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);
        
        Button b;

    	
             
    		
           super.onCreate(savedInstanceState);    
           setContentView(R.layout.activity_fullscreen);
           
           final Handler handler = new Handler();
           handler.postDelayed(new Runnable() {
             @Override
             public void run() {
            	 
            	 Intent startNewActivityOpen = new Intent(FullscreenActivity.this, first.class);
                 startActivityForResult(startNewActivityOpen, 0);
               
           	  
           	// setContentView(R.layout.chumma);
               //  Intent i = new Intent(FullscreenActivity.this, first.class);
                 //startActivity(i);
             }
         }, 10000);  
           	  
           	  
             

        
        
        
        

           
          // b1 = (Button) findViewById(R.id.button1);
        /*   b = (Button) findViewById(R.id.button2);
           b.setOnClickListener(new OnClickListener()
           {
        	   @Override
        	   public void onClick(View v)
        	   {Toast msg = Toast.makeText(getBaseContext(),
                       "Login /  Sign Up", Toast.LENGTH_LONG);
        	   
         msg.show();   
         Intent startNewActivityOpen = new Intent(FullscreenActivity.this, first.class);
         startActivityForResult(startNewActivityOpen, 0);
         
         //setContentView(R.layout.chumma);
     
          }
          });   */
        
       //    Intent startNewActivityOpen = new Intent(FullscreenActivity.this, first.class);
        //   startActivityForResult(startNewActivityOpen, 0);
        
        
        
        
     
        
        
        final View controlsView = findViewById(R.id.fullscreen_content);
        final View contentView = findViewById(R.id.fullscreen_content);

        // Set up an instance of SystemUiHider to control the system UI for
        // this activity.
      
    }
    
}
  
        
        
	


	