package com.example.multiimages;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mcontext;
    public  int[] imagearray={
//            R.drawable.image1,R.drawable.images2,R.drawable.image3,
//            R.drawable.image3,R.drawable.images2,R.drawable.image1,
//            R.drawable.image1,R.drawable.images2,R.drawable.image3,
//            R.drawable.image3,R.drawable.images2,R.drawable.image1,
//            R.drawable.image1,R.drawable.images2,R.drawable.image3,

    };

    //Right c|ick and generate constructor
    //imp|ement methods then auto generate

    //Constructor ...Rigth c|ick and generate constructor
    public ImageAdapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return imagearray.length;
    }

    @Override
    public Object getItem(int position) {
        return imagearray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        //Create image viewer which wi|| show in gridview
        ImageView imageView =new ImageView(mcontext);
        //Providing resource to images
        imageView.setImageResource(imagearray[position]);
        //Gravity center
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        //Setting width and height of image .which is going to be visib|e in gridview
        imageView.setLayoutParams(new GridView.LayoutParams(340,340));


        return imageView;
    }



}
