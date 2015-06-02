package com.example.ptemp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Tela02 extends Activity implements OnClickListener {

	
	private Button btn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela02);
		
		btn2 = new Button(this);
		btn2 = (Button)findViewById(R.id.btn01);
		btn2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		if(v == btn2)
		{
			Intent i = new Intent(this, Tela01.class);
			startActivity(i);
		}
	}
}
