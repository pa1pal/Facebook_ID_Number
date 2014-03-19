package com.tunnelight.facebookidnumber;

/**
 * 
 *@author pa1pal 
 *
 */

import com.google.ads.*;
import com.purplebrain.adbuddiz.sdk.AdBuddiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class Idnum extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.idnum);
		AdView adweb1 = (AdView)findViewById(R.id.adviewweb1);
		adweb1.loadAd(new AdRequest());
		 AdBuddiz.cacheAds(this);
		final WebView idnumber = (WebView)findViewById(R.id.webView1);
		final EditText Username = (EditText) findViewById(R.id.editText1);
		Button letsee = (Button) findViewById(R.id.leloidno);
		letsee.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String newadr = Username.getText().toString();
				newadr = newadr.replace(' ', '+');
				CustomWebViewClient myCustomWebViewClient = new CustomWebViewClient();
				idnumber.setWebViewClient(myCustomWebViewClient);
			    idnumber.loadUrl("https://graph.facebook.com/" + newadr);
			}
		});
	}
	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		AdBuddiz.showAd(this);
		super.onBackPressed();
	}


	private class CustomWebViewClient extends WebViewClient{

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			// TODO Auto-generated method stub
			
			view.loadUrl(url);
			return false;
		
		}
	}
	
}
