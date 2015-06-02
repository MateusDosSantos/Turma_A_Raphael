package com.example.ptemp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Tela01 extends Activity implements OnClickListener {

	
	private Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela01);
		
		btn = new Button(this);
		btn = (Button)findViewById(R.id.btn01);
		btn.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		if(v == btn)
		{
			Intent i = new Intent(this, Tela02.class);
			startActivity(i);
		}
		
	}
}
