package com.example.lab1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SanPhamAdapter extends BaseAdapter {
    Context context;
    int myLayout;
    List<SanPham> sanPhamList;

    public SanPhamAdapter(Context context, int myLayout, List<SanPham> sanPhamList) {
        this.context = context;
        this.myLayout = myLayout;
        this.sanPhamList = sanPhamList;
    }

    @Override
    public int getCount() {
        return sanPhamList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=layoutInflater.inflate(myLayout,null);

        //anh xa
        ImageView img=view.findViewById(R.id.img_ListView);
        TextView tv1=view.findViewById(R.id.tv_1);
        TextView tv2=view.findViewById(R.id.tv_2);

        img.setImageResource(sanPhamList.get(i).getImgSp());
        tv1.setText(sanPhamList.get(i).getTvSp1());
        tv2.setText(sanPhamList.get(i).getTvSp2());

        Animation animation= AnimationUtils.loadAnimation(context,R.anim.scale_anim);
        view.startAnimation(animation);


        return view;
    }
}
