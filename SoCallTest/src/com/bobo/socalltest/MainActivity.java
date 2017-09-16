package com.bobo.socalltest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.bobo.utils.NativeClass;

public class MainActivity extends Activity implements OnClickListener{

	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button1 = (Button)findViewById(R.id.button1);
		button2 = (Button)findViewById(R.id.button2);
		button3 = (Button)findViewById(R.id.button3);
		button4 = (Button)findViewById(R.id.button4);
		
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.button1:
			int add = NativeClass.add();
			button1.setText(""+add);
			break;
		case R.id.button2:
			int sub = NativeClass.sub();
			button2.setText(""+sub);
			break;
		case R.id.button3:
			int mul = NativeClass.mul();
			button3.setText(""+mul);
			break;
		case R.id.button4:
			int div = NativeClass.div();
			button4.setText(""+div);
			break;
		}
		
	}

	
}
