package com.example.prastutiquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Result extends Activity {

	TextView player, marks;
	String gotname;
	int gotmarks = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resultl);
		initialize();
		
		
		Bundle bunget = getIntent().getExtras();
		String firstNAME = bunget.getString("idname");
		player.setText(firstNAME);
		gotmarks = bunget.getInt("markno", 0);



		
		
		marks.setText(Integer.toString(gotmarks));
		
	}
		
	private void initialize() {
		// TODO Auto-generated method stub
		player = (TextView) findViewById(R.id.tvfname1);
		marks = (TextView) findViewById(R.id.tvfscore1);
		
	}
	
	}

	




