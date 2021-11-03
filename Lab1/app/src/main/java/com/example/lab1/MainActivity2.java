package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ArrayList<SanPham> sanPhamArrayList;
    SanPhamAdapter sanPhamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sanPhamArrayList=new ArrayList<>();
        sanPhamArrayList.add(new SanPham(R.drawable.ic_facebook, "Facebook","1"));
        sanPhamArrayList.add(new SanPham(R.drawable.ic_instagram, "Instagram","2"));
        sanPhamArrayList.add(new SanPham(R.drawable.ic_twitter, "Twitter","3"));
        sanPhamArrayList.add(new SanPham(R.drawable.ic_youtube, "Youtube","4"));
        sanPhamArrayList.add(new SanPham(R.drawable.ic_facebook, "Facebook","5"));
        sanPhamArrayList.add(new SanPham(R.drawable.ic_instagram, "Instagram","6"));
        sanPhamArrayList.add(new SanPham(R.drawable.ic_twitter, "Twitter","7"));
        sanPhamArrayList.add(new SanPham(R.drawable.ic_youtube, "Youtube","8"));
        sanPhamArrayList.add(new SanPham(R.drawable.ic_facebook, "Facebook","9"));
        sanPhamArrayList.add(new SanPham(R.drawable.ic_instagram, "Instagram","10"));
        sanPhamArrayList.add(new SanPham(R.drawable.ic_twitter, "Twitter","11"));
        sanPhamArrayList.add(new SanPham(R.drawable.ic_youtube, "Youtube","12"));

        sanPhamAdapter=new SanPhamAdapter(MainActivity2.this, R.layout.layout_listview,sanPhamArrayList);
        ListView lv=findViewById(R.id.lv_sanpham);
        lv.setAdapter(sanPhamAdapter);

    }
}