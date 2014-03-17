package com.tunnelight.facebookidnumber;

import com.google.ads.*;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * 
 * @author pa1pal
 *
 */

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button lets = (Button)findViewById(R.id.getid);
		
		AdView ad1 = (AdView)findViewById(R.id.adview1);
		ad1.loadAd(new AdRequest());
		
		
		Button Insturctionsfor = (Button)findViewById(R.id.instruct);
		lets.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent go = new Intent("com.tunnelight.facebookidnumber.Idnum");
				startActivity(go);
				finish();
			}
		});
		Insturctionsfor.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent inst = new Intent("com.tunnelight.facebookidnumber.Instructions");
				startActivity(inst);
			}
		});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
