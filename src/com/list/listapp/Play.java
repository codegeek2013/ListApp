package com.list.listapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class Play extends ActionBarActivity implements OnClickListener {

	ImageView img;
	Button back,bounce;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);
        img = (ImageView)findViewById(R.id.ball);
        back = (Button)findViewById(R.id.back);
        bounce = (Button)findViewById(R.id.bounce);
        
        final TranslateAnimation anim = new TranslateAnimation(0,0,0,200);
        anim.setDuration(1000);
        anim.setRepeatCount(2);
        anim.setRepeatMode(2);
        anim.setFillAfter(true);
        
        back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Play.this,MainActivity.class);
				startActivity(i);
				finish();
			}
		});
	
        bounce.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				img.startAnimation(anim);
			}
		});
        
                        
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
