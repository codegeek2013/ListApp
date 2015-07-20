package com.list.listapp;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter implements OnItemClickListener{

	Context mycon;
	ArrayList<String> mlist;
	int[] img;
	LayoutInflater in;
	public CustomAdapter(Context con,ArrayList<String> arlist,int[] im)
	{	
		super();
		this.mycon = con;
		this.mlist = arlist;
		this.img = im;
	}
	
		
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mlist.size();
	}

	@Override
	public Object getItem(int i) {
		// TODO Auto-generated method stub
		return mlist.get(i);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int pos, View contView, ViewGroup parent) { //gets called for every new entry into the list
		// TODO Auto-generated method stub
		View v;
		if(in==null)
			in = (LayoutInflater)mycon.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		System.out.println("Generating Viwe");
		
		if(contView==null){
			v = new View(mycon);
		}
		
		else{
			System.out.println("Trying");
			 v = (View) contView;
		 }
		
		v = in.inflate(R.layout.item, null);
		TextView tv = (TextView)v.findViewById(R.id.textView1);
		tv.setText(mlist.get(pos));
		ImageView imageView = (ImageView)v.findViewById(R.id.imv1);
		imageView.setImageResource(img[pos]);
		
		return v;
	}


	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
		
	
}
