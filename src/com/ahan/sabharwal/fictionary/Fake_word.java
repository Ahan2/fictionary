package com.ahan.sabharwal.fictionary;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Fake_word extends Activity {
	
	//Spinner spinner;
	 TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fake_word);
		
		// Get the message from the intent
	    Intent intent = getIntent();
	    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

	    // Create the text view
	    TextView textView = (TextView) findViewById(R.id.input);
	    textView.setTextSize(40);
	    textView.setText(message);
	    
	    TextView textView1 = (TextView) findViewById(R.id.input1);
	    textView1.setTextSize(20);
	    textView1.setText(message);
	    

	    TextView textView2 = (TextView) findViewById(R.id.input2);
	    textView2.setTextSize(20);
	    textView2.setText(message);
	    

	 // Set the text view as the activity layout
	   // setContentView(textView);
	   
		
	
		
		
	//spinner = (Spinner) findViewById(R.id.planets_spinner);
		
		
		//ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.planets_array,android.R.layout.simple_spinner_item);
		//spinner.setAdapter(adapter);
		    
	    
	    
		 
	}
	
	
		
		    
		    
	


	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fake_word, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}

