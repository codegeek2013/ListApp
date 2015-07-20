package com.list.listapp;


import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity implements OnItemClickListener {

    ListView lv;
    ArrayList<String> items;
    CustomAdapter adp;
    int[] imgid;
    PopupWindow popup;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lv = (ListView)findViewById(R.id.lv);
        items = new ArrayList<String>();
        
        System.out.println("1");
        
        items.add("Music");
        items.add("Art");
        items.add("Heritage");
        items.add("Food");
        items.add("Sweets");
        items.add("Education");
        items.add("Talent");
        items.add("History");
        items.add("Sports");
        items.add("Legends");
        items.add("Play a game");
        
        imgid = new int[items.size()];
        for(int i=0;i<items.size();i++)
        	imgid[i] = R.drawable.ic_launcher;
        
        System.out.println("Now Passing");
        
        adp = new CustomAdapter(MainActivity.this,items,imgid);
        lv.setAdapter(adp);
        lv.setScrollbarFadingEnabled(false); //setting scroll bar
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View arg1, int pos, long arg3) {
				// TODO Auto-generated method stub
				/**/
				String s = adp.getItem(pos).toString();
				if(s.equals("Play a game"))
				{
					Intent i = new Intent(MainActivity.this,Play.class);
					startActivity(i);
					finish();
				}
				else
				{
					Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
				}	
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
	public void onItemClick(AdapterView<?> list, View item, int pos, long arg3) {
		// TODO Auto-generated method stub
			
	}

	private void pop(String title,String desc){
		
	}

}
