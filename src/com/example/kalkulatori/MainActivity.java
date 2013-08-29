package com.example.kalkulatori;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	String op1="";
	String op2="";
	int k=1;
	int a;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void funk(View v)


	{
		
		Button b = (Button)v;
		TextView t = (TextView)this.findViewById(R.id.textView1);
		
		
		
		if(k==1)
		{
			op1 += b.getText().toString();
			t.setText(op1);
		}
		else if(k==2)
		{
			op2 += b.getText().toString();
			t.setText(op2);
		}
		
		
	}
    public void MessageBox(String message)
    {
       Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }  
	public void operatori(View v)
	{
		if(k==2)
		{
		llogarit(v);
		}
		Button b = (Button)v;
		Button p = (Button)this.findViewById(R.id.Button13);
		p.setEnabled(true);
		char s=b.getText().toString().charAt(0);
		k=2;
		switch(s)
		{
		case '+': a=1; break;	
		case '-': a=2; break;
		case '*': a=3; break;
		case '/': a=4; break;
		default:;
		}
		
	}
	public void llogarit(View v)
	{
		if(k!=1 && op2!="")
		{
		Double dop1=Double.parseDouble(op1);
		Double dop2=Double.parseDouble(op2);
		
		
		switch(a)
		{
		case 1:
			   dop1+=dop2;break;
		
		case 2:
			   dop1-=dop2;break;
		case 3:
			  dop1*=dop2;break;
			  
		case 4:
			   dop1/=dop2;break;
			  
		
			   default:
		}
		TextView t = (TextView)this.findViewById(R.id.textView1);
		t.setText(dop1.toString());
		op1=dop1.toString();
		op2="";
		}
		
		
	}
	public void pika(View v)
	{
		Button b = (Button)v;
		TextView t = (TextView)this.findViewById(R.id.textView1);
		if(k==1)
		{
			op1 += b.getText().toString();
			t.setText(op1);
		}
		else if(k==2)
		{
			op2 += b.getText().toString();
			t.setText(op2);
		}
		b.setEnabled(false);
		
	}
	public void fshij(View v)
	{
		op1="";
		op2="";
		k=1;
		TextView t = (TextView)this.findViewById(R.id.textView1);
		t.setText("0");
	}
	public void undo(View V)
	{
		TextView t = (TextView)this.findViewById(R.id.textView1);
		if(k==1 && op1!="")
		{
			op1 = op1.substring(0,op1.length()-1);
			t.setText(op1);
		}
		else if(k==2 && op2!="")
		{
			op2 = op2.substring(0,op2.length()-1);
			t.setText(op2);
		}
	}
}



	


