package com.p1creations.resourceshomework;

import com.p1creations.resourcehomework.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView textResource, textHomework;
	Button switchBtn;
	
	boolean swapped = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textResource = (TextView) findViewById(R.id.textResource);
		textHomework = (TextView) findViewById(R.id.textHomework);
		switchBtn = (Button) findViewById(R.id.switchBtn);
		
		switchBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				/*textResource.setText(R.string.homework);
				textResource.setTextColor(getResources().getColor(R.color.green));
				textHomework.setText(R.string.resource);
				textHomework.setTextColor(getResources().getColor(R.color.orange));
				*/
				if(swapped)
				{
					textResource.setText(R.string.homework);
					textResource.setTextColor(getResources().getColor(R.color.green));
					
					textHomework.setText(R.string.resource);
					textHomework.setTextColor(getResources().getColor(R.color.orange));
					
					
				}
				else
				{
					textResource.setText(R.string.resource);
					textResource.setTextColor(getResources().getColor(R.color.orange));
					
					textHomework.setText(R.string.homework);
					textHomework.setTextColor(getResources().getColor(R.color.green));
				}
				swapped = !swapped;
				
			}
		});
		
	}
	
	public void switchButton() {
		if (!textResource.equals(textHomework)) {
			textResource.setText(R.string.resource);
			textResource.setTextColor(getResources().getColor(R.color.orange));
		}
	}

}
