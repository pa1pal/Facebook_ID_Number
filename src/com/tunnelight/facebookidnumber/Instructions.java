<<<<<<< HEAD
package com.tunnelight.facebookidnumber;

/**
 * 
 *@author pa1pal 
 *
 */

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.app.Activity;
import android.os.Bundle;

public class Instructions extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instructions);
		AdView adins1 = (AdView)findViewById(R.id.adviewins1);
		adins1.loadAd(new AdRequest());
		
	}
	
}
=======
package com.tunnelight.facebookidnumber;

/**
 * 
 *@author pa1pal 
 *
 */

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.app.Activity;
import android.os.Bundle;

public class Instructions extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instructions);
		AdView adins1 = (AdView)findViewById(R.id.adviewins1);
		adins1.loadAd(new AdRequest());
		
	}
	
}
>>>>>>> 6bb8d70e3009caddce45564c292124008e81bc9c
