package com.example.zaven.gallery;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.widget.GridView;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.content.Context;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        return imageView;
    }

    // references to our images
    public Integer[] mThumbIds = {
            R.drawable.sample_2, R.drawable.sample_1,
            R.drawable.sample_1, R.drawable.sample_2,
            R.drawable.sample_1, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_2,
            R.drawable.sample_2, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_2,
            R.drawable.sample_1, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_2,
            R.drawable.sample_1, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_2
    };
}
