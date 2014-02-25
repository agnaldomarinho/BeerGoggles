package com.example.beergoggles;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		final LinearLayout layout1 = (LinearLayout) findViewById(R.id.layout1);
		final LinearLayout layout2 = (LinearLayout) findViewById(R.id.layout2);

				
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	if(layout2.getVisibility() == (View.GONE)){
            		layout1.setVisibility(View.GONE);
            		layout2.setVisibility(View.VISIBLE);
            	}
            }
        });
        
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	if(layout1.getVisibility() == (View.GONE)){
            		layout2.setVisibility(View.GONE);
            		layout1.setVisibility(View.VISIBLE);
            		
            	}
               
            }
        });
   	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		final LinearLayout layout1 = (LinearLayout) findViewById(R.id.layout1);
		final LinearLayout layout2 = (LinearLayout) findViewById(R.id.layout2);

	    if (keyCode == KeyEvent.KEYCODE_BACK) {
	    	if(layout1.getVisibility() == (View.GONE)){
        		layout2.setVisibility(View.GONE);
        		layout1.setVisibility(View.VISIBLE);
	       
	    }else {
	    	finish();
	    }
	    	 return true;
	    }
	    return super.onKeyDown(keyCode, event);
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
